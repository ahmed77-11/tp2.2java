import java.util.*;

public class Departement implements Comparable<Departement>{
    private int idDep;
    Set<Employe> LEmployes;
    public Departement(int idDep, int capacity) {
        this.idDep=idDep;
        this.LEmployes=new HashSet<>(capacity);
    }
    /*ajouter un Employe au département courant
     * la fonction n'ajoute que les employés ayants un CIN valide >0
     * ne pas oublier de mettre à jour le num dep de l'Employe
     *
     */
    public void ajoutEmploye(Employe E)
    {
        if(!E.getCin().isEmpty()){
            E.setIdDep(this.idDep);
            this.LEmployes.add(E);
        }else{
            System.out.println("cin non valide");
        }
    }
    //retirer un Employe du département courant
    public void retirerEmploye(Employe E)
    {
        this.LEmployes.remove(E);
        E.setIdDep(-1);
    }
    //afficher détails du département
    public void afficheDep() {
        Iterator it=LEmployes.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
//à compléter}
//vérifier si un employé dont le cin est donné en paramètre
// appartient au département courant ou pas
    public boolean existeE(String cin)
    {
        return this.LEmployes.contains(new Employe(cin,null,-1));
    }

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "idDep=" + idDep +
                ", LEmployes=" + LEmployes +
                '}';
    }

    public Set<Employe> getLEmployes() {
        return LEmployes;
    }

    public void setLEmployes(Set<Employe> LEmployes) {
        this.LEmployes = LEmployes;
    }

    //retourner l'employé qui a le plus grand salaire ds le département
    // pensez un utiliser un treeSet
    public Employe getEmpSalMax() {
        TreeSet<Employe> treeSetEmp=new TreeSet<>(LEmployes);
        return treeSetEmp.getLast();
    }
    @Override
    public int compareTo(Departement o) {
        if(this.LEmployes.size()>o.getLEmployes().size())
            return 1;
        if(this.LEmployes.size()<o.getLEmployes().size())
            return  -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return idDep == that.idDep;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDep);
    }
}
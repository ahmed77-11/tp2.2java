import java.util.*;

public class Entreprise {
    private String nomEntreprise;
    HashMap<Integer, Departement> Liste_Deps;

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public HashMap<Integer, Departement> getListe_Deps() {
        return Liste_Deps;
    }

    public void setListe_Deps(HashMap<Integer, Departement> liste_Deps) {
        Liste_Deps = liste_Deps;
    }

    //constructeurs, getters et setters
    public Entreprise(String nomEntreprise) {
        this.nomEntreprise=nomEntreprise;
        Liste_Deps=new HashMap<>();
    }
    //ajouter un département donné à l'entreprise
    public void ajoutDep(Departement d)
    {
        Liste_Deps.put(d.getIdDep(),d);
    }
    //retirer un département de l'entreprise
    public void retirerDep(Departement d) {
        Liste_Deps.remove(d.getIdDep());
    }
//afficher les détails de l'entreprise

        public void afficheE() {
            Set<Map.Entry<Integer, Departement>> entrySet=Liste_Deps.entrySet();
            Iterator<Map.Entry<Integer, Departement>> it=entrySet.iterator();
            while (it.hasNext()){
                Map.Entry<Integer,Departement> entry=it.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    public void UpdateDep(Employe E, int idDep) {
        E.setIdDep(idDep);
        for (Departement d: this.Liste_Deps.values()) {
            if (d.existeE(E.getCin())) {
                d.retirerEmploye(E);
                Departement n = this.Liste_Deps.get(idDep);
                if (n != null) {
                    n.ajoutEmploye(E);
                }
            }
        }
    }
//vérifier si un département donné en paramètre appartient à la société ou pas
        public boolean existeD (Departement d)
        {
            return this.Liste_Deps.containsKey(d.getIdDep());
        }
//afficher le département ayant le plus petit nombre d’étudiants
        public void DepMinCapacity (){
//            TreeMap<Integer,Departement> treeMap=new TreeMap<>(this.Liste_Deps);
//            System.out.println(treeMap.get(0));
            int min=Integer.MAX_VALUE;
            Departement minDepartement=null;
            for (Departement department : Liste_Deps.values()) {
                if (department.getLEmployes().size() < min) {
                    min = department.getLEmployes().size();
                    minDepartement=department;

                }
            }
            System.out.println(minDepartement);
        }
    }
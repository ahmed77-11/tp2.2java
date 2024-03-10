import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private String cin;
    private String nom;
    private double salaire;
    private int idDep;

    @Override
    public String toString() {
        return "Employe{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", salaire=" + salaire +
                ", idDep=" + idDep +
                '}';
    }

    public Employe(String cin, String nom, double salaire) {
        this.cin = cin;
        this.nom = nom;
        this.salaire = salaire;
        this.idDep = -1;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getIdDep() {
        return idDep;
    }

    public void setIdDep(int idDep) {
        this.idDep = idDep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(cin, employe.cin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin);
    }

    @Override
    public int compareTo(Employe o) {
        if(this.salaire>o.getSalaire())
            return 1;
        if(this.salaire<o.getSalaire())
            return  -1;
        return 0;
    }
}


public class TestEntrprise {
    public static void main(String[] args) {
        Entreprise entreprise=new Entreprise("iset");
        Employe e1=new Employe("14473249","ahmed",1500.0);
        Employe e2=new Employe("14473248","mohsen",1000.0);
        Employe e3=new Employe("14473258","same7",800.0);
        Employe e4=new Employe("14473250","mohdin",900.0);
        Departement d=new Departement(1,15);
        d.ajoutEmploye(e1);
        d.ajoutEmploye(e2);
        d.ajoutEmploye(e3);
        d.ajoutEmploye(e4);
        Employe e5=new Employe("14479999","hsen",1500.0);
        Employe e6=new Employe("14447777","hamadi",1000.0);
        Departement d1=new Departement(2,15);
        d1.ajoutEmploye(e5);
        d1.ajoutEmploye(e6);
        entreprise.ajoutDep(d);
        entreprise.ajoutDep(d1);
        System.out.println("///////////");
        entreprise.afficheE();
        System.out.println("///////////");
        System.out.println(entreprise.existeD(d1));
        System.out.println("///////////");
        entreprise.DepMinCapacity();
        System.out.println("///////////");
        entreprise.UpdateDep(e5,1);
        entreprise.afficheE();
        System.out.println("///////////");
        entreprise.retirerDep(d1);
        entreprise.afficheE();
    }
}

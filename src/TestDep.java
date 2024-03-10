public class TestDep {
    public static void main(String[] args) {
        Employe e1=new Employe("14473249","ahmed",1500.0);
        Employe e2=new Employe("14473248","mohsen",1000.0);
        Employe e3=new Employe("14473248","same7",800.0);
        Employe e4=new Employe("14473250","mohsen",900.0);
        Departement d=new Departement(1,15);
        d.ajoutEmploye(e1);
        d.ajoutEmploye(e2);
        d.ajoutEmploye(e3);
        d.ajoutEmploye(e4);
        System.out.println("///////////");
        d.afficheDep();
        d.retirerEmploye(e4);
        System.out.println("///////////");
        d.afficheDep();
        System.out.println("///////////");
        System.out.println(d.getEmpSalMax());
        System.out.println(d.existeE("14473249"));
    }
}

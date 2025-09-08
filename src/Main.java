import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangolo triangolo = new Triangolo();

//        Student stu;
//        System.out.println("Inserisca il nome del studente:");
//        String nome = scanner.nextLine();
//        System.out.println("Inserisca il cognome del studente:");
//        String cognome = scanner.nextLine();
//        System.out.println("Inserisca il voto del studente:");
//        double voto = scanner.nextDouble();
//
//        stu = new Student(nome, cognome, voto);


//        System.out.println("Iserisca il primo lato del triangolo: ");
//        double a = scanner.nextDouble();
//        System.out.println("Iserisca il secondo lato del triangolo: ");
//        double b = scanner.nextDouble();
//        System.out.println("Iserisca il terzo lato del triangolo: ");
//        double c = scanner.nextDouble();
//
//        triangolo.setA(a);
//        triangolo.setB(b);
//        triangolo.setC(c);
//
//        triangolo.classificazione();
//        triangolo.perimetro();


//        Cane cane = new Cane("Arias");
//        Gatto gatto = new Gatto("Mila");
//
//        Animale[] animal = {cane, gatto};
//
//        cane.abbaia();
//        gatto.maigola();
//
//        for(Animale a: animal) {
//            a.cosaMangia();
//            a.cammina();
//        }

//        Calcolatrice cal = new Calcolatrice();
//
//        cal.somma(5.5, 5.5);
//        cal.somma(new double[]{1.1, 1.1, 1.1, 1.1,1.1 });

//        Quadro qua = new Quadro();
//        qua.calcolaStipendio(30);


//        Quadrato quadrato = new Quadrato();
//        Triangolo triangolo1 = new Triangolo();
//
//        double periQuadrato = quadrato.perimetro(1,2,3);
//        double areaQuadrato = quadrato.area(1,2);
//
//        double areaTriangolo = triangolo.area(1,2);
//        double periTriangolo = triangolo.perimetro(1,2,3);
//
//        System.out.println("L'area del triangolo : " + areaTriangolo);
//        System.out.println("L'area del quadrato : " + areaQuadrato);
//
//        System.out.println("Il perimetro del triangolo: " + periTriangolo);
//        System.out.println("Il perimetro del quadrato: " + periQuadrato);

        Maschio maschio = new Maschio("Memo");
        Femina femina = new Femina("Mema");

        maschio.saluta();
        femina.saluta();
    }
}

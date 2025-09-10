import java.util.ArrayList;
import java.util.InputMismatchException;
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

//        Maschio maschio = new Maschio("Memo");
//        Femina femina = new Femina("Mema");
//
//        maschio.saluta();
//        femina.saluta();

//        ArrayList<String> nomi = new ArrayList<String>();
//        nomi.add("Mohamed");
//        nomi.add("Marco");
//        nomi.add("Mousa");
//
//        for (String s : nomi){
//            System.out.println("I nomi sono: " + s);
//        }

//        ArrayList<Contatto> contatti = new ArrayList<Contatto>();
//        contatti.add(new Contatto("Mohamed", "1234321"));
//        contatti.add(new Contatto("Mousa", "222333444"));
//        contatti.add(new Contatto("Ibra", "444555666"));
//
//        for (Contatto c : contatti) {
//            System.out.println(c.toString());
//        }
        boolean exit = true;
        while (exit) {
            try {
                collectNumbers(scanner);
                exit = false;
            }catch (Exception e) {
                System.out.println("Error lanciato:  " + e.getMessage() + ". Try Again!");
            }
        }
    }

    private static void collectNumbers(Scanner scanner) {
        System.out.println("Inserisca il primo numero: ");
        int numero = scanner.nextInt();

        System.out.println("Inserisca il secondo numero: ");
        int secondoNumero = scanner.nextInt();

        int result = calcolaLaDivisione(numero, secondoNumero);
        System.out.println("La divisione vale a " + result);
    }

    private static int calcolaLaDivisione(int numero1, int numero2) {
        int result = numero1 / numero2;
        return result;
    }
}


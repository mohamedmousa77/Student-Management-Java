public class Triangolo extends FomaGeometrica {

    private double a;
    private double b;
    private double c;

    public void classificazione() {
        if(a == b && b ==c){
            System.out.println("Questo triangolo e` Equilatero!");
        } else if (a == b && b != c) {
            System.out.println("Questo triangolo e` Isoscele!");
        }else if (a !=b && b != c) {
            System.out.println("Questo triangolo e` Scaleno!");
        }
    }

    public double perimetro() {
        double result = a + b + c;
        System.out.println("Il perimetro vale a " + result);
        return result;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double area(double x, double y) {
        double area = (x * y ) / 2;
        return area;
    }

    @Override
    public double perimetro(double x, double y, double z) {
        double peri = x+y+z;
        return peri;
    }
}

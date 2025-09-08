
public class Quadrato extends FomaGeometrica {
//    private double lato;


    @Override
    public double area(double x, double y) {
        double area = x * y;
        return area;
    }

    @Override
    public double perimetro(double x, double y, double z) {
        double peri = x*4;
        return peri;
    }
}

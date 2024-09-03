package T1;

public class Rectangulo {
    private double base, altura;

    public Rectangulo(double altura, double base) {
        if (altura < 0 || base < 0) {
            throw new IllegalArgumentException("Numeros negativos");
        }
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(Rectangulo r) {
        altura = r.altura;
        base = r.base;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double perimetro() {
        double perimetro = 2 * altura + 2 * base;
        return perimetro;
    }

    public double area() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo --- base--> " + base + " || Altura --> " + altura;
    }
}

class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(2, 4);
        System.out.println(r); // This will automatically invoke r.toString()
        System.out.println("Base: " + r.getBase() + "cm");
        System.out.println("Altura: " + r.getAltura() + "cm");
        System.out.println("Area: " + r.area() + "cm2");
        System.out.println("Perimetro: " + r.perimetro() + "cm");
    }
}

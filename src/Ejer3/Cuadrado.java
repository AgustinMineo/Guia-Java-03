package Ejer3;

public class Cuadrado extends Figura{
    public Cuadrado(double base, double altura, String color) {super(base, altura, color);}

    public Cuadrado() {}

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {super.setColor(color);}

    @Override
    public double getBase() {return super.getBase();}

    @Override
    public void setBase(double base) {super.setBase(base);}

    @Override
    public double getAltura() {return super.getAltura();}

    @Override
    public void setAltura(double altura) {super.setAltura(altura);}

    @Override
    public double area(double base, double altura) {
        return super.area(base, altura);
    }

    @Override
    public double perimetro(double lado, double lado1) {
        return super.perimetro(lado, lado1);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                "Area : " + this.area(this.base,this.altura) +
                "Perimetro : " + this.perimetro(this.base,this.altura) +
                '}';
    }
}

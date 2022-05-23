package Ejer3;

public abstract class Figura {
    protected double base;
    protected double altura;
    protected String color="";

    public Figura(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }
    public Figura() {}

    public double area(double base, double altura){
        return base*altura;
    }
    public double perimetro(double lado, double lado1){
        return ((2*lado)+(2*lado1));
    }
    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double getBase() {return base;}

    public void setBase(double base) {this.base = base;}

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}


    @Override
    public String toString() {
        return "Figura{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

}

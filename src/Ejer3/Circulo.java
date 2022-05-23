package Ejer3;

public class Circulo extends Figura{
    private double radio=1.0D;
    private String color="";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {}

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

   /* @Override
    public double area(double base, double altura) {
        return super.area((Math.PI * (Math.pow(radio,2))));
    }

    @Override
    public double perimetro(double lado, double lado1) {
        return super.perimetro(lado, lado1);
    }*/

    public double areaCirculo(double radio){return Math.PI * (Math.pow(radio,2));}

    public double perimetroCirculo(double radio){return 2*Math.PI*radio;}


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}

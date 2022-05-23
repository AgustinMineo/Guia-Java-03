package Ejer1;

public class Circulo {
    private double radio=1.0D;
    private String color="rojo";

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
    }

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public double areaCirculo(double radio){
    return Math.PI * (Math.pow(radio,2));
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}

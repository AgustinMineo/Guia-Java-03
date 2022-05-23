package Ejer1;

public class Cilindro extends Circulo{
    private double altura=1.0D;

    public Cilindro(){
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    public double volumenCilindro(){
        return areaCirculo(getRadio())*altura;
    }


    @Override
    public double getRadio() {return super.getRadio();}

    @Override
    public void setRadio(double radio) {super.setRadio(radio);}

    @Override
    public String getColor() {return super.getColor();}

    @Override
    public void setColor(String color) {super.setColor(color);}

    @Override
    public double areaCirculo(double radio) {return super.areaCirculo(radio);}
    //Imprimir por pantalla, el
    //radio del cilindro, la altura, el área de la base y el volumen.
    @Override
    public String toString() {
        return " Cilindro : " + "\n" + " Radio : " + getRadio() + "\n" + " altura : " + altura + "\n" + " area : " + areaCirculo(getRadio()) + "\n"
                + " volumen : " + volumenCilindro() + "\n" +
                '}';
    }
}

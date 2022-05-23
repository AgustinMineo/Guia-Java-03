package Ejer3;

public class Rectangulo extends Figura{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(){}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public double getBase() {return base;}
    public void setBase(double base) {this.base = base;}

    @Override
    public double area(double base, double altura) {
        return super.area(base,altura);
    }

    @Override
    public double perimetro(double altura, double base) {
        return super.perimetro((2*altura),(2*base));
    }

   //** public double perimetroRectangulo(double base, double altura){return (altura+altura+base+base);}

   //*// public double areaRectangulo(double base, double altura){return base*altura;}

    @Override
    public String toString() {
        return "Rectangulo{" + "altura=" + altura + ", base=" + base + "area del Rectangulo : " + super.area(this.base,this.altura) +'}';
    }
}

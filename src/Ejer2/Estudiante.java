package Ejer2;

public class Estudiante extends Persona {
    private double cuotaMensual;
    private String añoIngreso;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, double cuotaMensual, String añoIngreso, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.cuotaMensual = cuotaMensual;
        this.añoIngreso = añoIngreso;
        this.carrera = carrera;
    }

    public double getCuotaMensual() {return cuotaMensual;}

    public void setCuotaMensual(double cuotaMensual) {this.cuotaMensual = cuotaMensual;}

    public String getAñoIngreso() {return añoIngreso;}

    public void setAñoIngreso(String añoIngreso) {this.añoIngreso = añoIngreso;}

    public String getCarrera() {return carrera;}

    public void setCarrera(String carrera) {this.carrera = carrera;}

}

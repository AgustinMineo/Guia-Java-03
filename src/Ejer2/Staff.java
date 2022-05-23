package Ejer2;

public class Staff extends Persona {
    private String turno; // Mañana - Noche
    private double salario;

    public Staff(String dni, String nombre, String apellido, String email, String direccion, String turno, double salario) {
        super(dni, nombre, apellido, email, direccion);
        this.turno = turno;
        this.salario = salario;
    }

    public String getTurno() {return turno;}

    public void setTurno(String turno) {this.turno = turno;}

    public double getSalario() {return salario;}

    public void setSalario(double salario) {this.salario = salario;}

    @Override
    public String toString() {
        return "Staff{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", turno='" + turno + '\'' +
                ", salario=" + salario +
                '}';
    }
}

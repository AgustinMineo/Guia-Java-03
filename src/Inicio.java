import Ejer1.Cilindro;
import Ejer1.Circulo;
import Ejer2.Estudiante;
import Ejer2.Staff;
import Ejer2.Persona;
import Ejer3.Cuadrado;

public class Inicio {
    public static void main(String[] args) {
        /* <----------------------------------------- Ejer 1 --------------------------------------->*/
        Cilindro cilindro= new Cilindro();
        System.out.println(cilindro.toString());

        Cilindro cilindro2= new Cilindro(10,"Gris",23);
        System.out.println(cilindro2.toString());

        /* <----------------------------------------- Ejer 1 --------------------------------------->*/




        /* <----------------------------------------- Ejer 2 --------------------------------------->*/
        Estudiante estudiante = new Estudiante("39824213","Jose","Carlos","josecarlos@correo.com","Dirección xd", 35000,"2008","Tecnicatura en informatica");
        Estudiante estudiante1 = new Estudiante("39824212","Juan","Carlos","juancarlos@correo.com","Dirección xd 1", 35000,"2008","Tecnicatura en informatica");
        Estudiante estudiante2 = new Estudiante("39824211","Pepe","Argento","pepeargento@correo.com","Dirección xd 2", 35000,"2008","Tecnicatura en informatica");
        Estudiante estudiante3 = new Estudiante("39824210","Marcos","Valdez","marcosvaldez@correo.com","Dirección xd 3", 35000,"2008","Tecnicatura en informatica");
        Staff staff = new Staff("83748324","Michael","Scott","michael@correo.com","Valverde 2003","Mañana",100000);
        Staff staff1 = new Staff("83748323","Travis","Scott","Travis@correo.com","Valverde 2003","Noche",150000);
        Staff staff2 = new Staff("83748322","Jack","Scott","Jack@correo.com","Valverde 2003","Mañana",100000);
        Staff staff3 = new Staff("83748321","Borton","Scott","Borton@correo.com","Valverde 2003","Noche",150000);
        Persona[]arregloPe = new Persona[]{estudiante,estudiante1,estudiante2,estudiante3,staff,staff1,staff2,staff3};

        int cantStudents=0;
        int cantStaff=0;
        double totalCuota=0;
        double totalSueldo=0;
        for (Persona personas:arregloPe) {
            if(personas instanceof Estudiante){
                cantStudents++;
                totalCuota+=((Estudiante) personas).getCuotaMensual();
            }

                if(personas instanceof Staff){
                    cantStaff++;
                    totalSueldo+=((Staff) personas).getSalario();
                }

        }
        System.out.println("La cantidad de alumnos es : " + cantStudents + " y " + "la cantidad de personal es de : " + cantStaff);
        System.out.println("La recaudación de la cuota es : " + totalCuota + " y " + "los sueldos son de " + totalSueldo);
        /* <----------------------------------------- Ejer 2 --------------------------------------->*/




        /* <----------------------------------------- Ejer 3 --------------------------------------->*/
        Cuadrado cuadrado = new Cuadrado(25,25,"Green");
        System.out.println(cuadrado.toString());
        cuadrado.area(25,25);


        /* <----------------------------------------- Ejer 3 --------------------------------------->*/
    }
}

import java.util.*;
class Empleado {
    public Empleado(String n, double s, int anio, int mes, int dia)
    {
        nombre = n;
        salario = s;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        fechaContratacion = calendario.getTime();
    }
    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerSalario(){
        return salario;
    }

    public Date obtenerFechaContratacion(){
        return fechaContratacion;
    }

    public void aumentarSalario (double porcentaje)
    {
        double aumento = salario * porcentaje/100;
        salario+=aumento;
    }
    private String nombre;
    private double salario;
    private Date fechaContratacion;
}

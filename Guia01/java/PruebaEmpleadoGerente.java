public class PruebaEmpleadoGerente {
    public static void main(String[] args) {
        Gerente jefe = new Gerente("Carlos Martinez", 800, 1987, 12, 15);
        jefe.obtenerBono(100);
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Tomas Castillo", 350, 1989, 10, 1);
        personal[2] = new Empleado("Roberto Mendoza", 400, 1990, 3, 15);

        for (int i = 0; i < personal.length; i++) {
            Empleado e = personal[i];
            System.out.println("Nombre = " + e.obtenerNombre() + ", salario = " + e.obtenerSalario());
        }
    }
}

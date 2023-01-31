public class Cadenas {
    
    public static void main(String[] args) {
        String cadena01 = "Universidad";
        String cadena02 = "Don Bosco";
        String cadena03 = "Escuela";
        String cadena04 = "de";
        String cadena05 = "Computación";
        String cadena06 = cadena03 + " " + cadena04 + " " + cadena05;
        String cadena07 = cadena06 + " Desarrollo de Software para Móviles " + "Ciclo 1-" + 2023;
        System.out.println(cadena06);
        System.out.println(cadena07);
        String cadena08 = cadena05.substring(0,5);
        System.out.println(cadena08);
        System.out.println("Cadena 06: "+cadena06);
        System.out.println("Longitud de la Cadena 06: "+cadena06.length());
        System.out.println("El caracter 4 de la Cadena 06 es: "+cadena06.charAt(4));
        cadena07 = cadena07.substring(23,36) + " - Programación Orientada a Objetos";
        System.out.println(cadena07);
        System.out.println(cadena07 == cadena06);
        String cadena09 = cadena06.substring(11,22);
        System.out.println(cadena09.equals("Computación"));
    }
}

public class GraficoBarrasNotas {
    
    public static void main(String[] args) {
        int array[] = {0,0,0,0,0,0,3,12,6,2,1};
        System.out.println("Distribucion de notas");
        for (int contador = 0; contador < array.length; contador++) {
            if (contador==10) {
                System.out.printf("%5d: ",100);
            } else {
                System.out.printf("%02d-%02d: ", contador*10,contador*10+9);
            }
            for (int asteriscos = 0; asteriscos<array[contador]; asteriscos++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

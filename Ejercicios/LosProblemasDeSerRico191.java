import java.util.Scanner;

public class LosProblemasDeSerRico191 { // Asume fichero llamado solution.java
    public static void main(String[] args) {
        
        Scanner src = new Scanner(System.in);

        int veces = src.nextInt();src.nextLine();

        for (int i = 0; i < veces; i++) {

            String cadena = src.nextLine();
            String[] datos = cadena.split(" ");

            int compartimentos = Integer.parseInt(datos[0]);
            int litros = Integer.parseInt(datos[1]);
            int diferencia = Integer.parseInt(datos[2]);

            int total = 0;

            if (compartimentos > 0 && litros > 0 && diferencia >= 0) {

                for (int j = 0; j < compartimentos; j++) {

                    total += litros;
                    litros -= diferencia;
                    
                }
            }
            System.out.println(total);
        }
        src.close();
    }
}
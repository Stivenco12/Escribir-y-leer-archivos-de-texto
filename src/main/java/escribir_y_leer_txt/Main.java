package escribir_y_leer_txt;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("archivo.txt");
        try (Scanner sc = new Scanner(System.in)) {
            String texto = sc.nextLine();
            try(FileWriter escritor = new FileWriter(file.getAbsoluteFile(), true)) {
                escritor.write("\n"+texto);
                System.out.println("el archivo a sido escrito correctamente");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
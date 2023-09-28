import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PR122cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running){
            System.out.println("Introduce una ruta (s para salir): ");
            String ruta = sc.nextLine();
            if (ruta.equals("s")){
                running = false;
                continue;
            }
            File file = new File(ruta);

            if (file.isFile()){
                Scanner scnr;
                try {
                    scnr = new Scanner(file);
                    while(scnr.hasNextLine()){
                        String line = scnr.nextLine();
                        System.out.println(" :" + line);
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }

            } else if (file.isDirectory()) {
                System.out.println("La ruta que has introducido es un directorio");
            }
            else {
                System.out.println("No existe la ruta introducida");
            }
        }

    }
}

import java.io.File;
import java.io.IOException;

public class PR121Files {
    public static void main(String[] args) {
        File carpeta = new File("./src/myFiles/");
        File file1 = new File("./src/myFiles/file1.txt");
        File file2 = new File("./src/myFiles/file2.txt");
        File renamed = new File("./src/myFiles/renamedFile.txt");

        if (!carpeta.exists()){
            carpeta.mkdir();
        }
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file2.renameTo(renamed);

        System.out.println("Els arxius de la carpeta son: ");

        File [] archivos = carpeta.listFiles();
        if (archivos != null){
            for (File archivo : archivos){
                System.out.println(archivo.getName());
            }
        }
        if (file1.exists()){
            file1.delete();
        }
        System.out.println("--------------------------");
        System.out.println("Els arxius de la carpeta son: ");
        archivos = carpeta.listFiles();
        if (archivos != null){
            for (File archivo : archivos){
                System.out.println(archivo.getName());
            }
        }
    }
}

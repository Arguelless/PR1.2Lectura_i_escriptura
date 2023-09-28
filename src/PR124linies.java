import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PR124linies {
    public static void main(String[] args) {
        String archivo = "./src/numeros.txt";
        Random random = new Random();

        try {
            FileWriter writer = new FileWriter(archivo, true);

            for (int i = 0; i < 10; i++) {
                int enteroAleatorio = random.nextInt(100) + 1;
                writer.write(enteroAleatorio + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

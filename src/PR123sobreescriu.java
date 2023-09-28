import java.io.FileWriter;
import java.io.IOException;

public class PR123sobreescriu {
    public static void main(String[] args) {
        String archivo = "./src/frasesMatrix.txt";
        String frases = "Yo sólo puedo mostrarte la puerta\nTú eres quien la tiene que atravesar\n";


        try {
            FileWriter writer = new FileWriter(archivo);
            writer.write(frases);

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

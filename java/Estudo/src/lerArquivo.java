import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class lerArquivo {

    public static void main(String args[]) throws FileNotFoundException {

        try {
            Scanner scanner = new Scanner(new FileReader("C:/Users/Professor/Downloads/leit123ura.txt"))
                    .useDelimiter("\\n");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Não Existe esse Arquivo!!!!");
        }

    }
}

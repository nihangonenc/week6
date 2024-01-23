import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {

        try {

            File file = new File ("number.txt"); //dosya oluşturma

            if( !file.exists()){
                file.createNewFile();
            }
            FileWriter fWriter = new FileWriter(file, true); //dosyaya yazma
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("5\n" +
                    "10\n" +
                    "20\n" +
                    "12\n" +
                    "33");
            bWriter.close();

            FileReader fReader = new FileReader(file);             //dosyadan okuma
            BufferedReader bReader = new BufferedReader(fReader);

            String numbers = bReader.readLine();

            int sumNumber = 0;
            while (numbers != null) {
                int intNumbers = Integer.parseInt(numbers);
                numbers = bReader.readLine();
                sumNumber += intNumbers;
            }
            System.out.println(sumNumber);
            fReader.close();
            bReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
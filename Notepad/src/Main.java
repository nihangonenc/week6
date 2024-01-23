import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            FileReader fReader = new FileReader("notlar.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String readText = bReader.readLine();

            if(readText != null) { // Başlangıçta not boş değilse tüm notu gösterir
                System.out.println("Eski notlarınız: " + readText);
            }

            fReader.close();
            bReader.close();

            FileWriter fWriter = new FileWriter("notlar.txt", true); //eski notlar silinmeden yenileri eklenecek
            PrintWriter pWriter = new PrintWriter(fWriter);

            System.out.print("Eklemek istediğiniz notları yazınız: "); //Kullanıcıdan not alımı
            String writeText = input.nextLine();
            pWriter.print(writeText);
            fWriter.close();
            pWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

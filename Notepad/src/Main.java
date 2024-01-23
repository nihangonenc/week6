import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Notunuzu yazınız: "); //Kullanıcıdan not alımı
        String text = input.nextLine();

        try {
            FileWriter fWriter = new FileWriter("notlar.txt", true); //eski notlar silinmeden yenileri eklenecek
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.println(text);
            pWriter.close();

            FileReader fReader = new FileReader("notlar.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String readText = bReader.readLine();
            bReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

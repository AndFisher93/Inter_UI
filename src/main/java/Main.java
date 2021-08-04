import java.io.FileReader;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws Exception {
        FileReader fr = new FileReader("/home/a.lukianenko/test.txt");
        Scanner scan = new Scanner(fr);
        int r;
        while ((r=fr.read())!=1){
            System.out.println((char) r);
        }
        fr.close();
    }
}

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Duyhxm {
    public static void main(String [] args){
        String s = "duyhxm";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String newString = sc.nextLine();
        if(s.equals(newString)){
            System.out.println(s + " equals " + newString);
        }
        else {
            System.out.println(s + "doesn't equal " + newString);
        }

    }
}

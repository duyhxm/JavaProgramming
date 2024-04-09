import java.util.Scanner;

public class CheckTriangle {
    static boolean edgeValidation(int a, int b, int c){
        if(a<b+c && a> b-c){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 edges of triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(CheckTriangle.edgeValidation(a,b,c) && CheckTriangle.edgeValidation(b,a,c) && CheckTriangle.edgeValidation(c,
                a,b)){
            System.out.println(a + " " + b + " " + c + " là 3 cạnh của tam giác");
        }
        else{
            System.out.println(a + " " + b + " " + c + " không là 3 cạnh của tam giác");
        }
    }
}

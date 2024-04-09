import java.util.ArrayList;
import java.util.Scanner;

public class TriangleTools {
    static boolean checkEdgeValidation(int a, int b, int c){
        if((a < b + c && a > Math.abs(b - c)) && (b < a + c && b > Math.abs(a - c)) && (c < b + a && c > Math.abs(b - a))){
            return true;
        }
        return false;
    }
    static boolean checkRightTriangleValidation(int a, int b, int c){
        if(c*c == a*a + b*b || a*a == b*b + c*c || b*b == a*a + c*c){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of 3 edges: ");
//        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
//        if(checkRightTriangleValidation(a,b,c)){
//            System.out.println("is a right triangle");
//        }
//        else
//            System.out.println("not a right triangle");
//        if(checkEdgeValidation(a,b,c)){
//            System.out.println("is a triangle");
//        }
//        else
//            System.out.println("not a triangle");
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1: " + s1);
        s1 = "duy";
        System.out.println("s2: " + s2);
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Integer> intArr1 ;
        intArr.add(1);
        intArr.add(2);
        intArr1 = intArr;
        intArr.remove(1);
        for(int x : intArr1){
            System.out.println(x);
        }
    }
}

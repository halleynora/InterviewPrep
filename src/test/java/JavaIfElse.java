import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        // int N = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // scanner.close();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        } else if (n>=2 && n <= 5){
            ans = "Not Weird";
        } else if (n>=6 && n <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);

    }

}

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static int fact(int N){
        if(N==1)
        {
            return 1;
        }
        else
        {
            return fact(N-1)*N;
        }

    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(in);
        out.println("Enter n");
        int n=scanner.nextInt();
        out.println(fact(n));
    }
}
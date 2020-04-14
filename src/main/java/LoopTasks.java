import java.util.ArrayList;
import java.util.Scanner;

public class LoopTasks {
    public LoopTasks(){
    }

    private void first() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: (int)");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        ArrayList result = new ArrayList();
        for (int i = a; i <= b; i++, n++){
            result.add(i);
        }
        System.out.println(result.toString());
        System.out.println(n);
    }
    private void second(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: (int)");
        int a = in.nextInt();
        int b = in.nextInt();
        int n = 0;
        ArrayList result = new ArrayList();
        for (int i = b-1; i > a; i--, n++){
            result.add(i);
        }
        System.out.println(result.toString());
        System.out.println(n);
    }
    private void third() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a float number A:");
        float a = in.nextFloat();
        System.out.println("Enter an integer number N (> 0):");
        int n = in.nextInt();
        float result = 1;
        for (int i = 1; i <= n; i++)
           result *= a;
        System.out.println(result);
    }
    private void fourth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a float number A:");
        float a = in.nextFloat();
        System.out.println("Enter an integer number N (> 0):");
        int n = in.nextInt();
        float result = 1;
        ArrayList results = new ArrayList();
        for (int i = 1; i <= n; i++){
            result *= a;
            results.add(result);
        }
        System.out.println(results.toString());
    }

    public void main() {
        System.out.println("3.1 Given two integers A and B (A < B). Find all the integers located between the given numbers\n" +
                "(including these numbers themselves), in increasing order, as well as the number N of these numbers.");
        first();
        System.out.println("3.2 Given two integers A and B (A < B). Find all integers located between given numbers\n" +
                "(not including these numbers themselves), in decreasing order, as well as the number N of these numbers.");
        second();
        System.out.println("3.3 Given a real number A and an integer N (> 0). Find A in power N: A^N = A • A •• A (numbers A are multiplied N times).");
        third();
        System.out.println("3.4 Given a real number A and an integer N (> 0). Find all integer powers of A from 1 to N");
        fourth();
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class WhileDoWhileTasks {
    public WhileDoWhileTasks() {
    }

    private void first(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max number (int)");
        int n = in.nextInt();
        int i = 0;
        ArrayList result = new ArrayList();
        while (i < n) {
            if ((i % 5 != 0) && (i % 3 == 0)){
                int digitsum = 0;
                int j = i;
                do {
                    digitsum += j % 10;
                    j /= 10;
                } while (j > 0);
                if ((digitsum % 5 != 0) && (digitsum % 3 == 0)) result.add(i);
            }
            i++;
        }
        System.out.println(result.toString());
    }

    private void second(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the N (int)");
        int n = in.nextInt();
        int i = 1;
        ArrayList result = new ArrayList();
        do {
            if (i % 5 == 0) result.add(i);
            i++;
        } while (i < n);
        System.out.println(result.toString());
    }

    private void third(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number:");
        int n = in.nextInt();
        boolean stoppoint = false;
        while (n % 2 == 0){
            n = n / 2;
            stoppoint = (n == 1);
        }
        System.out.println(stoppoint ? "Yes." : "No.");
    }
    private void fourth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the N (int)");
        int n = in.nextInt();
        ArrayList result = new ArrayList();
        int i1 = 1;
        int i2 = 2;
        int i3 = 0;
        result.add(i1);
        result.add(i2);
        do {
            result.add(i3);
            i3 = i1 + i2;
            i1 = i2;
            i2 = i3;
        } while (i3 < n);
        System.out.println(result.toString());
    }
    public void main() {
        System.out.println("2.1 Find all numbers that are non-multiple 5 and multiples of 3," +
                "and the sum of the digits of which is also non-multiple 5 and is a multiple of 3.");
        first();
        System.out.println("2.2 Find all numbers that are multiples of 5 for numbers from 1 to N.");
        second();
        System.out.println("2.3 Is a given natural number a power of 2?");
        third();
        System.out.println("2.4 In 1202, the Italian mathematician Leonard Pisansky (Fibonacci) proposed the following" +
                "task:\n a couple of rabbits each month gives offspring - two rabbits (male and female), from which two\n" +
                "months later a new offspring is obtained.\nHow many rabbits will there be in a year if there was one " +
                "pair at the beginning of the year?\nAccording to the condition of the problem, the numbers corresponding " +
                "to the number of rabbits\nthat appear every month make up the sequence 1, 1, 2, 3, 5, 8, 13, 21, 37, ...\n" +
                "Create a program that allows you to find all Fibonacci numbers less than a given number N.");
        fourth();
    }
}

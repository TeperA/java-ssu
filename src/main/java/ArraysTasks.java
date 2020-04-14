import java.util.Scanner;

public class ArraysTasks {

    private void first() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the N (int)");
        int n = in.nextInt();
        int[] loop = new int[n];
        for (int i = 0; i < n; i++)
            loop[i] = in.nextInt();
        String odd = "Odds: ";
        String even = "Evens: ";
        for (int i = 0; i < n; i++) {
            if (loop[i] % 2 != 0)
                odd += loop[i] + " ";
            else even += loop[i] + " ";
        }
        System.out.println(even);
        System.out.println(odd);
    }
    private void second(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n (int)");
        int n = in.nextInt();
        System.out.println("Enter the array: (int)");
        int[] loop = new int[n];
        for (int i = 0; i < n; i++){
            loop[i] = in.nextInt();
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            if ((loop[i] % 3 == 0) || (loop[i] % 9 == 0))
                result += loop[i] + " ";
        }
        System.out.println(result);
    }
    private void third() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n (int)");
        int n = in.nextInt();
        System.out.println("Enter the array: (int)");
        int[] loop = new int[n];
        for (int i = 0; i < n; i++){
            loop[i] = in.nextInt();
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            if ((loop[i] % 5 == 0) || (loop[i] % 10 == 0))
                result += loop[i] + " ";
        }
        System.out.println(result);
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    int lcm(int a, int b){
        return Math.abs(a * b) / gcd(a, b);
    }
    private void fourth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n (int)");
        int n = in.nextInt();
        System.out.println("Enter the array: (int)");
        int[] loop = new int[n];
        for (int i = 0; i < n; i++){
            loop[i] = in.nextInt();
        }
        int gcd_pair = loop[0];
        int lcm_pair = loop[0];
        for (int i = 1; i < n; i++){
            gcd_pair = gcd(gcd_pair, loop[i]);
            lcm_pair = lcm(lcm_pair, loop[i]);
        }
        System.out.println("GCD: " + gcd_pair);
        System.out.println("LCM: " + lcm_pair);
    }

    private void firth() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n (int)");
        int n = in.nextInt();
        System.out.println("Enter the array: (int)");
        int[] loop = new int[n];
        for (int i = 0; i < n; i++){
            loop[i] = in.nextInt();
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            //int divisor = 1;
            boolean simple = true;
            for (int j = 2; j <= loop[i]/2; j++) {
                if (loop[i] % j == 0){
                    simple = false;
                    break;
                }
            }
            if (simple) result += loop[i] + " ";
        }
        System.out.println(result);
    }

    private void sixth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n (int)");
        int n = in.nextInt();
        System.out.println("Enter the array: (int)");
        int[] loop = new int[n];
        for (int i = 0; i < n; i++){
            loop[i] = in.nextInt();
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            String string_loop_i = Integer.toString(loop[i]);
            int l = string_loop_i.length();
            if (l % 2 == 0){
                int j = loop[i];
                int[] digits = new int[l];
                int k = 1;
                while (j > 0) {
                    digits[l - k] = j % 10;
                    j = j / 10;
                    k++;
                }
                int sum1 = 0;
                int sum2 = 0;
                for (int m = 0; m < l / 2; m++) {
                    sum1 += digits[m];
                    sum2 += digits[l-1-m];
                }
                if (sum1 == sum2)
                    result += loop[i] + " ";
            }

        }
        System.out.println(result);
    }

    private void seventh() {
        Scanner in = new Scanner(System.in);
        String[] digitnames ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("Enter the digit (from 0 to 9):");
        int n = in.nextInt();
        System.out.println(digitnames[n]);
    }


    public void main() {
        System.out.println("4.1 Enter n integers from the console and put them in an array. Print even and odd numbers on the console.");
        first();
        System.out.println("4.2 Enter n integers from the console and put them in an array. On the console, display numbers that are divided by 3 or 9.");
        second();
        System.out.println("4.3 Enter n integers from the console and put them in an array. On the console, display numbers that are divided by 5 or 10.");
        third();
        System.out.println("4.4 Enter n integers from the console and put them in an array.\n" +
                "On the console, output the largest common divisor and the smallest common multiple of these numbers.");
        fourth();
        System.out.println("4.5 Enter n integers from the console and put them in an array. Print primes to the console.");
        firth();
        System.out.println("4.6 Enter n integers from the console and put them in an array. Print \"lucky\" numbers on the console.");
        sixth();
        System.out.println("4.7 For an arbitrary digit from 0 to 9, display its value in words on the console.\n" +
                "For example, for the number 9, the string “Nine” should be printed on the console.");
        seventh();
    }
}
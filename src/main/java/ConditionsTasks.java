import java.util.Scanner;

public class ConditionsTasks {

    public ConditionsTasks(){}

    private void first(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: (int)");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sumOfSquares = n1 * n1 + n2 * n2;
        int squareOfSum = (n1  + n2) * (n1 + n2);
        if (squareOfSum > sumOfSquares)
            System.out.format("The square of the sum of numbers %d and %d is greater than the sum of their squares.%n", n1, n2);
        else System.out.format("The sum of the squares of numbers %d and %d is greater than the square of their sum.%n", n1, n2);
    }

    private void second(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the salary and years of seniority (from 2 to 5 years): (double)");
        double salary = in.nextDouble();
        double seniority = in.nextDouble();

        double paybonus = (seniority < 5.0) ? salary * 0.02 : salary * 0.05;
        double amount_payable = salary + paybonus;
        System.out.format("The pay bonus is %.2f and amount to be paid %.2f %n", paybonus, amount_payable);
    }

    private void third(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of point A (double):");
        double ax = in.nextDouble();
        double ay = in.nextDouble();
        System.out.println("Enter the coordinates of point B: (double)");
        double bx = in.nextDouble();
        double by = in.nextFloat();
        double aLength = Math.sqrt(ax * ax + ay * ay);
        double bLength = Math.sqrt(bx * bx + by * by);
        if (aLength > bLength)
            System.out.println("Point A is farther from the origin than point B");
        else if (aLength == bLength)
            System.out.println("Point B equidistant with point A from the origin");
        else System.out.println("Point B is farther from the origin than point A");

    }

    private void fourth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the side a:");
        double a = in.nextDouble();
        System.out.println("Enter the value of the side b:");
        double b = in.nextDouble();
        System.out.println("Enter the value of the side c:");
        double c = in.nextDouble();
        double sqr_max = 0;
        double sum_sqr_others = 0;
        if ((a == b) && (b == c))
            System.out.println("The triangle is not rectangular");
        else {
            if ((a > b) && (a > c)){
                sqr_max = a * a;
                sum_sqr_others = b * b + c * c;
            } else if ((b > a) && (b > c)) {
                sqr_max = b * b;
                sum_sqr_others = a * a + c * c;
            } else if ((c > a) && (c > b)) {
                sqr_max = c * c;
                sum_sqr_others = a * a + b * b;
            }

            if (sqr_max == sum_sqr_others)
                System.out.println("The triangle is rectangular");
            else System.out.println("The triangle is not rectangular");
        }
    }

    private void fifth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: (int)");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        n1 = (n1 > 0) ? n1 * n1 : n1;
        n2 = (n2 > 0) ? n2 * n2 : n2;
        n3 = (n3 > 0) ? n3 * n3 : n3;
        System.out.format("%d, %d, %d %n", n1, n2, n3);
    }

    private void sixth(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of the month: (int)");
        int month = in.nextInt();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn"); break;
            default:
                System.out.println("An invalid number was entered.");
        }
    }

    public void main() {
        System.out.println("1.1 Enter two numbers from the keyboard. Determine which is greater, the sum of the squares or the square of the sum of these numbers.\n" +
                "The response is displayed as a message.");
        first();
        System.out.println("1.2 Calculate the salary bonus for seniority, if the seniority is from 2 to 5 years, the premium is 2%,\n" +
                "if the seniority is from 5 to 10 years - 5%. Enter the salary and length of service on the keyboard, display the premium and the amount payable.");
        second();
        System.out.println("1.3 Enter the coordinates of points A (x0, y0) and B (x1, y1) from the keyboard.\n" +
                "Determine which of the points A or B is the farthest from the origin (O (0,0)). The response is displayed as a message.");
        third();
        System.out.println("1.4 Enter the values of the three sides of the triangle a, b, and c from the keyboard\n"+
                "and determine whether it is rectangular. The response is displayed as a message");
        fourth();
        System.out.println("1.5 Enter three numbers from the keyboard, positive ones squared, and negative ones left unchanged.");
        fifth();
        System.out.println("1.6 Enter from the screen a number from 1 to 12. By the number of the month,display a message about the time of year.\n" +
                "If the user enters an invalid number, the program should display an error message");
        sixth();

    }
}

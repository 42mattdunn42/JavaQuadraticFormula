import java.util.Scanner;
/**
 * A program that will solve a quadratic equation for its roots
 */
public class Main {
    static double a, b, c, radical;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Populate A
        System.out.printf("Input a: ");
        try {
            a = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Your input was not a number");
            System.exit(3);
        }
        //Populate B
        System.out.printf("Input b: ");
        try {
            b = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Your input was not a number");
            System.exit(3);
        }
        //Populate C
        System.out.printf("Input c: ");
        try {
            c = s.nextDouble();
        } catch (Exception e) {
            System.out.println("Your input was not a number");
            System.exit(3);
        }
        s.close();
        //Calculate value under the radical
        radical = b*b - 4*a*c;
        //Output correct answer
        b = -1*b;
        a = 2*a;
        if(radical < 0){
            System.out.println("Your roots are imaginary!");
            String numerator = Double.toString(b) + " +- sqrt(" + Double.toString(radical) + ")";
            System.out.println(numerator);
            for(int i = 0; i < numerator.length(); i++){
                System.out.printf("_");
            }
            System.out.printf("%n");
            for(int i = 0; i < numerator.length() / 2; i++){
                System.out.printf(" ");
            }
            System.out.printf("%s%n", Double.toString(a));
        }else{
            double outP = (b + Math.sqrt(radical)) / a;
            double outM = (b - Math.sqrt(radical)) / a;
            if(outP > outM)
                System.out.printf("Your solution set is ( %f , %f )", outM, outP);
            else
                System.out.printf("Your solution set is ( %f , %f )", outP, outM);
        }
    }
}
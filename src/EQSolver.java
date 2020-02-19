public class EQSolver {
    public static void main (String[] args){

        double a =9 ;
        double b = 9;
        double c = 3;

        double x1;
        double x2;;

        x1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        if ((b * b - 4 * a * c) < 0) {
            System.out.println("There is no solution");
            return;
        } else if (x1 == 0 || x2 == 0) {
            System.out.println("There is only one root");
            return;
        }
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}

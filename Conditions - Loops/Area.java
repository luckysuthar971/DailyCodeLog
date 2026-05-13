import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. To find circle area");
        System.out.println("2. To find area of square");
        System.out.println("3. TO find area of rectangle");
        char ch = sc.next().trim().charAt(0);

        if(ch == '1'|| ch == '2'|| ch == '3'){
            if(ch == '1'){
                System.out.print("Enter radius of circle : ");
                double r = sc.nextDouble();
                double circle = 3.14 * r * r;
                System.out.printf("Area of circle : %.2f\n", circle);
            }
            else if (ch == '2'){
                System.out.print("Enter side of square :");
                double s = sc.nextDouble();
                double square = s * s;
                System.out.printf("Area of Square : %.2f\n" , square);
            }
             else if (ch == '3'){
                System.out.print("Enter length : ");
                double l = sc.nextDouble();
                System.out.print("Enter width :");
                double w = sc.nextDouble();
                double Rectangle = l * w;
                System.out.printf("Area of Rectangle : %.2f\n" , Rectangle);
            }
        }else{
            System.out.println("Invalid choice !!");
        }
        sc.close();
    }
}
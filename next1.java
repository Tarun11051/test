import java.util.Scanner;
public class next1{
        public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the radius");
                double r=sc.nextInt();
                double a=3.14*r*r;
                System.out.println(a);
                sc.close();
        }
}


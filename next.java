import java.util.Scanner;
public class next{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the area");
	        double a=sc.nextInt();
		System.out.println("enter the radius");
		int r=sc.nextInt();
		a=3.14*r*r;
		sc.close();
	}
}


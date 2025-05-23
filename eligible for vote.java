import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Age");
	    int age=sc.nextInt();
	    if(age>=0 && age<=100){
	        if(age>=18){
	            System.out.println("eligible for vote");
	        }
	        else{
	            System.out.println("not eligible for vote");
	        }
	    }
	    else{
	       System.out.println("ente a valid Age");
	   }
	}
}

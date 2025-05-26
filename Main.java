public class Main
{
	public static void main(String[] args) {
		int age=21;
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

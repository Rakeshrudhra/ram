
package rakesh;
import java.util.Scanner;
public class amstrong_number {
	
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int a=sc.nextInt(),remainder=0,amstrong=0;
		int temp=a;
		int original=temp;
		int count=(int)Math.floor(Math.log10(temp)) + 1;
		
		
		while(temp>0) {
			remainder=temp%10;
			amstrong+=(Math.pow(remainder, count));
			temp=temp/10;
			
		}
		if(original==amstrong) 
		System.out.println("its a amstrong number"+amstrong);
	
		else 
			System.out.println("its not a amstrong number"+ amstrong);
	}
}


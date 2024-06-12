package Queue__Even_Odd;
import java.util.Scanner;

public class printerQueue {

	public static void main(String[] args) {
	
		QueueX mainq=new QueueX(5);
		Scanner number=new Scanner(System.in);
		int n;
		
		for(int i=1;i<=5;i++) {
		 System.out.println("enter number "+i+":");
		 n=number.nextInt();
		 mainq.insert(n);
		 
		}
		
		QueueX evenque=new QueueX(5);
		QueueX oddque=new QueueX(5);
		
		int value;
		while(!mainq.isEmpty()) {
			value=mainq.remove();
			if(value %2 ==0) {
				evenque.insert(value);
				
			}
			else {
				oddque.insert(value);
				
			}
		}
		
		System.out.println("PC1 :");
		while(!evenque.isEmpty()) {
			System.out.println("Transsaction id ="+evenque.remove());
		}
		
		System.out.println("PC2 ::");
		while(!oddque.isEmpty()) {
			System.out.println("Transsaction id ="+oddque.remove());
		}
		

	}

}

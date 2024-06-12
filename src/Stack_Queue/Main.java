package Stack_Queue;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int arraysize=5;
		
		Queue quearray=new Queue(arraysize);
		
		Stack stackarray=new Stack(arraysize);
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<arraysize;i++) {
			System.out.println("enter character :");
			char c=sc.next().charAt(0);
			quearray.insert(c);
		}
		
		
		for(int i=0;i<arraysize;i++) {
			stackarray.push(quearray.remove());
		}
		for(int i=0;i<arraysize;i++) {
			quearray.insert(stackarray.pop());
		}
		for(int i=0;i<arraysize;i++) {
			System.out.println(quearray.remove());
		}
	}

}

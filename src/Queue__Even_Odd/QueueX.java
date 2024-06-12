package Queue__Even_Odd;

public class QueueX {

			private int queueArr[];
			private int maxSize;
			private int rear;
			private int front;
			private int noItems; 
			
			public  QueueX(int s) {
				maxSize=s;
				queueArr=new int[maxSize];
				front=0;
				rear=0;
				noItems=0;
			}
			
			public void insert(int j) {
				if(rear==maxSize-1) {
					
					System.out.println("isFull");
					
				}
				else {
					noItems++;
					 queueArr[rear++]=j;
				}
			}
			public int remove() {
				if(noItems==0) {
					System.out.println("isEmpty");
					return -1;
				}
				else {
					noItems--;
					return queueArr[front++];
				}
			}
			
			public boolean isFull() {
				return (rear==maxSize-1);
			}
			public boolean isEmpty() {
				return (noItems==0);
			}
}

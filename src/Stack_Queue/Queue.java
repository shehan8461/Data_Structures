package Stack_Queue;

public class Queue {
private char [] quearray ;
private int rear;
private int front;
private int maxsize;
private int nItems;

public Queue(int s) {
	maxsize=s;
	quearray=new char [maxsize];
	rear=-1;
	front=0;
	nItems=0;
	
}
public boolean isEmpty() {
	return (nItems==0);
}

public boolean isFull() {
	return (rear==(maxsize-1));
}

public void insert(char i) {
	if(nItems==maxsize) {
		System.out.println("queue is full");
	}else {
		if(rear==maxsize-1) 
			rear=-1;
		quearray[++rear]=i;
		nItems++;
		
	}
}

public char remove() {
	if(nItems==0) {
		System.out.println("queue is empty");
		return '.';
	}else {
		nItems--;
		char temp=quearray[front++];
		if(front==maxsize)
			front=0;
		return temp;
	}
}
}

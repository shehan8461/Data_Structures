package Stack_Queue;

public class Stack {
	
private char [] array;
private int top;
private int maxsize;

public Stack(int s) {
	maxsize=s;
	array=new char [maxsize];
	top=-1;

	
	
}
public boolean isFull() {
	return (top==maxsize-1);
}
public boolean isEmpty() {
	return (top==-1);
}

public void push(char c) {
	
	if(isFull()) {
		System.out.println("stack is full");
	}else {
		array[++top]=c;
		
	}
}
public char pop() {
	if(isEmpty()) {
		System.out.println("stack is empty");
		return '.';
	}else {
		return array[top--];
	}
}
public char peek() {
	if(isFull()) {
		System.out.println("stack is empty");
		return '.';
	}else {
		return array[top];
	}
}
}

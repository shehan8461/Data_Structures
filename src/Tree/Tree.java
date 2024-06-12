package Tree;

public class Tree {
Node root;
public void insert(int emp,String Empname) {
	Node newnode=new Node();
	newnode.empno=emp;
	newnode.empname=Empname;
	

	
	if(root==null) {
		root=newnode;
		
	}
	else {
		Node current=root;
		Node parent;
		
		while(true) {
			parent=current;
		  if(emp<current.empno) {
			  
			  current=current.leftchild;
			  if(current==null) {
				  parent.leftchild=newnode;
				  return;
			  }
		  }
		  else {
			  current=current.rightchild;
			  if(current==null) {
				  parent.rightchild=newnode;
				  return;
			  }
		  }
		}
	}
	
	
}
public void inorder(Node localroot) {
	if(localroot!=null) {
		inorder(localroot.leftchild);
		localroot.displaynode();
		inorder(localroot.rightchild);
		
	}
}
public void preorder(Node localroot) {
	if(localroot!=null) {
    localroot.displaynode();
    preorder(localroot.leftchild);
    preorder(localroot.rightchild);
	}
}
public void traverseinorder() {
	inorder(root);
}
public void traversepreorder() {
	preorder(root);
}
}

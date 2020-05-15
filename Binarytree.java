class Node{
	int key;
	Node left,right;
	public Node(int item){
		key=item;
		left=right=null;
	}
}
class Binarytree{
	Node root;
	public Binarytree(int key){
		root = new Node(key);
	}

	public Binarytree(){
		root=null;
	}

	public static void main(String args[]){
		Binarytree t = new Binarytree();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.right=new Node(3);
		System.out.println(root);
	}
}
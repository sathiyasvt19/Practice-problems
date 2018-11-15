import java.util.*;
class Node {
	int data;
	Node left,right;
	Node(int item){
		data=item;
		left=null;
		right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(int item) {
		root=new Node(item);
	}
	BinaryTree() {
		root=null;
	}
	public static void main(String args[]) {
		BinaryTree tree =new BinaryTree();
		List<Node> result=new ArrayList<>();
		tree.root=new Node(25);
		tree.root.left=new Node(15);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(20);
		tree.root.right.left=new Node(27);
		//tree.root.right.right=new Node(7);
		System.out.println("Preorder");
		tree.preOrder(tree.root);
		System.out.println("Inorder");
		tree.inOrder(tree.root);
		System.out.println("postorder");
		tree.postOrder(tree.root);
		System.out.println("Size="+tree.sizeOfBt(tree.root));
		System.out.println("height="+tree.heightBt(tree.root));
		boolean status=tree.roottoLeafPath(tree.root,10,result);
		//System.out.println(status);
		if(status){
            result.forEach(test -> System.out.print(test.data + " "));
        }else{
            System.out.println("No path for sum " + 10); 
        }
        Node res=tree.binarySearch(tree.root,27);
        System.out.println("Binary Search");
        if(res!=null){
        System.out.println(res.data);
        }
        else
        	System.out.println("Not Found");
	}
	void preOrder(Node root) {

		if(root==null)
			return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root){
		if(root==null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	void postOrder(Node root){
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	int sizeOfBt(Node root){
		if(root==null)
			return 0;
		int left=sizeOfBt(root.left);
		int right=sizeOfBt(root.right);
		return left+right+1;
	}
	int heightBt(Node root){
		if(root==null)
			return 0;
		int left=heightBt(root.left);
		int right=heightBt(root.right);
		return Math.max(left,right)+1;
	}
	boolean roottoLeafPath(Node root,int sum,List<Node> path){
		if(root==null)
			return false;
		if(root.left==null && root.right==null){
			if(root.data==sum){
				path.add(root);
				return true;
			}
			else
				return false;
		}
	  if (roottoLeafPath(root.left,sum-root.data,path) || roottoLeafPath(root.right,sum-root.data,path)) {

			path.add(root);
			return true;
		}
		return false;
	}
	Node binarySearch(Node root,int key) {
		if(root==null)
			return null;
		if(key==root.data)
			return root;
		else if(key<root.data)
			return binarySearch(root.left,key);
		else
			return binarySearch(root.right,key);

	}
	// public Node search(Node root, int key){
 //        if(root == null){
 //            return null;
 //        }
 //        if(root.data == key){
 //            return root;
 //        }else if(root.data < key){
 //            return binarySearch(root.right, key);
 //        }else{
 //            return search(root.left, key);
 //        }
 //    }
}




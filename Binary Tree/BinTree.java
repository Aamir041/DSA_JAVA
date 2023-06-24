import java.util.*;

class BinaryTree{
	int value;
	BinaryTree left;
	BinaryTree right;
	BinaryTree(){
		left = null;
		right = null;
	}
}

public class BinTree{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of nodes in BST: ");

		// int n = sc.nextInt();

		// BinaryTree root = null;

		// for(int i=0; i<n; i++){
			
		// 	System.out.print("Enter Value: ");
		// 	int val = sc.nextInt();

		// 	if(i==0){
		// 	    root = createNewNode(val);
		// 	}

		// 	else{
		// 		insertNode(root,val);
		// 	}

		// }

		BinaryTree root = null; 
		root = createNewNode(20);
		insertNode(root, 10);
		insertNode(root, 30);
		insertNode(root, 8);
		insertNode(root, 12);
		insertNode(root, 26);
		insertNode(root, 32);
		insertNode(root, 7);
		insertNode(root, 9);




		System.out.print("Tree: ");
		// inOrder(root);
		// postOrder(root);
		// preOrder(root);

		/* LEVEL WISE TRAVERSAL */
		ArrayList<BinaryTree> q = new ArrayList<BinaryTree> ();
		q.add(root);
		levelOrder(q);
	}

	static BinaryTree createNewNode(int value){
		BinaryTree newNode = new BinaryTree();
		newNode.value = value;
		return newNode;
	}

	static BinaryTree insertNode(BinaryTree node, int value){
		if(node == null){
			node = createNewNode(value);
		}
		else if(node.value > value){
		 	node.left = insertNode(node.left, value);
		}
		else if(node.value < value){
			node.right = insertNode(node.right, value);
		}
		return node;
	}

	static void inOrder(BinaryTree node){
		if(node != null){
			inOrder(node.left);
			System.out.print(node.value+" ");
			inOrder(node.right);
		}
	}

	static void postOrder( BinaryTree node){
		if(node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value+" ");
		}
	}

	static void preOrder(BinaryTree node){
		if(node != null){
			System.out.print(node.value+ " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	static void levelOrder(ArrayList<BinaryTree> q){
		while(q.size() != 0){
			System.out.print(q.get(0).value+" ");
			if(q.get(0).left != null){
				q.add(q.get(0).left);
			}
			if(q.get(0).right != null){
				q.add(q.get(0).right);
			}
			q.remove(0);
		}
	}

}
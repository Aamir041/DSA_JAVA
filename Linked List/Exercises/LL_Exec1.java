class LinkedList{

	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value){
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length=1;
	}

	public void getHead(){
		System.out.println("Head: "+head.value);
	}

	public void getTail(){
		System.out.println("Tail: "+tail.value);
	}

	public void getLength(){
		System.out.println("Length: "+length);
	}

}

public class LL_Exec1{
	public static void main(String[] args) {
		
		LinkedList myLL = new LinkedList(4);
		myLL.getHead();
		myLL.getTail();
		myLL.getLength();
	}
}
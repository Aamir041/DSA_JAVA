class LinkedList{

	class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	}
	
	private Node head;
	private Node tail;
	private int length;

	public LinkedList() {}

	public LinkedList(int value){
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length=1;
	}

	public void prepend(int value){
		Node newNode = new Node(value);
		if(length == 0){
			head = newNode;
			tail = newNode;
		}
		else{
		    // new node pointing to intial frist node
		    newNode.next = head;
		    // making head pointer to point new node so that it becomes first node 
		    head = newNode;
		}
		// length incrementing by +1
		length++;
	}

	public void append(int value){
		Node newNode = new Node(value);
		if(length == 0){
			head = newNode;
			tail = newNode;
		}
		else{
			// making last node's next point towards new node
			tail.next = newNode;
			// making tail pointer point towards new node to make it last node
			tail = newNode;
		}
		// incrementing length by +1
		length++;
	} 

	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println();
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

public class LinkListTut{
	public static void main(String[] args) {
		
		LinkedList myLL = new LinkedList();
		
		myLL.append(2);
		myLL.prepend(1);
		myLL.append(3);

		myLL.printList();

		myLL.getHead();
		myLL.getTail();
		myLL.getLength();
	}
}
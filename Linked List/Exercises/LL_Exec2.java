class LinkedList{
	
	private Node head;
	private Node tail;
	private int length;

	class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}

	LinkedList() {}

	LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
	}

	public void append(int value){
		Node newNode = new Node(value);
		if(length==0){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
		length++;
	}

	public void prepend(int value){
		Node newNode = new Node(value);
		if(length==0){
			head=newNode;
			tail=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
		length++;
	}

	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.value+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public void makeEmpty(){
		head = null;
		tail = null;
		length=0;
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

public class LL_Exec2{
	public static void main(String[] args) {
		
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
	}	
}
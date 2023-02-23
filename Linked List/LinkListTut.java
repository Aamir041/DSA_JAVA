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

	public void removeLast(){
		
		if(head == null){
			System.out.println("List is Empty");
			return;
		}
		
		if(length == 1){
			head = null;
			tail = null;
			length--;
			return;
		}

		Node temp = head;
		Node pre = head;
		
		while(temp.next != null){
			pre = temp;
			temp = temp.next;
		}

		tail = pre;
		tail.next=null;
		length--;
		
	}

	public void removeFirst(){
		if(length == 0){
			System.out.println("List is Empty");
			return;
		}

		if(head == tail){
			head = null;
			tail = null;
			length--;
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
	}

	public Node get(int index) {
		
		if(index > length || index < 0){
			return null;
		}

		Node temp = head;
		for(int i=0; i<index; i++){
			temp = temp.next;
		}

		return temp; 
	}

	public boolean set(int index, int value){
		if(index > length || index <0){
			return false;
		}

		Node temp = get(index);

		temp.value = value;

		return true;
	}

	public boolean insert(int index,int value){
		if(index >length || index <0){
			return false;
		}
		if(index == 0){
			prepend(value);
			return true;
		}

		if(index == length-1){
			append(value);
			return true;
		}

		Node before = get(index-1);
		Node newNode =  new Node(value);
		newNode.next = before.next;
		before.next = newNode;
		length++;
		return true;
	}

	public boolean remove(int index){
		if(index <0 || index > length){
			return false;
		}
		if(index == 0){
			removeFirst();
			return true;
		}

		if(index == length-1){
			removeLast();
			return true;
		}
		
		Node before  = get(index-1);
		Node deleteNode = before.next;
		before.next = deleteNode.next;
		deleteNode.next = null;
		length--;
		return true;

	}

	public void reverseLinkList(){
		Node temp = head;
		head = tail;
		tail = head;
		Node after = temp.next;
		Node before = null;
		
		for(int i=0; i<length; i++){
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
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
		
		myLL.append(85);
		myLL.prepend(69);
		myLL.append(101);
		myLL.append(112);
		myLL.append(196);

		myLL.printList();

		myLL.reverseLinkList();
		
		myLL.printList();
	}
}
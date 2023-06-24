package stackLinkList;

class Node{
    public int data;
    public Node next;
    
    Node(int val){
        data = val;
    }

}

public class Stack {
    private Node top;
    private int height=0;

    Stack(){

    }

    Stack(int val){
        Node newNode = new Node(val);
        top = newNode;
        height=1;
    }

    void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void  getTop(){
        System.out.println("Top: "+top.data);
    }

    public void getHeight(){
        System.out.println("Height: "+height);
    }

    public void push(int val){
        Node newNode = new Node(val);
        if(height == 0){
            top = newNode;
        }
        else{
            
            newNode.next = top;
            top = newNode;
        }
        height++;

    }

    public void pop(){
        if(height == 0){
            System.out.println("Stack Is Empty");
        }
        else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
        }
    }


}

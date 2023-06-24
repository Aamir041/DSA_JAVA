package stackLinkList;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.pop();
        
        myStack.push(10);
        myStack.push(20);
        
        myStack.getTop();
        myStack.getHeight();
        System.out.println("Stack: ");
        myStack.printStack();
        
        myStack.pop();
        myStack.getTop();
        myStack.getHeight();
        System.out.println("Stack: ");
        myStack.printStack();
    }
}

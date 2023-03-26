import java.util.Scanner;

class StackEx {
	int size;
	int[] numbers;
	int top = -1;

	StackEx(int size) {
		this.size = size;
		numbers = new int[this.size];
	}

	void push(int x) {
		if (!isFull()) {
			top++;
			numbers[top] = x;
		} 
		else {
			{
				System.out.println("Cannot Add Stack is Full!");
			}
		}
	}

	void pop() {
		if (!isEmpty()) {
			System.out.println(numbers[top] + " deleted!");
			top--;
		}
		else{
			System.out.println("Cannot Delete Stack is Empty!");
		}
	}

	void display() {
		if(!isEmpty()){
			for (int i = 0; i <= top; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}
		else{
			System.out.println("Stack is Empty!");
		}
	}

	int peek(int index){
		int i = top - index;
		if(i<0){
			System.out.println("Invalid Index");
			return 0;
		}
		return numbers[i];
	}

	boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}
}

public class StackUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size of Array: ");
		
		int size = sc.nextInt();
		StackEx stack1 = new StackEx(size);

		int choice;
		boolean isExit = false;

		while(!isExit){

			System.out.println("\nChoose a a option: ");
			System.out.println("1 -> Add An Number");
			System.out.println("2 -> Delete A Number");
			System.out.println("3 -> Peek at a Index");
			System.out.println("4 -> Peek at top");
			System.out.println("5 -> Display Elements In Array");
			System.out.println("6 -> Exit\n");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice){

				case(1): int number;
				         System.out.print("\nEnter Number: ");
						 number = sc.nextInt();
				         stack1.push(number);
						 System.out.println();
						 break;

				case(2): stack1.pop();
				         break;
				
				case(3): int index;
				         System.out.print("\nEnter index: ");
						 index = sc.nextInt();
						 int peekNum = stack1.peek(index);
						 System.out.println(peekNum);
						 break;
				
				case(4): peekNum = stack1.peek(0);
				         System.out.println(peekNum);
						 break;
				
				case(5): stack1.display();
				         break;
				
				case(6): isExit = true;
				         sc.close();
				         break;
				         

			}
			

		}
	}
}
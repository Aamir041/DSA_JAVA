class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class LinkListAddNumbers{
    public static void main(String[] args) {
        
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l11.next = l12;
        ListNode l13 = new ListNode(3);
        l12.next = l13;
        
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        ListNode l23 = new ListNode(4);
        l22.next = l23;
        

        ListNode result = addTwoNumbers(l11, l21);
        printList(result);

    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int length = 0;
        int value=0;
        int carry =0;

        ListNode head = null;
        ListNode tail = null;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            value = sum % 10;
            carry = sum / 10;

            if(length == 0){
                ListNode newNode = new ListNode(value);
                head = newNode;
                tail = newNode;
                length++;
            }
            else{
                
                ListNode newNode = new ListNode(value);
                tail.next = newNode;
                tail = newNode;
                length++;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null ){
            int sum = l1.val + carry ;
            value = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(value);
            tail.next = newNode;
            tail = newNode;
            l1 = l1.next;
            length++;
        }


        while(l2 != null ){
            int sum = l2.val + carry ;
            value = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(value);
            tail.next = newNode;
            tail = newNode;
            l2 = l2.next;
            length++;
        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            tail.next = newNode;
            tail = newNode;
        }

        return head;
    }

    static void printList(ListNode node){
        System.out.print("[ ");
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.print("]");
    }
}


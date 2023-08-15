public class Stack {
    public static Node head = null;

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    public  void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            newNode.next = head;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop(){
        Node top = head;
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return;
        }
        head = head.next;

    }

    public void peek(){
        Node top = head;
        if(isEmpty()){
            System.out.print("Stack is Empty");
            return;
        }
        System.out.print(top.data);
    }

    public static void main(String[] args){
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        //stk.peek();

        while (!stk.isEmpty()){
            stk.peek();
            stk.pop();

        }

    }
}

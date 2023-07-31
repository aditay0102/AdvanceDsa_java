public class doublyLL {
    private Node head;
    private Node tail;

    private int size;


    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // create node man
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;

        }

        size++;

        newNode.next = head;
        head = newNode;
        newNode.next = tail;
        tail = null;


    }



    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        size++;
        Node temp = head;
        while(temp != tail){
            temp = temp.next;

        }

        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = tail;
        tail.prev = newNode;
    }

    // --------------------------==================--------------------     deletion
    public  void delefirst(){
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;

    }

    public  void deletelast(){
        Node temp = head;
        Node curr = head.next;

        if(head == null){
            System.out.print("it is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }

        while (curr.next != null){
            curr = curr.next;
            temp = temp.next;
        }
        temp.next = null;
    }

    // ============================-----------------------------                        output
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        System.out.print("tail&null");
    }

    public void revdis(){
        Node temp = tail;

        if(head == null){
            System.out.print("this is empty");
        }

        while(temp != head){
            System.out.print(temp.data+"<-");
            temp = temp.prev;
        }
        System.out.print("head");
    }


    public static void main(String[] args){
        doublyLL list = new doublyLL();
        list.addFirst("i");
        list.addFirst("d");
        list.addFirst("a");
       // list.delefirst();

        list.display();
    }

}

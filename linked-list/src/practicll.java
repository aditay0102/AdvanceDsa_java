public class practicll {
    private Node head;
    private int size;

    practicll(){
        size = 0;
    }

   class Node{
        String  data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;

        }
   }
    // ====================------------------------------------        add elements man -------------=====================
    // inteliaze a linked list
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void addMiddle(String data,int n){

        if(n == 0){
            addFirst(data);
            return;
        }else {


            int i = 1;
            Node newNode = head;
            Node temp = new Node(data);


            while (i < n) {
                newNode = newNode.next;
                i++;
            }

            Node thiss = newNode.next;
            newNode.next = temp;
            temp.next = thiss;
        }

                // 8219138890
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        size++;
    }

    // -------------------------------=================================               deletion
    public void deleteFirst(){

        if(head == null){
            System.out.print("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deletemiddle(int n){
        if(n == 0){
            deleteFirst();
            return;
        }
        Node temp = head;

        int i = 1;
        while(i<n){
            temp = temp.next;
            i++;
        }
        Node curr = temp.next;
        temp.next = curr.next;

        size--;

    }


    public void deleteLast(){
        Node temp = head;
        Node nxt = temp.next;
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        while(nxt.next != null){
            nxt = nxt.next;
            temp = temp.next;
        }
        temp.next = null;


    }

    public void reverse(){
        if(head == null && head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode  =   head.next;


        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // updating nodes
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }





    // ------------------------ =================  output
    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.print("list is empty");
        }

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args){
        practicll l = new practicll();
        l.addFirst("a");
     l.addLast("d");
        l.addLast("i");
       // l.deleteLast();
        //l.reverse();
        l.display();
        System.out.println();
       // l.addMiddle("gg",1);
        l.deletemiddle(2);
        l.display();

    }
}

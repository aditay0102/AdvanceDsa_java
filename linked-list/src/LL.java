// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LL {

    private Node head = null;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // addd -operation  first and last;
    public void  addfirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // insert at middle -------------=====================
    public void addmiddle(String data,int n){
        if(n == 0){
            addfirst(data);
            return;
        }

        int i =1;
        Node temp = head;
        Node next = head.next;
        while(i<n){
            temp = temp.next;
            next = temp.next;
            i++;
        }
        Node ths  = new Node(data);
        temp.next = ths;
        ths.next = next;

        size++;
    }

    // add last
    public void  addlast(String data){
        Node temp = new Node(data);
        Node h = head;
        if(head == null){
            addfirst(data);
        }
        while(h.next!= null){
            h = h.next;
        }


            h.next = temp;
            temp.next = null;
    }

    public void display()
    {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    //=================================================== ------------            Deletion
    public void deletefirst(){
        if(head == null){
            System.out.print("the list is empty");
             return;
        }
        size--;
        head = head.next;
    }

    public void deletemiddle(int n){
        if(n == 0){
            deletefirst();
            return;
        }

        if(head == null){
            System.out.print("list is empty");
        }
        int i = 1;

        Node first = head;


        while(i<n){
            first = first.next;
            i++;
        }
        Node second = first.next;
        first.next = second.next;
        size--;
    }

    public void deletelast(){
        if(head == null){
            System.out.print("the list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode= head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void getSize(){
        System.out.println(size);
    }

    public static void main(String[] args){
        LL list = new LL();
        list.addfirst("1");
        list.addfirst("i");
        list.addfirst("am");
        list.addlast("aditya");
        list.addlast("thakur");
        list.addmiddle("99",0);
        list.display();
        System.out.println();
        list.getSize();
        list.deletemiddle(1);
        list.display();



    }
}
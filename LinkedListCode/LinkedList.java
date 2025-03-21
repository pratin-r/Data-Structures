public class LinkedList {
    Node head; //ref variable that is used to hold the reference of next (upcoming) node
    Node tail; //ref variable that holds the 
    int size; // size of LinkedList... default is zero

    public void insertFirst(int data){
        Node newNode = new Node(data); //0x3 //calls the parameterized argument in the Node class
        newNode.next=head; //usually at first, we need to assign the value of next in order to attach the chain of other node
        head=newNode; 
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
        Node node =new Node(data);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertLastWithoutTail(int data){
        if(head==null){
            insertFirst(data);
            return;
        }
        else{
            // temp (a temporary variable) is used to traverse the linked list
            // temp acts as a pointer and is used to hold the address
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node newNode= new Node(data);  // this has no link as of right now with the linked list
            temp.next=newNode;               // now the newly created node address is stored in it(it refers to the previous node)
            size++;
        }   
    }

    public void insert(int data,int index ){  //index=2// created to add elements (objects) in the middle
        if(head==null){
            insertFirst(data);
            return;
        }
        if(tail==null){
            insertLast(data);
            return;
        }
        Node temp=head;
        // i = 1 as the first node is already created and its is where you will start
        for (int i=1;i<index;i++){  // index = 3 ( 0 , 1 (where i is right now) , 2 ); then i -> 1, i -> 2
            temp=temp.next;    // temp is in 2 right now 
        }
        //create a new node
        Node newNode=new Node(data,temp.next);//
        temp.next=newNode;
        size++;
    }

/*  use this if you dont want to display the deleted value

    public void deleteFirst(){
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }
*/

    public int deleteFirst(){
        int data=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data; 
    }

    // public void deleteLast(){
    //     Node temp=head;
    //     for(int i=0;i<size-2;i++){
    //         temp=temp.next;
    //     }
    //     System.out.println(temp.next.data);
    //     temp.next=null;
    //     size--;
    // }

    public int deleteLast(){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;
        }
        int tempval=temp.next.data;
        temp.next=null;
        size--;
        return tempval;
    }

    public Node getReferenceOfIndexGiven(int index){
        Node temp=head;
        for(int i=0;i<index;i++)
        temp=temp.next;
        return temp;
    }

    public int deleteLast1(){
        if(size<=1){
            return deleteFirst();
        }
        //size-2 gives you the reference of second last node
        Node secondLastNode = getReferenceOfIndexGiven(size-2);
        int valueToBeRemoved=tail.data;  // this variable stores the value. 
        tail=secondLastNode;             
        // only after storing a value in temp variable like valueToBeRemoved, the link is removed
        tail.next=null;
        return valueToBeRemoved;
    }

    public int deleteParticular(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=getReferenceOfIndexGiven(index-1);
        int tempval=prev.next.data;
        prev.next=prev.next.next;
        return tempval;
    }

    public Node findNodeForGivenData(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

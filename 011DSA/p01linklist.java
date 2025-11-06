class LinkedListNode{
    int data;
    LinkedListNode next;
    LinkedListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class p01linklist{
   LinkedListNode head;
   void insertatstart(int data){
    LinkedListNode newnode=new LinkedListNode(data);
    if(head==null){
        head=newnode;
    }else{
        newnode.next=head;
        head=newnode;
    }
   } 
   void insertatlast(int data){
    LinkedListNode newnode=new LinkedListNode(data);
    if(head==null){
        head=newnode;
    }else{
        LinkedListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
   }
   void display(){
    LinkedListNode temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
   }
   void deleteatfirst(){
    if(head==null){
        System.out.println("Underflow");
        return;
    }
    head=head.next;
   }
   void deleteatlast(){
    if(head==null){
        System.out.println("Underflow");
    }else{
        LinkedListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
   }
   public static void main(String[] args){
    p01linklist list=new p01linklist();
    list.insertatstart(7);
    list.insertatstart(4);
    list.insertatlast(6);
    list.deleteatlast();
    list.display();
   }
}
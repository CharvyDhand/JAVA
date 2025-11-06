class LinkedListNode{
    int data;
    LinkedListNode next;
    LinkedListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class p02stack{
   LinkedListNode head;
   void push(int data){
    LinkedListNode newnode=new LinkedListNode(data);
    if(isEmpty()){
        head=newnode;
    }else{
        newnode.next=head;
        head=newnode;
    }
   } 
   void display(){
    LinkedListNode temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
   }
   void pop(){
    if(isEmpty()){
        System.out.println("Underflow");
        return;
    }
    head=head.next;
   }
   void peek(){
    if(head==null){
        System.out.println("underflow");
        return;
    }
    System.out.println(head.data);
   }
   boolean isEmpty(){
    if(head==null) return true;
    return false;
   }
   void reverse(){
    LinkedListNode prev=null;
    LinkedListNode next=null;
    LinkedListNode temp=head;
    
   }
   public static void main(String[] args){
    p02stack list=new p02stack();
    System.out.println(list.isEmpty());
    list.push(2);
    list.push(5);
    list.push(7);
    list.push(1);
    list.push(4);
    list.peek();
    list.pop();
    list.pop();
    list.display();
   }

}
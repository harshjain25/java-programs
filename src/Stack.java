import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
        }
    }
    public Stack(){
        top=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isempty(){
        return length==0;
    }

    public void push(int data){
        ListNode temp=new ListNode(data);
        temp.next=top;
        top=temp;
        length++;
    }

    public int pop(){
        if(isempty()){
            throw new EmptyStackException();
        }
        int result=top.data;
        top=top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isempty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(15);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}

class LL2{
    Node head;
    private int size;
    LL2(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addfirst(String data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void addlast(String data){
        Node node=new Node(data);
        if(head==null){
            node=head;
            return;
        }
        Node n=head;
        while(n.next!=null){
            n=n.next;
        }
        n.next=node;
    }
    public void addinbw(int index, String data){
        Node node=new Node(data);
        if(index==0){
            if(head==null){
                node.next=head;
                return;
            }
            node.next=head;
            head=node;
            return;
        }
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
    public void show(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL2 list=new LL2();
        list.addfirst("this");
        list.addlast("list");
        list.addinbw(0,"is");
        list.addinbw(2,"my");
        list.show();
    }
}
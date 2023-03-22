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
                head=node;
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

    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    public void deleteat(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n.next=n.next.next;
            //n1=n.next;
            //n.next=n1.next;
        }
    }

    public static void main(String[] args) {
        LL2 list=new LL2();
        list.addinbw(0,"this");
        list.addlast("list");
        list.addinbw(0,"is");
        list.addinbw(2,"my");
        list.show();
        list.deleteat(1);
        list.show();
    }
}
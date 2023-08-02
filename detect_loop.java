import java.util.*;

class Main{
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    
    static public void push(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }
    
    static public boolean loop_detect(Node h){
        HashSet<Node> s=new HashSet<Node>();
        while(h!=null){
            if(s.contains(h)){
                return true;
            }
            s.add(h);
            h=h.next;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] elements=sc.nextLine().split(" ");
        for(int i=elements.length-1;i>=0;i--){
            push(Integer.parseInt(elements[i]));
        }
        int pos=sc.nextInt();
        if(pos>=0){
            Node current=head;
            while(pos>0 && current!=null){
                current=current.next;
                pos--;
            }
            Node tail=current;
            if(tail!=null){
                current.next=tail;
            }
        }
        if(loop_detect(head)) System.out.println("Loop detected");
        else System.out.println("Loop not detected");
        sc.close();
    }
}
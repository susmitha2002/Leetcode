class MyHashSet {
    node head;
    node last;
    public MyHashSet() {
        head=null;
        last=null;
    }
    
    public void add(int key) {
        if(contains(key)==true){
            return ;
        }
        node temp=new node(key);
        if(head==null){
            head=last=temp;
        }
        else{
            last.next=temp;
            last=temp;
        }
    }
    
    public void remove(int key) {
        if(contains(key)==false){
            return ;
        }
        if(head.data==key){
            head=head.next;
            return;
        }
        node temp=head;
        node prev=null;
        while(temp!=null){
            if(temp.data!=key){
                prev=temp;
                temp=temp.next;
            }
            else{
                break;
            }
        }
        if(temp==last){
            prev.next=null;
            last=prev;
        }
        prev.next=temp.next;
    }
    
    public boolean contains(int key) {
        node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
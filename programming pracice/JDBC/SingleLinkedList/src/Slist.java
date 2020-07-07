public class Slist {
    node head;
    int size;
    Slist()
    {
        head=null;
size=0;
    }

    public int getSize() {
        return size;
    }

    void insert(node newNode )
    {
        newNode.setNext(head);
        head=newNode;
size++;
    }
    int delete()
    {
        int deleter=head.getValue();
        head=head.next;
        size--;
        return deleter;
    }
}

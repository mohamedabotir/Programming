public class node {
    int value;
    node next;
    node(node next,int value)
    {
        this.next=next;
    this.value=value;
    }

    public int getValue() {
        return value;
    }

    public node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(node next) {
        this.next = next;
    }
}

package edu.escuelaing.arem.util;

public class Node<E> {

    private Node next = null;
    private E val;

    public Node(E e) {
        this.val = e;
    }

    public E getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public boolean hasNext(){
        if (next != null){
            return true;
        }else {
            return false;
        }
    }

    public void setNext(Node next) {
        this.next = next;

    }
}

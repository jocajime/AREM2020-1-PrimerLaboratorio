package edu.escuelaing.arem.util;

import java.util.Iterator;

public class IteratorLinked<E> implements Iterator<E> {

    private LinkedList<E> lista = null;
    private Node<E> actual = null;


    public IteratorLinked(LinkedList<E> lista){
        this.lista = lista;
        this.actual = lista.getFirst();
    }

    public void setActual(Node actual) {
        this.actual = actual;
    }

    @Override
    public boolean hasNext() {
        if (actual == null){
            actual= lista.getFirst();
            return false;
        }else {
            return true;
        }
    }

    @Override
    public E next() {
        E resultado = actual.getVal();
        actual = actual.getNext();
        return resultado;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Jo
 */
public class ArbolB {
    private Nodo head;
    
    public ArbolB(){
        this.head= null;
    }
    
    public void add(Object dato){
        //Método para agregar el nuevo elemento
    }
    
    public Nodo buscar(String dato){
        //Método para buscar un elemento y si no lo encuentra devuelve null
        return null;
    }
    
    public boolean isEmpty(){
        //Método para verificar si el árbol está vacio
        return this.getHead() == null;
    }
    
    public void recorrer(Nodo actual){
        if (actual == null){
            return;
        }
        System.out.println("Palabra: " +actual.getDato().toString()+" Ocurrencias: "+actual.getContador());
        recorrer(actual.getIzquierda());
        recorrer(actual.getDerecha());
    }

    /**
     * @return the head
     */
    public Nodo getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Nodo head) {
        this.head = head;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Jo
 */
public class Lista {
    private NodoL head;
    private NodoL ultimo;
    
    public Lista(){
        this.head = null;
    }
    
    public void insertar(Object dato){
        NodoL nuevo = new NodoL(dato);
        
        if (this.isEmpty()){
            this.head = nuevo;
            this.ultimo = nuevo;
        }else{
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public interface IPila {
    public int longitud();
    public boolean esVacia();
    public void push(Object o);
    public Object pop();
    public Object primero();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_Pedido;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugoh
 */
public class Pedido {
    private int numero;
    private String cliente;
    private List<Item> lista;
    
    public Pedido (int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        lista = new ArrayList<Item>();
    }
    
    public void adicionaItem(Item item) {
        lista.add(item);
    }
    
    public void removeItem(Item item) {
        lista.remove(item);        
    }
    
    public double calcularTotal() {
        double total = 0;
        for (int i =0; i<lista.size(); i++) {
            Item umItem = lista.get(i);
            total=total + umItem.calcularCustoItem();
        }
        return total;
    }
    
    public void imprimir() {
        System.out.println("Pedido:" + numero);
        System.out.println("Cliente:" + cliente);
        
        System.out.println("Itens:");
        for (int i = 0; i < lista.size(); i++) {
            Item umItem = lista.get(i);
            System.out.print("*");
            umItem.imprime();
        }
        System.out.print("Total do pedido:" + calcularTotal());
    }
    
    
}

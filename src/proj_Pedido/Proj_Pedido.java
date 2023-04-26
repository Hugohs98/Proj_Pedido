/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_Pedido;

/**
 *
 * @author hugoh
 */
public class Proj_Pedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item it1, it2, it3;
        it1 = new Item(100, 3, 3);
        it2 = new Item(101, 2, 4);
        it3 = new Item(102, 1, 5);
        
        Pedido pedido1 = new Pedido (1001, "Ana");
        
        pedido1.adicionaItem(it1);
        pedido1.adicionaItem(it2);
        pedido1.adicionaItem(it3);
        
        
        pedido1.removeItem(it3);
        pedido1.imprimir();
        // TODO code application logic here
    }
    
}

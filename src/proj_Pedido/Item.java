/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_Pedido;

/**
 *
 * @author hugoh
 */
public class Item {
    private int codigo;
    private int quantidade;
    private double preco;
    
    public Item (int codigo, int quantidade, double preco) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;    
    }
    
    public double calcularCustoItem() {
        return quantidade*preco;
    }
    
    public void imprime() {
        System.out.println("Código Item" + codigo);
        System.out.println("Quantidade:" + quantidade);
        System.out.println("Preço:" + preco);
    }
}

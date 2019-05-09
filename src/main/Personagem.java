
package main;

/**
 *
 * @author johnny
 */
public class Personagem {
    
    public String nome;
    private int itemAtual = -1;
    
    public Personagem(String nome) {
        this.nome = nome;
    }
    
    public void exibirItem(){
        if(this.itemAtual != -1) {   
            Item item = new Item();
            String nomeItem = item.getNomeItem(itemAtual);
            String descItem = item.getDescItem(itemAtual);

            System.out.println("----------------");
            System.out.println("Item: "+nomeItem+"\n");
            System.out.println("----------------");
            System.out.println(descItem);
            System.out.println("\n----------------\n");
            
        } else {
            System.out.println("Nenhum item coletado!\n");
        }
    }
    
    public void setItem(int idItem){
       this.itemAtual = idItem; 
    }
}

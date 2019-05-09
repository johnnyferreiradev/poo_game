
package main;

public class Jogo {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Johnny");
        p1.exibirItem();
        
        p1.setItem(0);
        
        p1.exibirItem();
        
        /**
        int idItem1 = item1.getIdItem();
        int idItem2 = item2.getIdItem();
        
        System.out.println("id1 = "+idItem1);
        System.out.println("id2 = "+idItem2);
        */
    }
}

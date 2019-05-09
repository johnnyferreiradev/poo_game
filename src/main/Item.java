
package main;

/**
 *
 * @author johnny
 */
class Item {
    
    private String itens[][] = {
        {"item1","desc1"},
        {"item2","desc2"},
        {"item3","desc3"},
        {"item4","desc4"},
        {"item5","desc5"}
    };
    
    public String getNomeItem(int idItem) {
        return itens[idItem][0];
    }
    
    public String getDescItem(int idItem) {
        return itens[idItem][1];
    }
}

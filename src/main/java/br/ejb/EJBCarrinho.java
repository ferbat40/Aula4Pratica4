/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ejb;

import br.crud.itemCompra;
import br.model.Produto;
import java.util.ArrayList;
import java.util.Optional;
import javax.ejb.Stateful;

/**
 *
 * @author Pessoal
 */
@Stateful
public class EJBCarrinho {
    private ArrayList<itemCompra> itensCompra;

    public EJBCarrinho() {
        itensCompra = new ArrayList();
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void add(Produto produto){
        
        
        boolean achou =false;
       for (itemCompra itmcompra: itensCompra){
           if (itmcompra.getProduto().getCodigo()==produto.getCodigo()){
            itmcompra.setQtde(itmcompra.getQtde()+1);
            achou=true;
            break;
           }
       }
        if (achou==false){
            itensCompra.add(new itemCompra(produto,1));
        }
        
    }
    
    
    public ArrayList<itemCompra> getALL(){
        return itensCompra;
    }
    
    
}

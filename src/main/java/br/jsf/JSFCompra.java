/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.crud.itemCompra;
import br.ejb.EJBCarrinho;
import br.model.Produto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author Pessoal
 */
@Named(value = "jSFCompra")
@SessionScoped
public class JSFCompra implements Serializable {

    @EJB
    private EJBCarrinho eJBCarrinho;

    
    
    
    /**
     * Creates a new instance of JSFCompra
     */
    public JSFCompra() {
        
           }
    
    
    public void add(Produto produto){
        eJBCarrinho.add(produto);
    }
    
    
    public ArrayList<itemCompra> getALL(){
       return eJBCarrinho.getALL();
    }
    
}

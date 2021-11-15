/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.crud;

import br.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pessoal
 */
public class CrudProduto {
    
    
    public ArrayList<Produto> getALL(){
    ArrayList<Produto> LProduto = new ArrayList<>();
    LProduto.add(new Produto(1,"MOUSE"));
    LProduto.add(new Produto(2,"WEBCAN"));
    LProduto.add(new Produto(3,"HD"));
    LProduto.add(new Produto(4,"TECLADO"));
    
    return LProduto;
    }
    
}

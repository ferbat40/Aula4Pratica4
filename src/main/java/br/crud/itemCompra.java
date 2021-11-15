/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.crud;

import br.model.Produto;
import lombok.Data;

/**
 *
 * @author Pessoal
 */
@Data
public class itemCompra {
    private Produto produto;
    private int qtde;

    public itemCompra() {
    }

    public itemCompra(Produto produto, int qtde) {
        this.produto = produto;
        this.qtde = qtde;
    }
    
    
    
}

package exceptions;

import produtos.Produto;

public class ProdutoAusenteException extends Exception{
    public ProdutoAusenteException(){
        super("Produto não existe no carrinho!");
    }
}

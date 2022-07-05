package exceptions;

import produtos.Produto;

public class produtoAusenteException extends RuntimeException{
    public <T extends Produto> produtoAusenteException(){
        super("Produto não existe no carrinho!");
    }
}

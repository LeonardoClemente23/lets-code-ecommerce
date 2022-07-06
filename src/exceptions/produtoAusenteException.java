package exceptions;

public class ProdutoAusenteException extends RuntimeException{
    public ProdutoAusenteException(){
        super("Produto não existe no carrinho!");
    }
}

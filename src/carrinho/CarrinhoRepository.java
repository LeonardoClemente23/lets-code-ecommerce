package carrinho;

import java.util.HashMap;

import exceptions.ProdutoAusenteException;
import produtos.Produto;

public class CarrinhoRepository {

    public <T extends Produto> void adicionaProduto(Carrinho carrinho, T produto, int quantidade) {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        lista.put(produto, quantidade);
        carrinho.setListaProdutos(lista);
    }

    public <T extends Produto> void removeProduto(Carrinho carrinho, T produto) throws ProdutoAusenteException {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        if (lista.containsKey(produto)) {
            lista.remove(produto);
            carrinho.setListaProdutos(lista);
        } else {
            throw new ProdutoAusenteException();
        }
    }

    public <T extends Produto> void alteraProduto(Carrinho carrinho, T produto, int novaQuantidade) throws ProdutoAusenteException {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        if (lista.containsKey(produto)) {
            lista.put(produto, novaQuantidade);
        } else {
            throw new ProdutoAusenteException();
        }
    }
}

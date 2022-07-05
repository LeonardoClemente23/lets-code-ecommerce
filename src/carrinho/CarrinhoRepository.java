package carrinho;

import java.util.HashMap;

import exceptions.produtoAusenteException;
import produtos.Produto;

public class CarrinhoRepository {

    public <T extends Produto> void adicionaProduto(Carrinho carrinho, T produto, int quantidade) {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        lista.put(produto, quantidade);
        carrinho.setListaProdutos(lista);
    }

    public <T extends Produto> void removeProduto(Carrinho carrinho, T produto) {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        if (lista.containsKey(produto)) {
            lista.remove(produto);
            carrinho.setListaProdutos(lista);
        } else {
            throw new produtoAusenteException();
        }
    }

    public <T extends Produto> void alteraProduto(Carrinho carrinho, T produto, int novaQuantidade) {
        HashMap<Produto, Integer> lista = carrinho.getListaProdutos();
        if (lista.containsKey(produto)) {
            lista.put(produto, novaQuantidade);
        } else {
            throw new produtoAusenteException();
        }
    }
}

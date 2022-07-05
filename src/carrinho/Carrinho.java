package carrinho;

import java.util.HashMap;

import produtos.Produto;

public class Carrinho {

    private HashMap<Produto, Integer> listaProdutos;

    public Carrinho() {
        listaProdutos = new HashMap<>();
    }

    public HashMap<Produto, Integer> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(HashMap<Produto, Integer> lista) {
        this.listaProdutos = lista;
    }

}

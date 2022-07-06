package compra;

import java.time.LocalDate;
import RegrasFormaDePagamento.FormaPagamento;
import carrinho.Carrinho;
import cliente.Cliente;
import produtos.Produto;

public class Compra {

    private Cliente cliente;
    private Carrinho carrinho;
    private FormaPagamento formaPagamento;
    private LocalDate dataCompra;
    private double valorDaCompra;

    public Compra(Cliente cliente, Carrinho carrinho, FormaPagamento formaPagamento) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.formaPagamento = formaPagamento;
        setDataCompra();
        somarValorTotal();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // public int getIdCarrinho() {
    // return carrinho.getId();
    // }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    private void setDataCompra() {
        this.dataCompra = LocalDate.now();
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public void somarValorTotal() {
        for (Produto item : carrinho.getListaProdutos().keySet()) {
            valorDaCompra += item.getPreco() * carrinho.getListaProdutos().get(item);

        }
    }

    public void imprimeItensComprados() {

        System.out.println("Itens comprados:");

        for (Produto item : carrinho.getListaProdutos().keySet()) {

            System.out.println(carrinho.getListaProdutos().get(item).toString() + " - " + item.toString());

        }

    }

}

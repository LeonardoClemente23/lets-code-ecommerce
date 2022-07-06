package compra;

import java.time.LocalDate;

import RegrasFormaDePagamento.Boleto;
import RegrasFormaDePagamento.CartaoAVista;
import RegrasFormaDePagamento.CartaoParcelado;
import RegrasFormaDePagamento.FormaPagamento;
import RegrasFormaDePagamento.PayPal;
import carrinho.Carrinho;
import cliente.Cliente;
import produtos.Produto;

public class Compra {

    private Cliente cliente;
    private Carrinho carrinho;
    private FormaPagamento formaPagamento;
    private LocalDate dataCompra;
    private double valorDaCompra;
    private Integer parcelas;
    private Boleto boleto;
    private CartaoAVista cartaoAVista;
    private CartaoParcelado cartaoParcelado;
    private PayPal payPal;

    public Compra(Cliente cliente, Carrinho carrinho, FormaPagamento formaPagamento, Integer parcelas) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.formaPagamento = formaPagamento;
        setParcelas(parcelas);
        setDataCompra();
        somarValorTotal();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
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

    public void aprovarCompra() throws Exception {

        switch (this.formaPagamento) {

            case BOLETO:
                this.boleto = new Boleto();
                this.boleto.aprovaCompra();
                break;

            case CARTAO_A_VISTA:
                this.cartaoAVista = new CartaoAVista();
                this.cartaoAVista.aprovaCompra();
                break;

            case CARTAO_PARCELADO:
                this.cartaoParcelado = new CartaoParcelado();
                this.cartaoParcelado.validaNumeroParcelas(parcelas);
                this.cartaoParcelado.aprovaCompra();
                break;

            case PAYPAL:
                this.payPal = new PayPal();
                this.payPal.aprovaCompra();
                break;

        }

    }

    public boolean isCompraAprovada() {

        Boolean resposta = false;

        switch (this.formaPagamento) {

            case BOLETO:
                resposta = this.boleto.isAprovadoCompra();
                break;

            case CARTAO_A_VISTA:
                resposta = this.cartaoAVista.isAprovadoCompra();
                break;

            case CARTAO_PARCELADO:
                resposta = this.cartaoParcelado.isAprovadoCompra();
                break;

            case PAYPAL:
                resposta = this.payPal.isAprovadoCompra();
                break;

        }

        return resposta;

    }

}

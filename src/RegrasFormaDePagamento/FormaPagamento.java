package RegrasFormaDePagamento;

public enum FormaPagamento {

    BOLETO(new Pagamento()),
    CARTAO_PARCELADO(new CartaoParcelado()),
    CARTAO_A_VISTA(new Pagamento()),
    PAYPAL(new Pagamento());

    private Aprovacao tipo;

    FormaPagamento(Aprovacao tipo) {
        this.tipo = tipo;
    }

    public Aprovacao getFormaPagamento() {
        return tipo;
    }

}

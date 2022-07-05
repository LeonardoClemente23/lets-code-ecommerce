package RegrasFormaDePagamento;

public enum FormaPagamento {
    BOLETO(new Pagamento()),
    CARTAO_PARCELADO(new CartaoParcelado()),
    CARTAO_A_VISTA(new Pagamento()),
    PAYPAL(new Pagamento());

    private Aprovacao tipoPagamento;

    FormaPagamento(Aprovacao tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Aprovacao getFormaPagamento() {
        return tipoPagamento;
    }
}

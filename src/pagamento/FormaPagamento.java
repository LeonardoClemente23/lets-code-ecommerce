package pagamento;

public enum FormaPagamento {
    BOLETO(new Boleto()),
    CARTAO_PARCELADO(new CartaoParcelado()),
    CARTAO_A_VISTA(new CartaoAVista()),
    PAYPAL(new PayPal());

    private Aprovacao tipoPagamento;

    FormaPagamento(Aprovacao tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Aprovacao getFormaPagamento() {
        return tipoPagamento;
    }

}

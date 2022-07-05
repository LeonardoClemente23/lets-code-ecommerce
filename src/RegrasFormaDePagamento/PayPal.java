package RegrasFormaDePagamento;

public class PayPal implements Aprovacao {
    private boolean aprovadoCompra;

    public boolean isAprovadoCompra() {
        return aprovadoCompra;
    }

    @Override
    public void aprovaCompra() {
        this.aprovadoCompra = true;
    }

}

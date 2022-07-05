package RegrasFormaDePagamento;

public class CartaoAVista implements Aprovacao {
    private boolean aprovadoCompra;

    public boolean isAprovadoCompra() {
        return aprovadoCompra;
    }

    @Override
    public void aprovaCompra() {
        this.aprovadoCompra = true;

    }

}

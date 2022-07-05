package RegrasFormaDePagamento;

public class Pagamento implements Aprovacao {
    private boolean aprovadoCompra;

    public boolean getPagou() {
        return aprovadoCompra;
    }

    @Override
    public void aprovaCompra() {
        this.aprovadoCompra = true;

    }

}

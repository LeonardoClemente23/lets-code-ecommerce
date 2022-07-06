package pagamento;

public class CartaoParcelado implements Aprovacao {

    private int numeroParcelas;
    private boolean aprovadoCompra;

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void validaNumeroParcelas(int numeroParcelas) throws Exception {
        if (numeroParcelas > 3) {
            throw new Exception("Quantidade de parcelas inválida.");
        }
        this.numeroParcelas = numeroParcelas;
    }

    public boolean isAprovadoCompra() {
        return aprovadoCompra;
    }

    @Override
    public void aprovaCompra() {
        this.aprovadoCompra = true;
    }

}

package RegrasFormaDePagamento;

public class CartaoParcelado implements Aprovacao {
    private int numeroParcelas;

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void validaNumeroParcelas(int numeroParcelas) throws Exception {
        if (numeroParcelas > 3) {
            throw new Exception("Quantidade de parcelas inválida.");
        }
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public void pagar() {
        // TODO Auto-generated method stub

    }

}

package pagamento;

import java.util.Random;

public class Boleto implements Aprovacao {
    private Long codigoDeBarras;
    private boolean aprovadoCompra;

    public Boleto() {
        Random random = new Random();
        Long codigo = random.nextLong();
        if (codigo < 0) {
            codigo *= -1;
        }
        this.codigoDeBarras = codigo;
    }

    public Long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public Boolean isAprovadoCompra() {
        return aprovadoCompra;
    }

    @Override
    public void aprovaCompra() {
        this.aprovadoCompra = true;
    }

}

import java.time.LocalDate;

public class Compra {
    private Cliente cliente;
    private Carrinho carrinho;
    //Forma de pagamento
    private LocalDate dataCompra;

    public Compra(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        setDataCompra();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCarrinho() {
        return carrinho.getId();
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    private void setDataCompra() {
        this.dataCompra = LocalDate.now();
    }

}

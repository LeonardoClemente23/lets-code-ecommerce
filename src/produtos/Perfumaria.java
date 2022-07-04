package produtos;

public class Perfumaria extends Produto {

    private String fragrancia;

    public Perfumaria(String fragrancia, int idProduto, String nome, double preco) {
        this.fragrancia = fragrancia;
        super.setIdProduto(idProduto);
        super.setNome(nome);
        super.setPreco(preco);
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public String toString() {
        return "Eletronico [nome:" + super.getNome() + ",id:" + super.getIdProduto() + ",preço: " + super.getPreco()
                + ",cor:" + this.fragrancia + "]";
    }

}

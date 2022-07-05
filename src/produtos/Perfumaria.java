package produtos;

public class Perfumaria extends Produto {

    private String fragrancia;

    public Perfumaria(String fragrancia, int idProduto, String nome, double preco) {
        this.fragrancia = fragrancia;
        super.setIdProduto(idProduto);
        super.setNome(nome);
        super.setPreco(preco);
        setCategoria();
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public void setCategoria() {
        super.categoria = Produto.CategoriaProduto.PERFUMARIA;
    }

    @Override
    public String toString() {
        return "Perfumaria [nome: " + super.getNome() + ", id: " + super.getIdProduto() + ", preço: " + super.getPreco()
                + ", fragrância: " + this.fragrancia + "]";
    }

}

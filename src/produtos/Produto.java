package produtos;

public abstract class Produto implements Categoria {

    private int idProduto;
    private String nome;
    private double preco;
    protected Produto.CategoriaProduto categoria;

    public enum CategoriaProduto {
        CALCADO, ELETRONICO, PERFUMARIA, VESTUARIO
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public Produto.CategoriaProduto getCategoria() {
        return this.categoria;
    }

}

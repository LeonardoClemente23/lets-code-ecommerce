package produtos;

public class Calcado extends Produto {

    private int numeracao;

    public Calcado(int numeracao, int idProduto, String nome, double preco) {
        this.numeracao = numeracao;
        super.setIdProduto(idProduto);
        super.setNome(nome);
        super.setPreco(preco);
        setCategoria();
    }

    @Override
    public int getIdProduto() {
        return super.getIdProduto();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setIdProduto(int idProduto) {
        super.setIdProduto(idProduto);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public String toString() {
        return "Calçado [nome: " + super.getNome() + ",id: " + super.getIdProduto() + ",preço: " + super.getPreco()
                + ",numeracao: " + this.numeracao + "]";
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public void setCategoria() {
        super.categoria = Produto.CategoriaProduto.CALCADO;
    }

}

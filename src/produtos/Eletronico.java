package produtos;

public class Eletronico extends Produto {
    private String cor;

    public Eletronico(String cor, int idProduto, String nome, double preco) {
        this.cor = cor;
        super.setIdProduto(idProduto);
        super.setNome(nome);
        super.setPreco(preco);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        return "Eletronico [nome:" + super.getNome() + ",id:" + super.getIdProduto() + ",preço: " + super.getPreco()
                + ",cor:" + this.cor + "]";
    }

}

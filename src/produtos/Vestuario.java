package produtos;

public class Vestuario extends Produto {
    private Tamanho tamanho;

    public Vestuario(Vestuario.Tamanho tamanho, int idProduto, String nome, double preco) {
        super.setIdProduto(idProduto);
        super.setNome(nome);
        super.setPreco(preco);
        this.tamanho = tamanho;
    }

    public enum Tamanho {
        P, M, G
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
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
        return "Vestuario [nome:" + super.getNome() + ",id:" + super.getIdProduto() + ",preço: " + super.getPreco()
                + ",tamanho:" + this.tamanho + "]";
    }

}

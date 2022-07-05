import java.util.HashMap;
import java.util.LinkedHashMap;

import exceptions.CategoriaInexistenteException;
import produtos.Calcado;
import produtos.Eletronico;
import produtos.Perfumaria;
import produtos.Produto;
import produtos.Vestuario;

public class Loja {

    private String nomeLoja;
    private Integer ultimaChaveCompras;
    private Integer ultimaChaveProdutoPerfumaria;
    private Integer ultimaChaveProdutoCalcado;
    private Integer ultimaChaveProdutoEletronico;
    private Integer ultimaChaveProdutoVestuario;
    private LinkedHashMap<Integer, Compra> compras = new LinkedHashMap<>();
    private HashMap<Integer, Perfumaria> produtosPerfumaria = new HashMap<>();
    private HashMap<Integer, Calcado> produtosCalcado = new HashMap<>();
    private HashMap<Integer, Eletronico> produtosEletronico = new HashMap<>();
    private HashMap<Integer, Vestuario> produtosVestuario = new HashMap<>();

    public Loja(String nomeLoja) {

        setNomeLoja(nomeLoja);
        this.ultimaChaveCompras = 1;
        this.ultimaChaveProdutoPerfumaria = 1;
        this.ultimaChaveProdutoCalcado = 1;
        this.ultimaChaveProdutoEletronico = 1;
        this.ultimaChaveProdutoVestuario = 1;

    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public void incrementaUltimaChaveCompras() {
        this.ultimaChaveCompras++;
    }

    public void incrementaUltimaChaveProdutoPerfumaria() {
        this.ultimaChaveProdutoPerfumaria++;
    }

    public void incrementaUltimaChaveProdutoCalcado() {
        this.ultimaChaveProdutoCalcado++;
    }

    public void incrementaUltimaChaveProdutoEletronico() {
        this.ultimaChaveProdutoEletronico++;
    }

    public void incrementaUltimaChaveProdutoVestuario() {
        this.ultimaChaveProdutoVestuario++;
    }

    public Integer getUltimaChaveCompras() {
        return ultimaChaveCompras;
    }

    public Integer getUltimaChaveProdutoPerfumaria() {
        return ultimaChaveProdutoPerfumaria;
    }

    public Integer getUltimaChaveProdutoCalcado() {
        return ultimaChaveProdutoCalcado;
    }

    public Integer getUltimaChaveProdutoEletronico() {
        return ultimaChaveProdutoEletronico;
    }

    public Integer getUltimaChaveProdutoVestuario() {
        return ultimaChaveProdutoVestuario;
    }

    public LinkedHashMap<Integer, Compra> getCompras() {
        return compras;
    }

    public HashMap<Integer, Perfumaria> getProdutosPerfumaria() {
        return produtosPerfumaria;
    }

    public HashMap<Integer, Calcado> getProdutosCalcado() {
        return produtosCalcado;
    }

    public HashMap<Integer, Eletronico> getProdutosEletronico() {
        return produtosEletronico;
    }

    public HashMap<Integer, Vestuario> getProdutosVestuario() {
        return produtosVestuario;
    }

    public void adicionarProdutoLoja(Produto produto) {

        switch (produto.getCategoria()) {

            case CALCADO:
                produtosCalcado.put(this.ultimaChaveProdutoCalcado, (Calcado) produto);
                incrementaUltimaChaveProdutoCalcado();
                break;

            case ELETRONICO:
                produtosEletronico.put(this.ultimaChaveProdutoEletronico, (Eletronico) produto);
                incrementaUltimaChaveProdutoEletronico();
                break;

            case PERFUMARIA:
                produtosPerfumaria.put(this.ultimaChaveProdutoPerfumaria, (Perfumaria) produto);
                incrementaUltimaChaveProdutoPerfumaria();
                break;

            case VESTUARIO:
                produtosVestuario.put(this.ultimaChaveProdutoVestuario, (Vestuario) produto);
                incrementaUltimaChaveProdutoVestuario();
                break;

            default:
                throw new CategoriaInexistenteException(produto.getCategoria().toString()); // Unchecked exception

        }

    }

    public void adicionarCompraLoja(Compra compra) {

        compras.put(this.ultimaChaveCompras, compra);
        incrementaUltimaChaveCompras();

    }

}

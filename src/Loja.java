import java.util.HashMap;
import java.util.LinkedHashMap;

import produtos.Calcado;
import produtos.Eletronico;
import produtos.Perfumaria;
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

}

import carrinho.Carrinho;
import carrinho.CarrinhoRepository;
import produtos.Calcado;
import produtos.Eletronico;
import produtos.Perfumaria;
import produtos.Vestuario;

public class App {

    public static void main(String[] args) throws Exception {

        // testesProduto();

        // testesCliente();

        testesLoja();

    }

    public static void testesProduto() {

        Vestuario blusa1 = new Vestuario(Vestuario.Tamanho.P, 111, "blusa descolada", 70.5d);
        System.out.println(blusa1.toString());

        Calcado tenis1 = new Calcado(37, 2001, "Asics run", 652.9);
        System.out.println(tenis1.toString());

        Eletronico relogio1 = new Eletronico("preto", 3001, "Polar M600", 1500.0);
        System.out.println(relogio1.toString());

        System.out.println("\n----------Teste do Carrinho---------");
        Carrinho c1 = new Carrinho();
        CarrinhoRepository cr = new CarrinhoRepository();
        cr.adicionaProduto(c1, blusa1, 2);
        cr.adicionaProduto(c1, relogio1, 1);
        System.out.println(c1.getListaProdutos());

        cr.removeProduto(c1, relogio1);
        cr.adicionaProduto(c1, blusa1, 4);
        System.out.println(c1.getListaProdutos());

        cr.removeProduto(c1, tenis1);
    }

    private static void testesCliente() {

        Cliente cliente1 = new Cliente("Pedro Rosa", "32558741598", "SLRN 416 Bl. M Apto. 206");
        Cliente cliente2 = new Cliente("João Guimarães", "078.956.369-89", "SLRN 106 Bl. B Apto. 204");

        System.out.println(cliente1.getCpfFormatado());
        System.out.println(cliente2.getCpfFormatado());
        System.out.println(cliente1.getCpfLimpo());
        System.out.println(cliente2.getCpfLimpo());

    }

    public static void testesLoja() {

        System.out.println("\n####################### INÍCIO DOS TESTES DE LOJA #######################");

        Loja wallmart = new Loja("WallMart");
        Perfumaria bvlgari = new Perfumaria("Amadeirada, quente e ambarada", 1, "LE GEMME AMBERO EAU DE PARFUM",
                2106.00);
        Perfumaria hadrien = new Perfumaria("Cítrico", 2, "Eau d'Hadrien", 1400.00);
        Eletronico iphone = new Eletronico("Azul SIerra", 1, "Apple iPhone 13 Pro Max (256 GB)", 8135.00);
        Calcado alphafly = new Calcado(39, 1, "Nike Air Zoom Alphafly NEXT% Flyknit Ekiden", 2199.99);
        Vestuario jumpsuit = new Vestuario(Vestuario.Tamanho.P, 1, "Jersey jumpsuit with DG logo", 3567.29);

        wallmart.adicionarProdutoLoja(bvlgari);
        wallmart.adicionarProdutoLoja(iphone);
        wallmart.adicionarProdutoLoja(alphafly);
        wallmart.adicionarProdutoLoja(jumpsuit);
        wallmart.adicionarProdutoLoja(hadrien);

        System.out.println("\nItens de perfumaria: ");

        for (Integer item : wallmart.getProdutosPerfumaria().keySet()) {

            System.out.println(wallmart.getProdutosPerfumaria().get(item).toString());

        }

        System.out.println("\nItens de eletrônicos: ");

        for (Integer item : wallmart.getProdutosEletronico().keySet()) {

            System.out.println(wallmart.getProdutosEletronico().get(item).toString());

        }

        System.out.println("\nItens de calçados: ");

        for (Integer item : wallmart.getProdutosCalcado().keySet()) {

            System.out.println(wallmart.getProdutosCalcado().get(item).toString());

        }

        System.out.println("\nItens de vestuário: ");

        for (Integer item : wallmart.getProdutosVestuario().keySet()) {

            System.out.println(wallmart.getProdutosVestuario().get(item).toString());

        }

        System.out.println("\n####################### FIM DOS TESTES DE LOJA #######################");

    }

}

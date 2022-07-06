import carrinho.Carrinho;
import carrinho.CarrinhoRepository;
import cliente.Cliente;
import compra.Compra;
import loja.Loja;
import pagamento.FormaPagamento;
import produtos.Calcado;
import produtos.Eletronico;
import produtos.Perfumaria;
import produtos.Vestuario;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("\n####################### INÍCIO DA SIMULAÇÃO DO E-COMMERCE #######################");

        Loja wallmart = new Loja("WallMart");
        Cliente cliente1 = new Cliente("Pedro Rosa", "32558741598", "SLRN 416 Bl. M Apto. 206");
        Cliente cliente2 = new Cliente("João Guimarães", "078.956.369-89", "SLRN 106 Bl. B Apto. 204");
        Carrinho c1 = new Carrinho();
        Carrinho c2 = new Carrinho();
        CarrinhoRepository cr = new CarrinhoRepository();
        Perfumaria bvlgari = new Perfumaria("Amadeirada, quente e ambarada", 1, "LE GEMME AMBERO EAU DE PARFUM",
                2106.00);
        Perfumaria hadrien = new Perfumaria("Cítrico", 2, "Eau d'Hadrien", 1400.00);
        Eletronico iphone = new Eletronico("Azul SIerra", 1, "Apple iPhone 13 Pro Max (256 GB)", 8135.00);
        Calcado alphafly = new Calcado(39, 1, "Nike Air Zoom Alphafly NEXT% Flyknit Ekiden", 2199.99);
        Calcado derby = new Calcado(42, 2, "Oxford Derby Prada (NOT BROGUES)", 6700.00);
        Vestuario jumpsuit = new Vestuario(Vestuario.Tamanho.P, 1, "Jersey jumpsuit with DG logo", 3567.29);
        Vestuario armani = new Vestuario(Vestuario.Tamanho.M, 2, "Terno Giorgio Armani (2 peças)", 22895.00);
        Vestuario moschino = new Vestuario(Vestuario.Tamanho.P, 3, "Moletom Moschino (com capuz e detalhe de bolso)",
                2383.00);

        System.out.println("\nInserindo itens na loja.");

        wallmart.adicionarProdutoLoja(bvlgari);
        wallmart.adicionarProdutoLoja(hadrien);
        wallmart.adicionarProdutoLoja(iphone);
        wallmart.adicionarProdutoLoja(alphafly);
        wallmart.adicionarProdutoLoja(derby);
        wallmart.adicionarProdutoLoja(jumpsuit);
        wallmart.adicionarProdutoLoja(alphafly);
        wallmart.adicionarProdutoLoja(armani);
        wallmart.adicionarProdutoLoja(moschino);

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

        System.out.println("\nAdicionando itens ao carrinho (compra 1): ");
        cr.adicionaProduto(c1, wallmart.getProdutosPerfumaria().get(1), 2);
        cr.adicionaProduto(c1, wallmart.getProdutosEletronico().get(1), 1);
        cr.adicionaProduto(c1, wallmart.getProdutosVestuario().get(1), 1);
        cr.adicionaProduto(c1, wallmart.getProdutosVestuario().get(2), 1);

        System.out.println("\nItens adicionados no carrinho (compra 1): ");
        System.out.println(c1.getListaProdutos());

        System.out.println("\nRemovendo o item " + wallmart.getProdutosVestuario().get(2).toString()
                + " do carrinho da compra 1.");
        cr.removeProduto(c1, wallmart.getProdutosVestuario().get(2));

        System.out.println("\nItens adicionados no carrinho (compra 1): ");
        System.out.println(c1.getListaProdutos());

        Compra compra1 = new Compra(cliente1, c1, FormaPagamento.CARTAO_PARCELADO, 3);

        try {

            compra1.aprovarCompra();
            if (compra1.isCompraAprovada()) {
                System.out.println("\nCompra aprovada! Forma de pagamento: " + compra1.getFormaPagamento().toString());
                wallmart.adicionarCompraLoja(compra1);
            } else
                System.out.println("\nCompra não aprovada.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println("\nCompra 1: ");
        System.out.println(wallmart.getCompras().get(1).getCliente().toString());
        wallmart.getCompras().get(1).imprimeItensComprados();
        System.out.println("Valor total da compra: " + wallmart.getCompras().get(1).getValorDaCompra());

        System.out.println("\nAdicionando itens ao carrinho (compra 2): ");
        cr.adicionaProduto(c2, wallmart.getProdutosPerfumaria().get(2), 1);
        cr.adicionaProduto(c2, wallmart.getProdutosCalcado().get(2), 1);
        cr.adicionaProduto(c2, wallmart.getProdutosVestuario().get(2), 1);

        System.out.println("\nItens adicionados no carrinho (compra 2): ");
        System.out.println(c2.getListaProdutos());

        Compra compra2 = new Compra(cliente2, c2, FormaPagamento.CARTAO_A_VISTA, 1);

        try {

            compra2.aprovarCompra();
            if (compra2.isCompraAprovada()) {
                System.out.println("\nCompra aprovada! Forma de pagamento: " + compra2.getFormaPagamento().toString());
                wallmart.adicionarCompraLoja(compra2);
            } else
                System.out.println("\nCompra não aprovada.");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println("\nCompra 2: ");
        System.out.println(wallmart.getCompras().get(2).getCliente().toString());
        wallmart.getCompras().get(2).imprimeItensComprados();
        System.out.println("Valor total da compra: " + wallmart.getCompras().get(2).getValorDaCompra());

        System.out.println("\n####################### FIM DA SIMULAÇÃO DO E-COMMERCE #######################");

    }

}

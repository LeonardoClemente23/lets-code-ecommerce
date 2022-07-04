import carrinho.Carrinho;
import carrinho.CarrinhoRepository;
import produtos.Calcado;
import produtos.Eletronico;
import produtos.Vestuario;

public class App {
    public static void main(String[] args) throws Exception {
        testesCliente();
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

}

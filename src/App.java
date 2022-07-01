import produtos.Calcado;
import produtos.Eletronico;
import produtos.Vestuario;

public class App {
    public static void main(String[] args) throws Exception {
        Vestuario blusa1 = new Vestuario(Vestuario.Tamanho.P, 111, "blusa descolada", 70.5d);
        System.out.println(blusa1.toString());

        Calcado tenis1 = new Calcado(37, 2001, "Asics run", 652.9);
        System.out.println(tenis1.toString());

        Eletronico relogio1 = new Eletronico("preto", 3001, "Polar M600", 1500.0);
        System.out.println(relogio1.toString());
    }
}

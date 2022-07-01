import produtos.Calcado;
import produtos.Vestuario;

public class App {
    public static void main(String[] args) throws Exception {
        Vestuario blusa1 = new Vestuario(Vestuario.Tamanho.P, 111, "blusa descolada", 70.5d);
        System.out.println(blusa1.toString());

        Calcado tenis1 = new Calcado(37, 2001, "Asics run", 652.9);
        System.out.println(tenis1.toString());
    }
}

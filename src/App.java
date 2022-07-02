public class App {
    public static void main(String[] args) throws Exception {
        testesCliente();
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

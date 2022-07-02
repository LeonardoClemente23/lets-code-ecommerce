public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {

        this.nome = nome;
        setCpf(cpf);
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfFormatado() {
        String cpfFormatato = String.format("%s.%s.%s-%s", this.cpf.substring(0, 3), this.cpf.substring(3, 6),
                this.cpf.substring(6, 9), this.cpf.substring(9, 11));
        return cpfFormatato;
    }

    public String getCpfLimpo() {
        return cpf;
    }

    public void setCpf(String cpf) {

        if (cpf.length() == 14) {

            if (cpf.substring(3, 4).equals(".") && cpf.substring(7, 8).equals(".")
                    && cpf.substring(11, 12).equals("-")) {

                this.cpf = cpf.replace(".", "").replace("-", "");

            }

        } else {

            this.cpf = cpf;

        }

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
    }

}

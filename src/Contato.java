
public class Contato {

    String nome;
    String telefone;
    String email;
    Integer cpf;
    static int contador = 0;

    public Contato(String nome, String telefone, String email, Integer cpf) {
        if (
                !ValidacaoUtils.isNullOrEmpty(nome) &&
                        !ValidacaoUtils.isNullOrEmpty(telefone) &&
                        !ValidacaoUtils.isNullOrEmpty(email) &&
                        !ValidacaoUtils.isNullOrNegative(cpf)
        ) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.cpf = cpf;
            contador++;
        } else {
            throw new IllegalArgumentException("Dados invalidos!");
        }
    }

    public int getContador() {
        return contador;
    }
}

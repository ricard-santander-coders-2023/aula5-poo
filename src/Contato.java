public class Contato {

    String nome;
    String telefone;
    String email;
    Integer cpf;

    public Contato(String nome, String telefone, String email, Integer cpf) {
        if(isEmptyOrNull(nome) && isEmptyOrNull(telefone) && isEmptyOrNull(email) && isEmptyOrNull(cpf)) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Dados invalidos!");
        }
    }
    boolean isEmptyOrNull(String dado) {
        return dado != null && !dado.isEmpty();
    }
    boolean isEmptyOrNull(Integer dado) {
        return dado != null;
    }


}

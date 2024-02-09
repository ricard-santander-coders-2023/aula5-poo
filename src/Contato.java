public class Contato {

    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        if(nome != null && telefone != null && email != null) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        } else {
            System.out.println("Dados invalidos!!!!!!");
        }

    }


}

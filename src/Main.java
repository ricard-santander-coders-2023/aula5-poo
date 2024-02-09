public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Ricard", "9999-9999", "ricard@email.com");
        Contato contato2 = new Contato(null, "9999-9999", "ricard@email.com");

        System.out.println(contato1.nome);
        System.out.println(contato2.nome);

    }
}


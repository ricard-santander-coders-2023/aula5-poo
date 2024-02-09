public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Ricard", "9999-9999", "ricard@email.com", 109827398);
        System.out.println(contato1.nome);

//        Contato contato2 = new Contato(null, "9999-9999", "ricard@email.com", 0);
//        System.out.println(contato2.nome);

//        Contato contato3 = new Contato("", "9999-9999", "ricard@email.com");
//        System.out.println(contato3.nome);

        Contato contato4 = new Contato(null, "9999-9999", "ricard@email.com", null);
        System.out.println(contato4.nome);
    }
}


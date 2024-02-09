public class Main {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Ricard", "9999-9999", "ricard@email.com", 109827398);
        System.out.println(contato1.nome);
        System.out.println(contato1.getContador());
//        Contato contato2 = new Contato(null, "9999-9999", "ricard@email.com", 0);
//        System.out.println(contato2.nome);

//        Contato contato3 = new Contato("", "9999-9999", "ricard@email.com");
//        System.out.println(contato3.nome);

//        Contato contato4 = new Contato("Joao", "9999-9999", "ricard@email.com", -234);
//        System.out.println(contato4.nome);
        Contato contato5 = new Contato("Vinicius", "9999-9999", "ricard@email.com", 109827398);
        System.out.println(contato5.nome);

        System.out.println(contato5.getContador());
    }
}


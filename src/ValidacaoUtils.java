public class ValidacaoUtils {

    static boolean isNullOrEmpty(String dado) {
        return dado == null || dado.isEmpty();
    }
    static boolean isNullOrNegative(Integer dado) {
        return dado == null || dado < 0;
    }
}

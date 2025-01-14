public class uri1097 {
    public static void main(String[] args) {
        int inicio = 5;
        int fim = 3;
        for (int i = 1; i <= 9; i += 2) {
            inicio += 2;
            fim += 2;
            for (int j = inicio; j >= fim; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
        }
    }
}

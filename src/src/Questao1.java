public class Questao1 {

    private static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);

    }

    /** 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
     * anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
     * informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
     * pertence ou não a sequência.
     * @param num a ser verificado
     * @return se o num tem na sequencia ou não
     */
    public static boolean hasInFibo(int num) {
        if(num < 1) return false;
        int c = 1;
        while (true) {
            if(fibo(c)>num) { return false; }
            else if(fibo(c)==num) return true;
            c++;
       }
    }


    public static void main(String[] args) {
        int numeroInformado = 5;
        System.out.println(numeroInformado + " tem na Sequencia? " + Questao1.hasInFibo(numeroInformado));
    }

}

import java.text.Normalizer;

public class Questao2 {

    private static class AboutText {
        private boolean has;

       private int occurrences;

        public AboutText() {
            this.has = false;
            this.occurrences = 0;
        }


        public void setHas(boolean has) {
            this.has = has;
        }

        public int getOccurrences() {
            return occurrences;
        }

        public void setOccurrences(int occurrences) {
            this.occurrences = occurrences;
        }
    }

    /** 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
     * seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
     * @param text string percorrida
     * @return dados sobre o text
     */
    public static AboutText checkLetterA(String text) {
        AboutText aboutText = new AboutText();
        for (int i = 0; text.length() > i; i++) {
            aboutText.setOccurrences(
                    String.valueOf(text.charAt(i)).equalsIgnoreCase("a") ?
                            aboutText.getOccurrences()+1 : aboutText.getOccurrences()
            );
        }
        aboutText.setHas(aboutText.getOccurrences() > 0);

        return aboutText;
    }

    public static void main(String[] args) {
        String text = "Coca Cola";
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        AboutText aboutText = Questao2.checkLetterA(text);
        System.out.println("Na frase:\n" + text);
        System.out.println("Tem a letra A(a)? " + aboutText.has);
        System.out.println("Quantidade de ocorrências da letra A(a)? " + aboutText.occurrences);
    }
}

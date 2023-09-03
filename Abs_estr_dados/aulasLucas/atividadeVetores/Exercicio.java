public class Exercicio {
    public static void main(String[]args) {
        String[] cores={"vermelho", "verde","azul"};
        System.out.println("Cor antes da modificção:" + cores[1]);cores[1] = "amarelo";
        System.out.println("Cor apos a modificação:" + cores[1]);
    }
}

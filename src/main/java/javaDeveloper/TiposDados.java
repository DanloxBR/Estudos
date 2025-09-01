package javaDeveloper;

public class TiposDados {
    private static String CPF;

    public static void main(String[] args) {
        setCPF("00011122233");
        setCPF(getCPF().substring(0, 3) + "." +
                getCPF().substring(3, 6) + "." +
                getCPF().substring(6, 9) + "-" +
                getCPF().substring(9, 11));
        System.out.println("CPF: " + getCPF());
    }
    public static String getCPF() {
        return CPF;
    }
    public static void setCPF(String cpf){
        CPF = cpf;
    }
}

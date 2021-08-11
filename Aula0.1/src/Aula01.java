
public class Aula01 {

    public static void main(String[] args) {
        byte inteiroPequeno = 1;
        short inteiroCurto = 10;
        int inteiro = 100;
        int inteiro2 = 10;
        long inteiroLongo = 100000000000000000L;

        float real = 1.1f; // real = (float)1.1; 
        double realDuplo = 1.11;

        char caracter = 'a';
        String string = "Aprendendo";
        String string2 = "JAVA!";

        boolean booleano = true;

        System.out.println(inteiroPequeno);
        System.out.println(inteiroCurto);
        System.out.println(inteiro);
        System.out.println(inteiroLongo);
        System.out.println(real);
        System.out.println(realDuplo);
        System.out.println(caracter);
        System.out.println(string);
        System.out.println(booleano);

        System.out.println(string + inteiro);

        System.out.println(string + inteiro + inteiro2);
        System.out.println(string + (inteiro + inteiro2));

        System.out.println(string + " " + inteiro2);

        System.out.println(string + "\n" + inteiro2);

        System.out.printf("%d %d", inteiroPequeno, inteiroCurto, "\\n");

        System.out.printf("%s  a programar em %s", string, string2);
    }
}

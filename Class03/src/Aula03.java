
import javax.swing.JOptionPane;

/**
 *
 * @author Marcela Amorim
 */
public class Aula03 {

    public static void main(String[] args) {

        int contador;
        int teste;
        teste = 0;

        /*Estrutura While - Do While:*/
        while (teste < 10) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        }

        teste = 0;
        do {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        } while (teste < 10);
        

        /*Formas de estruturação do for:*/
        for (contador = 0; contador < 10; contador++) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        }

        for (contador = 0; contador < 10; contador++) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        }

        for (contador = 0, teste = 0; contador < 10; contador++, teste++) {
            JOptionPane.showMessageDialog(null, teste);
        }

        for (;;) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
            if (teste == 10) {
                break;
            }
        }

        for (;;) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
            if (teste == 10) {
                break;
            }
            if (teste != 5) {// Do 4 para o 5 o FATEC não será exibido
                JOptionPane.showMessageDialog(null, "FATEC");
            }
        }
        for (;;) {
            JOptionPane.showMessageDialog(null, teste);
            teste++;
            if (teste == 5) {
                break;
            }
            if (teste != 3) {
                continue;
            }
            JOptionPane.showMessageDialog(null, "FATEC");
            JOptionPane.showMessageDialog(null, "MC");
        }

        saida:
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "i: " + i);
            for (int j = 0; j < 10; j++) {
                JOptionPane.showMessageDialog(null, "j: " + j);
                if (j == 5) {
                    break saida;
                }
            }
        }
        saida:
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "i: " + i);
            for (int j = 0; j < 10; j++) {
                JOptionPane.showMessageDialog(null, "j: " + j);
                if (j == 5) {
                    continue saida;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "i: " + i);
            saida:
            for (int j = 0; j < 10; j++) {
                JOptionPane.showMessageDialog(null, "j: " + j);
                for (int k = 0; k < 10; k++) {
                    JOptionPane.showMessageDialog(null, "k: " + k);
                }
            }
        }
        
        /*Chamada de funções:*/
        funcao();
        int n = 0;
        funcaoRecursiva(n);
    }
    
    /*Estruturação de função:*/
    static void funcao() {
        saida:
        for (int j = 0; j < 10; j++) {
            JOptionPane.showMessageDialog(null, "j: " + j);
            for (int k = 0; k < 10; k++) {
                JOptionPane.showMessageDialog(null, "k: " + k);
            }
            JOptionPane.showMessageDialog(null, "Função chamada!");
        }
    }
    
    /*Estruturação de função recursiva:*/
    static void funcaoRecursiva(int n) {
        if (n == -1) {
            return;
        }
        JOptionPane.showMessageDialog(null, n);
        funcaoRecursiva(n - 1);
    }
}

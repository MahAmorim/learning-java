/**
 *
 * @author Marcela Amorim
*/   
import javax.swing.JOptionPane;
public class Aula02 {
    public static void main (String[] args){
    
        String palavra="Fatec";
        int inteiro = 10;
        int inteiro2 = 10;
        char caracter = 'a'; 
        
        /*System.out.println(palavra); //saída por console
        
        --Exercicio 1
        palavra = JOptionPane.showInputDialog("Digite uma palavra");
        JOptionPane.showMessageDialog(null, palavra); //saída por caixa de msg
        */
        
        /* 
        --Exercicio 2
        palavra = JOptionPane.showInputDialog("Digite um valor");
        inteiro2 =Integer.parseInt(palavra);
        inteiro2 += 10;
        JOptionPane.showMessageDialog(null, "O valor lido acrescido de 10 é: " + inteiro2);
       */
        
        /*
        --Exercicio 3
        palavra = JOptionPane.showInputDialog("Digite uma palavra");
        caracter = palavra.charAt(0); //verificar qual caracter da palavra inserida na posição 0
        JOptionPane.showMessageDialog(null, caracter);
        */   
    
        switch(caracter){
            case 'a': JOptionPane.showMessageDialog(null, "Letra a");
                break;
            case 'b': JOptionPane.showMessageDialog(null, "Letra b");
                break;
            case 'c': JOptionPane.showMessageDialog(null, "Letra c");
                break;            
            default: JOptionPane.showMessageDialog(null, "Letra não mapeada");
        }
        
        int teste;
        teste = 0;
        do{
            JOptionPane.showMessageDialog(null, teste);
            teste++;
        }while(teste < 10);
    }
}

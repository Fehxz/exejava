import javax.swing.JOptionPane;

public class Fatorial {
    
public static void main(String[] args) {
    
int i, numFat;
long fatorial = 1;

       
    numFat = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));

        
    if (numFat <= 0) {
    JOptionPane.showMessageDialog(null, "Erro! Digite um número maior que ZERO");
    } else {
            
    for (i = 2; i <= numFat; i++) {
    fatorial *= i;
    }

    JOptionPane.showMessageDialog(null, "O fatorial de " + numFat + " é igual a: " + fatorial);    

   }
  }
}
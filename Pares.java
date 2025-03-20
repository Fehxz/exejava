import javax.swing.JOptionPane;

public class Pares {
    public static void main(String[] args) {
        
        String numFinal_str, numInicial_str;
        int numFinal, numInicial, temp , i ,somaPares = 0;


        numInicial_str = JOptionPane.showInputDialog("Digite o primeiro número: ");
        numInicial = Integer.parseInt(numInicial_str);

        numFinal_str = JOptionPane.showInputDialog("Digite o segundo número: ");
        numFinal = Integer.parseInt(numFinal_str);

        
        if (numInicial > numFinal) {
            
            temp = numInicial;
            numInicial = numFinal;
            numFinal = temp;
        }

        for ( i = numInicial; i <= numFinal; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números pares entre " + numInicial + " e " + numFinal + " é: " + somaPares);
    }
}

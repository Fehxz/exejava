import javax.swing.JOptionPane;

public class Senha {
    public static void main(String[] args) {

        final char SenhaCorreta = 'F'; 
        int tentativas = 0;
        String input;

        while (tentativas < 3) {

            input = JOptionPane.showInputDialog("Digite a senha de acesso (dica: apenas uma letra):");
            
           
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                
                return;
            }

            if (input.charAt(0) == SenhaCorreta) {
                JOptionPane.showMessageDialog(null, "Acesso liberado");

                return; 
            } else {
                tentativas++;
                JOptionPane.showMessageDialog(null, "Senha incorreta. Tentativas restantes: " + (3 - tentativas));
            }
        }



      
    }
}
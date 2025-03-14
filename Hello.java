import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        int eleitores = 0, totalNaoEleitores = 0, qntNaoEleitores = 0, i = 0, idade;
        double mediaNaoEleitores;
        Scanner sc = new Scanner(System.in); 

            while (i < 10) {
            
            System.out.print("Digite a idade do " + (i + 1) + " aluno: ");
            idade = sc.nextInt();  

            if (idade >= 16) {
                eleitores++;
            } else {
                totalNaoEleitores += idade;
                qntNaoEleitores++;
            }

            i++;
        }

        mediaNaoEleitores = (qntNaoEleitores > 0) ? (double) totalNaoEleitores / qntNaoEleitores : 0;

        
        System.out.println("Quantidade de alunos que podem ser eleitores: " + eleitores);
        System.out.println("Media de idade dos alunos que ainda nao podem ser eleitores: " + String.format("%.2f", mediaNaoEleitores));

        sc.close();  
    }
}
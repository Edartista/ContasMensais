package contasmensais;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ContasMensais {
    public static void main(String[] args) {
        
        try{
        List <Orçamento> orçamento = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quanto foi o pagamento nesse mês? R$");
        double pagamento = teclado.nextDouble();
        
        System.out.print("Quantas contas deseja cadastrar? ");
        int contas = teclado.nextInt();
        
        for (int i=0; i<contas; i++){
            teclado.nextLine();
            System.out.println();
            System.out.print("Nome da conta: ");
            String nome = teclado.nextLine();
            System.out.print("Valor da conta: R$");
            double valor = teclado.nextDouble();
            pagamento -= valor;
            orçamento.add(new Conta(nome, valor));
        }
        
        System.out.println("Relatório das contas mensais:");
        for (Orçamento o : orçamento){
            System.out.println();
            System.out.println(o);
        }
        
        System.out.printf("O saldo final disponível é de R$%.2f \n", pagamento);
        }
        
        catch(InputMismatchException e){
            System.out.println("Erro: você deve digitar um valor numérico.");
        }
    }
    
}

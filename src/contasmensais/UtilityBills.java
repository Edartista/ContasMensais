package contasmensais;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UtilityBills{
    public static void main(String[] args) {
        
        try{
        List <Budget> budget = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Wage's total? R$");
        double pagamento = teclado.nextDouble();
        
        System.out.print("How many bills do you need to pay? ");
        int contas = teclado.nextInt();
        
        for (int i=0; i<contas; i++){
            teclado.nextLine();
            System.out.println();
            System.out.print("Account's name: ");
            String name = teclado.nextLine();
            System.out.print("Value: R$");
            double value = teclado.nextDouble();
            pagamento -= value;
            budget.add(new Account(name, value));
        }
        
        System.out.println();
        System.out.println("Relatório das contas mensais:");
        
        for (Budget o : budget){
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

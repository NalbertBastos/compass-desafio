
import java.util.Scanner;

/**
 *
 * @author Nalbert
 */
public class Bonus {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos funcionários vai cadastrar?");
        int x = ler.nextInt();
        String [] funcionario = new String[x];
        double [] salario = new double[x];
        
        for(int i = 0;i<funcionario.length;i++){
            System.out.println("Informe o nome do funcionário");
            funcionario[i] = ler.next();
            System.out.println("Informe o salário do funcionário");
            salario[i] = ler.nextDouble();
            System.out.println("Funcionario: " + funcionario[i]);
            System.out.println("Salário: " + salario[i]);
            
            calculaBonus(salario[i]);
            
        }
        
    }
    public static double calculaBonus(double salario){
        if(salario<=1000 && salario >0){
            System.out.println("Bonus: " + (salario*20)/100);
            System.out.println("Salário liquido: ");
            System.out.println(salario+((salario*20)/100));
            
        }else if(salario<=2000 && salario > 1000){
            System.out.println("Bonus: " + (salario*10)/100);
            System.out.println("Salário liquido: ");
            System.out.println(salario+((salario*10)/100));
            
        }else if(salario>2000){
            System.out.println("Desconto: " + (salario*10)/100);
            System.out.println("Salário liquido: ");
            System.out.println(salario-((salario*10)/100));
            
        }
        
        return salario;
    }
    
}

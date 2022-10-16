/**
 *
 * @author Nalbert
 */
import java.util.Scanner;
import java.util.Calendar;

public class Login {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
        String [] login = {
            "usuario1",
            "usuario2",
            "usuario3"
        };
        String [] senhas = {
            "senha1",
            "senha2",
            "senha3"
        };
        
        int tentativa = 0 ;
        
        do{
            System.out.println("Informe Login:");
            String user = ler.next();
            System.out.println("Informe Senha:");
            String senha = ler.next();
            if(login[0].equals(user)&& senhas[0].equals(senha) 
                || login[1].equals(user)&& senhas[1].equals(senha) 
                || login[2].equals(user)&& senhas[2].equals(senha)){
               entra();
               tentativa = 2;
               
            }else{
                erro();
                System.out.println("Deseja tentar novamente? sim = 1 ou não = 2");
                tentativa = ler.nextInt();
                
            }
        }while(tentativa != 2);  
    }
    
    public static void entra(){
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);
        
        if(hora > 6 && hora < 12){
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        }else if(hora > 12 && hora < 18){
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        }else if(hora > 18 && hora < 0){
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        }else {
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
    }
    public static void erro(){
        String msg = "Usuário e/ou senha incorretos.";
        System.out.println(msg);
    }
}

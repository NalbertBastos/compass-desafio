import java.util.Scanner;
/**
 *
 * @author Nalbert
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("informe seu nome");
        String NomeUser = ler.next();
        
        String [] questoes = {
            "[1]Normalmente, quantos litros de sangue uma pessoa tem?",
            "[2]De quem é a famosa frase “Penso, logo existo”?",
            "[3]De onde é a invenção do chuveiro elétrico?",
            "[4]Quais o menor e o maior país do mundo?",
            "[5]Qual o nome do presidente do Brasil que ficou conhecido como Jango?"
            
        };
        String [] respostas ={
            "a) Tem entre 2 a 4 litros.\n" + "b) Tem entre 4 a 6 litros.\n" + "c) Tem 10 litros.",
            "a) Platão\n" + "b) Galileu Galilei\n" + "c) Descartes",
            "a) França\n" + "b) Inglaterra\n" + "c) Brasil",
            "a) Vaticano e Rússia\n" + "b) Nauru e China\n" + "c) Mônaco e Canadá",
            "a) Getúlio Vargas\n" + "b) João Figueiredo\n" + "c) João Goulart"
        };
        
        int score = 0;
        int errado = 0;
       
            System.out.println(questoes[0]);
            System.out.println(respostas[0]);
            String r= ler.next();
            if("b".equals(r)  || "B".equals(r)){
               System.out.println("Acertou");
                 score++;
            }else{
               System.out.println("Errou");
               errado++;
            }
          
            
            
            System.out.println(questoes[1]);
            System.out.println(respostas[1]);
                String r2= ler.next();
                if("c".equals(r2)  || "C".equals(r2)){
                    System.out.println("Acertou");
                    score++;
                }else{
                    System.out.println("Errou");
                    errado++;
                }
            
            
            System.out.println(questoes[2]);
            System.out.println(respostas[2]);
                String r3= ler.next();
                if("c".equals(r3)  || "C".equals(r3)){
                    System.out.println("Acertou");
                    score++;
                }else{
                    System.out.println("Errou");
                    errado++;
                }
           
            
            System.out.println(questoes[3]);
            System.out.println(respostas[3]);
            String r4= ler.next();
                if("a".equals(r4)  || "A".equals(r4)){
                    System.out.println("Acertou");
                    score++;
                }else{
                    System.out.println("Errou");
                    errado++;
                }
            
            
            System.out.println(questoes[4]);
            System.out.println(respostas[4]);
            String r5= ler.next();
                if("c".equals(r5)  || "C".equals(r5)){
                    System.out.println("Acertou");
                    score++;
                }else{
                    System.out.println("Errou");
                    errado++;
                }
 
        System.out.println("participante: " + NomeUser);
        System.out.println("Acertou: " + score);
        System.out.println("Errou: " + errado);
        
    }
    
}

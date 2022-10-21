package projetobanco;
import java.util.*;

public class ProjetoBanco {

    public static void main(String[] args) {
 
      
          List<Cbancaria> bancos = new ArrayList<>();
            bancos.add(new Ccorrente(25));
            bancos.add(new Cpoupança(100));
 
            bancos.forEach((b) -> System.out.println(b.consulta()));
            bancos.forEach((b) -> System.out.println(b.deposito(30)));
            bancos.forEach((b) -> System.out.println(b.saque(40)));  

//        Ccorrente c = new Ccorrente(25);
//        
//        System.out.println(c.saque(15));
//        System.out.println(c.consulta());

    }
    
    
}

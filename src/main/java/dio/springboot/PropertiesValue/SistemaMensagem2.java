package dio.springboot.PropertiesValue;

import dio.springboot.SingletonAndPrototype.Remetente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SistemaMensagem2 implements CommandLineRunner {

    @Autowired
    private Remetente2 remetente2;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente2.getNome()
                + "\nE-mail: " + remetente2.getEmail()
                + "\nCom telefones para contato: " + remetente2.getTelefones());
        System.out.println("Seu cadastro foi aprovado /2");

    }
}

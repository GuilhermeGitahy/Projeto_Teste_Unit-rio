package UnitTestProject;

import java.time.Instant;

public class EmailTest {
    public static void main(String[] args) {

        Email email_1 = new Email.EmailBuilder()
                .from(Instant.now())
                .to("teste@gmail.com")
                .cc("cc@gmail.com")
                .bcc("bcc@gmail.com")
                .subject("Apenas um teste")
                .message("E esse é o corpo da mensagem")
                .criarEmail();


    }
}

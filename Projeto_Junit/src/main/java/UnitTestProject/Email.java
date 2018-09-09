package UnitTestProject;

import java.time.Instant;
import java.util.Collection;

public class Email {

    private Instant from;
    private Collection to;
    private Collection cc;
    private Collection bcc;
    private String subject;
    private String message;

    private Email(Instant from, Collection to, Collection cc, Collection bcc, String subject, String message) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.message = message;
    }

    public static class EmailBuilder{
        public Instant from;
        public Collection to;
        public Collection cc;
        public Collection bcc;
        public String subject;
        public String message;

        public EmailBuilder(){

        }

        public EmailBuilder from(Instant from){
            this.from = from;
            return this;
        }
        public EmailBuilder to(Collection to){
            this.to = to;
            return this;
        }
        public EmailBuilder cc(Collection cc){
            this.cc = cc;
            return this;
        }
        public EmailBuilder bcc(Collection bcc){
            this.bcc = bcc;
            return this;
        }
        public EmailBuilder subject(String subject){
            this.subject = subject;
            return this;
        }
        public EmailBuilder message(String message){
            this.message = message;
            return this;
        }

        public Email criarEmail(){
            return new Email(from, to, cc, bcc, subject, message);

        }
    }

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public Collection getTo() {
        return to;
    }

    public void setTo(Collection to) {
        this.to = to;
    }

    public Collection getCc() {
        return cc;
    }

    public void setCc(Collection cc) {
        this.cc = cc;
    }

    public Collection getBcc() {
        return bcc;
    }

    public void setBcc(Collection bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

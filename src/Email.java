import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

// class to represent an email
public class Email implements Serializable {
    protected String emailTo, subject, content, date;
    @Serial
    private static final long serialVersionUID = 1L;


    public Email(String emailTo, String subject, String content) {
        this.emailTo = emailTo;
        this.subject = subject;
        this.content = content;
        String word = (LocalDate.now()).toString();
        this.date = (word.substring(0, 4) + "/" + word.substring(5, 7) + "/" + word.substring(8, 10));
    }

    public String getEmailTo() {
        return emailTo;
    }


    public String getSubject() {
        return subject;
    }


    public String getContent() {
        return content;
    }


}
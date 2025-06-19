
public class EmailAdapter implements Notifier {

    private final EmailService emailService;

    public EmailAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        emailService.sendEmail(mensagem);
    }
}

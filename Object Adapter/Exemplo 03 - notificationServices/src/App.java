
public class App {

    public static void main(String[] args) {
        Notifier emailNotifier = new EmailAdapter(new EmailService());
        Notifier telegramNotifier = new TelegramAdapter(new TelegramService());

        emailNotifier.enviarNotificacao("Tarefa concluída com sucesso!");
        telegramNotifier.enviarNotificacao("Você recebeu uma nova tarefa!");
    }
}

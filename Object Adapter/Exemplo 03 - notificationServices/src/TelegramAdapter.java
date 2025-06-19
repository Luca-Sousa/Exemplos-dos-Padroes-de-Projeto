
public class TelegramAdapter implements Notifier {

    private final TelegramService telegramService;

    public TelegramAdapter(TelegramService telegramService) {
        this.telegramService = telegramService;
    }

    @Override
    public void enviarNotificacao(String mensagem) {
        telegramService.sendMessage(mensagem);
    }
}


import java.time.LocalDateTime;
import java.util.*;

enum EnumStatus {
    NOT_STARTED, UNREALIZED, IN_PROGRESS, COMPLETED
}

enum EnumCategory {
    WORK, STUDY, HOME, HEAL, FINANCIAL, LEISURE, RELATIONSHIPS, VOLUNTEERING,
    TRAVEL, PERSONAL_DEVELOPMENT, TECHNOLOGY, SHOPPING, ERRANDS, OTHER
}

class Tarefa {

    private final String titulo;
    private final String descricao;
    private EnumStatus status;
    private final EnumCategory categoria;
    private final LocalDateTime dataCriacao;
    private final String nomeCriador;

    public Tarefa(String titulo, String descricao, EnumCategory categoria, String nomeCriador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = EnumStatus.NOT_STARTED;
        this.categoria = categoria;
        this.dataCriacao = LocalDateTime.now();
        this.nomeCriador = nomeCriador;
    }

    public void atualizarStatus(EnumStatus novoStatus) {
        this.status = novoStatus;
    }

    public void exibirTarefa() {
        System.out.println("   📝 Tarefa: " + titulo);
        System.out.println("   📄 Descrição: " + descricao);
        System.out.println("   📚 Categoria: " + categoria);
        System.out.println("   ⏳ Status: " + status);
        System.out.println("   👤 Criador: " + nomeCriador);
        System.out.println("   📅 Criada em: " + dataCriacao);
    }

    public EnumStatus getStatus() {
        return status;
    }

    public String getTitulo() {
        return titulo;
    }
}

abstract class Usuario {

    protected String nome;
    protected List<Tarefa> tarefas;

    public Usuario(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public void criarTarefa(String titulo, String descricao, EnumCategory categoria) {
        Tarefa nova = new Tarefa(titulo, descricao, categoria, this.nome);
        tarefas.add(nova);
        System.out.println("✅ Tarefa criada com sucesso!\n");
    }

    public void visualizarTarefas() {
        System.out.println("📋 Tarefas de " + nome + ":");
        if (tarefas.isEmpty()) {
            System.out.println("   (Nenhuma tarefa encontrada!)\n");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println("🔹 Tarefa #" + (i + 1));
                tarefas.get(i).exibirTarefa();
                System.out.println();
            }
        }
    }

    public void atualizarStatusTarefa(int indice, EnumStatus novoStatus) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).atualizarStatus(novoStatus);
            System.out.println("✅ Status atualizado com sucesso!\n");
        } else {
            System.out.println("⚠️ Tarefa não encontrada!\n");
        }
    }
}

class UsuarioComum extends Usuario {

    public UsuarioComum(String nome) {
        super(nome);
    }
}

class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nome) {
        super(nome);
    }
}

// Abstract Factory
interface UsuarioFactory {

    Usuario criarUsuario(String nome);
}

class UsuarioComumFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario(String nome) {
        return new UsuarioComum(nome);
    }
}

class UsuarioPremiumFactory implements UsuarioFactory {

    @Override
    public Usuario criarUsuario(String nome) {
        return new UsuarioPremium(nome);
    }
}

public class SistemaRotinaUniversitario {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nomeUsuario = scanner.nextLine();

            System.out.print("Você é usuário Premium? (s/n): ");
            String tipo = scanner.nextLine().toLowerCase();

            UsuarioFactory factory;
            if (tipo.equals("s")) {
                factory = new UsuarioPremiumFactory();
            } else {
                factory = new UsuarioComumFactory();
            }

            Usuario usuario = factory.criarUsuario(nomeUsuario);

            while (true) {
                System.out.println("\n📌 Bem-vindo ao Organizador de Rotina Universitária");
                System.out.println("1. Criar nova tarefa");
                System.out.println("2. Ver tarefas");
                System.out.println("3. Atualizar status de tarefa");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Título da tarefa: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Escolha a categoria:");
                        for (int i = 0; i < EnumCategory.values().length; i++) {
                            System.out.println(i + ". " + EnumCategory.values()[i]);
                        }
                        int catIndex = scanner.nextInt();
                        scanner.nextLine();
                        usuario.criarTarefa(titulo, descricao, EnumCategory.values()[catIndex]);
                    }
                    case 2 -> usuario.visualizarTarefas();
                    case 3 -> {
                        usuario.visualizarTarefas();
                        System.out.print("Digite o número da tarefa para atualizar: ");
                        int index = scanner.nextInt() - 1;
                        scanner.nextLine();
                        System.out.println("Novo status:");
                        for (int i = 0; i < EnumStatus.values().length; i++) {
                            System.out.println(i + ". " + EnumStatus.values()[i]);
                        }
                        int statusIndex = scanner.nextInt();
                        scanner.nextLine();
                        usuario.atualizarStatusTarefa(index, EnumStatus.values()[statusIndex]);
                    }
                    case 0 -> {
                        System.out.println("👋 Até logo!");
                        return;
                    }
                    default -> System.out.println("⚠️ Opção inválida!\n");
                }
            }
        }
    }
}

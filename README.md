# Exemplos dos Padrões de Projeto

Repositório com exemplos práticos dos padrões de projeto **Abstract Factory** e **Object Adapter**, aplicados em cenários do mundo real, com foco educacional. Esses exemplos foram desenvolvidos no contexto da disciplina *Análise e Projeto de Sistemas*.

## 👨‍💻 Equipe

- Ana Flávia de Sousa Oliveira  
- Izael de Araujo Silva  
- Lucas de Sousa Silva  
- Vandi Vieira dos Santos Junior
- **Professora**: Cynthia Pinheiro Santiago  

---

## 🎯 Objetivo

Demonstrar o uso prático de dois padrões de projeto amplamente utilizados no desenvolvimento de software orientado a objetos:

- [Abstract Factory](#factory)
- [Object Adapter](#adapter)

---

## 🏭 Abstract Factory <a name="factory"></a>

### 📌 Definição

O padrão **Abstract Factory** é um padrão de projeto **criacional** que permite a criação de famílias de objetos relacionados sem depender de suas classes concretas.

### 💡 Problema Resolvido

- Evita o uso excessivo de `new` para instanciar objetos.
- Permite a criação de produtos compatíveis entre si.
- Facilita a troca de famílias inteiras de objetos (ex: interfaces, bancos de dados, estilos).

### 🛠️ Exemplos

#### ✅ Exemplo 1: Loja de Mobílias

Criação de diferentes peças de mobília (cadeira, sofá, mesa) que fazem parte de uma mesma família de estilo (moderno, vitoriano, etc.).

**Características:**

- Interface para cada tipo de mobília.
- Fábricas concretas que criam todas as peças de um mesmo estilo.
- Consistência entre os objetos criados.

#### ✅ Exemplo 2: Organizador de Rotina Universitária

Sistema Java para gerenciar tarefas acadêmicas, com dois tipos de usuários:

- `UsuarioComumFactory`
- `UsuarioPremiumFactory`

**Funcionalidades:**

- Criação, visualização e atualização de tarefas.
- Fábricas que criam usuários e componentes de forma desacoplada.

**Benefícios:**

- Flexibilidade para trocar tipo de backend (SQL, Firebase, etc.).
- Consistência e escalabilidade no uso dos objetos relacionados.

### 📈 Aplicações

- Sistemas com múltiplas interfaces visuais (temas).
- Softwares com diferentes tipos de armazenamento.
- Kits de produto (ex: interfaces de fábrica, interfaces de usuário).

---

## 🔌 Object Adapter <a name="adapter"></a>

### 📌 Definição

O padrão **Object Adapter** é um padrão **estrutural** que permite que classes com interfaces incompatíveis trabalhem juntas por meio de um adaptador.

### 💡 Problema Resolvido

- Compatibilização entre APIs e classes antigas ou de terceiros.
- Conexão de sistemas com padrões diferentes de comunicação ou entrada.

### 🛠️ Exemplos

#### ✅ Exemplo 1: Impressora

Sistema espera arquivos `.txt`, mas a nova impressora aceita apenas `.pdf`.

**Solução:**  
Um adaptador (`PDFAdapter`) converte o conteúdo de `.txt` para `.pdf`, integrando as duas partes.

#### ✅ Exemplo 2: Tomada e Notificações

- **Tomada EUA ↔ BR**: Um `AdapterTomadaEUA` permite usar um dispositivo americano em uma tomada brasileira.
- **Notificações por Email/Telegram**: Adapta serviços externos (`EmailService`, `TelegramService`) para uma interface comum `Notifier`.

```python
emailNotifier = EmailAdapter(EmailService())
telegramNotifier = TelegramAdapter(TelegramService())

emailNotifier.enviarNotificacao("Tarefa concluída com sucesso!")
telegramNotifier.enviarNotificacao("Você recebeu uma nova tarefa!")

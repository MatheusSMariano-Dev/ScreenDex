🎬 ScreenDex

Projeto Java para organização, listagem e ordenação de filmes e séries, utilizando conceitos de **Programação Orientada a Objetos**, **Collections** e **Comparator**.  
O projeto está em constante evolução e **em breve contará com uma API REST**.

📌 Sobre o Projeto

O ScreenDex foi criado com o objetivo de praticar e consolidar conceitos fundamentais da linguagem Java, como:

- Orientação a Objetos (POO)
- Listas e coleções
- Ordenação de dados
- Comparators
- Boas práticas de organização de código

Inicialmente, o projeto funciona via console, mas está planejado para evoluir para uma **arquitetura baseada em API**, aproximando-se de um cenário real de mercado.

🚀 Funcionalidades Atuais

- Criação de objetos representando filmes e séries;
- Armazenamento em listas;
- Ordenação por critérios como:
  - Nome
  - Ano de lançamento
  - Avaliação
- Exibição organizada dos dados no console.
🔮 Próximas Funcionalidades (Em desenvolvimento)

- Criação de uma **API REST**;
- Implementação de endpoints para:
  - Listar filmes e séries;
  - Buscar por nome;
  - Filtrar por avaliação ou ano;
- Estruturação em camadas:
  - Controller
  - Service
  - Model
- Possível uso de **Spring Boot**;
- Integração com API externa de filmes e séries.

 🧩 Arquitetura Planejada
Controller
↓
Service
↓
Model
↓
Repository (futuramente)


Essa estrutura visa melhorar a organização, escalabilidade e manutenibilidade do projeto.

  🛠️ Tecnologias Utilizadas

- ☕ **Java**
- 🧠 Programação Orientada a Objetos
- 📦 Collections Framework
- 🛠️ IntelliJ IDEA
- 🌱 Git & GitHub

  📁 Estrutura do Projeto

ScreenDex
│
├── src/
│ └── br/
│ └── alura/
│ └── screenmatch/
│ ├── model/
│ ├── main/
│ └── util/
│
├── .gitignore
├── README.md
└── LICENSE


 ▶️ Como Executar o Projeto

 Pré-requisitos
- Java JDK 17 ou superior
- IntelliJ IDEA (ou outra IDE Java)

  Passos

1. Clone o repositório:
```bash
git clone https://github.com/MatheusSMariano-Dev/ScreenDex.git

 Entre na pasta do projeto:
 cd ScreenDex
Abra o projeto na IDE;

Certifique-se de que o JDK está configurado;

Execute a classe principal (main).

📌 Status do Projeto

🚧 Em desenvolvimento
O projeto continuará recebendo melhorias e novas funcionalidades, incluindo a implementação de uma API REST.

👨‍💻 Autor

Matheus S. Mariano
Desenvolvedor Backend

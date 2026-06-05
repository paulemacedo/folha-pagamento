# Folha de Pagamento

Um sistema de gestão de folha de pagamento desenvolvido em **Java**.

## 📋 Sobre o Projeto

Este projeto é um aplicativo para gerenciar e calcular a folha de pagamento de uma empresa, permitindo o controle de salários, descontos, benefícios e geração de relatórios de pagamento.

## 🛠️ Tecnologias

- **Linguagem:** Java
- **Padrão:** Aplicação Desktop/Web

## 📁 Estrutura do Projeto

```
folha-pagamento/
├── src/
│   ├── Main.java                          # Ponto de entrada da aplicação
│   ├── model/                             # Modelos e entidades
│   │   ├── Funcionario.java               # Classe base para funcionários
│   │   ├── FuncionarioPadrao.java         # Funcionário com salário fixo
│   │   ├── FuncionarioComissionado.java   # Funcionário com comissão
│   │   └── FuncionarioProducao.java       # Funcionário de produção
│   └── service/                           # Serviços de negócio
│       └── FolhaPagamento.java            # Cálculo e gestão de folha de pagamento
├── .gitignore                             # Arquivo de configuração Git
└── README.md                              # Este arquivo
```

## 🚀 Como Começar

### Pré-requisitos

- Java 8+ instalado
- Git instalado

### Instalação

1. Clone o repositório:
```bash
git clone https://github.com/paulemacedo/folha-pagamento.git
cd folha-pagamento
```

2. Compile o projeto:
```bash
javac -d bin src/*.java
```

3. Execute a aplicação:
```bash
java -cp bin Main
```

## 📝 Funcionalidades

- ✅ Registro e gestão de funcionários
- ✅ Cálculo de folha de pagamento
- ✅ Geração de relatórios
- ✅ Controle de descontos e benefícios
- ✅ Histórico de pagamentos

## 📖 Documentação

Para mais informações sobre como utilizar o sistema, consulte a documentação no diretório `docs/` (quando disponível).

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um Fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está disponível sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👤 Autor

**Paule Macedo**
- GitHub: [@paulemacedo](https://github.com/paulemacedo)

---

**Desenvolvido com ❤️**

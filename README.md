<div align="center"> <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"> <img src="https://img.shields.io/badge/POO-0D8ABC?style=for-the-badge" alt="POO"> <img src="https://img.shields.io/badge/Status-Completo-brightgreen?style=for-the-badge" alt="Status"> <img src="https://img.shields.io/github/license/seu-usuario/bookstore?style=for-the-badge" alt="License"> </div>
<div align="center"> <img src="https://www.vectorlogo.zone/logos/java/java-icon.svg" width="150" alt="Java Logo"> </div>

# Sistema de Gerenciamento de Farmácia

![Java](https://img.shields.io/badge/Java-17+-007396?logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![POO](https://img.shields.io/badge/OOP-Implementado-blue)
![MVC](https://img.shields.io/badge/Pattern-MVC-blueviolet)
![Lambda](https://img.shields.io/badge/Lambda-Expressions-orange)

## 💊 Descrição

Sistema completo de gerenciamento de farmácia desenvolvido em Java, com interface console colorida e interativa. Permite o controle de medicamentos e cosméticos com operações CRUD completas, diferenciando acesso entre clientes e funcionários.

## ✨ Funcionalidades

- 👥 **Dois tipos de acesso**: Cliente e Funcionário
- 💊 **Gestão de medicamentos**: Genéricos e Originais
- 💄 **Controle de cosméticos**: Com fragrância ou não
- 🔍 **Sistema de buscas**: Por ID ou listagem completa
- ✏️ **Atualização de produtos**
- 🗑️ **Exclusão segura** com confirmação

## 🧪 Tipos de Produtos

1. **Medicamentos**
   - Controle de tipo (Genérico/Original)
   - Gerenciamento completo

2. **Cosméticos**
   - Identificação de fragrância
   - Cadastro específico

## 🛠️ Tecnologias Utilizadas

- **Java 17+** - Linguagem principal
- **Programação Funcional** - Expressões Lambda
- **Scanner** - Para entrada de dados
- **Tratamento de Exceções** - Validação robusta
- **Console Colors** - Interface amigável
- **Encapsulamento Avançado** - Boas práticas de POO

## 🖥️ Interface Console

```plaintext
╔═════════════════════════════════════════════════════════════╗
║                                                             ║
║ ▒█▀▀█ ▒█▀▀█ ▒█▀▀▄ ▒█▀▄ ▄▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀ ║
║ ▒█▄▄  ▒█▄▄█ ▒█▀▀▄ ▒█  ▀  █ ▒█  █ ▒█     ▒█   █  ▒█  █ ▒█▄▄  ║
║ ▒█    ▒█  █ ▒█  █ ▒█     █ ▒█▀▀█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄ ║
║                                                             ║
╠═════════════════════════════════════════════════════════════╣
```

## 📦 Estrutura do Projeto

```
farmacia/
├── src/
│   ├── controller/       # Lógica de controle (produtoController)
│   ├── model/            # Classes de domínio (medicamento, cosmetico)
│   ├── util/             # Utilitários (Cores)
│   └── Menu.java         # Interface principal
├── README.md
└── LICENSE
```

## 🚀 Como Executar

1. Certifique-se de ter o Java 17+ instalado
2. Clone o repositório (se aplicável)
3. Compile e execute:

```bash
javac src/farmaciaMenu/MenuFarmacia.java
java -cp src farmaciaMenu.MenuFarmacia
```

## 🧑‍💻 Autor

**Carlos Moroni Garcia**  
📧 carlosmoronisud@gmail.com  
🔗 [GitHub](https://github.com/carlosmoronisud)  
🔗 [LinkedIn](https://www.linkedin.com/in/carlosmoronisud)

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para detalhes.

---

> 💡 **Dica**: O sistema utiliza cores vibrantes no terminal para melhor experiência  
> ⚙️ **Para devs**: Excelente exemplo de Java console application com lambdas e encapsulamento
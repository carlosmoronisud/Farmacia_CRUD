package farmaciaMenu;

import controller.produtoController;
import java.util.Scanner;
import java.util.function.Consumer;
import farmaciaUtil.Cores;
import produto.model.medicamento;
import produto.model.Produto;
import produto.model.cosmetico;

public class menu {
    private final Scanner leia;
    private final produtoController produto;
    
    public menu() {
        this.leia = new Scanner(System.in);
        this.produto = new produtoController();
    }
    
    public void executar() {
        exibirCabecalho();
        
        while(true) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();
            
            if (opcao == 3) {
                encerrarPrograma();
                break;
            }
            
            processarOpcaoPrincipal(opcao);
        }
    }
    
    private void exibirCabecalho() {
        System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND 
                + "╔═════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                             ║");
        System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█▀▀█ ▒█▀▀█ ▒█▀▀▄ ▒█▀▄ ▄▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀ " + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
        System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█▄▄  ▒█▄▄█ ▒█▀▀▄ ▒█  ▀  █ ▒█  █ ▒█     ▒█   █  ▒█  █ ▒█▄▄  " + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
        System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█    ▒█  █ ▒█  █ ▒█     █ ▒█▀▀█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄ "+ Cores.ANSI_BLUE_BACKGROUND + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
        System.out.println("║                                                             ║"+ Cores.ANSI_BLUE_BACKGROUND);
        System.out.println("╠═════════════════════════════════════════════════════════════╣" + Cores.TEXT_RESET);
    }
    
    private void exibirMenuPrincipal() {
        System.out.println(Cores.TEXT_CYAN_BOLD + "\n         ✧･ﾟ: *✧･ﾟ:*   MENU PRINCIPAL         *:･ﾟ✧*:･ﾟ✧" + Cores.TEXT_RESET);
        System.out.println(Cores.TEXT_WHITE + "\n        ╭────────────────────────────────────────────╮");
        System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "1" + Cores.TEXT_WHITE + " ➤  Entrar como cliente" + Cores.TEXT_WHITE + "                  │");
        System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "2" + Cores.TEXT_WHITE + " ➤  Entrar como funcionário" + Cores.TEXT_WHITE + "              │");
        System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "3" + Cores.TEXT_WHITE + " ➤  Sair" + Cores.TEXT_WHITE + "                                 │");
        System.out.println("        ╰────────────────────────────────────────────╯");
        System.out.println(Cores.TEXT_PURPLE_BRIGHT + "\n  ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ:*" + Cores.TEXT_RESET);
        System.out.print(Cores.TEXT_GREEN_BRIGHT + "\n  ➤ Digite a opção desejada: " + Cores.TEXT_YELLOW_BRIGHT);
    }
    
    private int lerOpcao() {
        try {
            return leia.nextInt();
        } finally {
            leia.nextLine();
        }
    }
    
    private void processarOpcaoPrincipal(int opcao) {
        switch(opcao) {
            case 1 -> menuCliente();
            case 2 -> menuFuncionario();
            default -> System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
        }
    }
    
    private void menuCliente() {
        exibirMenu(
            "✧･ﾟ: *✧･ﾟ:*   MENU CLIENTE         *:･ﾟ✧*:･ﾟ✧",
            new String[]{
                "1 ➤  Para encontrar medicamento",
                "2 ➤  Para encontrar Cosmético",
                "3 ➤  Para Todos os produtos",
                "4 ➤  Voltar"
            },
            opcao -> {
                switch(opcao) {
                    case 1 -> buscarMedicamento();
                    case 2 -> buscarCosmetico();
                    case 3 -> listarTodosProdutosCliente();
                }
            }
        );
    }
    
    private void menuFuncionario() {
        exibirMenu(
            "✧･ﾟ: *✧･ﾟ:*   MENU FUNCIONARIO     *:･ﾟ✧*:･ﾟ✧",
            new String[]{
                "1 ➤  Para cadastrar produtos",
                "2 ➤  Para visualizar produtos",
                "3 ➤  Para alterar produtos",
                "4 ➤  Para excluir produtos",
                "5 ➤  Voltar"
            },
            opcao -> {
                switch(opcao) {
                    case 1 -> cadastrarProduto();
                    case 2 -> listarTodosProdutosFuncionario();
                    case 3 -> alterarProduto();
                    case 4 -> excluirProduto();
                }
            }
        );
    }
    
    private void exibirMenu(String titulo, String[] opcoes, Consumer<Integer> acao) {
        System.out.println(Cores.TEXT_CYAN_BOLD + "\n         " + titulo + Cores.TEXT_RESET);
        System.out.println(Cores.TEXT_WHITE + "\n        ╭───────────────────────────────────╮");
        
        for (String opcao : opcoes) {
            System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + opcao + Cores.TEXT_WHITE + "     │");
        }
        
        System.out.println("        ╰───────────────────────────────────╯\n\n");
        System.out.println(Cores.TEXT_WHITE + "  Olá, Digite a opção desejada ");
        
        int escolha = lerOpcao();
        if (escolha >= 1 && escolha <= opcoes.length) {
            acao.accept(escolha);
        }
    }
    
    private void buscarMedicamento() {
        System.out.println("Digite o número do medicamento, só temos 3");
        int numero = lerOpcao();
        produto.buscaId(numero);
    }
    
    private void buscarCosmetico() {
        System.out.println("Digite o número do cosmético");
        int numero = lerOpcao();
        produto.buscaId(numero);
    }
    
    private void listarTodosProdutosCliente() {
        System.out.println("Nossos produtos");
        produto.ListarTodosProdutosCliente();
    }
    
    private void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        float preco = leia.nextFloat();
        leia.nextLine();
        
        System.out.println("Digite o tipo do produto (1 -> medicamento / 2 -> Cosmético)");
        int tipo = lerOpcao();
        
        if(tipo == 1) {                             
            System.out.println("É genérico?: (s/n)");
            String generico = leia.nextLine();
            String tipoGenerico = generico.equalsIgnoreCase("s") ? "Genérico" : "Original";
            
            medicamento novoMedicamento = new medicamento(tipo, 0, nome, preco, tipoGenerico);
            produto.criarProduto(novoMedicamento);
        } else if (tipo == 2) {
            System.out.println("É Fragrância?: (s/n)");
            String fragrancia = leia.nextLine();
            String tipoFragrancia = fragrancia.equalsIgnoreCase("s") ? "Fragrância" : "Original";
            
            cosmetico novoCosmetico = new cosmetico(tipo, 0, nome, preco, tipoFragrancia);
            produto.criarProduto(novoCosmetico);
        }
        
        System.out.println("Produto cadastrado com sucesso!");
    }
    
    private void listarTodosProdutosFuncionario() {
        produto.ListarTodosProdutosFuncionario();
    }
    
    private void alterarProduto() {
        System.out.println("Digite o id do produto que deseja alterar: ");
        int id = lerOpcao();
        
        Produto produtoExistente = produto.buscaId(id);
        
        if(produtoExistente != null) {
            System.out.println("Digite o novo nome do produto: ");
            String nome = leia.nextLine();
            
            System.out.println("Digite o novo preço do produto: ");
            float preco = leia.nextFloat();
            
            System.out.println("Digite o novo tipo do produto (1-medicamento/2-cosmético): ");
            int tipo = lerOpcao();
            
            Produto produtoAtualizado = null;
            
            if(tipo == 1) {
                produtoAtualizado = new medicamento(tipo, id, nome, preco, nome);
            } else if (tipo == 2) {
                produtoAtualizado = new cosmetico(tipo, id, nome, preco, nome);
            } else {
                System.out.println("O produto não existe!");
            }
            
            if(produtoAtualizado != null) {
                produto.atualizarProduto(produtoAtualizado);
            }
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
    
    private void excluirProduto() {
        System.out.println("Digite o id do produto que deseja deletar: ");
        int id = lerOpcao();
        
        Produto produtoExistente = produto.buscaId(id);
        if(produtoExistente != null) {
            produtoExistente.visualizarFuncionario();
            System.out.println("Deseja deletar esse produto? (s/n)");
            String decisao = leia.next();
            
            if(decisao.equalsIgnoreCase("s")) {
                produto.deletarProduto(id);
                System.out.println("Produto deletado com sucesso!");
            } else {
                System.out.println("Produto NÃO DELETADO!");
            }
        }
    }
    
    private void encerrarPrograma() {
        System.out.println(Cores.TEXT_WHITE_BOLD + "\nAdeus!");
        sobre();
        leia.close();
        System.exit(0);
    }
    
    private static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Carlos Moroni Garcia - carlosmoronisud@gmail.com");
        System.out.println("https://github.com/carlosmoronisud");
        System.out.println("*********************************************************");
    }
    
    public static void main(String[] args) {
        new menu().executar();
    }
}
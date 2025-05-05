package farmaciaMenu;


import controller.produtoController;
import java.util.Scanner;
import farmaciaUtil.Cores;
import produto.model.medicamento;
import produto.model.Produto;
import produto.model.cosmetico;


public class menu {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);		
		 
		produtoController produto = new produtoController();
		
		 
		 while(true) {
			 
			 System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND 					    + "╔═════════════════════════════════════════════════════════════╗");
					System.out.println("║                                                             ║");
					System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█▀▀█ ▒█▀▀█ ▒█▀▀▄ ▒█▀▄ ▄▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀█ ▒█▀▀▀ " + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
					System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█▄▄  ▒█▄▄█ ▒█▀▀▄ ▒█  ▀  █ ▒█  █ ▒█     ▒█   █  ▒█  █ ▒█▄▄  " + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
					System.out.println("║ " + Cores.TEXT_YELLOW_BRIGHT + "▒█    ▒█  █ ▒█  █ ▒█     █ ▒█▀▀█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄█ ▒█▄▄▄ "+ Cores.ANSI_BLUE_BACKGROUND + Cores.TEXT_WHITE_BOLD_BRIGHT + "║");
					System.out.println("║                                                             ║"+ Cores.ANSI_BLUE_BACKGROUND);
					System.out.println("╠═════════════════════════════════════════════════════════════╣" + Cores.TEXT_RESET);

					System.out.println(Cores.TEXT_CYAN_BOLD + "\n         ✧･ﾟ: *✧･ﾟ:*   MENU PRINCIPAL         *:･ﾟ✧*:･ﾟ✧" + Cores.TEXT_RESET);

					System.out.println(Cores.TEXT_WHITE + "\n        ╭────────────────────────────────────────────╮");
					System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "1" + Cores.TEXT_WHITE + " ➤  Entrar como cliente" + Cores.TEXT_WHITE + "                  │");
					System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "2" + Cores.TEXT_WHITE + " ➤  Entrar como funcionário" + Cores.TEXT_WHITE + "              │");
					System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "3" + Cores.TEXT_WHITE + " ➤  Sair" + Cores.TEXT_WHITE + "                                 │");
					System.out.println("        ╰────────────────────────────────────────────╯");

					System.out.println(Cores.TEXT_PURPLE_BRIGHT + "\n  ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ: *✧･ﾟ:* ✧･ﾟ:*" + Cores.TEXT_RESET);

					System.out.print(Cores.TEXT_GREEN_BRIGHT + "\n  ➤ Digite a opção desejada: " + Cores.TEXT_YELLOW_BRIGHT);
					int opcao = leia.nextInt();
					
				if (opcao == 3) {
					System.out.println(Cores.TEXT_WHITE_BOLD + "\nAdeus!");
					sobre();
					leia.close();
					System.exit(0);
				}
					
				switch (opcao) {
					case 1:
						System.out.println(Cores.TEXT_CYAN_BOLD + "\n         ✧･ﾟ: *✧･ﾟ:*   MENU CLIENTE         *:･ﾟ✧*:･ﾟ✧" + Cores.TEXT_RESET);
						System.out.println(Cores.TEXT_WHITE + "\n        ╭───────────────────────────────────╮");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "1" + Cores.TEXT_WHITE + " ➤  Para encontrar medicamento " + Cores.TEXT_WHITE + " │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "2" + Cores.TEXT_WHITE + " ➤  Para encontar Cosmetico" + Cores.TEXT_WHITE + "     │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "3" + Cores.TEXT_WHITE + " ➤  Para Todos o produtos" + Cores.TEXT_WHITE + "       │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "4" + Cores.TEXT_WHITE + " ➤  Voltar" + Cores.TEXT_WHITE + "                      │");
						System.out.println("        ╰───────────────────────────────────╯\n\n");
						
						System.out.println(Cores.TEXT_WHITE + "  Olá, Digite a opção desejada ");
						int escolha = leia.nextInt();
						if(escolha <= 4 && escolha >= 1) {
							switch(escolha){
								case 1 ->{
									System.out.println("Digite o número do medicamento, só temos 3");
									int numero = leia.nextInt();
									produto.buscaId(numero);
									
								}
								case 2 ->{
									System.out.println("Digite o número do cosmético");
								}
								case 3 ->{
									System.out.println("Nossos produtos");
									produto.ListarTodosProdutosCliente();
									
								}
								case 4->{
									System.out.println("Voltar");
								}
							}
						}
	                    		break;
						case 2:
						System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "\n         ✧･ﾟ: *✧･ﾟ:*   MENU FUNCIONARIO         *:･ﾟ✧*:･ﾟ✧" + Cores.TEXT_RESET);
						System.out.println(Cores.TEXT_WHITE + "\n        ╭───────────────────────────────────╮");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "1" + Cores.TEXT_WHITE + " ➤  Para cadastrar produtos " + Cores.TEXT_WHITE + "    │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "2" + Cores.TEXT_WHITE + " ➤  Para vizualisar produtos " + Cores.TEXT_WHITE + "   │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "3" + Cores.TEXT_WHITE + " ➤  Para alterar produtos" + Cores.TEXT_WHITE + "       │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "4" + Cores.TEXT_WHITE + " ➤  Para excluir produtos" + Cores.TEXT_WHITE + "       │");
						System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "5" + Cores.TEXT_WHITE + " ➤  Voltar" + Cores.TEXT_WHITE + "                      │");
						System.out.println("        ╰───────────────────────────────────╯\n\n");
						
						System.out.println(Cores.TEXT_WHITE + "2 -> Olá, o que deseja fazer? \n\n");
						int acao = leia.nextInt();
						if(acao <= 4 && acao >= 1) {
							switch(acao){
								case 1 -> {
									System.out.println("Digite o nome do produto: ");
									String nome = leia.next();
									leia.nextLine();
								    System.out.println("Digite o preço do produto: ");
								    float preco = leia.nextFloat();
								    leia.nextLine();
								    System.out.println("Digite o tipo do produto (1 -> medicamento / 2 -> Cosmético)");
								    int tipo = leia.nextInt();
								    leia.nextLine();							    
								    
									    if(tipo == 1) {							    	
									    	System.out.println("É genérico?: (s/n)");
										    String generico = leia.nextLine();
										    String tipoGenerico = generico.equalsIgnoreCase("s") ? "Genérico" :
										    	generico.equalsIgnoreCase("n") ? "Original" : "Indefinido";
										    
									        medicamento novoMedicamento = new medicamento(tipo, 0, nome, preco, tipoGenerico);
									        produto.criarProduto(novoMedicamento);
									        
									    } else if (tipo == 2){
									    	System.out.println("É Fragrância?: (s/n)");
										    String fragrancia = leia.nextLine();
										    String tipoFragrancia = fragrancia.equalsIgnoreCase("s") ? "Fragrância" :
										    	fragrancia.equalsIgnoreCase("n") ? "Original" : "Indefinido";
										    
									    	cosmetico novoCosmetico = new cosmetico (tipo, 0, nome, preco, tipoFragrancia);
									        produto.criarProduto(novoCosmetico);
									    }
								    
									    System.out.println("Produto cadastrado com sucesso!");
									}
									case 2 ->{
										produto.ListarTodosProdutosFuncionario();
									}
									case 3 -> {
									    System.out.println("Digite o id do produto que deseja alterar: ");
									    int id = leia.nextInt();
									    leia.nextLine(); 
									    
									  
									    Produto produtoExistente = produto.buscaId(id);
									    
									    if(produtoExistente != null) {
									        System.out.println("Digite o novo nome do produto: ");
									        String nome = leia.nextLine();
									        
									        System.out.println("Digite o novo preço do produto: ");
									        float preco = leia.nextFloat();
									        
									        System.out.println("Digite o novo tipo do produto (1-medicamento/2-cosmético): ");
									        int tipo = leia.nextInt();
									        leia.nextLine();
									        
									        Produto produtoAtualizado = null;
									        
									        if(tipo == 1) {
									            produtoAtualizado = new medicamento(tipo, id, nome, preco, nome);
									        }else if (tipo == 2){
									            produtoAtualizado = new cosmetico(tipo, id, nome , preco, nome);
									        }else {
									        	System.out.println("O produto não existe!");
									        }
									        
									        produto.atualizarProduto(produtoAtualizado);
									    } else {
									        System.out.println("Produto não encontrado!");
									    }
									}
									case 4->{
										 System.out.println("Digite o id do produto que deseja deletar: ");
										    int id = leia.nextInt();
										    leia.nextLine();
										    
										    Produto produtoExistente = produto.buscaId(id);
										    if(produtoExistente != null) {
										    	produtoExistente.visualizarFuncionario();
										    	System.out.println("Deseja deletar esse produto? (s/n)");
										    	String decisao = leia.next();
										    	
												if  (decisao.equalsIgnoreCase("s")) {
													produto.deletarProduto(id);
													System.out.println("Produtodeletado com sucesso!");
												}else if(decisao.equalsIgnoreCase("n")) {
													System.out.println("Produto NÃO DELETADO!");
												}
												    	
										    	
										    }
									}
							}
						}
						
	                    		break;
					
					default:
						System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
	                    		break;
				}
			}	
	    }

	    public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Carlos Moroni Garcia - carlosmoronisud@gmail.com");
		System.out.println("https://github.com/carlosmoronisud");
		System.out.println("*********************************************************");
	   }
			 
	

}

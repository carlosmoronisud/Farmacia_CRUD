package controller;

import java.util.ArrayList;
import java.util.Scanner;

import produto.model.Produto;
import produtoRepository.ProdutoRepository;

public class produtoController implements ProdutoRepository {
	
	Scanner leia = new Scanner(System.in);
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	int id = 0;

	@Override
	public void criarProduto(Produto produto) {
		produto.setId(gerarId());
		listaProdutos.add(produto);		
		System.out.println("Novo Produto adicionado com sucesso!");
		
	}

	@Override
	public void ListarTodosProdutosCliente() {
		// TODO Auto-generated method stub
		for (var produto : listaProdutos) {
			if(produto!= null)
			produto.visualizarCliente();
		}
		
	}
	@Override
	public void ListarTodosProdutosFuncionario() {
		// TODO Auto-generated method stub
		for (var produto : listaProdutos) {
			if(produto!= null)
			produto.visualizarFuncionario();
		}
		
	}

	@Override
	public void consultaProdutosId(int numero) {
		// TODO Auto-generated method stub
		var produto =  buscaId(numero);
			if(produto != null)
				produto.visualizarFuncionario();
			else
				System.out.println("\nProduto não encontrado");
		
	}

	@Override
	public void atualizarProduto(Produto produtoAtualizado) {
	    // Busca o produto existente pelo ID
	    Produto produtoExistente = buscaId(produtoAtualizado.getId());
	    
	    if (produtoExistente != null) {
	        // Atualiza os campos do produto existente
	        produtoExistente.setNome(produtoAtualizado.getNome());
	        produtoExistente.setPreco(produtoAtualizado.getPreco());
	        produtoExistente.setTipo(produtoAtualizado.getTipo());
	        
	        System.out.println("Produto atualizado com sucesso!");
	    } else {
	        System.out.println("\nProduto não encontrado para atualização");
	    }
	}
		
		
		
	

	@Override
	public void deletarProduto(int numero) {
		// TODO Auto-generated method stub
		var produto =  buscaId(numero);
		if(produto != null) {
			produto.visualizarFuncionario();
			listaProdutos.remove(produto);
		}else {
			System.out.println("\nProduto não encontrado");
		}
	}

	//Métodos auxilires
	
	public int gerarId() {		
		return ++ id;
	}
	
	public Produto buscaId(int numero) {
		for(var produto : listaProdutos) {
			if(produto.getId() == numero)
				return produto;
		}
		return null;
	}



}

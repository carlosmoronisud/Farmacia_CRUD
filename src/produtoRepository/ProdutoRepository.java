package produtoRepository;

import produto.model.Produto;


public interface ProdutoRepository {

	public abstract void criarProduto(Produto produto);
	public abstract void ListarTodosProdutosFuncionario();
	public abstract void consultaProdutosId(int num);
	public abstract void atualizarProduto(Produto produto);
	public abstract void deletarProduto(int num);
	public abstract void ListarTodosProdutosCliente();
	
	
}

package produto.model;

public class cosmetico extends Produto{

	
	public cosmetico(int tipo, int id, String nome, float preco, String tipoFragrancia) {
		super(tipo, id, nome, preco);
		// TODO Auto-generated constructor stub
	}

	public cosmetico(Produto novoCosmetico) {
		// TODO Auto-generated constructor stub
	}

	private String fragrancia;
	private String tipoFragrancia;

	public String getFragrancia() {
		return fragrancia;
	}

	@Override
	public void visualizarCliente() {
		// TODO Auto-generated method stub
		super.visualizarCliente();
	}

	@Override
	public void visualizarFuncionario() {
		// TODO Auto-generated method stub
		super.visualizarFuncionario();
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}

	public String getTipoFragrancia() {
		return tipoFragrancia;
	}

	public void setTipoFragrancia(String tipoFragrancia) {
		this.tipoFragrancia = tipoFragrancia;
	}
}

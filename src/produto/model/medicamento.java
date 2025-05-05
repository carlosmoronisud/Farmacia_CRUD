package produto.model;

public class medicamento extends Produto {		

		public medicamento(int tipo, int id, String nome, float preco, String tipoGenerico) {
		super(tipo,id, nome, preco);
		// TODO Auto-generated constructor stub
	}

		public medicamento(Produto novoMedicamento) {
			// TODO Auto-generated constructor stub
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

		private String tipoGenerico;

		

		public String getTipoGenerico() {
			return tipoGenerico;
		}

		public void setTipoGenerico(String tipoGenerico) {
			this.tipoGenerico = tipoGenerico;
		}
		
		
}



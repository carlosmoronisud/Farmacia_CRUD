package produto.model;

import java.text.NumberFormat;

import farmaciaUtil.Cores;

public abstract class Produto {
	
	private int tipo;
	private int id;
	private String nome;
	private float preco;
	
	
	
	public Produto(int tipo, int id, String nome, float preco) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Produto() {}
	
	public void visualizarCliente () {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1-> tipo = "medicamento: ";
		case 2-> tipo = "cosmetico: ";
		default -> tipo = "Inválido";
		}
		
		
		System.out.println(Cores.TEXT_WHITE + "\n        ╭───────────────────────────────────╮");
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Nome" + Cores.TEXT_WHITE + " ➤ " + this.nome + Cores.TEXT_WHITE );
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Tipo" + Cores.TEXT_WHITE + " ➤ " + tipo + Cores.TEXT_WHITE );
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Preço" + Cores.TEXT_WHITE + " ➤ " + nfMoeda.format(this.preco) + Cores.TEXT_WHITE );
		System.out.println("        ╰───────────────────────────────────╯\n\n");
		
	
	}
	public void visualizarFuncionario () {
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1-> tipo = "medicamento ";
		case 2-> tipo = "cosmetico ";
		default -> tipo = "Inválido";
		}
		
		
		
		System.out.println(Cores.TEXT_WHITE + "\n        ╭───────────────────────────────────╮");
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "ID" + Cores.TEXT_WHITE + " ➤ " + id + Cores.TEXT_WHITE );
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Nome" + Cores.TEXT_WHITE + " ➤ " + this.nome + Cores.TEXT_WHITE );
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Tipo" + Cores.TEXT_WHITE + " ➤ " + tipo + Cores.TEXT_WHITE );
		System.out.println("        │  " + Cores.TEXT_YELLOW_BRIGHT + "Preço" + Cores.TEXT_WHITE + " ➤ " + nfMoeda.format(this.preco)  + Cores.TEXT_WHITE );
		System.out.println("        ╰───────────────────────────────────╯\n\n");
		
	}




	
	
}

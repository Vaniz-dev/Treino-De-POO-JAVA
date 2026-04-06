package model;
public class Lutador {
	//Variáveis
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//metodo construtor
	public Lutador(String n, String na, int i, float a, float p, int v, int d, int e) {
		this.setNome(n);
		this.setNacionalidade(na);
		this.setIdade(i);
		this.setAltura(a);
		this.setPeso(p);
		this.setCategoria();
		this.setVitorias(v);
		this.setDerrotas(d);
		this.setEmpates(e);
	}
	
	//Metodos
	
	public void apresentar() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("                    Apresentação                      ");
		System.out.println("------------------------------------------------------");
		System.out.println("\n SENHORAS E SENHORES! É COM MUITO ANIMO QUE VENHO APRESENTAR ESTE LUTADOR INCRIVEL!!\n"
				         + "Seu nome é "+this.getNome()+", Veio diretamente de "+this.getNacionalidade()+" Para se apresentar em nosso ringue!"
				         + "\no mesmo está pesando "+this.getPeso()+", e está com incriveis "+this.getVitorias()+" Vitórias, "+this.getDerrotas()+" Derrotas e "
				         + this.getEmpates()+" Empates!!!");
	}
	public void status() {
		System.out.println("\n------------------------------------------------------");
		System.out.println("                       Status                         ");
		System.out.println("------------------------------------------------------");
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Peso: "+this.getPeso());
		System.out.println("Altura: "+this.getAltura());
		System.out.println("Categoria: Peso "+this.getCategoria());
		System.out.println("Vitorias: "+this.getVitorias());
		System.out.println("Derrotas: "+this.getDerrotas());
		System.out.println("Empates: "+this.getEmpates());
	}	
	

	protected void vencerLuta() {
		this.vitorias +=1;
	}
	protected void perderLuta() {
		this.derrotas +=1;
	}
	protected void empatarLuta(){
		this.empates +=1;
	}
	
	//metodos especiais

	protected String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private float getAltura() {
		return altura;
	}

	private void setAltura(float altura) {
		this.altura = altura;
	}

	private float getPeso() {
		return peso;
	}

	private void setPeso(float peso) {
		this.peso = peso;
	}

	private String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 25.2) {
			this.categoria = "Inválido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	
}

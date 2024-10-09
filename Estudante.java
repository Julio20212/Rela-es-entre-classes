package Associação;

public class Estudante {

	private Universidade universidade;
	private String nome;

	public Estudante(String nome, Universidade universidade) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setuniversidade(Universidade universidade) {
		this.universidade = universidade;
	}

	public Universidade getuniversidade() {
		return universidade;
	}

}

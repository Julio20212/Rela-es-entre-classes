package Composição;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa ("Faria", 80);
		
		System.out.println(pessoa.getNome() + " tem a média de " + pessoa.getCoracao() + " batimentos");
	
	}
}

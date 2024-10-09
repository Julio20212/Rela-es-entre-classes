package Composição;

public class Principal2 {

	public static void main(String[] args) {

	Autor autor = new Autor("J.K. Rowling");
	Livro livro = new Livro("Harry Potter e a Pedra Filosofal", autor);

	System.out.println("O título do livro é: " + livro.getTitulo() + ", e o autor é: " + livro.getAutor().getNome());

	}
}

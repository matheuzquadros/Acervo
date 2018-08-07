package br.org.catolicasc.acervo.client;

import java.util.List;

import br.org.catolicasc.acervo.service.ListagemLivros;
import br.org.catolicasc.acervo.service.ListagemLivrosService;
import br.org.catolicasc.acervo.service.Livro;

public class Client {
	public static void main(String[] args) {
		ListagemLivrosService factory = 
				new ListagemLivrosService();
		
		ListagemLivros listagem = 
				factory.getListagemLivrosPort();
		
		List<Livro> livros = listagem.listarLivro();
		
		for(Livro livro : livros){
			System.out.println("Nome: "+livro.getNome());
		}
	}
}

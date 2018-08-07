package br.org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.org.catolicasc.acervo.model.Livro;

public class LivroDao {
	private static List<Livro> livros = new ArrayList<>();
	
	static{
		Livro l1 = new Livro();
		l1.setAnoDePublicacao(2015);
		l1.setEditora("Academia de letras");
		l1.setNome("O rei do inverno");
		l1.setAutores(Arrays.asList("Joao", "Maria"));
		livros.add(l1);
		
		Livro l2 = new Livro();
		l2.setAnoDePublicacao(2014);
		l2.setEditora("Academia de letras2");
		l2.setNome("O inimigo de deus");
		l2.setAutores(Arrays.asList("Sebastiao", "Maria"));
		livros.add(l1);
		
		Livro l3 = new Livro();
		l3.setAnoDePublicacao(2018);
		l3.setEditora("Academia de letras");
		l3.setNome("Excalibur");
		l3.setAutores(Arrays.asList("Bernard", "Cornwell"));
		livros.add(l3);
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
}

package br.com.daniel.silva;

public class LivroFisico extends Livro {

	public LivroFisico(String nome, String descricao, double valor, String isbn, Autor autor) {
		  super(nome, descricao, valor, isbn, autor);
		 }

		 @Override
		 public boolean aplicarDescontoDe(double porcentagem) {
		  if (porcentagem > 30) {
		   return false;
		  }
		  setValor(getValor() * (100 - porcentagem) / 100);
		  return true;
		 }
		}

package br.com.daniel.silva;

public class Ebook extends Livro {
	
	private String marcaDAgua;

	 public Ebook(String nome, String descricao, double valor, String isbn, Autor autor, String marcaDAgua) {
	  super(nome, descricao, valor, isbn, autor);
	  this.marcaDAgua = marcaDAgua;
	 }

	 public String getMarcaDAgua() {
	  return marcaDAgua;
	 }

	 public void setMarcaDAgua(String marcaDAgua) {
	  this.marcaDAgua = marcaDAgua;
	 }

	 @Override
	 public boolean aplicarDescontoDe(double porcentagem) {
	  if (porcentagem > 15) {
	   return false;
	  }
	  setValor(getValor() * (100 - porcentagem) / 100);
	  return true;
	 }

}

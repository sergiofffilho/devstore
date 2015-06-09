package npi.contatos.service;

import java.util.List;

import npi.contatos.model.Produto;

public interface ProdutoService {
	
	List<Produto> findAll();
	
	public Produto getProdutoById(Integer id);
	
	void salvar(Produto produto);
	
	void remover(Integer id);

}

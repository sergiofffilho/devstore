package npi.contatos.respository;

import java.util.List;

import npi.contatos.model.Produto;

public interface ProdutoRepository {
	
	List<Produto> findAll();
	
	void salvar(Produto produto);
	
	Produto findById(Integer id);
	
	void remover(Produto produto);

}

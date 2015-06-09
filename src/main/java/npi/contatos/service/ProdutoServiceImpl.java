package npi.contatos.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import npi.contatos.model.Produto;
import npi.contatos.respository.ProdutoRepository;

@Named
public class ProdutoServiceImpl implements ProdutoService {
	
	@Inject
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	@Override
	public void salvar(Produto produto) {
		produtoRepository.salvar(produto);
		
	}

	@Override
	public void remover(Integer id) {
		Produto produto = produtoRepository.findById(id);
		produtoRepository.remover(produto);
	}

}

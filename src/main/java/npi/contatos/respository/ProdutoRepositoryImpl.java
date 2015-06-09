package npi.contatos.respository;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import npi.contatos.model.Contato;
import npi.contatos.model.Produto;

import org.springframework.transaction.annotation.Transactional;

@Named
public class ProdutoRepositoryImpl implements ProdutoRepository {
	
	protected EntityManager em;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Produto> findAll() {
		Query query = em.createQuery("from Produto");
		return query.getResultList();
	}

	@Override
	@Transactional
	public void salvar(Produto produto) {
		em.persist(produto);
	}

	@Override
	public Produto findById(Integer id) {
		return em.find(Produto.class, id);
	}

	@Override
	@Transactional
	public void remover(Produto produto) {
		em.remove(em.merge(produto));
		
	}

}

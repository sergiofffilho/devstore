package npi.contatos.controller;

import javax.inject.Inject;

import npi.contatos.model.Produto;
import npi.contatos.service.ContatoService;
import npi.contatos.service.ProdutoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("produto")
public class ContatoController {
	
	@Inject
	private ContatoService contatoService;
	
	@Inject
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:/listar";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("produtos", produtoService.findAll());
//		model.addAttribute("contatos", contatoService.findAll());
		return "listar";
	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
	public String adicionarForm(Model model) {
		model.addAttribute("produto", new Produto());
		return "adicionar";
	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("produto") Produto produto) {
		produtoService.salvar(produto);
		return "redirect:/listar";
	}
	
	@RequestMapping(value = "/remover/{id}", method = RequestMethod.GET)
	public String remover(@PathVariable("id") Integer id) {
		contatoService.remover(id);
		return "redirect:/listar";
	}

}

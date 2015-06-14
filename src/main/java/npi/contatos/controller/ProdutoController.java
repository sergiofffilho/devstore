package npi.contatos.controller;

import javax.inject.Inject;

import npi.contatos.model.Contato;
import npi.contatos.model.Produto;
import npi.contatos.service.ProdutoService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutoController {
	
	
	@Inject
	private ProdutoService produtoService;
	
	@RequestMapping(value = "/")
	public String index() {
		return "redirect:produto/listar";
	}
	
	@RequestMapping(value = "/comprar/{produtoId}", method = RequestMethod.GET)
	public String comprar(@PathVariable("produtoId")Integer produtoId, Model model) {
		model.addAttribute("produtos", produtoService.getProdutoById(produtoId));
		//model.addAttribute("contatos", contatoService.findAll());
		return "comprar";
	}
	
	@RequestMapping(value = "/listar")
	public String listar(Model model) {
		model.addAttribute("produtos", produtoService.findAll());
		return "listar";
	}
	
//	@RequestMapping(value = "/adicionar", method = RequestMethod.GET)
//	public String adicionarForm(Model model) {
//		model.addAttribute("contato", new Contato());
//		return "adicionar";
//	}
	
	@RequestMapping(value = "/adicionar", method = RequestMethod.POST)
	public String adicionar(@ModelAttribute("produto") Produto produto) {
		return "adicionar";
	}
	
	@RequestMapping(value = "/remover/{id}", method = RequestMethod.GET)
	public String remover(@PathVariable("id") Integer id) {
		return "redirect:/listar";
	}

}

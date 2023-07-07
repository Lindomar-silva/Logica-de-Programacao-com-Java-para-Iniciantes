package com.algaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {

	private static final List<Contato> CONTATOS = new ArrayList<>();

	static {
		int i = 1;
		CONTATOS.add(new Contato("" + i++, "Maria", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("" + i++, "João", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("" + i++, "Normandes", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("" + i++, "Thiago", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("" + i++, "Alexandro", "+55 9-1234-5678"));
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");

		modelAndView.addObject("contatos", CONTATOS);

		return modelAndView;
	}

	@GetMapping("/contatos/novo")
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");

		modelAndView.addObject("contato", new Contato());

		return modelAndView;
	}

	@PostMapping("/contatos")
	public String cadastrar(Contato contato) {
		String id = UUID.randomUUID().toString();
		contato.setId(id);

		CONTATOS.add(contato);

		return "redirect:/contatos";
	}

	@GetMapping("/contatos/{id}/editar")
	public ModelAndView editar(@PathVariable String id) {
		ModelAndView modelAndView = new ModelAndView("formulario");

		Contato contato = localizarContato(id);

		modelAndView.addObject("contato", contato);

		return modelAndView;
	}

	public Contato localizarContato(String id) {

		for (Contato contato : CONTATOS) {
			if (contato.getId().equals(id)) {
				return contato;
			}
		}

		return null;
	}
}

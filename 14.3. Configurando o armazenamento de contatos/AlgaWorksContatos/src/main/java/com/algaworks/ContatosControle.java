package com.algaworks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {

	private static final List<Contato> CONTATOS = new ArrayList<>();

	static {
		CONTATOS.add(new Contato("1", "Maria", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("1", "João", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("1", "Normandes", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("1", "Thiago", "+55 9-1234-5678"));
		CONTATOS.add(new Contato("1", "Alexandro", "+55 9-1234-5678"));
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/contatos")
	public String listar() {
		return "listar";
	}
}

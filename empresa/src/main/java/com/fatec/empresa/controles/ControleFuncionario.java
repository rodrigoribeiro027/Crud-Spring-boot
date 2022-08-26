package com.fatec.empresa.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.empresa.modelos.Funcionario;
import com.fatec.empresa.repositorios.RepositorioFuncionario;

@RestController
public class ControleFuncionario {
	@Autowired
	private RepositorioFuncionario Bancodados;
	
	@GetMapping("/listarFuncionarios")
	public List<Funcionario> obterFuncionario(){
		return Bancodados.findAll();
	}
	@PostMapping("/InsesirFuncionario")
	public void inserirFuncionario(@RequestBody Funcionario novo) {
		Bancodados.save(novo);
	}
	@DeleteMapping("/deletarFuncionario")
	public void apagarFuncionario(@RequestBody Funcionario identificador) {
		@SuppressWarnings("deprecation")
		Funcionario alvo = Bancodados.getById(identificador.getId());
		Bancodados.delete(alvo);
	}
	@SuppressWarnings("deprecation")
	@PostMapping("/editarFuncionario")
	public void editarFuncionario(@RequestBody Funcionario identificador) {
		Funcionario alvo = Bancodados.getById(identificador.getId());
		alvo.setNome(identificador.getNome());
		Bancodados.save(alvo);
	}

}

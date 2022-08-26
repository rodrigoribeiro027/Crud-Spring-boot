package com.fatec.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.empresa.modelos.Funcionario;
import com.fatec.empresa.repositorios.RepositorioFuncionario;

@SpringBootApplication
public class EmpresaApplication implements CommandLineRunner {
	
	
	@Autowired 
	private RepositorioFuncionario Bancodados;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpresaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Funcionario usuario = new Funcionario();
		usuario.setNome("Jorge");
		Bancodados.save(usuario);
	}
}

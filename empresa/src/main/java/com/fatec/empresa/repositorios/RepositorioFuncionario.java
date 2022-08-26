package com.fatec.empresa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.empresa.modelos.Funcionario;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Long>   {

}

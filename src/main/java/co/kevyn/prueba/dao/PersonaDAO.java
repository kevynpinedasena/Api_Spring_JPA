package co.kevyn.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kevyn.prueba.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>{

}

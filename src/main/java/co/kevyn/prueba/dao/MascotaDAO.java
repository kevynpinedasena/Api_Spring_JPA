package co.kevyn.prueba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kevyn.prueba.model.Mascota;

public interface MascotaDAO extends JpaRepository<Mascota, Integer>{

}

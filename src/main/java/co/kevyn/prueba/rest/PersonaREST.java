package co.kevyn.prueba.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.kevyn.prueba.dao.PersonaDAO;
import co.kevyn.prueba.model.Persona;

@RestController
@RequestMapping("personas")
@CrossOrigin
public class PersonaREST {

	@Autowired
	private PersonaDAO miPersonaDao;
	
	//metodos http - SERVIDOR AL SERVIDOR
	
	//http://localhost:8080/personas
	
	@PostMapping("/guardar")
	public void guardarPersona(@RequestBody Persona miPersona) {
		miPersonaDao.save(miPersona);
	}
	
	@GetMapping("persona/{id}")
	public Optional<Persona> consultarPersonaId(@PathVariable("id") Integer id) {
		return miPersonaDao.findById(id);
	}
	
	@GetMapping("/listaPersona")
	public List<Persona> listaPersonas() {
		return miPersonaDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarPersona(@PathVariable("id") Integer id) {
		miPersonaDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizarPersona(@RequestBody Persona miPersona) {
		miPersonaDao.save(miPersona);
	}
}

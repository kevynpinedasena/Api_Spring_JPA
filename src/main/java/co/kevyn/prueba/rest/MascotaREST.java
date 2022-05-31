package co.kevyn.prueba.rest;

import java.util.List;

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

import co.kevyn.prueba.dao.MascotaDAO;
import co.kevyn.prueba.model.Mascota;

@RestController
@RequestMapping("mascotas")
@CrossOrigin
public class MascotaREST {

	
	@Autowired
	private MascotaDAO miMascotaDao;
	
	@PostMapping("/guardar")
	public void guardarMascota(@RequestBody Mascota miMascota) {
		miMascotaDao.save(miMascota);
	}
	
	@GetMapping("/listaMascota")
	public List<Mascota> listaMascota(){
		return miMascotaDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarMascota(@PathVariable("id") Integer id) {
		miMascotaDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizarMascota(@RequestBody Mascota miMascota) {
		miMascotaDao.save(miMascota);
	}
}

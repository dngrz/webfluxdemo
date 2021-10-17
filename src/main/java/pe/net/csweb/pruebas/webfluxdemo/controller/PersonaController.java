package pe.net.csweb.pruebas.webfluxdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.net.csweb.pruebas.webfluxdemo.model.PersonaBean;
import pe.net.csweb.pruebas.webfluxdemo.repo.IPersonaRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	private static final Logger log = LoggerFactory.getLogger(PersonaController.class);

	@Autowired
	private IPersonaRepo repo;

	@GetMapping
	public Flux<PersonaBean> listar() {
		return repo.listar();
	}

	@GetMapping("/{id}")
	public Mono<PersonaBean> listarPorId(@PathVariable("id") Integer id) {
		return repo.listarPorId(id);
	}

	@PostMapping
	public Mono<PersonaBean> registrar(@RequestBody PersonaBean persona) {
		return repo.registrar(persona);
	}

	@PutMapping
	public Mono<PersonaBean> modificar(@RequestBody PersonaBean persona) {
		return repo.registrar(persona);
	}

	@DeleteMapping("/{id}")
	public Mono<Void> eliminarPorId(@PathVariable("id") Integer id) {
		return repo.eliminar(id);
	}
}

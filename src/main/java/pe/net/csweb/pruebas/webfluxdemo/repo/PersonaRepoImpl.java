package pe.net.csweb.pruebas.webfluxdemo.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import pe.net.csweb.pruebas.webfluxdemo.model.PersonaBean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {
	
	private static final Logger log = LoggerFactory.getLogger(PersonaRepoImpl.class);

	@Override
	public Mono<PersonaBean> registrar(PersonaBean persona) {
		log.info(persona.toString());
		return Mono.just(persona);
	}

	@Override
	public Mono<PersonaBean> actualizar(PersonaBean persona) {
		log.info(persona.toString());
		return Mono.just(persona);
	}

	@Override
	public Flux<PersonaBean> listar() {
		List<PersonaBean> personas = new ArrayList<>();
		personas.add(new PersonaBean().builder().idPersona(1).nombre("Persona1").build());
		personas.add(new PersonaBean().builder().idPersona(2).nombre("Persona2").build());
		personas.add(new PersonaBean().builder().idPersona(3).nombre("Persona3").build());
		return Flux.fromIterable(personas);
	}

	@Override
	public Mono<PersonaBean> listarPorId(Integer id) {
		return Mono.just(new PersonaBean().builder().idPersona(id).nombre("Persona con Id").build());
	}

	@Override
	public Mono<Void> eliminar(Integer id) {
		return Mono.empty();
	}

}

package pe.net.csweb.pruebas.webfluxdemo.repo;

import pe.net.csweb.pruebas.webfluxdemo.model.PersonaBean;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonaRepo {

	Mono<PersonaBean> registrar(PersonaBean persona);

	Mono<PersonaBean> actualizar(PersonaBean persona);

	Flux<PersonaBean> listar();

	Mono<PersonaBean> listarPorId(Integer id);

	Mono<Void> eliminar(Integer id);

}

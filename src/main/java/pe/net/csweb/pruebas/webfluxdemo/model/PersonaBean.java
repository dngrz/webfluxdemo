package pe.net.csweb.pruebas.webfluxdemo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonaBean implements Serializable{
	
	private static final long serialVersionUID = -3923721716874688433L;
	
	private Integer idPersona;
	
	private String nombre;

	@Override
	public String toString() {
		return "PersonaBean [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	

}

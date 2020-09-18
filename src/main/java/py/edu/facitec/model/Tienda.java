package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //identificar tabla
public class Tienda {
	@Id  //clave primaria

	//GENERACION AUTOMATICA DEL ID 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private long id;
	private String descripcion;
	private Integer estrellas;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}
	
	@Override
	public String toString() {
		return "Tienda [id=" + id + ", descripcion=" + descripcion + ", estrellas=" + estrellas + "]";
	}
	
	
	
}

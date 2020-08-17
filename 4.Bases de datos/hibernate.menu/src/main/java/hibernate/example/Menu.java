package hibernate.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "menu", uniqueConstraints={@UniqueConstraint(columnNames= {"id"})})
public class Menu {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "precio")
	private double precio;

	public Menu() {
		
	}
	
	public Menu(int id, String nombre, String descripcion, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nId: ");
		sb.append(id);
		sb.append("\nNombre: ");
		sb.append(nombre);
		sb.append("\nDescripcion: ");
		sb.append(descripcion);
		sb.append("\nPrecio ");
		sb.append(precio);
		return sb.toString();
	}

}

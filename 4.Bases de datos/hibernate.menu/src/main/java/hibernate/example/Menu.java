package hibernate.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMenu")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "menu", fetch = FetchType.EAGER)
	private List<Plato> platos;

	public Menu(int id, String nombre, List<Plato> platos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.platos = platos;
	}

	public Menu() {
		super();
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

	@Override
	public String toString() {
		return "Menu [id=" + id + ", nombre=" + nombre + ", platos=" + platos + "]";
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}



}

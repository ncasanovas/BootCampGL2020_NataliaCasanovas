package hibernate.example;

import java.time.LocalDate;
import java.util.List;

public class Carrera {

	protected LocalDate dt; //= new DateTime(2010, 3, 5, 0, 0);
	protected String nombre;
	protected List<Competidor> competidores;
	
	public Carrera() {

		this.dt = LocalDate.of(2020 , 7 , 17);
		this.nombre = "Gran Carrera Global";
	}
	
	/*public Carrera() {

	}
	*/
	public LocalDate getDt() {
		return dt;
	}
	
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Competidor> getCompetidores() {
		return competidores;
	}
	
	public void setCompetidores(List<Competidor> competidores) {
		this.competidores = competidores;
	}
	

	
	

}

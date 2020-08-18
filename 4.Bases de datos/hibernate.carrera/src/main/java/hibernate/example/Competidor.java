package hibernate.example;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "competidor", uniqueConstraints={@UniqueConstraint(columnNames= {"numero"})})
public class Competidor {

	
	@Id
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "nombreCompetidor")
	private String nombreCompetidor;
	
	/*@Column(name = "carrera")
	Carrera carrera;

	*/

	public Competidor() {
		
	}
	
	public Competidor(int numero, String nombreCompetidor) {
		
		this.numero = numero;
		this.nombreCompetidor = nombreCompetidor;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombreCompetidor() {
		return nombreCompetidor;
	}

	public void setNombreCompetidor(String nombreCompetidor) {
		this.nombreCompetidor = nombreCompetidor;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNumero ");
		sb.append(numero);
		sb.append("\nNombre Competidor ");
		sb.append(nombreCompetidor);
		return sb.toString();
	}
	

	
}

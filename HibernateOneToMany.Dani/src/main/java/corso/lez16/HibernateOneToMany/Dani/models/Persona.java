package corso.lez16.HibernateOneToMany.Dani.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="personaID") 
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@Column(name = "codice_fiscale")
	private String cod_fis;
	
	public Persona() {
		
	}
	
	public Persona(String nome, String cognome, String cod_fis) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cod_fis = cod_fis;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCod_fis() {
		return cod_fis;
	}

	public void setCod_fis(String cod_fis) {
		this.cod_fis = cod_fis;
	}

	

}

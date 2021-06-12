package corso.lez16.HibernateOneToMany.Dani.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "carta_fedelta")
public class Carta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartaID")
	private int id;
	
	@Column
	private String negozio;
	
	@Column(name="numero_carta")
	private String numero; 
	
	@ManyToOne
	@JoinColumn(name = "persona_rif")
	private Persona proprietario;
	
	
	public Carta() {
		
	}

	public Carta(String negozio, String numero) {
		super();
		this.negozio = negozio;
		this.numero = numero;
	}

	public String getNegozio() {
		return negozio;
	}

	public void setNegozio(String negozio) {
		this.negozio = negozio;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Persona getProprietario() {
		return proprietario;
	}

	public void setProprietario(Persona proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Carta [id=" + id + ", negozio=" + negozio + ", numero=" + numero +  "]";
	}

	public String stampaProprietario() {
		return "Carta [id=" + id + ", negozio=" + negozio + ", numero=" + numero + ", proprietario=" + proprietario
				+ "]";
	}
	
	
	

	
	
}

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Proprietario {
	
	@Id
	private int Id_Proprietario;
	private int contato;
	private String Nome;
	
	@ManyToMany
	@JoinTable(
					name = "Proprietario",
					joinColumns = @JoinColumn(name = "Endereco"),
					inverseJoinColumns = @JoinColumn(name = "Id_Proprietario"))
	
	private Set <Hotel> tem;
	
	public int getId_Proprietario() {
		return Id_Proprietario;
	}
	public void setId_Proprietario(int id_Proprietario) {
		Id_Proprietario = id_Proprietario;
	}
	public int getContato() {
		return contato;
	}
	public void setContato(int contato) {
		this.contato = contato;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public Set<Hotel> getTem() {
		return tem;
	}
	public void setTem(Set<Hotel> tem) {
		this.tem = tem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id_Proprietario;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + contato;
		result = prime * result + ((tem == null) ? 0 : tem.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		if (Id_Proprietario != other.Id_Proprietario)
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (contato != other.contato)
			return false;
		if (tem == null) {
			if (other.tem != null)
				return false;
		} else if (!tem.equals(other.tem))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Proprietario [Id_Proprietario=" + Id_Proprietario + ", contato=" + contato + ", Nome=" + Nome + ", tem="
				+ tem + ", getId_Proprietario()=" + getId_Proprietario() + ", getContato()=" + getContato()
				+ ", getNome()=" + getNome() + ", getTem()=" + getTem() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public Proprietario(int id_Proprietario, int contato, String nome, Set<Hotel> tem) {
		super();
		Id_Proprietario = id_Proprietario;
		this.contato = contato;
		Nome = nome;
		this.tem = tem;
	}
	
}

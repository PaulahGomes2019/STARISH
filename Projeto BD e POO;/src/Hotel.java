import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")

public class Hotel {

	@Id
	private String Endereco;
	private String Nome;
	private Set <Reserva> possui;
	@OneToMany
	@JoinColumn(name="id_Empregados")
	private Set <Empregados> tem;
	@OneToMany
	private Set <Vagas> vagas;
	@ManyToMany
	@JoinTable(
					name = "Proprietario",
					joinColumns = @JoinColumn(name = "Id_Proprietario"),
					inverseJoinColumns = @JoinColumn(name = "Endereco"))
	@JoinColumn(name="Num_Vagas")
	private Set <Proprietario> proprietario;
	
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public Set<Reserva> getPossui() {
		return possui;
	}
	public void setPossui(Set<Reserva> possui) {
		this.possui = possui;
	}
	public Set<Empregados> getTem() {
		return tem;
	}
	public void setTem(Set<Empregados> tem) {
		this.tem = tem;
	}
	
	public Set<Vagas> getVagas() {
		return vagas;
	}
	public void setVagas(Set<Vagas> vagas) {
		this.vagas = vagas;
	}
	public Set<Proprietario> getProprietario() {
		return proprietario;
	}
	public void setProprietario(Set<Proprietario> proprietario) {
		this.proprietario = proprietario;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Endereco == null) ? 0 : Endereco.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((possui == null) ? 0 : possui.hashCode());
		result = prime * result + ((proprietario == null) ? 0 : proprietario.hashCode());
		result = prime * result + ((tem == null) ? 0 : tem.hashCode());
		result = prime * result + ((vagas == null) ? 0 : vagas.hashCode());
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
		Hotel other = (Hotel) obj;
		if (Endereco == null) {
			if (other.Endereco != null)
				return false;
		} else if (!Endereco.equals(other.Endereco))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (possui == null) {
			if (other.possui != null)
				return false;
		} else if (!possui.equals(other.possui))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		if (tem == null) {
			if (other.tem != null)
				return false;
		} else if (!tem.equals(other.tem))
			return false;
		if (vagas == null) {
			if (other.vagas != null)
				return false;
		} else if (!vagas.equals(other.vagas))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Hotel [Endereco=" + Endereco + ", Nome=" + Nome + ", possui=" + possui + ", tem=" + tem + ", vagas="
				+ vagas + ", proprietario=" + proprietario + ", getEndereco()=" + getEndereco() + ", getNome()="
				+ getNome() + ", getPossui()=" + getPossui() + ", getTem()=" + getTem() + ", getVagas()=" + getVagas()
				+ ", getProprietario()=" + getProprietario() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public Hotel(String endereco, String nome, Set<Reserva> possui, Set<Empregados> tem, Set<Vagas> vagas,
			Set<Proprietario> proprietario) {
		super();
		Endereco = endereco;
		Nome = nome;
		this.possui = possui;
		this.tem = tem;
		this.vagas = vagas;
		this.proprietario = proprietario;
	}
	
}

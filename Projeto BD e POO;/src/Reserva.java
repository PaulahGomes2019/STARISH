import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reserva {

	@Id
	private int Id_Reserva;
	private String Status;
	private Set <Empregados> pede;
	@OneToMany
	@JoinColumn(name="Id_Empregados")
	
	private Set <Hospedagem> gera;
	@ManyToOne
	@JoinColumn(name="Id_Hospedagem")
	
	private Set <TipoDeQuarto> tem;
	@OneToMany
	@JoinColumn(name="Id_TipoDeQuarto")
	
	public int getId_Reserva() {
		return Id_Reserva;
	}
	public void setId_Reserva(int id_Reserva) {
		Id_Reserva = id_Reserva;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public Set<Empregados> getPede() {
		return pede;
	}
	public void setPede(Set<Empregados> pede) {
		this.pede = pede;
	}
	
	public Set<Hospedagem> getGera() {
		return gera;
	}
	public void setGera(Set<Hospedagem> gera) {
		this.gera = gera;
	}
	
	public Set<TipoDeQuarto> getTem() {
		return tem;
	}
	public void setTem(Set<TipoDeQuarto> tem) {
		this.tem = tem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id_Reserva;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((gera == null) ? 0 : gera.hashCode());
		result = prime * result + ((pede == null) ? 0 : pede.hashCode());
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
		Reserva other = (Reserva) obj;
		if (Id_Reserva != other.Id_Reserva)
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (gera == null) {
			if (other.gera != null)
				return false;
		} else if (!gera.equals(other.gera))
			return false;
		if (pede == null) {
			if (other.pede != null)
				return false;
		} else if (!pede.equals(other.pede))
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
		return "Reserva [Id_Reserva=" + Id_Reserva + ", Status=" + Status + ", pede=" + pede + ", gera=" + gera
				+ ", tem=" + tem + ", getId_Reserva()=" + getId_Reserva() + ", getStatus()=" + getStatus()
				+ ", getPede()=" + getPede() + ", getGera()=" + getGera() + ", getTem()=" + getTem() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public Reserva(int id_Reserva, String status, Set<Empregados> pede, Set<Hospedagem> gera, Set<TipoDeQuarto> tem) {
		super();
		Id_Reserva = id_Reserva;
		Status = status;
		this.pede = pede;
		this.gera = gera;
		this.tem = tem;
	}
	
	
}

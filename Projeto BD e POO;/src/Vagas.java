import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vagas {
	
	@Id
	private int Num_Vagas;
	private int Tempo;
	private int Valor;
	
	@ManyToMany
	@JoinTable(
					name = "TipoDeQuarto",
					joinColumns = @JoinColumn(name = "Id_TipoDeQuarto"),
					inverseJoinColumns = @JoinColumn(name = "Num_Vagas"))
	private Set <TipoDeQuarto> tem;
	
	public int getNum_Vagas() {
		return Num_Vagas;
	}
	public void setNum_Vagas(int num_Vagas) {
		Num_Vagas = num_Vagas;
	}
	public int getTempo() {
		return Tempo;
	}
	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
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
		result = prime * result + Num_Vagas;
		result = prime * result + Tempo;
		result = prime * result + Valor;
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
		Vagas other = (Vagas) obj;
		if (Num_Vagas != other.Num_Vagas)
			return false;
		if (Tempo != other.Tempo)
			return false;
		if (Valor != other.Valor)
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
		return "Vagas [Num_Vagas=" + Num_Vagas + ", Tempo=" + Tempo + ", Valor=" + Valor + ", tem=" + tem
				+ ", getNum_Vagas()=" + getNum_Vagas() + ", getTempo()=" + getTempo() + ", getValor()=" + getValor()
				+ ", getTem()=" + getTem() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public Vagas(int num_Vagas, int tempo, int valor, Set<TipoDeQuarto> tem) {
		super();
		Num_Vagas = num_Vagas;
		Tempo = tempo;
		Valor = valor;
		this.tem = tem;
	}
	
	
}

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospedagem {

	@Id
	private int Id_Hospedagem;
	private String Status;
	private int Valor;
	
	public int getId_Hospedagem() {
		return Id_Hospedagem;
	}
	public void setId_Hospedagem(int id_Hospedagem) {
		Id_Hospedagem = id_Hospedagem;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id_Hospedagem;
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + Valor;
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
		Hospedagem other = (Hospedagem) obj;
		if (Id_Hospedagem != other.Id_Hospedagem)
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (Valor != other.Valor)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Hospedagem [Id_Hospedagem=" + Id_Hospedagem + ", Status=" + Status + ", Valor=" + Valor
				+ ", getId_Hospedagem()=" + getId_Hospedagem() + ", getStatus()=" + getStatus() + ", getValor()="
				+ getValor() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	public Hospedagem(int id_Hospedagem, String status, int valor) {
		super();
		Id_Hospedagem = id_Hospedagem;
		Status = status;
		Valor = valor;
	}
	
	
}
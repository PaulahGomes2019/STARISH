import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class TipoDeQuarto {
	
	@Id
	private int Id_TipoDeQuarto;
	private String Descricao;
	
	@ManyToMany
	@JoinTable(
					name = "Vagas",
					joinColumns = @JoinColumn(name = "Num_Vagas"),
					inverseJoinColumns = @JoinColumn(name = "Id_TipoDeQuarto"))
	
	public int getId_TipoDeQuarto() {
		return Id_TipoDeQuarto;
	}
	public void setId_TipoDeQuarto(int id_TipoDeQuarto) {
		Id_TipoDeQuarto = id_TipoDeQuarto;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descricao == null) ? 0 : Descricao.hashCode());
		result = prime * result + Id_TipoDeQuarto;
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
		TipoDeQuarto other = (TipoDeQuarto) obj;
		if (Descricao == null) {
			if (other.Descricao != null)
				return false;
		} else if (!Descricao.equals(other.Descricao))
			return false;
		if (Id_TipoDeQuarto != other.Id_TipoDeQuarto)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "TipoDeQuarto [Id_TipoDeQuarto=" + Id_TipoDeQuarto + ", Descricao=" + Descricao
				+ ", getId_TipoDeQuarto()=" + getId_TipoDeQuarto() + ", getDescricao()=" + getDescricao()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public TipoDeQuarto(int id_TipoDeQuarto, String descricao) {
		super();
		Id_TipoDeQuarto = id_TipoDeQuarto;
		Descricao = descricao;
	}

	
}

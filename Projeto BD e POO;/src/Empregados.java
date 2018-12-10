import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empregados {
	
	@Id
	private int Id_Empregados;
	private String Nome;
	private int Senha;
	private String Login;
	private Set <Hotel> tem;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id_Empregados;
		result = prime * result + ((Login == null) ? 0 : Login.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + Senha;
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
		Empregados other = (Empregados) obj;
		if (Id_Empregados != other.Id_Empregados)
			return false;
		if (Login == null) {
			if (other.Login != null)
				return false;
		} else if (!Login.equals(other.Login))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Senha != other.Senha)
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
		return "Empregados [Id_Empregados=" + Id_Empregados + ", Nome=" + Nome + ", Senha=" + Senha + ", Login=" + Login
				+ ", tem=" + tem + ", hashCode()=" + hashCode() + ", getId_Empregados()=" + getId_Empregados()
				+ ", getNome()=" + getNome() + ", getSenha()=" + getSenha() + ", getLogin()=" + getLogin()
				+ ", getTem()=" + getTem() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public Empregados(int id_Empregados, String nome, int senha, String login, Set<Hotel> tem) {
		super();
		Id_Empregados = id_Empregados;
		Nome = nome;
		Senha = senha;
		Login = login;
		this.tem = tem;
	}
	
	public int getId_Empregados() {
		return Id_Empregados;
	}
	public void setId_Empregados(int id_Empregados) {
		Id_Empregados = id_Empregados;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getSenha() {
		return Senha;
	}
	public void setSenha(int senha) {
		Senha = senha;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public Set<Hotel> getTem() {
		return tem;
	}
	public void setTem(Set<Hotel> tem) {
		this.tem = tem;
	}
	
	
}
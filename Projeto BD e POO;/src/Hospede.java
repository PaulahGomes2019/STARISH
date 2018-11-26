import java.util.ArrayList;

import javax.jws.Oneway;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospede {
	
	@Id
	private int idHospede;
	private String nome;
	private String Status;
	private Long telefone;
	private String recidencia;
	private ArrayList<Reserva> faz;
	
	public Hospede(int idHospede, String nome, String status, Long telefone, String recidencia,
			ArrayList<Reserva> faz) {
		super();
		this.idHospede = idHospede;
		this.nome = nome;
		Status = status;
		this.telefone = telefone;
		this.recidencia = recidencia;
		this.faz = faz;
	}
	public int getIdHospede() {
		return idHospede;
	}
	public void setIdHospede(int idHospede) {
		this.idHospede = idHospede;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getRecidencia() {
		return recidencia;
	}
	public void setRecidencia(String recidencia) {
		this.recidencia = recidencia;
	}
	public ArrayList<Reserva> getFaz() {
		return faz;
	}
	public void setFaz(ArrayList<Reserva> faz) {
		this.faz = faz;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Hospede() {
		super();
		// TODO Auto-generated constructor stub
	}
}

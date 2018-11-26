
public interface SisHotel {
	
	public Hotel hotel(Reserva reserva, Empregados empregados, Proprietario proprietario, Vagas vagas);
	//
	public void empregardos(Reserva reserva, Hotel hotel);
	//
	public void proprietario();
	//
	public void vagas(int Descricao);
	//
	public Hospede hospede(String Status);
	
	
	

}

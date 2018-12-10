
public interface SisHotel {
	
	public Hotel hotel(Reserva reserva, Empregados empregados, Proprietario proprietario, Vagas vagas) throws VagaInvalidaExpection; 
	//
	public void empregardos(Reserva reserva, Hotel hotel) throws ReservaInvalidaExpection;
	//
	public void proprietario();
	//
	public void vagas(int Descricao);
	//
	public Hospede hospede(String Status);
	
	
	

}

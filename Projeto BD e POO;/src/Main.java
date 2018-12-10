import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		DAO<Hospede> dao = new DAO<Hospede>();
		Hospede h = new Hospede();
		h.setFaz(22l);
		h.setNome("HugoFF");
		Hospede p;
		dao.save(p);
		Hospede h2 = new Hospede();
		h2.setFaz(23l);
		h2.setNome("Hugo");
		dao.save(h2);
		Hospede find = dao.find(Hospede.class, 22l);
		System.out.println(find.getNome());
	}
	
}

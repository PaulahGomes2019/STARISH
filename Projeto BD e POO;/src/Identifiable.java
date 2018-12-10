import javax.persistence.Id;

		public class Identifiable {
		@Id
 		private Long id;
 		private String nome;
 		private String hospede;
 
 		public Long getId() {
 			return id;
 		}
 		public void setId(Long id) {
 			this.id = id;
 		}
 		public String getNome() {
 			return nome;
 		}
 		public void setNome(String nome) {
 			this.nome = nome;
 		}
 		public String getHospede() {
 			return hospede;
 		}
 		public void setHospede(String hospede) {
 			this.hospede = hospede;
 		}
 
}


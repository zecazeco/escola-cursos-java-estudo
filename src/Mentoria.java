
public class Mentoria extends Conteudo {

	private int cargaHoraria;
	private String mentor;
		
	public Mentoria() {
		super(TIPOS.MENTORIA);

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

}

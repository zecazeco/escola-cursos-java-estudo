
public class Aula extends Conteudo {

	private int cargaHoraria;
	
	public Aula() {
		super(TIPOS.AULA);

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}

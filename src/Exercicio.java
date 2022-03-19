
public class Exercicio extends Conteudo {

	private int dificuldade;
	
	public Exercicio() {
		super(TIPOS.EXERCICIO);

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

}

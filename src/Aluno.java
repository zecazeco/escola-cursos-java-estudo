import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Curso> cursosInscritos = new ArrayList<Curso>();
	
	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addCurso(Curso curso) {
		this.cursosInscritos.add(curso);
	}

	public void imprimirCursos() {
		for (int i = 0; i < this.cursosInscritos.size(); i++) {
			System.out.println("=== Cursos ====");
			System.out.println("Nome " + this.cursosInscritos.get(i).getNome());
		}
	}	
}

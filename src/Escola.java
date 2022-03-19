import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Curso> cursos = new ArrayList<Curso>();
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public Escola() {
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public void addCurso(Curso curso) {
		this.cursos.add(curso);
	}

	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Curso getCurso(int id) {
		return this.cursos.get(id);
	}
	
	public Aluno getAluno(int id) {
		return this.alunos.get(id);
	}
	
	public void imprimirCursos() {
		for (int i = 0; i < this.cursos.size(); i++) {
			System.out.println("=======");
			System.out.println("Curso " + this.cursos.get(i).getIdCurso());
			System.out.println("Nome: " + this.cursos.get(i).getNome());
			System.out.println("Descricao: " + this.cursos.get(i).getDescricao());
			System.out.println("Carga Horaria: " + this.cursos.get(i).getCargaHoraria());
		}
	}
	
	public void imprimirAlunos() {
		for (int i = 0; i < this.alunos.size(); i++) {
			System.out.println("=======");
			System.out.println("Aluno: " + this.alunos.get(i).getNome());
			this.alunos.get(i).imprimirCursos();
		}
	}		
}

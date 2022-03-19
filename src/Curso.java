import java.util.ArrayList;
import java.util.List;

public class Curso {

	private static int SEQUENCIAL = 1;
	
    private int cargaHoraria;
    private int idCurso;
    private String nome;
    private String descricao;
    private List<Conteudo> conteudos = new ArrayList<Conteudo>();
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public Curso() {
    	this.idCurso = SEQUENCIAL++;
    }

    public int getIdCurso() {
		return idCurso;
	}

	public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addConteudo(Conteudo conteudo) {
		this.conteudos.add(conteudo);
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void imprimirConteudos() {
		for (int i = 0; i < this.conteudos.size(); i++) {
			System.out.println("=======");
			System.out.println("Conteudo " + this.conteudos.get(i).getTipo());
			System.out.println("Titulo: " + this.conteudos.get(i).getTitulo());
			System.out.println("Descricao: " + this.conteudos.get(i).getDescricao());
		}
	}	
	
	public void imprimirAlunos() {
		for (int i = 0; i < this.alunos.size(); i++) {
			System.out.println("=======");
			System.out.println("Aluno: " + this.alunos.get(i).getNome());
		}
	}	
}

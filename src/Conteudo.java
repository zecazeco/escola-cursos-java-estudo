
public class Conteudo {
	
	public enum TIPOS  {
	    AULA, EXERCICIO, MENTORIA;
	}
	private static int SEQUENCIAL = 1;
	
	private int idConteudo;
    private String titulo;
    private String descricao;
    private Conteudo.TIPOS tipo;
    
    public Conteudo(Conteudo.TIPOS tipo) {
    	this.tipo = tipo;
    	this.idConteudo = SEQUENCIAL++;
    }
    
	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public int getIdConteudo() {
		return idConteudo;
	}
	
	public String getTipo() {
		return tipo.name();
	}	

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String escolha = "";
		boolean exit = false;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("======= Bem Vindo ao Sistema Escolar ========");
		System.out.println("===============================================");

		System.out.println("=== Cadastro da Escola ===");
		System.out.print("Digite um nome para sua escola: ");
		escolha = entrada.nextLine();

		Escola escola1 = new Escola();
		escola1.setNome(escolha);
		
		try {
			do {
				System.out.println("================================================");
				System.out.println("O que você gostaria de fazer?");
				System.out.println("0 - Sair");
				System.out.println("1 - Cadastrar curso");
				System.out.println("2 - Listar todos os cursos");
				System.out.println("3 - Cadastrar conteudo em um curso");
				System.out.println("4 - Listar conteudos de um curso");				
				System.out.println("5 - Cadastrar aluno");
				System.out.println("6 - Listar alunos da escola");
				System.out.println("7 - Matricular aluno em um curso");
				System.out.println("8 - Listar alunos de um curso");
				
				escolha = entrada.nextLine();
				switch (escolha) {
					case "0":
						System.out.println("================================================");
						System.out.println("=============== Sistema encerrado ==============");
						System.out.println("============== Obrigado pela visita ============");
						System.out.println("================================================");
						exit = true;
						break;
					case "1":
						System.out.println("================================================");
						System.out.println("============== Cadastro de Cursos ==============");
						Curso curso1 = new Curso();
						
						System.out.print("Digite um nome para o curso: ");
						escolha = entrada.nextLine();
						curso1.setNome(escolha);

						System.out.print("Informe uma descrição para o curso: ");
						escolha = entrada.nextLine();
						curso1.setDescricao(escolha);

						System.out.print("Informe a carga horária do curso: ");
						int cargaHoraria = Integer.parseInt(entrada.nextLine());
						curso1.setCargaHoraria(cargaHoraria);
						
						escola1.addCurso(curso1);
						
						System.out.println("================================================");
						break;
					case "2":
						System.out.println("================================================");
						System.out.println("========== Lista de Cursos Cadastrados =========");
						escola1.imprimirCursos();
						System.out.println("================================================");
						break;
					case "3":
						System.out.println("================================================");
						System.out.println("========= Cadastro de conteudo no curso ========");
						
						System.out.print("Escolha o curso(ID): ");
						int idCursoCont = Integer.parseInt(entrada.nextLine()) - 1;
						Curso cursoEscolhido = escola1.getCurso(idCursoCont);
						
						System.out.print("Escolha um tipo de conteudo (1=AULA, 2=EXERCICIO, 3=MENTORIA): ");
						String tipoConteudo = entrada.nextLine();
						
						System.out.print("Digite um titulo para o conteudo: ");
						escolha = entrada.nextLine();
						String tituloConteudo = escolha;

						System.out.print("Informe uma descrição para o conteudo: ");
						escolha = entrada.nextLine();
						String descConteudo = escolha;	

						switch (tipoConteudo) {
							case "1":
								Aula aula1 = new Aula();
								aula1.setTitulo(tituloConteudo);
								aula1.setDescricao(descConteudo);
								System.out.print("Informe a carga horária da aula: ");
								int aulaCargaHoraria = Integer.parseInt(entrada.nextLine());
								aula1.setCargaHoraria(aulaCargaHoraria);
								cursoEscolhido.addConteudo(aula1);
								break;
							case "2":
								Exercicio exercicio1 = new Exercicio();
								exercicio1.setTitulo(tituloConteudo);
								exercicio1.setDescricao(descConteudo);
								System.out.print("Informe a dificuldade do exercicio: ");
								int dif = Integer.parseInt(entrada.nextLine());
								exercicio1.setDificuldade(dif);
								cursoEscolhido.addConteudo(exercicio1);								
								break;
							case "3":
								Mentoria mentoria1 = new Mentoria();
								mentoria1.setTitulo(tituloConteudo);
								mentoria1.setDescricao(descConteudo);
								System.out.print("Informe o nome do mentor: ");
								mentoria1.setMentor(entrada.nextLine());
								cursoEscolhido.addConteudo(mentoria1);									
								break;								
						}
					
						System.out.println("================================================");
						break;
					case "4":
						System.out.println("================================================");
						System.out.println("======== Lista de conteudos de um curso ========");
						System.out.print("Escolha o curso(ID): ");
						int idCursoList = Integer.parseInt(entrada.nextLine()) - 1;
						Curso cursoEscolhidoList = escola1.getCurso(idCursoList);	
						System.out.println("================================================");
						System.out.println("Curso escolhido: " + cursoEscolhidoList.getNome());
						cursoEscolhidoList.imprimirConteudos();
						System.out.println("================================================");
						break;
					case "5":
						System.out.println("================================================");
						System.out.println("============== Cadastro de aluno ===============");
						Aluno aluno1 = new Aluno();
						System.out.print("Digite um nome para o aluno: ");
						escolha = entrada.nextLine();
						aluno1.setNome(escolha);
						escola1.addAluno(aluno1);
						System.out.println("================================================");
						break;
					case "6":
						System.out.println("================================================");
						System.out.println("=========== Lista de alunos da escola ==========");
						escola1.imprimirAlunos();
						System.out.println("================================================");
						break;
					case "7":
						System.out.println("================================================");
						System.out.println("========= Matricular aluno em um curso =========");
						System.out.print("Escolha o curso(ID): ");
						Curso cursoMat = escola1.getCurso(Integer.parseInt(entrada.nextLine()) - 1);
						
						System.out.print("Escolha o aluno(ID): ");
						Aluno alunoMat = escola1.getAluno(Integer.parseInt(entrada.nextLine()) - 1);

						alunoMat.addCurso(cursoMat);
						cursoMat.addAluno(alunoMat);
						
						System.out.println("================================================");
						break;						
					case "8":
						System.out.println("================================================");
						System.out.println("=========== Listar alunos de um curso ==========");
						System.out.print("Escolha o curso(ID): ");
						Curso cursoLis = escola1.getCurso(Integer.parseInt(entrada.nextLine()) - 1);
						cursoLis.imprimirAlunos();
						System.out.println("================================================");
						break;
					default:
						break;				
				}
			} while(!exit);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			entrada.close();
			
		}

	}

}

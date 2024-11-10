import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	private double nota;
	private List<String> cursos;
	
	public Aluno() {
		this.cursos = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}
	
	public void adicionaCurso(String curso) {
		if (cursos.contains(curso)) {
			System.out.println("Aluno já está matriculado");
		}else {
			cursos.add(curso);
			System.out.println("Curso foi adicionado");
		}
	}
	
	public void removerCurso(String curso) {
		if (cursos.contains(curso)) {
			cursos.remove(curso);
			System.out.println("Curso removido");
		}else {
			System.out.println("Curso não encontrado");
		}
	}
	
	public boolean verificarNome(String nome) {
		return this.nome != null && this.nome.equalsIgnoreCase(nome);
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Nota: " + nota);
		System.out.println("Curso: " + cursos);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

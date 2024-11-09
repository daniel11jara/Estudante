import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String aluno;
	private double nota;
	private List<String> cursos;
	
	public Aluno() {
		this.cursos = new ArrayList<String>();
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
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
	
	public boolean adicionarCursos(String curso) {
		if (!cursos.contains(curso)) {
			cursos.add(curso);
			System.out.println("Curso adicionado: " + curso);
			return true;
		}else {
			System.out.println("Curso já existe");
			return false;
		}
	}
	
	public boolean removerCurso(String curso) {
		if (curso.contains(curso)) {
			cursos.remove(curso);
			System.out.println("Curso removido: " + curso);
			return true;
		}else {
			System.out.println("Curso não encontrado");
			return false;
		}
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + aluno);
		System.out.println("Nota: " + nota);
		System.out.println("Cursos: " + cursos);
	}

}

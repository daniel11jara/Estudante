import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.setAluno(scanner.nextLine());
		
		System.out.println("Nota: ");
		aluno.setNota(scanner.nextDouble());
		
		scanner.nextLine();
		
		while (true) {
			System.out.println("\nEscolha uma opção: ");
			System.out.println("1 - Adicionar Curso");
			System.out.println("2 - Remover curso");
			System.out.println("3 - Imprimir os dados");
			System.out.println("4 - sair");
			
			int opcao = scanner.nextInt();
			
			scanner.nextLine();
			
			switch (opcao) {
			case 1: System.out.print("Nome do curso: ");
			        String adicionaCurso = scanner.nextLine();
			        aluno.adicionarCursos(adicionaCurso);
			        break;
			case 2: System.out.print("Nome do curso a ser removido: ");
					String removerCurso = scanner.nextLine();
					aluno.removerCurso(removerCurso);
					break;
			
			case 3: aluno.imprimirDados();
					break;
					
			case 4:System.out.print("Encerrando");
			       scanner.close();
			       return;
			
			default:
				System.out.print("Opção inválida");
			}
		}

	}

}

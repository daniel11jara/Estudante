import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		aluno.setNome(scanner.nextLine());
		
		System.out.println("Nota da aluno: ");
		aluno.setNota(scanner.nextDouble());
		
		scanner.nextLine();
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("\nEscolha um opção: ");
			System.out.println("1 - Adiciona curso");
			System.out.println("2 - Remover curso");
			System.out.println("3 - Verificar nome do aluno");
			System.out.println("4 - Imprimir dados");
			System.out.println("5 - sair");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1: 
				System.out.println("Nome do curso: ");
				aluno.adicionaCurso(scanner.nextLine());
				break;
				
			case 2: 
				System.out.println("Nome do curso: ");
				aluno.removerCurso(scanner.nextLine());
				break;
				
			case 3:
				System.out.println("Nome para verificar: ");
				String nomeParaVerificar = scanner.nextLine();
				
				if (aluno.verificarNome(nomeParaVerificar)) {
					System.out.println("Nome já existe");
				}else{
					System.out.println("Aluno não existe");
				}
				
				break;
				
			case 4:
				aluno.imprimirDados();
				break;
				
			case 5:
				continuar = false;
				break;
			
			default:
				System.out.println("Opção inválida");
			}
		}
		
		scanner.close();
		
		
	}

}

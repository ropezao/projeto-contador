import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

	try{ 
		 System.out.println("Digite o primeiro numero");
		 int parametroUm = terminal.nextInt();
		 System.out.println("Digite o segundo Segundo numero");
		 int parametroDois = terminal.nextInt();

		 if(parametroDois > parametroUm) {
			int contagem = (parametroDois - parametroUm);

			System.out.println("Resultado: " + contagem);
			int numero = contagem;
            int contador = 0;
			for (contador = 0; numero > contador++;) {
				System.out.println(contador);
			}

		    } 
			else{
			System.out.println("O segundo numero precisa ser maior que o primeiro ");
		}
	}
	catch (InputMismatchException e){
			System.out.println("Por favor digite um numero sem ponto e virgula ");
	}
	
	
	}  

}
package engenharia_cede;
import java.util.Scanner;
public class main {

	import java.util.Scanner;

	import pt.brunojesus.caixa.errors.NotEnoughWidthException;

	

		public static void main(String[] args) { //throws Exception {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Largura: ");
			int width = in.nextInt();
			
			System.out.println("Altura: ");
			int height = in.nextInt();

			caixa caixa = new caixa(width, height, '-');
			
			try {
				caixa.print();
			} catch (NotEnoughWidthException e) {
				System.out.println("Ocorreu um erro ao desenhar a caixa! Largura tem que ser superior a 3");
				//System.out.println(e.getMessage());
			}
			
		}
		
		
	}
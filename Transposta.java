import java.util.Scanner;
public class Transposta {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i, j;
		i = scan.nextInt(); // lê as dimensões da matriz original
		j = scan.nextInt();
		
		int[][] entrada = new int[i][j]; // cria a matriz original

		for(int lin = 0; lin < i; lin++){
			for(int col = 0; col < j; col++){
				entrada[lin][col] = scan.nextInt(); // lê a matriz da entrada
			}
		}
		
		int[][] transposta = new int[j][i]; // cria a matriz transposta com as dimensões invertidas

		for (int lin = 0; lin < i; lin++) {
			for (int col = 0; col < j; col++) {
				transposta[col][lin] = entrada[lin][col]; // transpõe a matriz
			}
		}


		for(int lin = 0; lin < j; lin++){
			for(int col = 0; col < i; col++){
				System.out.print(transposta[lin][col] + " "); // imprime a matriz transposta
			}
			System.out.println();
		}
	
	}

}
import java.util.Scanner;
public class AchandoATransposta{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		int a,b;
		int [][] matriz=new int[i][j];
		for(a=0; a<i; a++){
			for(b=0; b<j; b++){
				matriz[a][b]=scan.nextInt();
			}
		}
		
		int [][] matrizTransposta=new int[j][i];
		for(a=0; a<i; a++){
			for(b=0; b<j; b++){
				matrizTransposta[b][a]=matriz[a][b];
			}
		}

		for(b=0; b<j; b++){
			for(a=0; a<i; a++){
				System.out.print(matrizTransposta[b][a] + " ");
			}
			System.out.println();
		}
	}
}
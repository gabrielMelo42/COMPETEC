import java.util.Scanner;
public class BatalhaNaval{
	public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
	int N=scan.nextInt();
	int M=scan.nextInt();
	//(N,M) eh o tamanho do tabuleiro

	int [][] tabuleiro=new int[N][M];

	//if(i>=j){
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				tabuleiro[i][j]=0;
			}
		}
	//}
/*
	else{
		for()
	}*/

	int couLinha=scan.nextInt();
	int couColuna=scan.nextInt();
	
	for(int i=0; i<4; i++){
		tabuleiro[couLinha-1][couColuna-1]=1;
		couColuna++;
	}

	int cruzLinha=scan.nextInt();
	int cruzColuna=scan.nextInt();
	
	for(int i=0; i<3; i++){
		tabuleiro[cruzLinha-1][cruzColuna-1]=2;
		cruzLinha++;
	}

	int poLinha=scan.nextInt();
	int poColuna=scan.nextInt();

	int aux=poColuna;
	for(int i=0; i<2; i++){
		for(int j=0; j<4; j++){
			tabuleiro[poLinha-1][poColuna-1]=3;
			poColuna++;
		}
		poLinha++;
		poColuna=aux;
	}

	for(int i=0; i<N; i++){
		for(int j=0; j<M; j++){
			System.out.print(tabuleiro[i][j] + " ");
		}
		System.out.println();
	}


	}
}
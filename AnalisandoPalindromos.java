import java.util.Scanner;
public class AnalisandoPalindromos{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		for(int x=0; x<N; x++){
			int K=scan.nextInt();
			char[] palavra=new char[K];
			for(int i=0; i<K; i++){
				palavra[i]=scan.next().charAt(0);
			} 

			boolean ehPalindromo=true;
			for(int i=0; i<=palavra.length/2; i++){
				if(palavra[i]!=palavra[palavra.length-1-i]){
					ehPalindromo=false;
					System.out.println("nao eh palindromo");
					break;
				}
			}

			if(ehPalindromo==true){
				System.out.println("eh palindromo");
			}
		}
	}
}

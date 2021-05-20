package aleatorio94;

import java.util.Random;

public class Aleatorio94 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		int vetor[] = new int[94];
		int cont = 1;
		int numero = 0;
	    int j = 0;
		
		for(int i = 1; i <= vetor.length; i++) {
			
			vetor[i-1] = i;
			
		}
	
		while(j>=0) {
			
			numero = aleatorio.nextInt(vetor.length);
			
			if(vetor[numero]>0) {
			
			System.out.println(cont+"º "+vetor[numero]+" ");
			
			vetor[numero]=0;
			
			cont++;
			
			}
			
		j++;
			
		}
		
		
		// TODO Auto-generated method stub

	}

}

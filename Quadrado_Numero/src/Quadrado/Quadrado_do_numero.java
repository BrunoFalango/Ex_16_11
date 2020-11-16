package Quadrado;

public class Quadrado_do_numero {

	public static void main(String[] args) {
		 int A = 0, a2, B = 0, b2, C = 0, c2, D = 0, d2 ;
		 
		 System.out.print("Digite quatro numeros dinstintos: \n");
		 scanf("%d,\n", A );
		 scanf("%d,\n", B );
		 scanf("%d,\n", C );
		  scanf("%d,\n", D );
		  a2 = A*A;
		  b2 = B*B;
		  c2 = C*C;
		  d2 = D*D;
		  System.out.print("cls");
		  if(c2 >= 1000){ System.out.printf("O terceiro numero digitado e seu quadrado, respectivamente sao: %d, %d\n", C,c2); }
		  else{ if(c2 < 1000) System.out.printf("O primeiro numero digitado e seu quadrado, respectivamente sao: %d, %d\n", A,a2);
		  System.out.printf("O segundo numero digitado e seu quadrado, respectivamente sao: %d, %d\n", B,b2);
		  System.out.printf("O terceiro numero digitado e seu quadrado, respectivamente sao: %d, %d\n", C,c2);
		  System.out.printf("O quarto numero digitado e seu quadrado, respectivamente sao: %d, %d\n", D,d2); }
		  System.out.printf("\n\n");
		  System.out.printf("Fim de progamacao.\n"); }

	private static void scanf(String string, int a) {
		// TODO Auto-generated method stub
		
	}
		
		
		

	}

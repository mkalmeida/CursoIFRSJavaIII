package AvaliacaoCinema;


public class ResultadosQuestionario {

	public static void main(String[] args) {
	
		int a, b, c, d, idadeE, idadeD, i, maior = 0;
		double mediaIdadeD, percE, e;
		
		Avaliacao.avaliacao();
		
		maior = Avaliacao.idadeE;
		
		for (i = 0; i<4;i++) {
			Avaliacao.avaliacao();
	
			if (Avaliacao.idadeE>maior) {
				maior =  Avaliacao.idadeE;
			} 
			
		}
	
		
		a = Avaliacao.a;
		b = Avaliacao.b;
		c = Avaliacao.c;
		d = Avaliacao.d;
		e = Avaliacao.e;
		
		percE = (e/(a+b+c+d+e)*100);
		
		System.out.println("A quantidade de respostas ÓTIMO foi: " + a);
		if (d>0) {
		idadeD = Avaliacao.sIdadeD;
		mediaIdadeD = idadeD/d;
		System.out.println("A média de idade das pessoas que responderam RUIM foi: " + mediaIdadeD);
		}
		System.out.println("A porcentagem de respostas PÉSSIMO é " + percE + "% e a maior idade que utilizou essa opção foi " + maior);

	}

}

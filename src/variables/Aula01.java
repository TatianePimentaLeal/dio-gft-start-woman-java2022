package variables;

/*
 * Classe de exemplo para o exerc�cio da aula 1 de Vari�veis, Tipos de Dado e Operadores Aritm�ticos.
 */

public class Aula01 {

	public static void main(String[] args) {
		int i;
		//int i;
		int I;
		//int 1a;
		int _1a; //n�o d� erro de compila��o, mas n�o � uma boa pr�tica
		int $aq; //n�o d� erro de compila��o, mas n�o � uma boa pr�tica
		
		//inicializa��o de vari�veis
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		
		//dos itens abaixo, os comentados s�o os itens errados
        final int j = 10;
        //j = 15;
        int asrn24678md;
        //int asrn246 78md;
        int asrn2$4678_md = 10;
        //int asrn2$46%78_md = 10;

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; n�o d� erro de compila��o, mas n�o � uma boa pr�tica
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5;  n�o d� erro de compila��o, mas n�o � uma boa pr�tica
        int QUANTIDADE_OPCOES = 25; //n�o gera erro de compila��o tamb�m, mas n�o � uma boa pr�tica
        //int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

	}

}

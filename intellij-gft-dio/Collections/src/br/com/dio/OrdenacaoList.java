package br.com.dio;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.*;

public class OrdenacaoList {

    public static void main (String [] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        /*Não podemos usar meusGatos.sort() porque o Sort usa um COMPARATOR e
        temos um classe COMPARABLE para usar. Então vamos usar o Collections.sort
        que recebe uma list (List<T> list) e essa lista pra ser organizada tem que
        ter o método comparable, organizado conforme abaixo.
        * */
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //System.out.println("--\tOrdem Idade\t---");

        //System.out.println("--\tOrdem cor\t---");

        //System.out.println("--\tOrdem Nome/Cor/Idade\t---");

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());

    /*
    * O this.getNome é porque estamos na mesma classe que tem todas as informações
    * Usamos o this.getNome() com o compareToIgnoreCase, mas poderia ser o compareTo também
    * para assim, comparar o nome da classe Gato representada pela variável gato
    * */
    }

}

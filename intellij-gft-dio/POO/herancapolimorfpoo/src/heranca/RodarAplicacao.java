package heranca;

class RodarAplicacao {

    public static void main(String[] args) {

        //Funcionario funcionario = new Funcionario();

        //upcasts
        /*Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        */

        //Gerente gerente = new Funcionario();

        //downcast
        //Vendedor vendedor2 = (Vendedor) new Funcionario();

        /*
         * Criação de vetor ClasseMae[] para uso do Override
         * */

        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        /*O For-Each é usado aqui para que seja percorrido o vetor
        Assim passamos pelos 3 objetos do vetor e chama o método 1 de cada um deles
        O polimorfismo abaixo ocorre porque o classe.metodo1 vai se comportar como o ClasseFilha
        e não como o ClasseMae. Na ultima percorrida na ClasseMae isso não vai ocorrer
        porque ela se refere a ela mesma
        */
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        //Aqui temos uma sobrescrita pura, sem polimorfismo, diferente dos outros 2 acima
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}
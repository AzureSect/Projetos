// CRIANDO OBJETO

class Conta {
    int numeroConta;
    String titularConta;
    double saldo;
//inserindo novos atributos e métodos.
    double salario;

// Utilizando o termo "void" faz com que não exiba um retorno.
        void saca(double quantidade){
            double novoSaldo = this.saldo - quantidade;
            this.saldo = novoSaldo;
        }

       void deposita(double quantidade) {
            this.saldo += quantidade;
       }
}

class TestandoMetodos{
    public static void main(String[] args){
        Conta novaConta;
        novaConta = new Conta();
// criando nova conta
    novaConta.titularConta = "Marcos";
    novaConta.saldo = 1000.0;

//Utilizando método SACAR
    novaConta.saca(350);

// Utilizando método DEPOSITAR
    novaConta.deposita(850);
    System.out.println(novaConta.saldo);
    }
}
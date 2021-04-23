//Criando um Objeto do tipo conta bancária:

class Conta {
    int numeroConta;
    String titularConta;
    double saldo;
}

//Na minha percepção, compreendi que a classe permite definir as características gerais de um determinado objeto. Como: Numero da conta, nome do titular e quanto tempo disponível.
//Entretanto,  quando se cria o objeto do tipo conta bancária, é onde podemos afirmar que a conta existe. 1 classe pode criar vários objetos.
class Programa{
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.titularConta = "Azure";
        minhaConta.saldo=1000.0;
        System.out.println("Olá " +  minhaConta.titularConta + " O seu saldo é: " + minhaConta.saldo);

    }

}

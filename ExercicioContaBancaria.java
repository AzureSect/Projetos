// Exercicio utilizando Setters / getters & métodos em java simulando ações de conta bancária.

class ContaBanco {
    //Definindo atributos para a classe

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


   // Método Personalizado
    public void estadoAtual(){
        System.out.println("_____________________________________________");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("_____________________________________________");
    }


    // GETTERS N SETTERS - Utilizar esses paramêtros para não ter que alterar os atributos diretamente.
    //set numConta = registra o número da conta de um banco
    public void setnumConta(int n) {

        this.numConta = n;
    }

    //get numConta = observa / pega o número de uma conta cadastrada
    public int getnumConta() {
        return this.numConta;
    }

    // getDono = observa o nome do dono da conta
    public String getDono(){
        return this.dono;
    }

    // setDono = define o  nome do dono da conta
    public String setDono(String d){
        this.dono = d;
        return d;
    }

    //getTipo = retorna o tipo da conta, se CC ou CP
    public String getTipo(){
        return tipo;
    }

    //setTipo = determina, define o tipo da conta, se CC ou CP
    public String setTipo(String t){
        return this.tipo = t;
    };

    //setSaldo = determina o valor do saldo (utilizado nos métodos abrirConta, depositar, sacar)
    public float setSaldo(float v){
            this.saldo = v;
            return v;
    }

    //getSaldo = retorna o saldo da conta
    public float getSaldo(){
        return saldo;
    }

    //demostra se a conta está aberta ou fechada
    public boolean getStatus(){
        return status;
    };

    //define se a conta estará aberta ou fechada
    public boolean setStatus(boolean s){
        this.status= s;
        return s;
    }

    //CONSTRUCTORS MÉTODOS ESPECIAIS
             public ContaBanco() {
            this.saldo = 0;
            this.status = false;
        }

    //Definindo Métodos
    public String abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        }
        else if  (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com Sucesso!");
        return t;
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, pois saldo é positivo");
        } else if (this.getSaldo() < 0 ) {
            System.out.println("Conta não pode ser fechada, pois saldo é negativo");
        } else {
            this.getStatus();
            System.out .println("Conta fechada com sucesso");
        }
    }

    public float deposita(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com Sucesso! na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar na conta fechada de " + this.getDono());
            return v;
        }
        return v;
    }


    public float sacar (float v){
        if (this.getStatus()){
                if (this.getSaldo() >= v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
            } else{
                    System.out.println("Saldo insuficiente para saque");
            }

        } else {
            System.out.println("Conta não está ativa");
            return v;
        }
        return v;
    }
    public int pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }

        else{
            System.out.println("Impossivel pagar conta fechada");
        }
        return v;
        }

    public static void  main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1111);
        p1.setDono("João");
        p1.estadoAtual();
        p1.abrirConta("CC");
        p1.estadoAtual();
        p1.deposita(300);
        p1.getSaldo();


        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(2222);
        p2.setDono("Maria");
        p2.estadoAtual();
        p2.abrirConta("CP");
        p2.estadoAtual();
        p2.deposita(1000);
        p2.sacar(100);
        p2.sacar(1060);
        p2.getSaldo();
        p2.estadoAtual();
    }
}





//Exercicio 02 de Java . Calcular o total de gasto em um trimestre e, fazer a média.
class GastoMedio {
    public static void main(String[] args){
        //registro de dados: gasto mensal no primeiro trimestre
        int janeiro = 1500;
        int fevereiro = 2300;
        int marco = 1700;

        int gastoTotal;
        gastoTotal = janeiro + fevereiro + marco;

        // IMPRIMI GASTO TOTAL
        System.out.println("seu gasto total foi de: " + gastoTotal);

        int gastoMedio;
                gastoMedio= gastoTotal / 3;

        // IMPRIMI GASTO MÉDIO
        System.out.println("seu gasto medio foi de: " + gastoMedio);

    }

}
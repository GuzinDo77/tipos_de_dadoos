public class BalancoTrimestral {

    public static void main(String[] BaslancoTrimestal){
        
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestal = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = gastosTrimestal / 3;

        System.out.println("O gasto trimestral é de "+gastosTrimestal+ " reais");
        System.out.println("A media de gastos é de "+mediaMensal+ " reais");
    }
    
}

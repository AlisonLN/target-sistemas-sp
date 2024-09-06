import java.util.Locale;

//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//        • SP – R$67.836,43
//        • RJ – R$36.678,66
//        • MG – R$29.229,88
//        • ES – R$27.165,48
//        • Outros – R$19.849,53
//
//        Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double spValor = 67836.43;
        double rjValor = 36678.66;
        double mgValor = 29229.88;
        double esValor = 27165.48;
        double outrosValor = 19849.53;

        double somaTotal = spValor + rjValor + mgValor + esValor + outrosValor;

        System.out.print("SP : "+String.format("%.2f%%\n" ,porcentatemTotal(somaTotal,spValor)));
        System.out.print("RJ : "+String.format("%.2f%%\n" ,porcentatemTotal(somaTotal,rjValor)));
        System.out.print("MG : "+String.format("%.2f%%\n" ,porcentatemTotal(somaTotal,mgValor)));
        System.out.print("ES : "+String.format("%.2f%%\n" ,porcentatemTotal(somaTotal,esValor)));
        System.out.print("Outros  : "+String.format("%.2f%%\n" ,porcentatemTotal(somaTotal,outrosValor)));

    }

    public static double porcentatemTotal(double somaTotal, double valorEstado){
        return valorEstado * 100 / somaTotal;

    }

}


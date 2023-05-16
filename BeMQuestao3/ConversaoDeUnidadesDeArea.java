import java.util.Scanner;

public class ConversaoDeUnidadesDeArea{
    public static double metroParaPes (int metros){
        return metros * 10.76;
    }
    public static int pesParaCm (int pes){
        return pes * 929;
    }
    public static int milhaParaAcres (int milhas){
        return milhas * 640;
    }
    public static double acresParaPes (int acres){
        return acres * 43.560;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int metro, pe, milha, acre;
        System.out.print("Insira um numero inteiro em metro para ser convertido para pés: ");
        metro = sc.nextInt();
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.metroParaPes(metro));
        System.out.print("Insira um numero inteiro em pés para ser convertido para centímetros: ");
        pe = sc.nextInt();
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.pesParaCm(pe));
        System.out.print("Insira um numero inteiro em milhas para ser convertido para acres: ");
        milha = sc.nextInt();
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.milhaParaAcres(milha));
        System.out.print("Insira um numero inteiro em acres para ser convertido para pés: ");
        acre = sc.nextInt();
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.acresParaPes(acre));
        sc.close();
    }
}
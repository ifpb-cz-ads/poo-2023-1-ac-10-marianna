public class AppRegistraAluno2 {
    public static void main (String[] args){
        var joao = new RegistraAluno("Joao da Silva", "Nao temos", 19);
        joao.setNotaMatematica(7);
        joao.setNotaPortugues(8);
        joao.setNotaGeografia(6.5);
        joao.imprimir(joao.getNotaMatematica(), joao.getNotaPortugues(), joao.getNotaGeografia());
    }
}

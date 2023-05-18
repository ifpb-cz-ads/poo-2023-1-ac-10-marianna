public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMat;
    private double notaPort;
    private double notaGeo;

    private static int contadorEstudante;

    public RegistraAluno(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        contadorEstudante++;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String temp){
        nome = temp;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String temp){
        endereco = temp;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int temp){
        idade = temp;
    }

    public void setNotaMatematica(double temp){
        notaMat = temp;
    }

    public double getNotaMatematica(){
        return notaMat;
    }
    
    public void setNotaPortugues(double temp){
        notaPort = temp;
    }

    public double getNotaPortugues(){
        return notaPort;
    }

    public void setNotaGeografia(double temp){
        notaGeo = temp;
    }

    public double getNotaGeografia(){
        return notaGeo;
    }

    public double getMedia(){
        double resultado = 0;
        resultado = (notaMat + notaPort + notaGeo) / 3;
        return resultado;
    }

    public static int getQuantidadedeAlunos(){
        return contadorEstudante;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }
    public void imprimir(double mNota, double pNota, double gNota){
        System.out.println("Nome: " + nome);
        System.out.println("Nota Matemática: " + mNota);
        System.out.println("Nota Português: " + pNota);
        System.out.println("NOta Geografia: " + gNota);
    }
}


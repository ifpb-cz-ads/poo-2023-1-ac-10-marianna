public abstract class Animal {
    private int idade;
    private boolean domestico;
    private String nome;

    public Animal (int idade, boolean domestico){
        this.idade = idade;
        this.domestico = domestico;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public int getIdade (){
        return idade;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        if(domestico = true){
        return nome;
        }
        else {
            return "O animal não possui nome";
        }
    }

    public void temperatura(){}
    public void mover(){}
    public void som(){}

    public String imprimir (){
        if(domestico){
        return "A idade do animal é: " + this.getIdade() + "\n" + "O animal é doméstico." + "\n" + "O nome do animal é: " + this.getNome() + "\n";
        }
        else{ 
        return "A idade do animal é: " + this.getIdade() + "\n" + "O animal não é doméstico" + "\n"; 
        }
    }
}

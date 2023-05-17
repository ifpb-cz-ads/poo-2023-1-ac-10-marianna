public abstract class Mamifero extends Animal {
    private boolean botaOvo;
    private String alimentacao;
    private String habitat;

    public Mamifero (int idade, boolean domestico, boolean botaOvo, String alimentacao, String habitat){
        super(idade, domestico);
        this.botaOvo = botaOvo;
        this.alimentacao = alimentacao;
        this.habitat = habitat;
    }

    public void setBotaOvo(boolean BotaOvo){
        botaOvo = true;
    }

    public boolean getBotaOvo (){
        return botaOvo;
    }

    public void setAlimentacao(String alimentacao){
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao (){
        return alimentacao;
    }

    public void setHabitat (String habitat){
        this.habitat = habitat;
    }

    public String getHabitat (){
        return habitat;
    }

    @Override
    public void temperatura (){
        System.out.println("Os mamíferos são endotérmicos.");
    }

    @Override
    public String imprimir(){
        if(botaOvo){
            return super.imprimir() + "O animal coloca ovo." + "\n" + "O animal é " + this.getAlimentacao() + "\n" + "Seu habitat natural é " + this.getHabitat() + "\n" + "\n";
        }
        else{
        return super.imprimir() + "O animal não coloca ovo." + "\n" + "O animal é " + this.getAlimentacao() + "\n" + "Seu habitat natural é " + this.getHabitat() + "\n" + "\n";
        }
    }
}

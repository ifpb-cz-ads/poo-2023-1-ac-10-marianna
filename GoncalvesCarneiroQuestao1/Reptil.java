public abstract class Reptil extends Animal {
    private boolean temVeneno;

    public Reptil (int idade, boolean domestico, boolean temVeneno){
        super(idade, domestico);
        this.temVeneno = temVeneno;
    }

    public void setTemVeneno (boolean temVeneno){
        this.temVeneno = temVeneno;
    }

    public boolean getTemVeneno (){
        return temVeneno;
    }

    @Override
    public void temperatura (){
        System.out.println("Os répteis são ectotérmicos.");
    }

    @Override
    public String imprimir(){
        if(temVeneno){
        return super.imprimir() + "O animal é venenoso" + "\n" + "\n";
    }
    else{
        return super.imprimir() + "O animal não é venenoso." + "\n" + "\n";
    }
}
}

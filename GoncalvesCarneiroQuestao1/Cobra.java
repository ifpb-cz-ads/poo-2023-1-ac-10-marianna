public class Cobra extends Reptil{
        public Cobra(int idade, boolean domestico, boolean temVeneno){
            super(idade, domestico, temVeneno);
        }

        @Override
        public void mover(){
          System.out.println("A cobra se rasteja.");
        }
   
       public String imprimir() {
           return super.imprimir();
       }
}

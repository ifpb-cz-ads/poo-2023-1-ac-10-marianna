public class Gato extends Mamifero{
        public Gato (int idade, boolean domestico, boolean botaOvo, String alimentacao, String habitat){
            super(idade, domestico, botaOvo, alimentacao, habitat);
        }

        @Override
        public void mover(){
          System.out.println("O gato anda.");
        }
   
       @Override
        public void som(){
           System.out.println("Miau");
        } 
   
       public String imprimir() {
           return super.imprimir();
       }
}

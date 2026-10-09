public class principal{

   public static void main(String[] args) {
      Animal animal = new Animal();
      Colaborador colaborador = new Colaborador();

      animal.idade = 15;
      animal.nome = "Rafael";
      animal.especie = "Humano";
      animal.identificador = 568;
      
      System.out.println("Idade: " +animal.idade+ "\nNome: " + animal.nome);

      Animal a2 = new Animal();

      a2.idade = 18;

      System.out.println("Idade de a2: " + a2.idade + " anos");
   }   
   

}
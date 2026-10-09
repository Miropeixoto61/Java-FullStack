
public static void main(String[] args) {
    Animal animal = new Animal();
   /* animal.idade = 15;
    animal.nome = "Rafael";
    animal.especie = "Humano";
    animal.identificador = 568;

    System.out.println("Idade = " + animal.idade + " Nome = " + animal.nome );

    Animal a2 = new Animal();
    a2.idade = 18;
    System.out.println("Idade do animal a2 = " + a2.idade); */

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a idade do animal");
    animal.idade = sc.nextInt();
    System.out.println("A idade que você digitou é: " + animal.idade);

}

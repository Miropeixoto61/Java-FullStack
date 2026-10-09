package Aula03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do animal: ");
        animal.idade = sc.nextInt();

        System.out.println("\n A idade do animal nesse ponto é: " + animal.idade);

        animal.modificaIdade(85);

        System.out.println("\n A nova idade é: " + animal.idade);

        System.out.println("A idade é maior que 50 " + animal.verificaIdade(animal.idade));
    }
    
}

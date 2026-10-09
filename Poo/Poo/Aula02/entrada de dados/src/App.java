import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Scanner num = new Scanner(System.in);

        System.out.print("Digite a idade do animal: ");
        animal.idade = num.nextInt();

        System.out.println("A idade do animal é: " + animal.idade);
        
        
    }
    
}

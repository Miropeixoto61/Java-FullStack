package Aula03;

public class Animal {
    String nome;
    String raca;
    int identificacao;
    int idade;    

    void modificaIdade(int novaIdade){
        this.idade = novaIdade;
    }

    boolean verificaIdade(int idade){
        if (this.idade > 50){
             return true;
        } else {    
        return false;
        }
}
}
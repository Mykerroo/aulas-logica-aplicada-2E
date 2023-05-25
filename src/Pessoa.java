public class Pessoa extends Animal {
    // Atributos da classe
    public String sobrenome;
    // Métodos da classe
    public void falar(){
        System.out.println("falei");
    }
    // Sobrecarga do método falar()
    public String falar(String volume){
        return "falei " + volume;
    }
    public void comer(){
        System.out.println("Comeu como pessoa");
    }
}
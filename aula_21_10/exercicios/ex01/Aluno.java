package aula_21_10.exercicios.ex01;

class Aluno
{
    private String nome;
    private double nota1;
    private double nota2;

    // Método construtor
    public Aluno(String nome, double nota1, double nota2)
    {
       this.nome = nome;
       this.nota1 = nota1;
       this.nota2 = nota2; 
    }

    // Método para calcular a media
    public double calcularMedia()
    {
        return (this.nota1 + this.nota2)/2;
    }

    // Método para exibir o nome e a média
    public void exibirMedia()
    {
        System.out.println("A media de " + this.nome + " é: ");
        System.out.println(calcularMedia());
    }

}

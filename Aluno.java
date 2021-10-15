public class Aluno {
    private String nome;
    private String cpf; 
    private double nota1;
    private double nota2;
    private double nota3; 
    private double media;
    
    public Aluno(String nome, String cpf) { 
        super(); this.nome = nome;
        this.cpf = cpf;
    }

    public Aluno() {
    }

    public static void calcularMedia (double nota1, double nota2, double nota3) { 
        double calcularMedia = (nota1 + nota2 + nota3)/3; } 
        public double getCalcularMedia() {
        return getCalcularMedia(); }
    public static void main(String[] args) { 
        Aluno aluno1; 
        aluno1 = new Aluno();
        
        aluno1.nome = "Sayonara Cavalcante"; 
        aluno1.cpf = "123.456.789-01";
        aluno1.nota1 = 9.0;
        aluno1.nota2 = 10.0;
        aluno1.nota3 = 6.3;
        
        calcularMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3);
        System.out.println("Média: " + aluno1.getCalcularMedia());
    }
}

public class Paciente {
    private int codigo;
    private String nome;
    private String datadenascimento;
    private String sexo;
    private String planodesaude;
    private String alergia;
    private String tiposanguineo;

    public Paciente(){

    }
    public static void main (String[] args) {
        Paciente Paciente1;
        Paciente1 = new Paciente();

        Paciente1.codigo = 1234;
        Paciente1.nome = "Sayonara Cavalcante";
        Paciente1.datadenascimento = "29/04/2002";
        Paciente1.sexo = "feminino";
        Paciente1.planodesaude = "Plano Premium";
        Paciente1.alergia = "A paciente não possui alergias";
        Paciente1.tiposanguineo = "O+";

        System.out.println("Código: " + Paciente1.codigo);
        System.out.println("Nome: " + Paciente1.nome);
        System.out.println("Data de Nascimento: " + Paciente1.datadenascimento);
        System.out.println("Sexo: " + Paciente1.sexo);
        System.out.println("Plano de Saúde: " + Paciente1.planodesaude);
        System.out.println("Alergia: " + Paciente1.alergia);
        System.out.println("Tipo Sanguineo: " + Paciente1.tiposanguineo);

    }
}

public class Medico {
    private int codigo;
    private String nome;
    private String sexo;
    private String especialidade;
    private Endereco endereco1;
    
    public Medico() {

    }
    public static void main(String[] args) {
        Medico Medico1;
        Medico1 = new Medico();
        Endereco endereco1;
        endereco1 = new Endereco();

        String retornarRua;
        int retornarNumero;
        String retornarComplemento;
        String retornarBairro;
        String retornarCidade;
        String retornarUF;
        String retornarCEP;

        retornarRua = endereco1.getRua();
        retornarNumero = endereco1.getNumero();
        retornarComplemento = endereco1.getComplemento();
        retornarBairro = endereco1.getBairro();
        retornarCidade = endereco1.getCidade();
        retornarUF = endereco1.getUF();
        retornarCEP = endereco1.getCEP();
        
        Medico1.codigo = 0007;
        Medico1.nome = "James Bold";
        Medico1.sexo = "Masculino";
        Medico1.especialidade = "Neurocirurgião";
        
        System.out.println("Código: " + Medico1.codigo);
        System.out.println("Nome: " + Medico1.nome);
        System.out.println("Sexo: " + Medico1.sexo);
        System.out.println("Especialidade: " + Medico1.especialidade);
        System.out.println("Endereço: " + endereco1);
        System.out.println("Rua: " + retornarRua);
        System.out.println("Numero: " + retornarNumero);
        System.out.println("Complemento: " + retornarComplemento);
        System.out.println("Bairro: " + retornarBairro);
        System.out.println("Cidade: " + retornarCidade);
        System.out.println("UF: " + retornarUF);
        System.out.println("CEP: " + retornarCEP);
        
        

    }
}
    


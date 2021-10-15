public class Endereco {
    
    private String rua; 
    private int numero;
    private String complemento;
    private String bairro; 
    private String cidade;
    private String UF;
    private String CEP;
    
    public String getRua() { 
    return rua;
    }
    public void setRua (String rua) { 
        this.rua = rua;
    }
    public int getNumero() { 
        return numero;
    }
    public void setNumero(int numero) { 
        this.numero = numero;
    }
    public String getComplemento() { 
        return complemento;
    }
    public void setComplemento (String complemento) { 
        this.complemento = complemento; 
    }
    public String getBairro() { 
        return bairro;
    }
    public void setBairro(String bairro) { 
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade (String cidade) { 
        this.cidade = cidade;
    }
    public String getUF() { 
        return UF;
    }
    public void setUF (String UF) {
        this.UF = UF;
    }
    public String getCEP() { 
        return CEP;
    }
    public void setCEP (String CEP) { 
        this.CEP = CEP;
    }
        
        public static void main(String[] args) {
        Endereco Endereco1; 
        Endereco1 = new Endereco();
        
        Endereco1.rua = "Rua Getulio Vargas";
        Endereco1.numero = 005;
        Endereco1.complemento = "apt. 004";
        Endereco1.bairro = "Centro"; 
        Endereco1.cidade = "Quijingue";
        Endereco1.UF = "BA";
        Endereco1.CEP = "48830-000";

        System.out.println("---------- Endereço ---------- " );
        System.out.println("Rua: " + Endereco1.rua);
        System.out.println("Número: " + Endereco1.numero);
        System.out.println("Complemento: " + Endereco1.complemento);
        System.out.println("Bairro: " + Endereco1.bairro);
        System.out.println("Cidade: " + Endereco1.cidade);
        System.out.println("UF: " + Endereco1.UF);
        System.out.println("CEP:" + Endereco1.CEP);
    }


}

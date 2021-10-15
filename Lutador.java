public class Lutador {
    private String nome; 
    private int energia;
    private int forca;

    public String getNome() {
        return nome;
    } 
    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getEnergia() { 
        return energia;
    }
    public void setEnergia(int energia) { 
        this.energia = energia;
    }
    public int getForca() { 
        return forca;
    } 
    public void setForca(int forca) { 
        this.forca = forca;
    }
    public Lutador (String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }
    
    public Lutador() {

    }
    public void aplicarGolpe(String nome, int energia, int forca) {

    }
    public void reduzirEnergia(String nome, int energia, int forca) {
        energia = energia - forca;
    }
    
    public static void main(String[] args) {
        Lutador lutador1;
        lutador1 = new Lutador();
        Lutador lutador2;
        lutador2 = new Lutador();
        
        lutador1.nome = "Ryu";
        lutador1.energia = 100;
        lutador1.forca = 10;
        
        lutador2.nome = "Bison";
        lutador2.energia = 100;
        lutador2.forca = 12;

        int percaenergialutador1;
        int percaenergialutador2;

        percaenergialutador2 = lutador1.energia - (lutador1.forca = 10 * 3); 
        System.out.println("Energia de Bison após os golpes: " + percaenergialutador2); 
        percaenergialutador1 = lutador2.energia -  (lutador2.forca = 12 * 8); 
        System.out.println("Energia de Ryu após os golpes: " + percaenergialutador1);
    }
}


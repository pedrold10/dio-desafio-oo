import java.util.Scanner;

public class Iphone implements Reprodutor{
    private String musica;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public void tocar() {
        System.out.println("A música: "+this.getMusica()+" está tocando");
    }

    @Override
    public void pausar() {
        
        System.out.println("A música: "+this.getMusica()+" está pausada");
    }

    @Override
    public void selecionarMusica() {
        Scanner entrada = new Scanner(System.in);
        musica = entrada.nextLine();
        this.setMusica(musica);
        this.tocar();
        
    }
    
    
}

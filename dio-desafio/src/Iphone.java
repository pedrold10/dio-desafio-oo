import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Iphone implements Reprodutor, Aparelho{
    private String musica;
    private String numero;

    public Iphone(){
        Random random = new Random();
        int numero = random.nextInt(100000000);
        this.numero = String.format("%08d", numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

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

    @Override
    public void ligar(Iphone iphone) {
        String numeroDiscado = iphone.getNumero();
        System.out.println("Ligando para: " + numeroDiscado);
    }

    @Override
    public void atender(Iphone iphone) {
        Scanner entrada = new Scanner(System.in);
        String numeroLigando = iphone.getNumero();
        System.out.println("Recebendo ligação de: " + numeroLigando + "\nAtender?\n1 - SIM\n2 - NÃO");
        int atender = entrada.nextInt();
        if(atender==1)
            System.out.println("Ligação de: " + numeroLigando + " em andamento");
        else
            System.out.println("Ligação de: " + numeroLigando + " recusada");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }
    
    
}

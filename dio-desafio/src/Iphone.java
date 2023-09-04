import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Iphone implements Reprodutor, Aparelho, Navegador{
    private String musica;
    private String numero;

    private List<Pagina> abas = new ArrayList<>();

    public List<Pagina> getPaginas() {
        return abas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.abas = paginas;
    }

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

    @Override
    public void exibirPagina() {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        for(Pagina pagina : abas){
            contador++;
            System.out.println("Página "+ contador + pagina.getEndereco());
        }
        System.out.println("Escolha em qual aba você quer navegar: ");
        scanner.nextInt();
    }

    @Override
    public void adicionarNovaAba() {
        Scanner scanner = new Scanner(System.in);
        String endereco = scanner.nextLine();
        Pagina pagina = new Pagina(endereco);
        abas.add(pagina);
        System.out.println("Número de abas: " + abas.size());
        
    }

    @Override
    public void atualizarPagina() {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        for(Pagina pagina : abas){
            contador++;
            System.out.println("Página "+ contador + pagina.getEndereco());
        }
        System.out.println("Escolha qual aba você quer atualizar: ");
        scanner.nextInt();
    }
    
    
}

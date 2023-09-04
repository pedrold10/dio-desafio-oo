public class App {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();
        // Operações do reprodutor musical
        /* 
        iphone.selecionarMusica();
        iphone.pausar();
        iphone.tocar();
        */
        

        // Operações de ligação

        Iphone iphone2 = new Iphone();
        iphone2.ligar(iphone);
        iphone.atender(iphone2);
    }
}

package funcionalidades.musica;

public class Ipod implements ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando a música");
    };
    public void pausar(){
        System.out.println("Pausando a música");
    };
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    };
}

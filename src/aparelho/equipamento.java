package aparelho;

import funcionalidades.musica.Ipod;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.navegador.NavegandoNaInternet;
import funcionalidades.navegador.Internet;
import funcionalidades.telefone.AparelhoTelefonico;
import funcionalidades.telefone.Phone;

public class equipamento {
    public static void main(String[] args) {
        System.out.println("=========================================");
        ReprodutorMusical appMusica =  new Ipod();
        appMusica.selecionarMusica("Believer-Imagine Dragons");
        appMusica.tocar();
        appMusica.pausar();
        System.out.println("=========================================");

        AparelhoTelefonico telefone = new Phone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("=========================================");

        NavegandoNaInternet navegar = new Internet();
        navegar.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
        navegar.atualizarPagina();
        navegar.adicionarNovaAba();

    }

}

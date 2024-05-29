package funcionalidades.receberFuncoes;

import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.navegador.NavegandoNaInternet;
import funcionalidades.telefone.AparelhoTelefonico;

public class Funcionalidades  implements ReprodutorMusical, NavegandoNaInternet, AparelhoTelefonico {


    @Override
    public void tocar() {
        System.out.println("Tocando música via Funcionalidades do app");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música via Funcionalidades do app");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando uma música via Funcionalidades do app");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página via Funcionalidades do app");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página via Funcionalidades do app");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página via Funcionalidades do app");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando via Funcionalidades do app");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Funcionalidades do app");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz via Funcionalidades do app");
    }
}

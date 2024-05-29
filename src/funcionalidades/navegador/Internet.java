package funcionalidades.navegador;

public class Internet implements NavegandoNaInternet{

    public void exibirPagina(String url){
        System.out.println("Exibindo página: "+url);
    };
    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    };
    public void atualizarPagina(){
        System.out.println("atualizando pagina");
    };
}

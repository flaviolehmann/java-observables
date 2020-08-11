package observerimpl;

public class Observerimpl {
    
    // Aplicação que simula a realização de chamadas assincronas à apis, que
    // são uma excelente demonstração de como os Observers funcionam.
    //
    // Vale notar a ordem com que são definidos os prints, e em que ordem são
    // exibidos em tela.
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient("http://dev.spring.com:8080");
        
        System.out.println("Preparando-se para realizar a requisição...");
        
        httpClient.makeRequest().subscribe(res ->
            System.out.println("Requisição concluída!\nResposta obtida: " + res)
        );
        System.out.println("Requisição realizada, porém ainda não concluída.");
        
        // Vamos fingir que nesse momento a requisição foi concluída rs
        httpClient.simularConclusaoDaRequisicao();
    }
    
}

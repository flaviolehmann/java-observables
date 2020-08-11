/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerimpl;

/**
 *
 * @author flavi
 */
public class HttpClient {
    
    private Observable<String> observable = new Observable<>();
    private String url;

    public HttpClient(String url) {
        this.url = url;
    }
    
    public Observable makeRequest() {
        // Código onde é feita a chamada à api
        return this.observable;
    }
    
    public void simularConclusaoDaRequisicao() {
        this.observable.update("abc-123");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

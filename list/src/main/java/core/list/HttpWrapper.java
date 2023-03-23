package core.list;

import org.apache.hc.client5.http.classic.HttpClient;

public class HttpWrapper {

    private HttpClient client;

    public HttpWrapper(HttpClient client){
        this.client = client;
    }

}
package org.metier.WS;

import jakarta.xml.ws.Endpoint;
import org.metier.banqueService;

public class ServerJWS {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "http://0.0.0.0:9000/";
        Endpoint.publish(url, new banqueService());
        System.out.println("web service deploy sur " + url);


    }
}

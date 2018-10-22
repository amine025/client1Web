/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author utilisateur
 */
public class Gestionnaire {

    public Gestionnaire() {

    }

    public static String dateClientJSON(DateClient date) {
        String ddnJson = null;
        Gson gson = new GsonBuilder().create();

        ddnJson = gson.toJson(date);
        return ddnJson;
    }

    public static String clientJSON(Client client) {
        String clientJson = null;
        Gson gson = new Gson();

        clientJson = gson.toJson(client);
        return clientJson;
    }
    
    public static DateClient createDateClient(String[] infosDate){
        String year = infosDate[0];
        String month = infosDate[1];
        String day = infosDate[2];
        
        DateClient dateClient = new DateClient(year,month,day);

        return dateClient;
    }
    
    public static Client createClient(String nom, String prenom, DateClient dateClient){
        Client client = new Client(nom, prenom, dateClient);
        return client;
    }
}

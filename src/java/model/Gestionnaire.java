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

    private static Client client;

    public Gestionnaire() {

    }

    private static void createClient(String nom, String prenom, int dateClient) {
        client = new Client(nom, prenom, dateClient);
    }

    public static String clientJSON(String nom, String prenom, int dateClient) {
        createClient(nom, prenom, dateClient);
        String clientJson = null;
        Gson gson = new Gson();

        clientJson = gson.toJson(client);
        return clientJson;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author utilisateur
 */
public class Gestionnaire {

    public static String myMessage(java.lang.String birthDay) {
        service.MessageService_Service service = new service.MessageService_Service();
        service.MessageService port = service.getMessageServicePort();
        return port.myMessage(birthDay);
    }

}

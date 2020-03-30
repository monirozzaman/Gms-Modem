/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmsmodem;

/**
 *
 * @author monirozzamanroni
 */
public class GmsModem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
         PortFinder portFinder=new PortFinder();
        // portFinder.getAndTestCOMPorts();
         
        Sms sms=new Sms();
       //System.out.println(sms.sendSMS("COM5", "+8801988841890", "fdgfdgfdg"));
        //sms.readSms("COM5");
        sms.dialUssd("COM5", "*222#");
        
        
    }
   
}

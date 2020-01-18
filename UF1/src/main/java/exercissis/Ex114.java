/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercissis;

/**
 *
 * @author alu2019222
 */
public class Ex114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int km = (int)(Math.random()*2000)+1, anysCarnet = (int)(Math.random()*10);
        String vehicle = "cotxe";
        boolean soci = (int)(Math.random()) == 1;
        System.out.println("km: "+km+"\nAnys Carnet: "+anysCarnet+"\nVehicle: "+vehicle+"\nSoci: "+soci);
        double price = 30;
        if (km <= 300){
            price = 30;
        } else if (vehicle.equals("cotxe")){
            if (km >= 1000){
                price += ((double)km-300-1000)*0.2;
                double dist = (double)km - 1000;
                price += dist*0.18;
            } else {
                price += ((double)km-300)*0.2;
            }
        } else if (vehicle.equalsIgnoreCase("moto")){
            if (km > 1000){
                price += ((double)km-300-1000)*0.1;
                double dist = (double)km - 1000;
                price += dist*0.08;
            } else {
                price += ((double)km-300)*0.1;
            }
        }
        
        if (anysCarnet < 5){
            price*=0.5;
        } else if (anysCarnet > 5 && soci == true) {
            price-=((km * 10) /100);
        }
        
        System.out.println("Preu total: "+price+"€");
    }
    
}

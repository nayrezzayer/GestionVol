/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author Iyed
 */

public class Escale {


		private int idEs;

        private String heuredep ;
        private String heureArr;
        private String AirportEs ;

    public int getidEs() {
        return idEs;
    }

    public String getheuredep() {
        return heuredep;
    }

    public String getheureArr() {
        return heureArr;
    }

    public void setId(int idEs) {
        this.idEs = idEs;
    }

    public void setheuredep(String heuredep) {
        this.heuredep = heuredep;
    }

    public void setheureArr(String heureArr) {
        this.heureArr = heureArr;
    }

   
    
    public String getAirportEs() {
	return AirportEs;
}

public void setAirportEs(String airportEs) {
	AirportEs = airportEs;
}
        
    
}

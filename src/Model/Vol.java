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
public class Vol {
    private int IdVol;
    private String nameAirport; //NameµCl0
    private String nameAirportArr;
	private String AerportEscale ; // Namepro
    private String DdepVol , DarrVol; //qte
    private String heuredepEscale ; //prix
    private String heureArrEscale ; //date 
    private String reservation ;  


	public int getIdVol() {
		return IdVol;
	}
	public void setIdVol(int idVol) {
		IdVol = idVol;
	}
	public String getNameAirport() {
		return nameAirport;
	}
	
	public void setNameAirport(String nameAirport) {
		this.nameAirport = nameAirport;
	}
    public String getAerportEscale() {
		return AerportEscale;
	}
	public void setAerportEscale(String aerportEscale) {
		AerportEscale = aerportEscale;
	}

	public String getDdepVol() {
		return DdepVol;
	}
	public void setDdepVol(String ddepVol) {
		DdepVol = ddepVol;
	}
	public String getDarrVol() {
		return DarrVol;
	}
	public void setDarrVol(String darrVol) {
		DarrVol = darrVol;
	}
	public String getHeuredepEscale() {
		return heuredepEscale;
	}
	public void setHeuredepEscale(String heuredepEscale) {
		this.heuredepEscale = heuredepEscale;
	}
	public String getHeureArrEscale() {
		return heureArrEscale;
	}
	public void setHeureArrEscale(String heureArrEscale) {
		this.heureArrEscale = heureArrEscale;
	}
	public String getNameAirportArr() {
		return nameAirportArr;
	}
	public void setNameAirportArr(String nameAirportArr) {
		this.nameAirportArr = nameAirportArr;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
    
}
    
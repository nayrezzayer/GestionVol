/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Vol;
import Model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iyed
 */
public class VolController implements VolCrud<Vol> {
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    public VolController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }
    @Override
    public boolean create(Vol o) {
        try {
            String sql ="INSERT INTO Vols (nameAirport,nameAirportArr, AerportEscale, DdepVol,DarrVol, heuredepEscale,heureArrEscale,reservation   ) VALUES"
            		+ " ( '"+ o.getNameAirport()+"','"+o.getNameAirportArr()+"','"+o.getAerportEscale()+"','"+o.getDdepVol()+"','"+o.getDarrVol()+"',"+o.getHeuredepEscale()+",'"+o.getHeureArrEscale()+"','"+o.getReservation()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Vol not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }      }
	@Override
	public boolean update(int id, Vol u) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(int id) {
        try {
            
        String sql =  "DELETE FROM Vols  WHERE  IdVol="+id ; 
        System.out.println(sql);
        return (st.executeUpdate(sql)==1);    
    } catch (SQLException ex) {
        Logger.getLogger(VolController.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
	}
	@Override
	public ArrayList<Vol> retrieveAll() {
        try {
       String sql = "SELECT * FROM Vols";
       ArrayList<Vol>  arrayList = new ArrayList<>();
       ResultSet rs = st.executeQuery(sql);            
       while(rs.next()){
           Vol u = new Vol();
           u.setIdVol(rs.getInt(1));
           u.setNameAirport(rs.getString(2));
           u.setNameAirportArr(rs.getString(3));
           u.setAerportEscale(rs.getString(4));
           u.setDdepVol(rs.getString(5));
           u.setDarrVol(rs.getString(6));
           u.setHeuredepEscale(rs.getString(7));
           u.setHeureArrEscale(rs.getString(8));
           u.setReservation(rs.getString(9));
           

           arrayList.add(u);                
       }
       
       return arrayList;
   } catch (SQLException ex) {
       Logger.getLogger(VolController.class.getName()).log(Level.SEVERE, null, ex);
       return null;
   }
}
	
	@Override
	public Vol retrieveById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Vol> retrieveByKeyWord(String key) {
		// TODO Auto-generated method stub
	
		 try {
	            String sql = "SELECT * FROM Vols WHERE nameAirport like '%"+key+"%' OR nameAirportArr like '%"+key+"%'";
	            ArrayList<Vol>  arrayList = new ArrayList<>();
	            ResultSet rs = st.executeQuery(sql);            
	            while(rs.next()){
	                Vol u = new Vol();
	                u.setIdVol(rs.getInt(1));
	                u.setNameAirport(rs.getString(2));
	                u.setNameAirportArr(rs.getString(3));
	                u.setAerportEscale(rs.getString(4));
	                u.setDdepVol(rs.getString(5));
	                u.setDarrVol(rs.getString(6));
	                u.setHeuredepEscale(rs.getString(7));
	                u.setHeureArrEscale(rs.getString(8));
	                u.setReservation(rs.getString(9));
	               
	                arrayList.add(u);                
	            }
	            
	            return arrayList;
	        } catch (SQLException ex) {
	            Logger.getLogger(VolController.class.getName()).log(Level.SEVERE, null, ex);
	            return null;
	        }
	    }

    }
    


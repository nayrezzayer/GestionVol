/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Airport;
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
public class AirportController implements AirportCrud <Airport>{
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public AirportController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }}

    @Override
    public boolean create(Airport c) {
         try {
            String sql ="INSERT INTO Airport (nameAirport , paysAirport) VALUES ( '"+ c.getNameAirport()+"','" + c.getPaysAirport()+ "')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Airport not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }         
        
    }

    @Override
    public boolean update(int id, Airport c) {
                        try {
           
            String sql =  "UPDATE Airport SET nameAirport='" + c.getNameAirport()+"' , paysAirport = '" + c.getPaysAirport() +"' WHERE id="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(AirportController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }

    @Override
    public boolean delete(int id) {
         try {    
            String sql =  "DELETE FROM Airport WHERE id="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(AirportController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Airport> retrieveAll() {
                       try {
            String sql = "SELECT * FROM Airport";
            ArrayList<Airport>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Airport c = new Airport();
                c.setId(rs.getInt(1));
                c.setNameAirport(rs.getString(2));
                c.setPaysAirport(rs.getString(3));
                arrayList.add(c);  
                          }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(AirportController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Airport retrieveById(int id) {
                         try {
            String sql = "SELECT * FROM Airport";
            ArrayList<Airport>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Airport c =  null;
            while(rs.next()){
                c = new Airport();
                c.setId(rs.getInt(1));
                 c.setNameAirport(rs.getString(2));
                 c.setPaysAirport(rs.getString(3));
               
                arrayList.add(c); 
                             
            }
            return c ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AirportController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Airport> retrieveByKeyWord(String key) {
                       try {
            String sql = "SELECT * FROM Airport WHERE NameAirport like '%"+key+"%' OR PaysAirport like '%"+key+"%'";
            ArrayList<Airport>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Airport c = new Airport();
               c.setId(rs.getInt(1));
                c.setNameAirport(rs.getString(2));
                c.setPaysAirport(rs.getString(3));
               
                arrayList.add(c);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(AirportController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    }
    


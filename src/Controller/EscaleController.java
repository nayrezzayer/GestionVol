/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Escale;
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
public class EscaleController implements EscaleCrud <Escale>{
        public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public EscaleController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }

    @Override
    public boolean create(Escale p) {
                try {
            String sql ="INSERT INTO Escale (heuredep, heureArr, AirportEs) VALUES "+ " ( '"+ p.getheuredep()+"',"+p.getheureArr()+",'"+p.getAirportEs()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Escale not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }
        
    }

    @Override
    public boolean update(int id, Escale p) {
               try {
           
            String sql =  "UPDATE Escale SET heuredep='"+ p.getheuredep()+"', heureArr='"+ p.getheureArr()+"',  AirportEs='"+p.getAirportEs()+"' WHERE idEs ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(EscaleController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }

    @Override
    public boolean delete(int id) {
               try {
            
            String sql =  "DELETE FROM Escale  WHERE idEs ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(EscaleController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Escale> retrieveAll() {
         try {
            String sql = "SELECT * FROM Escale";
            ArrayList<Escale>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Escale p = new Escale();
                p.setId(rs.getInt(1));
                p.setheuredep(rs.getString(2));
                p.setheureArr(rs.getString(3)) ;
                p.setAirportEs(rs.getString(4));
            
           
                arrayList.add(p);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(EscaleController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Escale retrieveById(int id) {
                 try {
            String sql = "SELECT * FROM Escale";
            ArrayList<Escale>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Escale p =  null;
            while(rs.next()){
                 p = new Escale();
                p.setId(rs.getInt(1));
                p.setheuredep(rs.getString(2));
                p.setheureArr(rs.getString(3)) ;
                p.setAirportEs(rs.getString(4));
              
           
                arrayList.add(p);   
                             
            }
            return p ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EscaleController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Escale> retrieveByKeyWord(String key) {
                 try {
            String sql = "SELECT * FROM Escale WHERE AirportEs like '%"+key+"%' ";
            ArrayList<Escale>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Escale p = new Escale();
                p.setId(rs.getInt(1));
                p.setheuredep(rs.getString(2));
                p.setheuredep (rs.getString(3)) ;
              p.setAirportEs(rs.getString(4));
           
                arrayList.add(p);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(EscaleController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

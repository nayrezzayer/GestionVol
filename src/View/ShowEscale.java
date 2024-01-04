/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AirportController;
import Controller.EscaleController;
import Controller.EscaleController;
import Model.Airport;
import Model.Escale;
import Model.Escale;
import static View.Login.isAdmin;

import java.awt.Color;
import static java.time.zone.ZoneRulesProvider.refresh;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iyed
 */
public class ShowEscale  extends javax.swing.JInternalFrame {

    /**
     * Creates new form ShowEscale
     */
    public ShowEscale() {
        initComponents();
        TxtId.setEditable(false);
        ArrayList<Escale>  myEscalelist = new EscaleController().retrieveAll();
        DefaultTableModel model = new DefaultTableModel() ;
        EscaleList.setModel(model) ; 
        model.addColumn("idEs");
        model.addColumn("heuredep");
        model.addColumn("heureArr");
        model.addColumn("Airport Escale ");

      

        for (Escale p : myEscalelist) {            
            Object[] row =   new Object[]{p.getidEs(), p.getheuredep(), p.getheureArr(),p.getAirportEs() };
            model.addRow(  row);
        }
        EscaleList.setModel(model);
        
    }
    ArrayList<Airport>  myAirportlist = new AirportController().retrieveAll();

  


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        Txtsearch = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddButn = new com.k33ptoo.components.KButton();
        DeleteButn = new com.k33ptoo.components.KButton();
        ModifyButn = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EscaleList = new javax.swing.JTable();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        TxtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtArr =  new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Airportitems = new javax.swing.JComboBox<>();


        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Escales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(900);
        kGradientPanel1.setkStartColor(new java.awt.Color(15, 95, 134));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtsearch.setBackground(new Color (0,0,0,0));
        Txtsearch.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        Txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        Txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Txtsearch.setOpaque(false);
        kGradientPanel1.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 310, 33));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/search.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/packing_list_639ue1hnj1mi_64.png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 110));

        AddButn.setText("Add New Escale");
        AddButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        AddButn.setkBorderRadius(50);
        AddButn.setkEndColor(new java.awt.Color(102, 204, 255));
        AddButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        AddButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        AddButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        AddButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButnActionPerformed(evt);
            }
        });
        jPanel1.add(AddButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, -1, -1));

        DeleteButn.setText("Delete Escale");
        DeleteButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        DeleteButn.setkBorderRadius(50);
        DeleteButn.setkEndColor(new java.awt.Color(102, 204, 255));
        DeleteButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        DeleteButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        DeleteButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        DeleteButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, -1, -1));

        ModifyButn.setText("Modify Escale");
        ModifyButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        ModifyButn.setkBorderRadius(50);
        ModifyButn.setkEndColor(new java.awt.Color(102, 204, 255));
        ModifyButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        ModifyButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ModifyButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        ModifyButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              ModifyButnActionPerformed(evt);
            }
        });
        jPanel1.add(ModifyButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/remove_ak1dh1nbl3b2_32.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/edit_wgcm8dcqn62n_32.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 690, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/add_u2s8qcotg60o_32.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Escales List");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        EscaleList.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        EscaleList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EscaleList.setDragEnabled(true);
        EscaleList.setSelectionBackground(new java.awt.Color(153, 204, 255));
        EscaleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscaleListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EscaleList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 620, 440));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(50);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      
        TxtId.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TxtId.setForeground(new java.awt.Color(204, 0, 102));
        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });
        kGradientPanel2.add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 30));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("heure départ");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtdep.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, 30));



        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("ID : ");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
//heure arrrrrrrrrrr
        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Heure Arrivé");
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        
    txtArr.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        txtArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQte1ActionPerformed(evt);
            }
        });
 
        
        
        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Airport Escale  : ");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        
        ArrayList<Airport>  myAirportlist = new AirportController().retrieveAll();

        List<String> airportNames = new ArrayList<>();

        for (Airport airport : myAirportlist) {
            airportNames.add(airport.getNameAirport());
        }

        // Create the default combo box model with the airport names list
        javax.swing.DefaultComboBoxModel<String> model = new javax.swing.DefaultComboBoxModel<>(airportNames.toArray(new String[0]));

        // Set the model to your JComboBox
        Airportitems.setModel(model);
        
        Airportitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirportitemsActionPerformed(evt);
            }
        });
        kGradientPanel2.add(Airportitems, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, 30));
        kGradientPanel2.add(txtArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 260, 30));

        
      
        
        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 350, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
         String keyword= Txtsearch.getText();
        ArrayList<Escale>  myEscalelist = new EscaleController().retrieveByKeyWord(keyword);
        DefaultTableModel model = new DefaultTableModel() ;
        EscaleList.setModel(model) ; 
        model.addColumn("idEs");
        model.addColumn("heuredep");
        model.addColumn("heureArr");
        model.addColumn("AirportEs" );


        for (Escale p : myEscalelist) {            
            Object[] row =   new Object[]{p.getidEs(), p.getheuredep(), p.getheureArr() , p.getAirportEs()  };
            model.addRow(  row);
        }
        EscaleList.setModel(model);
        
    }//GEN-LAST:event_SearchMouseClicked

    private void AddButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButnActionPerformed

        Escale Escale = new Escale();
        Escale.setheuredep(txtdep.getText());
        System.out.println(txtdep.getText());

        Escale.setheureArr(txtArr.getText());
        System.out.println(txtArr.getText());
        Escale.setAirportEs(Airportitems.getSelectedItem().toString());
        System.out.println(Airportitems.getSelectedItem().toString());

       
        boolean result = new EscaleController().create(Escale);
        
         if(result){              
            JOptionPane.showMessageDialog(this,
            Escale.getheuredep().toUpperCase()+" Is successfuly added  ",
            "New Escale", JOptionPane.INFORMATION_MESSAGE);
            
                     ArrayList<Escale>  myEscalelist = new EscaleController().retrieveAll();
                    DefaultTableModel model = new DefaultTableModel() ;
                    EscaleList.setModel(model) ; 
                    model.addColumn("idEs");
                    model.addColumn("heuredep");
                    model.addColumn("heureArr");
                    model.addColumn("AirportEs" );
                   
                    
                  

                    for (Escale p : myEscalelist) {            
                        Object[] row =   new Object[]{p.getidEs(), p.getheuredep(), p.getheureArr(),p.getAirportEs() };
                        model.addRow(row);
                    }
                    EscaleList.setModel(model);
            refresh();
            
            
        }else{          
            JOptionPane.showMessageDialog(this,
            "Ajout erronée ",
            "Nouvel utilisateur", JOptionPane.ERROR_MESSAGE);
        }
         refresh();
       
    }//GEN-LAST:event_AddButnActionPerformed

    private void DeleteButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButnActionPerformed
   
        int x= EscaleList.getSelectedRow();
        if(x == -1){
             JOptionPane.showMessageDialog(this,
            "Select row please !",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
        } else{
            int p=  JOptionPane.showConfirmDialog(this,
            "Confirm to delete row number : "+ (x+1),
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
             System.out.println(p);
             if (p == 0){
                 int id =  Integer.parseInt(""+EscaleList.getValueAt(x, 0));
                 System.out.println(id);
                 if(new EscaleController().delete(id)){
                      JOptionPane.showMessageDialog(this,
            "Escale Deleted with success!",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
                      
                      
                    ArrayList<Escale>  myEscalelist = new EscaleController().retrieveAll();
                    DefaultTableModel model = new DefaultTableModel() ;
                    EscaleList.setModel(model) ; 
                    model.addColumn("idEs");
                    model.addColumn("heuredep");
                    model.addColumn("heureArr");
                    model.addColumn("AirportEs" );


                    for (Escale pr : myEscalelist) {            
                        Object[] row =   new Object[]{pr.getidEs(), pr.getheuredep(), pr.getheureArr(),pr.getAirportEs() };
                        model.addRow(  row);
                    }
                    EscaleList.setModel(model);

                      refresh();
                      
                      
                 } else{
                      JOptionPane.showMessageDialog(this,
            "Escale not Deleted check with the administrator!",
            "Error Message", JOptionPane.ERROR_MESSAGE);
                 }
                 
             }
             
        } refresh();}
//GEN-LAST:event_DeleteButnActionPerformed
    private void AirportitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirportitemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirportitemsActionPerformed

   //modifier 
    
    private void TxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPriceActionPerformed

    private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdActionPerformed

    private void txtdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepActionPerformed
    private void ModifyButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButnActionPerformed
        if (isAdmin == false)
        {
                        JOptionPane.showMessageDialog(this,
           "Sorry ! Only Admin Can do this !");
        }else{
       Escale Escale = new Escale();
       Escale.setheuredep(txtdep.getText());
       System.out.println(txtdep.getText());

       Escale.setheureArr(txtArr.getText());
       System.out.println(txtArr.getText());
       Escale.setAirportEs(Airportitems.getSelectedItem().toString());
       System.out.println(Airportitems.getSelectedItem().toString());
       

       
       int id = Integer.parseInt(""+ TxtId.getText());
       boolean result = new EscaleController().update(id, Escale);
       
        if(result){              
           JOptionPane.showMessageDialog(this,
           Escale.getAirportEs().toUpperCase()+" est modifié avec success ",
           "Modifier utilisateur", JOptionPane.INFORMATION_MESSAGE);
           //new userList().setVisible(true);
                   ArrayList<Escale>  myEscalelist = new EscaleController().retrieveAll();
                   DefaultTableModel model = new DefaultTableModel() ;
                   model.addColumn("idEs");
                   model.addColumn("heuredep");
                   model.addColumn("heureArr");
                   model.addColumn("AirportEs" );
              

                   for (Escale pr: myEscalelist) {            
                       Object[] row =   new Object[]{pr.getidEs(), pr.getheuredep(), pr.getheureArr(),pr.getAirportEs() };
                       model.addRow(  row);
                   }
                   EscaleList.setModel(model);
         
       }else{          
           JOptionPane.showMessageDialog(this,
           "Modification erronée ",
           "Modifier Escale", JOptionPane.ERROR_MESSAGE);
       }
        refresh();}
   }
    private void EscaleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscaleListMouseClicked
                int x= EscaleList.getSelectedRow();
        if(x == -1){
             JOptionPane.showMessageDialog(this,
            "Select row please !",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
        } else{

                int id = Integer.parseInt(""+EscaleList.getValueAt(x, 0));
                String heuredep=  (String) EscaleList.getValueAt(x,1);
                String heureArr = (String) EscaleList.getValueAt(x,2);
                
                
                 TxtId.setText(String.valueOf(id));
                 txtdep.setText(heuredep);
                 txtArr.setText(heureArr);
                 
                 
        }
    }//GEN-LAST:event_EscaleListMouseClicked

    private void TxtQte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQte1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton AddButn;
    private com.k33ptoo.components.KButton DeleteButn;
    private com.k33ptoo.components.KButton ModifyButn;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField txtdep;

    private javax.swing.JTextField Txtsearch;
    private javax.swing.JTextField txtArr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox Airportitems;

    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTable EscaleList;
    // End of variables declaration//GEN-END:variables
}

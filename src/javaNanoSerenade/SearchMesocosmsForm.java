/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaNanoSerenade;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aliay
 */
public class SearchMesocosmsForm extends javax.swing.JFrame {
    MY_CONNECTION my_connection = new MY_CONNECTION();
    
    /**
     * Creates new form ManageRoomsForm
     */
    public SearchMesocosmsForm() {
        
        
        
        initComponents();
        
        
        
         //ajout d une icone serende pour la page
          this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/lloogg_ser.png")).getImage());
        
          
          
            
        //populate the jtable
       // mesocosm.fillMesocosmJTable(jTable1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButtonClearCheckboxes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonPrintResults = new javax.swing.JButton();
        jButtonExportResults = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxFields = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxMT = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabelTap = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonValidateSearch = new javax.swing.JButton();
        jLabelLowerB = new javax.swing.JLabel();
        jLabelHigherB = new javax.swing.JLabel();
        jTextFieldLowerB = new javax.swing.JTextField();
        jTextFieldHigherB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advanced Search Mesocosms (SERENADE)");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonClearCheckboxes.setBackground(new java.awt.Color(204, 204, 204));
        jButtonClearCheckboxes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButtonClearCheckboxes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/reset_button.png"))); // NOI18N
        jButtonClearCheckboxes.setBorderPainted(false);
        jButtonClearCheckboxes.setContentAreaFilled(false);
        jButtonClearCheckboxes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClearCheckboxes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearCheckboxesActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/exit_button.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPrintResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/print_button_1.png"))); // NOI18N
        jButtonPrintResults.setBorderPainted(false);
        jButtonPrintResults.setContentAreaFilled(false);
        jButtonPrintResults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonExportResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/EXP8button.png"))); // NOI18N
        jButtonExportResults.setBorderPainted(false);
        jButtonExportResults.setContentAreaFilled(false);
        jButtonExportResults.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Search fields", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Select Field (s): ");

        jComboBoxFields.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All fields", "doi", "Total_time", "Total_dose", "Injection_mode", "Ecosystem", "Nanoparticle", "PH", "Temperature", "Conductivity", "Dissolved_oxygen", "ORP_water", "ORP_sediment", "Concentration_water", "Concentration_sediment", "Dissolved_concentration", "TBARS", "TAOC", "Algae", "Bateria", " " }));
        jComboBoxFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFieldsActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("at ");

        jComboBoxMT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All measure times", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Measure time: ");

        jLabelTap.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelTap.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTap.setText("Tap keywords:");

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });

        jButtonValidateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaNanoSerenade/image/search_button.png"))); // NOI18N
        jButtonValidateSearch.setBorderPainted(false);
        jButtonValidateSearch.setContentAreaFilled(false);
        jButtonValidateSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonValidateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidateSearchActionPerformed(evt);
            }
        });

        jLabelLowerB.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelLowerB.setForeground(new java.awt.Color(102, 102, 102));
        jLabelLowerB.setText("Lower bound:");

        jLabelHigherB.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelHigherB.setForeground(new java.awt.Color(102, 102, 102));
        jLabelHigherB.setText("Higher bound:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jComboBoxFields, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelTap)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelLowerB)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldLowerB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelHigherB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHigherB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxMT, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(jButtonValidateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxMT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabelTap)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLowerB)
                    .addComponent(jLabelHigherB)
                    .addComponent(jTextFieldLowerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHigherB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButtonValidateSearch)
                .addGap(8, 8, 8))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jButtonClearCheckboxes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jButtonExportResults, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(jButtonPrintResults, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(499, 499, 499))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonClearCheckboxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExportResults)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPrintResults, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenu5.setText("Tutorial");
        jMenu3.add(jMenu5);
        jMenu3.add(jSeparator1);

        jMenu4.setText("About the SERENADE");
        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        //display the selected row data in the jtextfields
//        
//        //get the jlabel model 
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//                
//        // get the selected row index
//        int rIndex = jTable1.getSelectedRow();
//        
//        //display data 
//        
//        jTextFieldDOI.setText(model.getValueAt(rIndex, 1).toString());
//        jTextFieldName.setText(model.getValueAt(rIndex, 7).toString());
//        jTextFieldTotDose.setText(model.getValueAt(rIndex, 3).toString());
//        String injectionMode = jComboBoxInjection.getSelectedItem().toString();
//        String ecosystem = jComboBoxEcosystem.getSelectedItem().toString();
//        jTextFieldTotTime.setText(model.getValueAt(rIndex, 2).toString());
//        jTextFieldMeasTime.setText(model.getValueAt(rIndex, 6).toString());
//        jTextFieldPH.setText(model.getValueAt(rIndex, 8).toString());
//        jTextFieldTemp.setText(model.getValueAt(rIndex, 9).toString());
//        jTextFieldConductivity.setText(model.getValueAt(rIndex, 10).toString());
//        jTextFieldDissOxygen.setText(model.getValueAt(rIndex, 11).toString());
//        jTextFieldWatORP.setText(model.getValueAt(rIndex, 12).toString());
//        jTextFieldSEDORP.setText(model.getValueAt(rIndex, 13).toString());
//        jTextFieldWatConcentration.setText(model.getValueAt(rIndex, 14).toString());
//        jTextFieldSedConcentration.setText(model.getValueAt(rIndex, 15).toString());
//        jTextFieldDissConcentration.setText(model.getValueAt(rIndex, 16).toString());
//        jTextFieldTBARS.setText(model.getValueAt(rIndex, 17).toString());
//        jTextFieldTAOC.setText(model.getValueAt(rIndex, 18).toString());
//        jTextFieldAlgae.setText(model.getValueAt(rIndex, 19).toString());
//        jTextFieldBacteria.setText(model.getValueAt(rIndex, 20).toString());
//               
//    }
    
    private void jButtonClearCheckboxesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearCheckboxesActionPerformed
        jLabelTap.setVisible(true);
        jTextFieldSearch.setVisible(true);
        jLabelLowerB.setVisible(true);
        jTextFieldLowerB.setVisible(true);
        jLabelHigherB.setVisible(false);
        jTextFieldHigherB.setVisible(true);
        // remove text from all jTextfields
        jComboBoxFields.setSelectedIndex(0);
        jComboBoxMT.setSelectedIndex(0);
        
        //clear the JTable first
       table.setModel(new DefaultTableModel(null, new Object[]{"ID", "DOI", "Nanoparticle", "Total dose", "Injection mode", "Ecosystem", "Total time", "Measure time", "PH", "Temperature", "Conductivity", "Dissolved oxygen", "ORP water", "ORP sediment", "Concentration water", "Concentration sediment", "Dissolved concentration", "TBARS", "TAOC", "Algae", "Bacteria"}));
        //reafficher le bouton  search
        jButtonValidateSearch.setVisible(true);
        
    }//GEN-LAST:event_jButtonClearCheckboxesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonValidateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidateSearchActionPerformed
        try {
      
        PreparedStatement stGetSearch;
	ResultSet searchResult;
 
        
        
        //déclaration et initialisation de LB et HB
        int LB = Integer.parseInt(jTextFieldLowerB.getText());
        int HB = Integer.parseInt(jTextFieldHigherB.getText());
        
        //keywords à chercher
        String valToSearch = jTextFieldSearch.getText();
        
           
        // déclaration et initialisation de mes 3 variables de 
        String cond ="";
        String cond1 ="";
        String cond2 ="";
        
        //une varable selectedField pour renvoyer le combobox field sélectioné
       int selectedField =  jComboBoxFields.getSelectedIndex();
        
       switch (selectedField) {
        case 0:
            cond1 = "";
            break;
        case 1:
            cond1 = "LOWER(doi) LIKE '%"+valToSearch+"%'";
            break;
        case 2:
            cond1 = "Total_time BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 3:
            cond1 = "Total_dose BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 4:
            cond1 = "LOWER(Ecosystem) LIKE '%"+valToSearch+"%'";
            break;
        case 5:
            cond1 = "LOWER(Injection_mode) LIKE '%"+valToSearch+"%'";
            break;
        case 6:
            cond1 = "LOWER(Nanoparticle) LIKE '%"+valToSearch+"%'";
            break;
        case 7:
            cond1 = "Measure_time BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 8:
            cond1 = "PH BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 9:
            cond1 = "Temperature BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 10:
            cond1 = "Conductivity BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 11:
            cond1 = "Dissolved_oxygen BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 12:
            cond1 = "ORP_water BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 13:
            cond1 = "ORP_sediment BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 14:
            cond1 = "Concentration_water BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 15:
            cond1 = "Dissolved_concentration BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 16:
            cond1 = "Concentration_sediment BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 17:
            cond1 = "TBARS BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 18:
            cond1 = "TAOC BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 19:
            cond1 = "Algae BETWEEN "+LB+" AND "+HB+" ";
            break;
        case 20:
            cond1 = "Bacteria BETWEEN "+LB+" AND "+HB+" ";
            break; 
        } 
        
        
        //String selectedTime = (String) jComboBoxFields.getSelectedItem();
        int measureTime = jComboBoxMT.getSelectedIndex();
        
       switch (measureTime) {
        case 0:
            cond2 = "";
            break;
        case 1:
            cond2 = " Measure_time == 1";
            break;
        case 2:
            cond2 = " Measure_time == 2";
            break;
        case 3:
            cond2 = " Measure_time == 3";
            break;
        case 4:
            cond2 = " Measure_time == 4";
            break;
        case 5:
            cond2 = " Measure_time == 5";
            break;
        case 6:
            cond2 = " Measure_time == 6";
            break;
        case 7:
            cond2 = " Measure_time == 7";
            break;
        case 8:
            cond2 = " Measure_time == 8";
            break;
        case 9:
            cond2 = " Measure_time == 9";
            break;
        case 10:
            cond2 = " Measure_time == 10";
            break;
        case 11:
            cond2 = " Measure_time == 11";
            break;
        case 12:
            cond2 = " Measure_time == 12";
            break;
        case 13:
            cond2 = " Measure_time == 13";
            break;
        case 14:
            cond2 = " Measure_time == 14";
            break;
        case 15:
            cond2 = " Measure_time == 15";
            break;
        case 16:
            cond2 = " Measure_time == 16";
            break;
        case 17:
            cond2 = " Measure_time == 17";
            break;
        case 18:
            cond2 = " Measure_time == 18";
            break;
        case 19:
            cond2 = " Measure_time == 19";
            break;
        case 20:
            cond2 = " Measure_time == 20";
            break;
        case 21:
            cond2 = " Measure_time == 21";
            break;
        case 22:
            cond2 = " Measure_time == 22";
            break;
        case 23:
            cond2 = " Measure_time == 23";
            break;
        case 24:
            cond2 = " Measure_time == 24";
            break;
        case 25:
            cond2 = " Measure_time == 25";
            break;
        case 26:
            cond2 = " Measure_time == 26";
            break;
        case 27:
            cond2 =  " Measure_time == 27";
            break;
        case 28:
            cond2 = " Measure_time == 28";
            break;
        case 29:
            cond2 = " Measure_time == 29";
            break;
        case 30:
            cond2 = " Measure_time == 30";
            break;
         case 31:
            cond2 = " Measure_time == 31";
            break;        
        }         
        

	        
       	if(cond1.isEmpty())
        {
            if(!(cond2.isEmpty()))
            cond = " WHERE " + cond2;
        }
        else
            {
            cond = " WHERE " + cond1;
            if(!(cond2.isEmpty()))
            cond = cond + " AND " + cond2;
            }
    
        
        String SearchGQuery = "SELECT e.IDE, s.IDS, m.IDM, doi, Total_time, Total_dose, Injection_mode, Ecosystem, Measure_time, Nanoparticle, PH, Temperature, Conductivity, Dissolved_oxygen, ORP_water, ORP_sediment, Concentration_water, Concentration_sediment, Dissolved_concentration, TBARS, TAOC, Algae, Bacteria FROM experiment e, sampling s, measure m WHERE e.IDE = s.IDE AND s.IDS = m.IDS " + cond + "Order by Measure_time";       
                
        
        stGetSearch = my_connection.createConnection().prepareStatement(SearchGQuery);
        searchResult = stGetSearch.executeQuery();
                        
        DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
        
        Object[] row;
        
            while(searchResult.next())
            {
                row = new Object[21];
                row[0] = searchResult.getLong(1)+"_"+searchResult.getLong(2)+"_"+searchResult.getLong(3);
                row[1] = searchResult.getString(4);
                row[2] = searchResult.getInt(5);
                row[3] = searchResult.getFloat(6);
                row[4] = searchResult.getString(7);
                row[5] = searchResult.getString(8);
                row[6] = searchResult.getInt(9);
                row[7] = searchResult.getString(10);
                row[8] = searchResult.getFloat(11);
                row[9] = searchResult.getFloat(12);
                row[10] = searchResult.getFloat(13);
                row[11] = searchResult.getFloat(14);
                row[12] = searchResult.getFloat(15);
                row[13] = searchResult.getFloat(16);
                row[14] = searchResult.getFloat(17);
                row[15] = searchResult.getFloat(18);
                row[16] = searchResult.getFloat(19);
                row[17] = searchResult.getFloat(20);
                row[18] = searchResult.getFloat(21);
                row[19] = searchResult.getFloat(22);
                row[20] = searchResult.getFloat(23);
               
                tableModel.addRow(row);
            }
                            
        } catch (Exception e) {
		JOptionPane.showMessageDialog(rootPane, "Sorry, no results were found matching your criteria. ", "Search Mesocosm", JOptionPane.INFORMATION_MESSAGE);
			
	}
                
                 
        
        
    }//GEN-LAST:event_jButtonValidateSearchActionPerformed

    private void jComboBoxFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFieldsActionPerformed
        //String selectedValue = (String) jComboBoxFields.getSelectedItem();
        
        if (jComboBoxFields.getSelectedItem().toString().contains("doi") || jComboBoxFields.getSelectedItem().toString().contains("Injection_mode")
                ||  jComboBoxFields.getSelectedItem().toString().contains("Ecosystem")|| jComboBoxFields.getSelectedItem().toString().contains("Nanoparticle")) 
            {           jLabelLowerB.setVisible(false);
                        jTextFieldLowerB.setVisible(false);
                        jLabelHigherB.setVisible(false);
                        jTextFieldHigherB.setVisible(false); 
                        jLabelTap.setVisible(true);
                        jTextFieldSearch.setVisible(true);
            }
            else if (jComboBoxFields.getSelectedItem().toString().contains("Total_time") || jComboBoxFields.getSelectedItem().toString().contains("Total_dose")
                || jComboBoxFields.getSelectedItem().toString().contains("PH")|| jComboBoxFields.getSelectedItem().toString().contains("Temperature") 
                || jComboBoxFields.getSelectedItem().toString().contains("Conductivity") || jComboBoxFields.getSelectedItem().toString().contains("Dissolved_oxygen")
                || jComboBoxFields.getSelectedItem().toString().contains("ORP_water")|| jComboBoxFields.getSelectedItem().toString().contains("ORP_sediment")
                || jComboBoxFields.getSelectedItem().toString().contains("Concentration_water") || jComboBoxFields.getSelectedItem().toString().contains("Concentration_sediment")
                || jComboBoxFields.getSelectedItem().toString().contains("Dissolved_concentration")|| jComboBoxFields.getSelectedItem().toString().contains("TBARS")
                || jComboBoxFields.getSelectedItem().toString().contains("TAOC") || jComboBoxFields.getSelectedItem().toString().contains("Algae")|| jComboBoxFields.getSelectedItem().toString().contains("Bacteria")) 
            {           jLabelTap.setVisible(false);
                        jTextFieldSearch.setVisible(false); 
                        jLabelLowerB.setVisible(true);
                        jTextFieldLowerB.setVisible(true);
                        jLabelHigherB.setVisible(true);
                        jTextFieldHigherB.setVisible(true);
            }
    }//GEN-LAST:event_jComboBoxFieldsActionPerformed

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageMesocosmsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMesocosmsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMesocosmsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMesocosmsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMesocosmsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClearCheckboxes;
    private javax.swing.JButton jButtonExportResults;
    private javax.swing.JButton jButtonPrintResults;
    private javax.swing.JButton jButtonValidateSearch;
    private javax.swing.JComboBox<String> jComboBoxFields;
    private javax.swing.JComboBox<String> jComboBoxMT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabelHigherB;
    private javax.swing.JLabel jLabelLowerB;
    private javax.swing.JLabel jLabelTap;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextFieldHigherB;
    private javax.swing.JTextField jTextFieldLowerB;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

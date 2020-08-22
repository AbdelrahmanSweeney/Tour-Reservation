package tourreservation;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
public class ReservationAdmin extends javax.swing.JFrame {
 
    public static DefaultTableModel model;
    public static int selectedRow;
    public static int selectedTourID;
    public static NewReservation newReservation;
    public void showTours(ArrayList arr){
        
    }
    
    
    public ReservationAdmin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

        


       model = (DefaultTableModel) jTable1.getModel();
       
       for(int i=0;i<Database.getTour().size();i++){
           String[] rowData = {String.valueOf(Database.getTour().get(i).getId_Tour()),
               Database.getTour().get(i).getDestination_Tour(),
                   String.valueOf(Database.getTour().get(i).getPrice_Tour()),Database.getTour().get(i).getS_date_Tour().toString(),
                   Database.getTour().get(i).getF_date_Tour().toString()};
           model.addRow(rowData);
       }

       
       
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 40, 55));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(94, 237, 181));
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(0.0F);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Place", "Price", "Start Date", "Finish Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(58, 56, 77));

        jPanel3.setBackground(new java.awt.Color(58, 56, 77));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 237, 181));
        jLabel3.setText("Show");
        jPanel3.add(jLabel3);

        jPanel4.setBackground(new java.awt.Color(58, 56, 77));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 237, 181));
        jLabel2.setText("Add Reservation");
        jPanel4.add(jLabel2);

        jPanel5.setBackground(new java.awt.Color(58, 56, 77));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel5.setAlignmentX(0.0F);
        jPanel5.setAlignmentY(0.0F);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(94, 237, 181));
        jLabel4.setText("Find");
        jPanel5.add(jLabel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(94, 237, 181));
        jLabel1.setText("Search By");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(58, 56, 77));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(58, 56, 77));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Place", "Price", "Duration" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        selectedRow = jTable1.getSelectedRow();
        selectedTourID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString()) - 1;
        TourDetails tourDetails = new TourDetails();
        tourDetails.setVisible(true);
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        selectedRow = jTable1.getSelectedRow();
        selectedTourID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString()) - 1;  
        newReservation = new NewReservation();
        NewReservation.isNew = true;
        newReservation.setVisible(true);
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        String choise = jComboBox2.getSelectedItem().toString();
        //System.out.println(choise);
        model.setRowCount(0);
        if(!(jTextField1.getText().equals(""))){
        switch (choise)
        {
            case "Place":
                for(int i=0;i<Database.getTour().size();i++)
                {
                    if(Database.getTour().get(i).getDestination_Tour().equals(jTextField1.getText())){
                        String[] rowData = {String.valueOf(Database.getTour().get(i).getId_Tour()),
               Database.getTour().get(i).getDestination_Tour(),
                   String.valueOf(Database.getTour().get(i).getPrice_Tour()),Database.getTour().get(i).getS_date_Tour().toString(),
                   Database.getTour().get(i).getF_date_Tour().toString()};
           model.addRow(rowData);
                    }
                }
                break;
            case "Price":
                for(int i=0;i<Database.getTour().size();i++)
                {
                    if(Database.getTour().get(i).getPrice_Tour() == Integer.parseInt(jTextField1.getText())){
                        String[] rowData = {String.valueOf(Database.getTour().get(i).getId_Tour()),
               Database.getTour().get(i).getDestination_Tour(),
                   String.valueOf(Database.getTour().get(i).getPrice_Tour()),Database.getTour().get(i).getS_date_Tour().toString(),
                   Database.getTour().get(i).getF_date_Tour().toString()};
           model.addRow(rowData);
                    }
                }
                break;
            case "Duration":
                for(int i=0;i<Database.getTour().size();i++)
                {
                    if(Database.getTour().get(i).getDestination_Tour().equals(jTextField1.getText())){
                        String[] rowData = {String.valueOf(Database.getTour().get(i).getId_Tour()),
               Database.getTour().get(i).getDestination_Tour(),
                   String.valueOf(Database.getTour().get(i).getPrice_Tour()),Database.getTour().get(i).getS_date_Tour().toString(),
                   Database.getTour().get(i).getF_date_Tour().toString()};
           model.addRow(rowData);
                    }
                }
                break;
        }
        }
        else
        {
                for(int i=0;i<Database.getTour().size();i++)
                {
                    String[] rowData = {String.valueOf(Database.getTour().get(i).getId_Tour()),
               Database.getTour().get(i).getDestination_Tour(),
                   String.valueOf(Database.getTour().get(i).getPrice_Tour()),Database.getTour().get(i).getS_date_Tour().toString(),
                   Database.getTour().get(i).getF_date_Tour().toString()};
           model.addRow(rowData);                
                }
                
        }
                
                
                
                
        
        
    }//GEN-LAST:event_jPanel5MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

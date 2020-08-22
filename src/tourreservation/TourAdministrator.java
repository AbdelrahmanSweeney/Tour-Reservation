package tourreservation;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author AbdElrahman Sowiny
 */
public  class TourAdministrator extends javax.swing.JFrame {
    
   ArrayList<Date> dates1 = new ArrayList<>(); 
   ArrayList<Date> dates2 = new ArrayList<>(); 
   java.util.Date temp1;
   

    public TourAdministrator() {
        initComponents();
        /*this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        placeFeild = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        availableField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        transportField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1_AM = new javax.swing.JRadioButton();
        jRadioButton2_PM = new javax.swing.JRadioButton();
        delete_Button = new javax.swing.JButton();
        edit_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textArea1_program = new java.awt.TextArea();
        jDateChooser2_end = new com.toedter.calendar.JDateChooser();
        jDateChooser1_start = new com.toedter.calendar.JDateChooser();
        jButton_clear = new javax.swing.JButton();
        jLabel_Warninng_date = new javax.swing.JLabel();
        jComboBox_Hour = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox_minite = new javax.swing.JComboBox<>();
        jLabel_warningPlace = new javax.swing.JLabel();
        jLabel_warningTransportMeans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adding Tour");
        setBackground(new java.awt.Color(58, 56, 77));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Starting day        ");

        placeFeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeFeildMouseClicked(evt);
            }
        });
        placeFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeFeildActionPerformed(evt);
            }
        });

        jLabel3.setText("Finishing day       ");

        jLabel4.setText("Price                    ");

        jLabel5.setText("Place                    ");

        priceField.setForeground(new java.awt.Color(204, 204, 204));
        priceField.setText("00.00");
        priceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceFieldMouseClicked(evt);
            }
        });
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Places Num");

        availableField.setColumns(10);
        availableField.setToolTipText("");
        availableField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        availableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Program              ");

        jLabel8.setText("TransportMeans ");

        transportField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportFieldActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Time ");

        jRadioButton1_AM.setText("AM");
        jRadioButton1_AM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_AMActionPerformed(evt);
            }
        });

        jRadioButton2_PM.setText("PM");
        jRadioButton2_PM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_PMActionPerformed(evt);
            }
        });

        delete_Button.setText("Delete");
        delete_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_ButtonMouseClicked(evt);
            }
        });
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });

        edit_Button.setText("Edit");
        edit_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Place", "Strat Day", "Finish Day", "Traveling Time ", "Price", "Available Places ", "Transport Means", "Program", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_clear.setText("Clear Feilds");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jComboBox_Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        jComboBox_Hour.setSelectedItem(null
        );
        jComboBox_Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_HourActionPerformed(evt);
            }
        });

        jLabel10.setText("H :");

        jLabel11.setText("M :");

        jComboBox_minite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        jComboBox_minite.setSelectedItem(null);
        jComboBox_minite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_miniteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(15, 15, 15))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jComboBox_Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jComboBox_minite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jRadioButton1_AM)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jRadioButton2_PM))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel_warningPlace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(placeFeild, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(transportField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(101, 101, 101)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_warningTransportMeans, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textArea1_program, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(availableField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser1_start, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Warninng_date, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser2_end, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(placeFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel_warningPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1_AM)
                                    .addComponent(jRadioButton2_PM)
                                    .addComponent(jComboBox_Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_minite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser2_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel_Warninng_date, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transportField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_warningTransportMeans, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea1_program, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        edit_Button.getAccessibleContext().setAccessibleName("Update");

        pack();
    }// </editor-fold>//GEN-END:initComponents
////////////////////////////////////////////////////////////////////////////////////
    private void placeFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeFeildActionPerformed
       
    }//GEN-LAST:event_placeFeildActionPerformed

    private void transportFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportFieldActionPerformed
       
    }//GEN-LAST:event_transportFieldActionPerformed
///////////////////////////////////////////////////////////////////////////////
           
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
      
          try{
               ///////////////////// Connectin with class Tour////////////////////////////////
       
           int avai_places = Integer.parseInt(availableField.getText());
           double price_travel = Double.parseDouble(priceField.getText());
           
           int time_Go_h = Integer.parseInt((String) jComboBox_Hour.getSelectedItem());
            int time_Go_m = Integer.parseInt((String) jComboBox_minite.getSelectedItem());
           String AMorPM ="";
           if(jRadioButton1_AM.isSelected()){
                
              AMorPM = "AM"; 
               
            }else if (jRadioButton1_AM.isSelected()){
             AMorPM = "PM"; 
            }
           
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           DateFormat only_day = new SimpleDateFormat("dd");
           DateFormat only_month = new SimpleDateFormat("MM");
           DateFormat only_year = new SimpleDateFormat("yyyy");
           
           Date s = jDateChooser1_start.getDate();
           Date f = jDateChooser2_end.getDate();
           int start_day =Integer.parseInt(only_day.format(jDateChooser1_start.getDate()));
           int strat_month = Integer.parseInt(only_month.format(jDateChooser1_start.getDate()));
           int start_year =Integer.parseInt(only_year.format(jDateChooser1_start.getDate()));
           
           int finish_day =Integer.parseInt(only_day.format(jDateChooser2_end.getDate()));
           int finish_month = Integer.parseInt(only_month.format(jDateChooser2_end.getDate()));
           int finish_year =Integer.parseInt(only_year.format(jDateChooser2_end.getDate()));
           
            NumberFormat formatter = new DecimalFormat("00");
           String start = formatter.format(start_year)+formatter.format(strat_month)+formatter.format(start_day);
           int start_Test = Integer.parseInt(start);
           
           String finish = formatter.format(finish_year)+formatter.format(finish_month)+formatter.format(finish_day);
           int finish_Test = Integer.parseInt(finish);
           
             if(start_Test>finish_Test){
                 jLabel_Warninng_date.setText("The finish date must be after start day");
             }else if(start_Test<=finish_Test){
                 String place_test =placeFeild.getText();
                 String transport_test = transportField.getText();
                 
                 if(Character.isLetter(place_test.charAt(0)) && Character.isLetter(transport_test.charAt(0))){
                  
            Tour tour = new Tour(placeFeild.getText(),textArea1_program.getText(), avai_places,
                                 price_travel ,transportField.getText(),time_Go_h,time_Go_m, AMorPM,
                                  
                                   );
            ///////////////////////////////////////////////////////////////////////////////////
            
            ////////////////////////////////////  Connectin with class Date////////////////////
            
            Date2 time= new Date2();
            if(jRadioButton1_AM.isSelected()){
                
                time.time="AM";
               
            }else if (jRadioButton1_AM.isSelected()){
                time.time="PM";
            }
         
            //////////////////////////////////////////////////////////////////////////////////
            
           //////////////////////////////////////show on table////////////////////////////////////////////
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object rowData[] = new Object[9];
            rowData[0] = placeFeild.getText();
            
            dates1.add(jDateChooser1_start.getDate());
            dates2.add(jDateChooser2_end.getDate());
            rowData[1] = jDateChooser1_start.getDate().toString();
            rowData[2] = jDateChooser2_end.getDate().toString();
            
            if(jRadioButton1_AM.isSelected()){
                jRadioButton2_PM.setSelected(false);
            rowData[3]= jComboBox_Hour.getSelectedItem()+":"+jComboBox_minite.getSelectedItem()+ " AM";
            }else if(jRadioButton2_PM.isSelected()){
                 jRadioButton1_AM.setSelected(false);
            rowData[3]= jComboBox_Hour.getSelectedItem()+":"+jComboBox_minite.getSelectedItem()+ " PM";
        
            }
            rowData[4] = priceField.getText();     
            rowData[5]= availableField.getText();   
            rowData[6]= transportField.getText();     
            rowData[7] = textArea1_program.getText();         
            rowData[8]=tour.getId();
            model.addRow(rowData);
             jLabel_warningPlace.setText("");
             jLabel_warningPlace.setText("");
                 }else if(Character.isDigit(place_test.charAt(0))){
                     jLabel_warningPlace.setText("The place must be text");
                 }
                 else if(Character.isDigit(transport_test.charAt(0))){
                     jLabel_warningTransportMeans.setText("The transport must be text");
                 }
             }
           
          }catch(NumberFormatException ex ) {
              JOptionPane.showMessageDialog(null,"The Feilds are not completed");
          }
      
    }//GEN-LAST:event_addButtonActionPerformed

   ////////////////////////////////////////////////////////////////////////////////
    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
       
    }//GEN-LAST:event_priceFieldActionPerformed

    private void availableFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableFieldActionPerformed
        
    }//GEN-LAST:event_availableFieldActionPerformed
/////////////////////////////////////////////////////////////////////////////////
    
    
    
    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowD = jTable1.getSelectedRow();
       
        if(selectedRowD < 0){
             JOptionPane.showMessageDialog(null,"No Row is selected");
        }else if(selectedRowD>=0){
             int p = JOptionPane.showConfirmDialog(null,"Are you sure for deleting ?!","Delete",JOptionPane.YES_NO_OPTION);
             if(p==0){
              model.removeRow(selectedRowD);
             }
             
        } 
        
        
    }//GEN-LAST:event_delete_ButtonActionPerformed
    
    
    private void jRadioButton2_PMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_PMActionPerformed
       jRadioButton1_AM.setSelected(false);
    }//GEN-LAST:event_jRadioButton2_PMActionPerformed

    
/////////////////////////////////////////////////////////////////////////////////////
    
    
    private void priceFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceFieldMouseClicked
        priceField.setText("");
        priceField.setForeground(Color.BLACK);
    }//GEN-LAST:event_priceFieldMouseClicked

    private void jRadioButton1_AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_AMActionPerformed
        jRadioButton2_PM.setSelected(false);
    }//GEN-LAST:event_jRadioButton1_AMActionPerformed


///////////////////////////////////////////////////////////////////////////////////////////
    private void placeFeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeFeildMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_placeFeildMouseClicked
///////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    private void edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ButtonActionPerformed
       
        try{
        
        int selectedRow =0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
         selectedRow = jTable1.getSelectedRow();
        
      
         model.setValueAt(placeFeild.getText(), selectedRow, 0);
         
       
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
           DateFormat only_day = new SimpleDateFormat("dd");
           DateFormat only_month = new SimpleDateFormat("MM");
           DateFormat only_year = new SimpleDateFormat("yyyy");
           
           int start_day =Integer.parseInt(only_day.format(jDateChooser1_start.getDate()));
           int strat_month = Integer.parseInt(only_month.format(jDateChooser1_start.getDate()));
           int start_year =Integer.parseInt(only_year.format(jDateChooser1_start.getDate()));
           
           int finish_day =Integer.parseInt(only_day.format(jDateChooser2_end.getDate()));
           int finish_month = Integer.parseInt(only_month.format(jDateChooser2_end.getDate()));
           int finish_year =Integer.parseInt(only_year.format(jDateChooser2_end.getDate()));
           
            NumberFormat formatter = new DecimalFormat("00");
           String start = formatter.format(start_year)+formatter.format(strat_month)+formatter.format(start_day);
           int start_Test = Integer.parseInt(start);
           
           String finish = formatter.format(finish_year)+formatter.format(finish_month)+formatter.format(finish_day);
           int finish_Test = Integer.parseInt(finish);
           
             
              if(start_Test <= finish_Test){
                model.setValueAt( jDateChooser1_start.getDate(), selectedRow, 1);
                model.setValueAt(jDateChooser2_end.getDate(), selectedRow, 2);
                selectedRow = jTable1.getSelectedRow();
                model.setValueAt(placeFeild.getText(), selectedRow, 0);
                model.setValueAt( jDateChooser1_start.getDate(), selectedRow, 1);
                model.setValueAt(jDateChooser2_end.getDate(), selectedRow, 2);
         
                if(jRadioButton1_AM.isSelected()){
                model.setValueAt(jComboBox_Hour.getSelectedItem()+":"+jComboBox_minite.getSelectedItem()+" AM", selectedRow, 3);
                 }else if(jRadioButton2_PM.isSelected()){ 
                 model.setValueAt(jComboBox_Hour.getSelectedItem()+":"+jComboBox_minite.getSelectedItem()+" PM", selectedRow, 3);
                }
       
                model.setValueAt(priceField.getText(), selectedRow, 4);
                model.setValueAt(availableField.getText(), selectedRow, 5);
                model.setValueAt(transportField.getText(), selectedRow, 6);
                model.setValueAt(textArea1_program.getText(), selectedRow, 7);
                 jLabel_Warninng_date.setText("");
                 } else if(start_Test > finish_Test){
                 jLabel_Warninng_date.setText("The finish date must be after start day");
                }
              
        }
              catch(Exception e){
              JOptionPane.showMessageDialog(null,"No Row is selected");  
        }
       
    }//GEN-LAST:event_edit_ButtonActionPerformed

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        try {
        ///////////////// clear old data click//////////////
              placeFeild.setText("");
              jDateChooser1_start.setCalendar(null);
              jDateChooser2_end.setCalendar(null);
              jComboBox_Hour.setSelectedItem(null);
              jComboBox_minite.setSelectedItem(null);
              jRadioButton1_AM.setSelected(false);
              jRadioButton2_PM.setSelected(false);
              priceField.setText("");
              availableField.setText("");
              transportField.setText("");
              textArea1_program.setText("");
             
      //////////////////////////////////////////////
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        
        placeFeild.setText(model.getValueAt(selectedRow,0 ).toString());
        jDateChooser1_start.setDate(dates1.get(selectedRow));
        jDateChooser2_end.setDate(dates2.get(selectedRow));
        
        String old_going_time = model.getValueAt(selectedRow,3 ).toString();
        
        String hourTable = old_going_time.substring(0,2);
        String minitTable = old_going_time.substring(3,5);   
        jComboBox_Hour.setSelectedItem(hourTable);
        jComboBox_minite.setSelectedItem(minitTable);    
       
        int  lenght_TF  = old_going_time.length();
        char AM_PM_test =old_going_time.charAt(lenght_TF -2);
        if(AM_PM_test =='A'){
            jRadioButton1_AM.setSelected(true);
        }else if(AM_PM_test =='P'){
             jRadioButton2_PM.setSelected(true);
        }
        
        priceField.setText(model.getValueAt(selectedRow,4).toString());
        availableField.setText(model.getValueAt(selectedRow,5 ).toString());
        transportField.setText(model.getValueAt(selectedRow,6 ).toString());
        textArea1_program.setText(model.getValueAt(selectedRow,7 ).toString());
        
       
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null,"Error");  
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
      placeFeild.setText("");
      jDateChooser1_start.setCalendar(null);
      jDateChooser2_end.setCalendar(null);
      jLabel_Warninng_date.setText("");
      jComboBox_Hour.setSelectedItem(null);
      jComboBox_minite.setSelectedItem(null);
      jRadioButton1_AM.setSelected(false);
      jRadioButton2_PM.setSelected(false);
      priceField.setText("");
      availableField.setText("");
      transportField.setText("");
      textArea1_program.setText("");
      jLabel_warningPlace.setText("");
      jLabel_warningPlace.setText("");
      
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jComboBox_HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_HourActionPerformed
       
    }//GEN-LAST:event_jComboBox_HourActionPerformed

    private void delete_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_ButtonMouseClicked
       
    }//GEN-LAST:event_delete_ButtonMouseClicked

    private void jComboBox_miniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_miniteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_miniteActionPerformed
 
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new TourAdministrator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField availableField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton delete_Button;
    private javax.swing.JButton edit_Button;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JComboBox<String> jComboBox_Hour;
    private javax.swing.JComboBox<String> jComboBox_minite;
    private com.toedter.calendar.JDateChooser jDateChooser1_start;
    private com.toedter.calendar.JDateChooser jDateChooser2_end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Warninng_date;
    private javax.swing.JLabel jLabel_warningPlace;
    private javax.swing.JLabel jLabel_warningTransportMeans;
    private javax.swing.JRadioButton jRadioButton1_AM;
    private javax.swing.JRadioButton jRadioButton2_PM;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField placeFeild;
    private javax.swing.JTextField priceField;
    private java.awt.TextArea textArea1_program;
    private javax.swing.JTextField transportField;
    // End of variables declaration//GEN-END:variables
}

package tourreservation;

import javax.swing.table.DefaultTableModel;

public class TourDetails extends javax.swing.JFrame {

    public static DefaultTableModel touristModel;
    public static int selectedReservation;
    public static int selectedSSN;
    public TourDetails() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        jLayeredPane2.setVisible(false);
        jLayeredPane3.setVisible(false);
        jLayeredPane4.setVisible(false);
        jLayeredPane5.setVisible(false);
        
        for(int i=0;i<Database.getTourist().size();i++)
                {
                    
                    String[] rowData = {Database.getTourist().get(i).getName_Tourist(),
                    "placeNum",
                    String.valueOf(Database.getTourist().get(i).getAddress_Tourist()),Database.getTourist().get(i).getSsn_Tourist(),
                    Database.getTourist().get(i).getPhone_Tourist()};
                    touristModel.addRow(rowData);
                    
                }
/*
        
        placeInfo.setText(TourReservation.tours.get(ReservationAdmin.selectedRow).place);
        programInfo.setText(TourReservation.tours.get(ReservationAdmin.selectedRow).program);
        durationInof.setText(TourReservation.tours.get(ReservationAdmin.selectedRow).startDate.getDate());
        takeOfTimeInfo.setText(TourReservation.tours.get(ReservationAdmin.selectedRow).startDate.hour + 
                TourReservation.tours.get(ReservationAdmin.selectedRow).startDate.time);
        availablePlacesInfo.setText(String.valueOf(TourReservation.tours.get(ReservationAdmin.selectedRow).availablePlaces));
        transportMeansInfo.setText(TourReservation.tours.get(ReservationAdmin.selectedRow).transportMeans);
*/
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(38, 40, 55));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(58, 56, 77));

        jPanel2.setBackground(new java.awt.Color(94, 237, 181));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 70));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("rpt-Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 56, 77));
        jLabel1.setText("Information:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel5.setBackground(new java.awt.Color(94, 237, 181));
        jPanel5.setPreferredSize(new java.awt.Dimension(130, 70));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("rpt-Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(58, 56, 77));
        jLabel4.setText("Registerants:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(94, 237, 181));
        jPanel4.setPreferredSize(new java.awt.Dimension(130, 70));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("rpt-Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 56, 77));
        jLabel2.setText("Sort By:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel8.setBackground(new java.awt.Color(94, 237, 181));
        jPanel8.setPreferredSize(new java.awt.Dimension(130, 70));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("rpt-Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 56, 77));
        jLabel7.setText("Find by:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(1);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(1);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available Places", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(1);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(1);
        jTextArea4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(1);
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "End Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(1);
        jTextArea6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transport means", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane6.setViewportView(jTextArea6);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addGap(62, 62, 62)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5))
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane6))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152))
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5, jScrollPane6});

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Place number", "Address", "SSD", "Phone number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(58, 56, 77));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 237, 181));
        jLabel3.setText("Edit");
        jPanel6.add(jLabel3);

        jPanel7.setBackground(new java.awt.Color(58, 56, 77));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel7.setAlignmentX(0.0F);
        jPanel7.setAlignmentY(0.0F);
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(94, 237, 181));
        jLabel5.setText("Find");
        jPanel7.add(jLabel5);

        jPanel9.setBackground(new java.awt.Color(58, 56, 77));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(94, 237, 181), 1, true));
        jPanel9.setAlignmentX(0.0F);
        jPanel9.setAlignmentY(0.0F);
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(94, 237, 181));
        jLabel9.setText("Cancel reservation");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(94, 237, 181));
        jLabel10.setText("Search By");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(58, 56, 77));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "SSN", "Phone number" }));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(58, 56, 77));

        jLayeredPane3.setLayer(jScrollPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jPanel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(94, 237, 181));
        jLabel6.setText("Sort By");

        jLayeredPane4.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(111, 111, 111))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(94, 237, 181));
        jLabel8.setText("Find By");

        jLayeredPane5.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(111, 111, 111))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel8)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane3))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane4))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane5))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane3))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane4))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane5))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        jPanel8.setBackground(new java.awt.Color(58,56,77));
        jLabel7.setForeground(new java.awt.Color(94,237,181));

        jPanel4.setBackground(new java.awt.Color(94,237,181));
        jLabel2.setForeground(new java.awt.Color(58,56,77));

        jPanel2.setBackground(new java.awt.Color(94,237,181));
        jLabel1.setForeground(new java.awt.Color(58,56,77));

        jPanel5.setBackground(new java.awt.Color(94,237,181));
        jLabel4.setForeground(new java.awt.Color(58,56,77));
        
        jLayeredPane2.setVisible(false);
        jLayeredPane3.setVisible(false);
        jLayeredPane4.setVisible(false);
        jLayeredPane5.setVisible(true);
        //jPanel3.setBackground(new java.awt.Color(94,237,181));
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        jPanel4.setBackground(new java.awt.Color(58,56,77));
        jLabel2.setForeground(new java.awt.Color(94,237,181));

        jPanel2.setBackground(new java.awt.Color(94,237,181));
        jLabel1.setForeground(new java.awt.Color(58,56,77));

        jPanel8.setBackground(new java.awt.Color(94,237,181));
        jLabel7.setForeground(new java.awt.Color(58,56,77));

        jPanel5.setBackground(new java.awt.Color(94,237,181));
        jLabel4.setForeground(new java.awt.Color(58,56,77));
        
        jLayeredPane2.setVisible(false);
        jLayeredPane3.setVisible(false);
        jLayeredPane4.setVisible(true);
        jLayeredPane5.setVisible(false);
        //jPanel3.setBackground(new java.awt.Color(94,237,181));
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        jPanel5.setBackground(new java.awt.Color(58,56,77));
        jLabel4.setForeground(new java.awt.Color(94,237,181));

        jPanel4.setBackground(new java.awt.Color(94,237,181));
        jLabel2.setForeground(new java.awt.Color(58,56,77));

        jPanel8.setBackground(new java.awt.Color(94,237,181));
        jLabel7.setForeground(new java.awt.Color(58,56,77));

        jPanel2.setBackground(new java.awt.Color(94,237,181));
        jLabel1.setForeground(new java.awt.Color(58,56,77));
        
        jLayeredPane2.setVisible(false);
        jLayeredPane3.setVisible(true);
        jLayeredPane4.setVisible(false);
        jLayeredPane5.setVisible(false);
        
        //jPanel3.setBackground(new java.awt.Color(94,237,181));
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        
        jTextArea1.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getDestination_Tour()));
        jTextArea2.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getSize_Tour()));
        jTextArea3.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getS_date_Tour().toString()));
        jTextArea4.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getPrice_Tour()));
        jTextArea5.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getF_date_Tour()));
        jTextArea6.setText(String.valueOf(Database.getTour(ReservationAdmin.selectedTourID).get(0).getVeichle_Tour()));

        
        jPanel2.setBackground(new java.awt.Color(58,56,77));
        jLabel1.setForeground(new java.awt.Color(94,237,181));

        jPanel4.setBackground(new java.awt.Color(94,237,181));
        jLabel2.setForeground(new java.awt.Color(58,56,77));

        jPanel8.setBackground(new java.awt.Color(94,237,181));
        jLabel7.setForeground(new java.awt.Color(58,56,77));

        jPanel5.setBackground(new java.awt.Color(94,237,181));
        jLabel4.setForeground(new java.awt.Color(58,56,77));
        
        jLayeredPane2.setVisible(true);
        jLayeredPane3.setVisible(false);
        jLayeredPane4.setVisible(false);
        jLayeredPane5.setVisible(false);
        
        
       // jPanel3.setBackground(new java.awt.Color(94,237,181));
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        NewReservation newReservation = new NewReservation();
        NewReservation.isNew = false;
        newReservation.setVisible(true);

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        String choise = jComboBox2.getSelectedItem().toString();
        //System.out.println(choise);
        touristModel.setRowCount(0);
        if(!(jTextField1.getText().equals(""))){
        switch (choise)
        {
            case "Name":
                for(int i=0;i<Database.getTourist().size();i++)
                {
                    if(Database.getTourist().get(i).getName_Tourist().equals(jTextField1.getText())){
                        String[] rowData = {Database.getTourist().get(i).getName_Tourist(),
                    "placeNum",
                    String.valueOf(Database.getTourist().get(i).getAddress_Tourist()),Database.getTourist().get(i).getSsn_Tourist(),
                    Database.getTourist().get(i).getPhone_Tourist()};
                    touristModel.addRow(rowData);
                    }
                }
                break;
            case "SSN":
                for(int i=0;i<Database.getTourist().size();i++)
                {
                    if(Database.getTourist().get(i).getSsn_Tourist().equals(jTextField1.getText())){
                        String[] rowData = {Database.getTourist().get(i).getName_Tourist(),
                    "placeNum",
                    String.valueOf(Database.getTourist().get(i).getAddress_Tourist()),Database.getTourist().get(i).getSsn_Tourist(),
                    Database.getTourist().get(i).getPhone_Tourist()};
                    touristModel.addRow(rowData);
                    }
                }
                break;
            case "Phone number":
                for(int i=0;i<Database.getTourist().size();i++)
                {
                    if(Database.getTourist().get(i).getPhone_Tourist().equals(jTextField1.getText())){
                        String[] rowData = {Database.getTourist().get(i).getName_Tourist(),
                    "placeNum",
                    String.valueOf(Database.getTourist().get(i).getAddress_Tourist()),Database.getTourist().get(i).getSsn_Tourist(),
                    Database.getTourist().get(i).getPhone_Tourist()};
                    touristModel.addRow(rowData);
                    }
                }
                break;
        }
        }
        else
        {
                for(int i=0;i<Database.getTourist().size();i++)
                {
                    String[] rowData = {Database.getTourist().get(i).getName_Tourist(),
                    "placeNum",
                    String.valueOf(Database.getTourist().get(i).getAddress_Tourist()),Database.getTourist().get(i).getSsn_Tourist(),
                    Database.getTourist().get(i).getPhone_Tourist()};
                    touristModel.addRow(rowData);              
                }
                
        }
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        selectedReservation = jTable1.getSelectedRow();
        selectedSSN = Integer.parseInt(touristModel.getValueAt(selectedReservation, 3).toString()) - 1;
        Database.removeTourist(selectedSSN);
       
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel9MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import DomainModels.TacGia;
import Services.Impl.TacGiaService;
import Utilities.SetSize;
import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Admin
 */
public class FrmTacGia extends javax.swing.JFrame {

    final SetSize setsize = new SetSize();
    final TacGiaService SERVICE = new TacGiaService();
    int i = 20000;
    public String icon ="";
    private boolean updateImg = false;
    /**
     * Creates new form FrmTacGgia
     */
    public FrmTacGia() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.seticon();
        this.setTable();
        this.loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnHoanThanh = new javax.swing.JButton();
        btnClose = new javax.swing.JLabel();
        rdoThem = new javax.swing.JRadioButton();
        rdoSua = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTacGia = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        imgAnhTG = new javax.swing.JLabel();
        btnTaianh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblMa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tác giả");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jLabel2.setText("Mã");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 50, 50, -1));

        jLabel3.setText("Địa chỉ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 120, 46, -1));
        jPanel2.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 77, 200, -1));
        jPanel2.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 117, 200, -1));

        btnHoanThanh.setBackground(new java.awt.Color(125, 200, 150));
        btnHoanThanh.setText("Hoàn thành");
        btnHoanThanh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanThanhActionPerformed(evt);
            }
        });
        jPanel2.add(btnHoanThanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setPreferredSize(new java.awt.Dimension(20, 20));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel2.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 1, 22, -1));

        rdoThem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoThem);
        rdoThem.setSelected(true);
        rdoThem.setText("Thêm");
        rdoThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(rdoThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        rdoSua.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoSua);
        rdoSua.setText("Sửa");
        rdoSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(rdoSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách tác giả"));

        tblTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã tác giả", "Tác giả", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTacGia.setGridColor(new java.awt.Color(255, 255, 255));
        tblTacGia.setSelectionBackground(new java.awt.Color(125, 200, 150));
        tblTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTacGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTacGia);
        if (tblTacGia.getColumnModel().getColumnCount() > 0) {
            tblTacGia.getColumnModel().getColumn(0).setResizable(false);
            tblTacGia.getColumnModel().getColumn(1).setResizable(false);
            tblTacGia.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 185, 416, 130));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 157, 135, -1));

        btnSearch.setText(".");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setPreferredSize(new java.awt.Dimension(20, 20));
        jPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 157, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAnhTG, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgAnhTG, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 100));

        btnTaianh.setBackground(new java.awt.Color(125, 200, 150));
        btnTaianh.setText("Tải ảnh");
        btnTaianh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaianhActionPerformed(evt);
            }
        });
        jPanel2.add(btnTaianh, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 150, -1, -1));

        jLabel4.setText("Tên");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 80, 46, -1));

        lblMa.setText("IS AUTO");
        jPanel2.add(lblMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 50, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        FrmChinh.setFrmChinh(new FrmQuanLyKhoSach());
    }//GEN-LAST:event_btnCloseMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    public String roleMa() {
        List<TacGia> _lst = SERVICE.getAll();
        if (!_lst.isEmpty()) {
            for (TacGia tacGia : _lst) {
                String matg = tacGia.getMa();
                int max = Integer.parseInt(matg.substring(2));
                if (i < max) {
                    i = max;
                }
            }
        }
        i++;
        String ma = "TG" + i;
        return ma;
    }

    public void clear() {
        lblMa.setText("IS AUTO");
        txtDiaChi.setText("");
        txtTen.setText("");
    }

    private void btnHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanThanhActionPerformed
        TacGia tg = getFormData();
        if (rdoThem.isSelected()) {
            tg.setMa(this.roleMa());
            SERVICE.insert(tg, this);
        } else if (rdoSua.isSelected()) {
            String ma = lblMa.getText();
            if(ma.equalsIgnoreCase("is auto")){
                JOptionPane.showMessageDialog(this, "Vui lòng chọn tác giả để thay dổi!");
                return;
            }
            tg = SERVICE.getByMa(ma);
            TacGia tgUpdate = getFormData();
            tgUpdate.setMa(tg.getMa());
            tgUpdate.setImg(icon);
            SERVICE.update(tgUpdate, this);
        }
        this.loadTable();
        this.clear();
    }//GEN-LAST:event_btnHoanThanhActionPerformed

    private TacGia getFormData(){
        TacGia tg = new TacGia();
        tg.setHoTen(txtTen.getText());
        tg.setDiaChi(txtDiaChi.getText());
        tg.setImg(icon);
        return tg;
    }
    private void tblTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTacGiaMouseClicked
        int row = tblTacGia.getSelectedRow();
        String ma = tblTacGia.getValueAt(row, 0).toString();
        TacGia tg = SERVICE.getByMa(ma);
        lblMa.setText(ma);
        txtDiaChi.setText(tg.getDiaChi());
        txtTen.setText(tg.getHoTen());
        icon = tg.getImg();
        this.setImgDisplay(icon);
    }//GEN-LAST:event_tblTacGiaMouseClicked

    private void btnTaianhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaianhActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        choose.showDialog(this, "Confirm");
        File file = choose.getSelectedFile();
        icon = file.getAbsolutePath();
        int index = icon.lastIndexOf("\\");
        icon ="/Images/imgTacGia/"+ icon.substring(index+1);
        this.setImgDisplay(icon);
    }//GEN-LAST:event_btnTaianhActionPerformed

    private void setImgDisplay(String src){
        URL img = getClass().getResource(src);
        imgAnhTG.setIcon(setsize.setSizeAnh(img, 90, 100));
    }
    private void seticon() {
        URL urlSearch = getClass().getResource("/Images/search.png");
        URL urldong = getClass().getResource("/Images/cross-small.png");
        btnSearch.setIcon(setsize.setSizeAnh(urlSearch, 20, 20));
        btnClose.setIcon(setsize.setSizeAnh(urldong, 20, 20));
    }

    private void setTable() {
        JTableHeader header = tblTacGia.getTableHeader();
        header.setBackground(new Color(125, 200, 150));
    }

    private void loadTable() {
        List<TacGia> _lst = SERVICE.getAll();
        DefaultTableModel model = (DefaultTableModel) tblTacGia.getModel();
        model.setRowCount(0);
        if(!_lst.isEmpty()){
            for (TacGia tacGia : _lst) {
                Object rowData[] = {
                    tacGia.getMa(), tacGia.getHoTen(), tacGia.getDiaChi()
                };
                model.addRow(rowData);
            }
        }
        tblTacGia.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnHoanThanh;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JButton btnTaianh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgAnhTG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblMa;
    private javax.swing.JRadioButton rdoSua;
    private javax.swing.JRadioButton rdoThem;
    private javax.swing.JTable tblTacGia;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}

package solveequation.function;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import solveequation.list.Category;
import solveequation.view.MainFrame;
import solveequation.rounded.RoundedPanel;

/**
 *
 * @author Admin
 */
public class SolveFrame extends javax.swing.JFrame {
    private JFrame node;
    /**
     * Creates new form SolveFrame
     */
    public SolveFrame() {
        initComponents();
        ImageIcon icon;
        icon = new ImageIcon(getClass().getClassLoader().getResource("baseline_superscript_black_18dp.png"));
        setIconImage(icon.getImage());
        setTitle("Giải phương trình");
        this.setSize(1320, 820);
        Control sc = new Control();
        List<Category> li = new ArrayList<>();
        //listItem.add(new Category("Homepage", HomePage, ));
        li.add(new Category("Linear", jpnLinear, jlbLinear));
        li.add(new Category("Quadratic", jpnQuadratic, jlbQuadratic));
        li.add(new Category("Cubic", jpnCubic, jlbCubic));
        li.add(new Category("Find", jpnFind, jlbFind));
        sc.setEven(li);
        pack();
        setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnLinear = new RoundedPanel();
        jlbLinear = new javax.swing.JLabel();
        jpnQuadratic = new RoundedPanel();
        jlbQuadratic = new javax.swing.JLabel();
        jpnCubic = new RoundedPanel();
        jlbCubic = new javax.swing.JLabel();
        jpnFind = new RoundedPanel();
        jlbFind = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1303, 815));

        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1320, 820));
        jPanel1.setLayout(null);

        jpnLinear.setBackground(new java.awt.Color(255, 255, 255));
        jpnLinear.setForeground(new java.awt.Color(255, 255, 255));

        jlbLinear.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbLinear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLinear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/baseline_filter_1_black_18dp.png"))); // NOI18N
        jlbLinear.setText("Bậc nhất");
        jlbLinear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbLinearMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbLinearMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpnLinearLayout = new javax.swing.GroupLayout(jpnLinear);
        jpnLinear.setLayout(jpnLinearLayout);
        jpnLinearLayout.setHorizontalGroup(
            jpnLinearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLinearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLinear, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLinearLayout.setVerticalGroup(
            jpnLinearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLinearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLinear, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jpnLinear);
        jpnLinear.setBounds(90, 320, 230, 150);

        jpnQuadratic.setBackground(new java.awt.Color(255, 255, 255));

        jlbQuadratic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbQuadratic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbQuadratic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/baseline_filter_2_black_18dp.png"))); // NOI18N
        jlbQuadratic.setText("Bậc hai");
        jlbQuadratic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbQuadraticMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnQuadraticLayout = new javax.swing.GroupLayout(jpnQuadratic);
        jpnQuadratic.setLayout(jpnQuadraticLayout);
        jpnQuadraticLayout.setHorizontalGroup(
            jpnQuadraticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuadraticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuadratic, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuadraticLayout.setVerticalGroup(
            jpnQuadraticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuadraticLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuadratic, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jpnQuadratic);
        jpnQuadratic.setBounds(380, 320, 230, 150);

        jpnCubic.setBackground(new java.awt.Color(255, 255, 255));

        jlbCubic.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbCubic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCubic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/baseline_filter_3_black_18dp.png"))); // NOI18N
        jlbCubic.setText("Bậc ba");
        jlbCubic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCubicMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnCubicLayout = new javax.swing.GroupLayout(jpnCubic);
        jpnCubic.setLayout(jpnCubicLayout);
        jpnCubicLayout.setHorizontalGroup(
            jpnCubicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCubicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCubic, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCubicLayout.setVerticalGroup(
            jpnCubicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCubicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCubic, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jpnCubic);
        jpnCubic.setBounds(680, 320, 230, 150);

        jpnFind.setBackground(new java.awt.Color(255, 255, 255));

        jlbFind.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlbFind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/baseline_find_in_page_black_18dp.png"))); // NOI18N
        jlbFind.setText("Dò nghiệm ");
        jlbFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbFindMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnFindLayout = new javax.swing.GroupLayout(jpnFind);
        jpnFind.setLayout(jpnFindLayout);
        jpnFindLayout.setHorizontalGroup(
            jpnFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnFindLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbFind, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnFindLayout.setVerticalGroup(
            jpnFindLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jPanel1.add(jpnFind);
        jpnFind.setBounds(970, 320, 230, 150);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/baseline_arrow_back_white_18dp.png"))); // NOI18N
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 160, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/solveequation/image/solvee.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 0, 1310, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1309, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbFindMouseClicked
        // TODO add your handling code here:
        FindFrame ff = new FindFrame();
        ff.setVisible(true);
        ff.setDefaultCloseOperation(ff.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jlbFindMouseClicked

    private void jlbCubicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCubicMouseClicked
        // TODO add your handling code here:
        CubicFrame cf = new CubicFrame();
        cf.setVisible(true);
        cf.setDefaultCloseOperation(cf.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jlbCubicMouseClicked

    private void jlbQuadraticMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbQuadraticMouseClicked
        // TODO add your handling code here:
        QuadraticFrame qf = new QuadraticFrame();
        qf.setVisible(true);
        qf.setDefaultCloseOperation(qf.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jlbQuadraticMouseClicked

    private void jlbLinearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLinearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlbLinearMouseExited

    private void jlbLinearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbLinearMouseClicked
        LinearFrame lf = new LinearFrame();
        lf.setVisible(true);
        lf.setDefaultCloseOperation(lf.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jlbLinearMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        JFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1360, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(SolveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCubic;
    private javax.swing.JLabel jlbFind;
    private javax.swing.JLabel jlbLinear;
    private javax.swing.JLabel jlbQuadratic;
    private javax.swing.JPanel jpnCubic;
    private javax.swing.JPanel jpnFind;
    private javax.swing.JPanel jpnLinear;
    private javax.swing.JPanel jpnQuadratic;
    // End of variables declaration//GEN-END:variables
}

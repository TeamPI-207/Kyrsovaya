package javaapplication1
public class gaz extends javax.swing.JFrame 
{
boolean focus1=false;
boolean focus2=false;
public gaz() 
{
initComponents();
}
private void proverka(int id)
{ 
if(focus1)
{ 
jTextField2.setText(jTextField2.getText() + id); 
}
else 
{
if(focus2)
{
jTextField3.setText(jTextField3.getText() +id);
}
}
}
@SuppressWarnings("unchecked")

// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
private void initComponents() 
{
jPanel1 = new javax.swing.JPanel();
jTextField1 = new javax.swing.JTextField();
jTextField2 = new javax.swing.JTextField();
jTextField3 = new javax.swing.JTextField();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton(); 
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton(); 
jButton9 = new javax.swing.JButton();
jButton10 = new javax.swing.JButton(); 
jButton11 = new javax.swing.JButton(); 
jButton12 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Газопровод"));
jTextField2.addFocusListener(new java.awt.event.FocusAdapter() 
{
public void focusLost(java.awt.event.FocusEvent evt) 
{ 
jTextField2FocusLost(evt);
}
});
jTextField3.addFocusListener(new java.awt.event.FocusAdapter() 
{

public void focusLost(java.awt.event.FocusEvent evt) 
{
jTextField3FocusLost(evt);
}
});
jLabel1.setText("Кол. людей:");
jLabel2.setText("Тариф:");
jButton1.setText("1");
jButton1.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton1ActionPerformed(evt);
}
});
jButton2.setText("2");
jButton2.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{ 
jButton2ActionPerformed(evt);
}
});
jButton3.setText("3");
jButton3.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton3ActionPerformed(evt);
}
});
jButton4.setText("4");
jButton4.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton4ActionPerformed(evt); 
}
}); 
jButton5.setText("5");
jButton5.addActionListener(new java.awt.event.ActionListener() 
{ 
public void actionPerformed(java.awt.event.ActionEvent evt) 
{
jButton5ActionPerformed(evt); 
}
});
jButton6.setText("6");
jButton6.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton6ActionPerformed(evt); 
}
});
jButton7.setText("7");
jButton7.addActionListener(new java.awt.event.ActionListener()
{ 
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton7ActionPerformed(evt);
}
});
jButton8.setText("8");
jButton8.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton8ActionPerformed(evt);
}
});
jButton9.setText("9");
jButton9.addActionListener(new java.awt.event.ActionListener()
{ 
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton9ActionPerformed(evt); 
} 
}); 
jButton10.setText("0"); 
jButton10.addActionListener(new java.awt.event.ActionListener() 
{ 
public void actionPerformed(java.awt.event.ActionEvent evt) 
{
jButton10ActionPerformed(evt);
}
}); 
jButton11.setText(".");
jButton11.addActionListener(new java.awt.event.ActionListener() 
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{ 
jButton11ActionPerformed(evt);
} 
}); 
jButton12.setText("OK"); 
jButton12.addActionListener(new java.awt.event.ActionListener() 
{ 
public void actionPerformed(java.awt.event.ActionEvent evt) 
{ 
jButton12ActionPerformed(evt);
}
 });
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup() 
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) 
.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
.addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
.addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel1)
.addComponent(jLabel2))
.addGap(18, 18, 18)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField2)
.addComponent(jTextField3)))))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup() 
.addGap(7, 7, 7)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel2)
.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton1)
.addComponent(jButton3))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton4)
.addComponent(jButton5)
.addComponent(jButton6))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton7)
.addComponent(jButton8) 
.addComponent(jButton9)) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton10)
.addComponent(jButton11) 
.addComponent(jButton12)) 
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
); 
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup( 
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
);
pack();
}// </editor-fold>//GEN-END:initComponents
private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
focus1=true;
focus2=false;
}//GEN-LAST:event_jTextField2FocusLost
private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
focus1=false;
focus2=true;
}//GEN-LAST:event_jTextField3FocusLost
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
proverka(1);
}//GEN-LAST:event_jButton1ActionPerformed 
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
proverka(2);
}//GEN-LAST:event_jButton2ActionPerformed 
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
proverka(3);
}//GEN-LAST:event_jButton3ActionPerformed 
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
proverka(4);
}//GEN-LAST:event_jButton4ActionPerformed
private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
proverka(5);
}//GEN-LAST:event_jButton5ActionPerformed 
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
proverka(6);
}//GEN-LAST:event_jButton6ActionPerformed
private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
proverka(7);
}//GEN-LAST:event_jButton7ActionPerformed 
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
proverka(8);
}//GEN-LAST:event_jButton8ActionPerformed 
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
proverka(9);
}//GEN-LAST:event_jButton9ActionPerformed 
private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
if(focus1)
{ 
jTextField2.setText(jTextField2.getText() + ".");
}
else 
{
if(focus2)
{ 
jTextField3.setText(jTextField3.getText() +".");
}
}
}
//GEN-LAST:event_jButton11ActionPerformed  
private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
proverka(0);
}
//GEN-LAST:event_jButton10ActionPerformed 
private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
float kyb= Float.parseFloat(jTextField2.getText());
float tarif= Float.parseFloat(jTextField3.getText());
float result= kyb*tarif;
jTextField1.setText(""+result);
JavaApplication1.setLast_result(result);
}
//GEN-LAST:event_jButton12ActionPerformed
public static void main(String args[]) 
{ 
try
{ 
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
{
if ("Nimbus".equals(info.getName())) 
{
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) 
{
java.util.logging.Logger.getLogger(gaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 catch (InstantiationException ex) 
{
java.util.logging.Logger.getLogger(gaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 catch (IllegalAccessException ex) 
{ 
java.util.logging.Logger.getLogger(gaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
catch (javax.swing.UnsupportedLookAndFeelException ex) 
{
java.util.logging.Logger.getLogger(gaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 //</editor-fold>
java.awt.EventQueue.invokeLater(new Runnable() 
{
public void run()
{ 
new gaz().setVisible(true);
}
});
}
// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton jButton1;
private javax.swing.JButton jButton10; 
private javax.swing.JButton jButton11; 
private javax.swing.JButton jButton12;
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3; 
private javax.swing.JButton jButton4; 
private javax.swing.JButton jButton5; 
private javax.swing.JButton jButton6;
private javax.swing.JButton jButton7; 
private javax.swing.JButton jButton8;
private javax.swing.JButton jButton9;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JPanel jPanel1;
private javax.swing.JTextField jTextField1;
private javax.swing.JTextField jTextField2;
private javax.swing.JTextField jTextField3; 
// End of variables declaration//GEN-END:variables
}


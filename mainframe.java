package javaapplication1; 
Public class mainframe extends javax.swing.JFrame
{
electro elect = new electro();
teplo teplo=new teplo();
voda voda=new voda();
gaz gaz=new gaz();
remont remont=new remont();
yborka yborka=new yborka();
domofon domofon=new domofon();
antena antena = new antena();

Public mainframe()
{
initComponents();
}
Private void initComponents()
{
JPanel1 = new javax.swing.JPanel();
JTextField1 = new javax.swing.JTextField();
JButton1 = new javax.swing.JButton();
JButton2 = new javax.swing.JButton();
JButton3 = new javax.swing.JButton();
JButton4 = new javax.swing.JButton();
JButton5 = new javax.swing.JButton();
JButton6 = new javax.swing.JButton();
JButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();
jButton9 = new javax.swing.JButton();
jButton10 = new javax.swing.JButton();
jButton11 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Расчет Квартплаты"));
jButton1.setText("Clear");
jButton1.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton1ActionPerformed(evt);
}
});
jButton2.setText("Электро - снабжение");
jButton2.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton2ActionPerformed(evt);
}
})
jButton3.setText("Тепло - снабжение");
jButton3.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton3ActionPerformed(evt);
}
});
jButton4.setText("Водо - снабжение");
jButton4.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton4ActionPerformed(evt);
}
});
jButton5.setText("Газ");
jButton5.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton5ActionPerformed(evt);
}
});
jButton6.setText("Ремонт");
jButton6.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton6ActionPerformed(evt);
}
});
jButton7.setText("Уборка");
jButton7.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton7ActionPerformed(evt);
}
});
jButton8.setText("Домофон");
jButton8.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton8ActionPerformed(evt);
}
});
jButton9.setText("Антена");
jButton9.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton9ActionPerformed(evt);
}
});
jButton10.setText("+");
jButton10.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton10ActionPerformed(evt);
}
});
jButton11.setText("=");
jButton11.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
jButton11ActionPerformed(evt);
}
});
javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE,147, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jButton5)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton7)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
.addComponent(jButton10)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton11))
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,147, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE,147, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(39,39,39)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
.addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,200, javax.swing.GroupLayout.PREFERRED_SIZE) 
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton1)))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
);
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton1)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton8))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton3)
.addComponent(jButton9))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton4)
.addComponent(jButton6))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton5)
.addComponent(jButton7)
.addComponent(jButton10)
.addComponent(jButton11))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
);
javax.swing.GroupLayout layout =new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
);
pack();
}
Private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)
{
remont.setVisible(true);
}
Private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)
{
String result= Float.toString( JavaApplication1.getSum());
jTextField1.setText(result);
}
Private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
{
elect.setVisible(true);
}
Private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
{
teplo.setVisible(true);
}
Private void jButton4ActionPerformed(java.awt.event.ActionEven evt)
{
voda.setVisible(true);
}
Private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)
{
gaz.setVisible(true);
}
Private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)
{
yborka.setVisible(true);
}
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)
{
domofon.setVisible(true);
}
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)
{
antena.setVisible(true);
}
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
{
jTextField1.setText(""+0);
JavaApplication1.setSum(0);
}
private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)
{
JavaApplication1.add(JavaApplication1.getLast_result());
JavaApplication1.setLast_result(0);
}
public static void main(String args[])
{
try {
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
java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}catch (InstantiationException ex)
{
java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}catch (IllegalAccessException ex)
{
java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
catch (javax.swing.UnsupportedLookAndFeelException ex)
{
java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
java.awt.EventQueue.invokeLater(new Runnable()
{
public void run()
{
new mainframe().setVisible(true);
}
});
}
Private javax.swing.JButton jButton1;
Private javax.swing.JButton jButton10;
Private javax.swing.JButton jButton11;
Private javax.swing.JButton jButton2;
Private javax.swing.JButton jButton3;
Private javax.swing.JButton jButton4;
Private javax.swing.JButton jButton5;
Private javax.swing.JButton jButton6;
Private javax.swing.JButton jButton7;
Private javax.swing.JButton jButton8;
Private javax.swing.JButton jButton9;
Private javax.swing.JPanel jPanel1;
Private javax.swing.JTextField jTextField1;
}


/** Required package class namespace */
package testing.prerequisite.cs20s;


/**
 * Unit3Variables1.java - this is a Visual Studio (C#) Windows Form
 * adaptation into NetBeans (Java) JFrame (some code may not translate)
 *
 * @author Mr. Wachs
 * @since Feb 22, 2024, 2:40:44 p.m.
 */
public class Unit3Variables1 extends javax.swing.JFrame 
{

    // <editor-fold defaultstate="collapsed" desc="NetBeans Generated Code">
    
    /** 
     * Default constructor, creates new form Unit3Variables1 
     */
    public Unit3Variables1() {
        initComponents();
        this.getContentPane().setLayout(null);        
        this.setTitle("Unit 3 Variables 1");
        this.setSize(240, 260);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        txtInput2 = new javax.swing.JTextField();
        btnProcess = new javax.swing.JButton();
        lblOutput1 = new javax.swing.JLabel();
        lblOutput2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblInfo1.setText("Whole Number:");
        getContentPane().add(lblInfo1);
        lblInfo1.setBounds(10, 10, 120, 30);

        lblInfo2.setText("Decimal Number:");
        getContentPane().add(lblInfo2);
        lblInfo2.setBounds(10, 40, 120, 30);
        getContentPane().add(txtInput1);
        txtInput1.setBounds(130, 10, 80, 22);
        getContentPane().add(txtInput2);
        txtInput2.setBounds(130, 40, 80, 22);

        btnProcess.setText("PROCESS");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcess);
        btnProcess.setBounds(10, 80, 200, 23);
        getContentPane().add(lblOutput1);
        lblOutput1.setBounds(10, 110, 200, 40);
        getContentPane().add(lblOutput2);
        lblOutput2.setBounds(10, 160, 200, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // </editor-fold>
    
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // Original C# code....................................................
        /*
        string value1 = txtInput1.Text;
        int number1 = Convert.ToInt32(value1);
        int number2 = number1 * 2;
        string answer1 = "Double the number is " + number2;
        lblOutput1.Text = answer1;

        string value2 = txtInput2.Text;
        double number3 = Convert.ToDouble(value2);
        double number4 = number3 * 0.5;
        string answer2 = "Half the number is " + number4;            
        lblOutput2.Text = answer2;

        int number5 = (int)number4;
        double number6 = (double)number5;
        */
        
        // Adapted Java code...................................................
        String value1 = txtInput1.getText();
        int number1 = Integer.parseInt(value1);
        int number2 = number1 * 2;
        String answer1 = "Double the number is " + number2;
        lblOutput1.setText(answer1);
        
        String value2 = txtInput2.getText();
        double number3 = Double.parseDouble(value2);
        double number4 = number3 * 0.5;
        String answer2 = "Half the number is " + number4;            
        lblOutput2.setText(answer2);     
        
        int number5 = (int)number4;
        double number6 = (double)number5;  
        
    }//GEN-LAST:event_btnProcessActionPerformed

    // <editor-fold defaultstate="collapsed" desc="NetBeans Generated Code"> 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblOutput1;
    private javax.swing.JLabel lblOutput2;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    // End of variables declaration//GEN-END:variables
    
    // </editor-fold>
    
}

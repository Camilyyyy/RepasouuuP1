import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTabbedPane tabbedPane1;
    private JTextField txtFieldNombre;
    private JSpinner spinner1;
    private JTextField txtFieldEdad;
    private JComboBox comboBox1;
    private JButton añadirButton;
    private JTextArea textArea1;
    private JButton actualizarButton;
    private JTextArea textArea2;
    private ColaA00101879  cola =new ColaA00101879();
    private int contadorglobal=6;
    public Ventana() {

        contadorglobal=contadorglobal+1;
        spinner1.setValue(contadorglobal);
        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtFieldNombre.getText().isEmpty() || txtFieldEdad.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Errorrr");
                }else {
                    Integer i=Integer.parseInt(txtFieldEdad.getText());
                    PersonaSolorzano daniela=new PersonaSolorzano(contadorglobal,txtFieldNombre.getText(),i,comboBox1.getSelectedItem().toString());
                    cola.add(daniela);
                    JOptionPane.showMessageDialog(null,"Se agrego correctamente");
                    contadorglobal=contadorglobal+1;
                    spinner1.setValue(contadorglobal);
                }
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                textArea1.setText(cola.imprimir());
                textArea2.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

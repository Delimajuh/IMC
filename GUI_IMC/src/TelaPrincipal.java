import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelaPrincipal  extends JFrame {
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JJulianaLabel lblClasseIMC;
    private JJulianaLabel lblResultadoIMC;

    public TelaPrincipal(){

        this.setTitle("Cálculo de IMC");
        this.setSize(300, 300);
        this.setResizable(false);
        this.setLayout(null);

        JLabel lblAltura = new JLabel();
        lblAltura.setText("Altura");
        lblAltura.setSize(100, 20);
        lblAltura.setLocation(20, 20);

        txtAltura = new JTextField();
        txtAltura.setSize(100, 20);
        txtAltura.setLocation(20, 40);

        JLabel lblPeso = new JLabel();
        lblPeso.setText("Peso");
        lblPeso.setSize(100,20);
        lblPeso.setLocation(20, 70);

        txtPeso = new JTextField();
        txtPeso.setSize(100, 20);
        txtPeso.setLocation(20, 90);

        JButton btCalcular = new JButton();
        btCalcular.setText("Calcular");
        btCalcular.setSize(100, 30);
        btCalcular.setLocation(20, 125);
        btCalcular.addActionListener(new ActionCalcularIMC());

        lblResultadoIMC = new JJulianaLabel();
        lblResultadoIMC.setSize(100, 20);
        lblResultadoIMC.setLocation(20, 165);

        lblClasseIMC = new JJulianaLabel();
        lblClasseIMC.setSize(100, 20);
        lblClasseIMC.setLocation(20, 195);

        JButton btFechar = new JButton("Fechar");
        btFechar.setSize(100, 30);
        btFechar.setLocation(170, 220);
        btFechar.addActionListener(new ACtionFechar());

        this.add(lblAltura);
        this.add(txtAltura);
        this.add(lblPeso);
        this.add(txtPeso);
        this.add(btCalcular);
        this.add(lblResultadoIMC);
        this.add(lblClasseIMC);
        this.add(btFechar);

    }
    class ActionCalcularIMC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            double altura = Double.parseDouble(txtAltura.getText());
            double peso = Double.parseDouble(txtPeso.getText());

            double imc = peso / (altura * altura);

            String classe = "Magrinho";

            if(imc > 25.0){
                classe = "Não magrinho";
            }
          
            lblResultadoIMC.setText(imc + "");
            lblClasseIMC.setText(classe);


        }
         
    }
    class ACtionFechar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Tchau!");
            System.exit(0);
            
            
        }
        
    }
    
    
}

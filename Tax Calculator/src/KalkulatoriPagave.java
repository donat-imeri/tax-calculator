import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class KalkulatoriPagave extends JFrame {

	private JPanel contentPane;
	private JTextField txtPagaBruto;
	private JTextField txtKontributiPunetorit;
	private JTextField txtGjKontributiPunetorit;
	private JTextField txtKontributiPunedhenesit;
	private JTextField txtGjKontributiPunedhenesit;
	private JTextField txtGjKontributet;
	private JTextField txtPagaTatohet;	
	private JTextField txtPaga0;
	private JTextField txtPaga80;
	private JTextField txtPaga250;
	private JTextField txtPaga450;
	private JTextField txtGjTatimi;
	private JTextField txtPagaNeto;
	private static final double P80250=0.04;
	private static final double P250450=0.08;
	private static final double PMBI450=0.1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkulatoriPagave frame = new KalkulatoriPagave();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KalkulatoriPagave() {
		setTitle("Kalkulatori i Pagave");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image atkImg=new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(atkImg));
		lblNewLabel.setBounds(10, 0, 730, 95);
		contentPane.add(lblNewLabel);
		
		JLabel lblKalkulatoriIPages = new JLabel("Kalkulatori i pages nga Bruto ne Neto");
		lblKalkulatoriIPages.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKalkulatoriIPages.setHorizontalAlignment(SwingConstants.CENTER);
		lblKalkulatoriIPages.setBounds(10, 106, 730, 23);
		contentPane.add(lblKalkulatoriIPages);
		
		JLabel lblPunedhenesi = new JLabel("Pun\u00EBdh\u00EBn\u00EBsi:");
		lblPunedhenesi.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPunedhenesi.setBounds(10, 151, 200, 25);
		contentPane.add(lblPunedhenesi);
		
		
		JLabel lblPagaBruto = new JLabel("Paga Bruto:");
		lblPagaBruto.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaBruto.setBounds(10, 187, 200, 25);
		contentPane.add(lblPagaBruto);
		
		txtPagaBruto = new JTextField();
		txtPagaBruto.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPagaBruto.setColumns(10);
		txtPagaBruto.setBounds(213, 187, 170, 25);
		contentPane.add(txtPagaBruto);
		
		txtKontributiPunetorit = new JTextField();
		txtKontributiPunetorit.setText("5");
		txtKontributiPunetorit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtKontributiPunetorit.setColumns(10);
		txtKontributiPunetorit.setBounds(213, 223, 170, 25);
		contentPane.add(txtKontributiPunetorit);
		
		JLabel lblKontributiIPunetorit = new JLabel("Kontributi i punetorit (%):");
		lblKontributiIPunetorit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblKontributiIPunetorit.setBounds(10, 223, 200, 25);
		contentPane.add(lblKontributiIPunetorit);
		
		txtGjKontributiPunetorit = new JTextField();
		txtGjKontributiPunetorit.setBackground(SystemColor.info);
		txtGjKontributiPunetorit.setEditable(false);
		txtGjKontributiPunetorit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtGjKontributiPunetorit.setColumns(10);
		txtGjKontributiPunetorit.setBounds(213, 259, 170, 25);
		contentPane.add(txtGjKontributiPunetorit);
		
		JLabel lblGjithsejKontributiI = new JLabel("Gjithsej kontributi i pun\u00EBtorit:");
		lblGjithsejKontributiI.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblGjithsejKontributiI.setBounds(10, 259, 200, 25);
		contentPane.add(lblGjithsejKontributiI);
		
		txtKontributiPunedhenesit = new JTextField();
		txtKontributiPunedhenesit.setText("5");
		txtKontributiPunedhenesit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtKontributiPunedhenesit.setColumns(10);
		txtKontributiPunedhenesit.setBounds(213, 295, 170, 25);
		contentPane.add(txtKontributiPunedhenesit);
		
		JLabel lblKontributiIPundhnsit = new JLabel("Kontributi i pun\u00EBdh\u00EBn\u00EBsit(%):");
		lblKontributiIPundhnsit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblKontributiIPundhnsit.setBounds(10, 295, 200, 25);
		contentPane.add(lblKontributiIPundhnsit);
		
		JLabel lblGjithsejKontributiI_1 = new JLabel("Gjithsej kontributi i pun\u00EBdh\u00EBn\u00EBsit:");
		lblGjithsejKontributiI_1.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblGjithsejKontributiI_1.setBounds(10, 331, 200, 25);
		contentPane.add(lblGjithsejKontributiI_1);
		
		txtGjKontributiPunedhenesit = new JTextField();
		txtGjKontributiPunedhenesit.setBackground(SystemColor.info);
		txtGjKontributiPunedhenesit.setEditable(false);
		txtGjKontributiPunedhenesit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtGjKontributiPunedhenesit.setColumns(10);
		txtGjKontributiPunedhenesit.setBounds(213, 331, 170, 25);
		contentPane.add(txtGjKontributiPunedhenesit);
		
		JLabel lblPagaQTatohet = new JLabel("Paga q\u00EB tatohet:");
		lblPagaQTatohet.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaQTatohet.setBounds(423, 151, 135, 25);
		contentPane.add(lblPagaQTatohet);
		
		txtPagaTatohet = new JTextField();
		txtPagaTatohet.setBackground(SystemColor.info);
		txtPagaTatohet.setEditable(false);
		txtPagaTatohet.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPagaTatohet.setColumns(10);
		txtPagaTatohet.setBounds(570, 151, 170, 25);
		contentPane.add(txtPagaTatohet);
		
		JLabel lblGjithsejKontributet = new JLabel("Gjithsej kontributet:");
		lblGjithsejKontributet.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblGjithsejKontributet.setBounds(10, 367, 200, 25);
		contentPane.add(lblGjithsejKontributet);
		
		txtGjKontributet = new JTextField();
		txtGjKontributet.setBackground(SystemColor.info);
		txtGjKontributet.setEditable(false);
		txtGjKontributet.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtGjKontributet.setColumns(10);
		txtGjKontributet.setBounds(213, 367, 170, 25);
		contentPane.add(txtGjKontributet);
		
		JLabel lblPagaNeto = new JLabel("PAGA NETO:");
		lblPagaNeto.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		lblPagaNeto.setBounds(423, 367, 135, 25);
		contentPane.add(lblPagaNeto);
		
		txtPagaNeto = new JTextField();
		txtPagaNeto.setBackground(SystemColor.info);
		txtPagaNeto.setEditable(false);
		txtPagaNeto.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPagaNeto.setColumns(10);
		txtPagaNeto.setBounds(568, 367, 170, 25);
		contentPane.add(txtPagaNeto);
		
		txtGjTatimi = new JTextField();
		txtGjTatimi.setBackground(SystemColor.info);
		txtGjTatimi.setEditable(false);
		txtGjTatimi.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtGjTatimi.setColumns(10);
		txtGjTatimi.setBounds(570, 331, 170, 25);
		contentPane.add(txtGjTatimi);
		
		JLabel lblGjithsejTatimi = new JLabel("Gjithsej tatimi:");
		lblGjithsejTatimi.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblGjithsejTatimi.setBounds(423, 331, 135, 25);
		contentPane.add(lblGjithsejTatimi);
		
		JLabel lblPagaMbi = new JLabel("Paga mbi 450\u20AC:");
		lblPagaMbi.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaMbi.setBounds(423, 295, 135, 25);
		contentPane.add(lblPagaMbi);
		
		txtPaga450 = new JTextField();
		txtPaga450.setBackground(SystemColor.info);
		txtPaga450.setEditable(false);
		txtPaga450.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPaga450.setColumns(10);
		txtPaga450.setBounds(570, 295, 170, 25);
		contentPane.add(txtPaga450);
		
		txtPaga250 = new JTextField();
		txtPaga250.setBackground(SystemColor.info);
		txtPaga250.setEditable(false);
		txtPaga250.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPaga250.setColumns(10);
		txtPaga250.setBounds(570, 259, 170, 25);
		contentPane.add(txtPaga250);
		
		JLabel lblPagaPrej_2 = new JLabel("Paga prej 250-450\u20AC:");
		lblPagaPrej_2.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaPrej_2.setBounds(423, 259, 135, 25);
		contentPane.add(lblPagaPrej_2);
		
		JLabel lblPagaPrej_1 = new JLabel("Paga prej 80-250\u20AC:");
		lblPagaPrej_1.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaPrej_1.setBounds(423, 223, 135, 25);
		contentPane.add(lblPagaPrej_1);
		
		txtPaga80 = new JTextField();
		txtPaga80.setBackground(SystemColor.info);
		txtPaga80.setEditable(false);
		txtPaga80.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPaga80.setColumns(10);
		txtPaga80.setBounds(570, 223, 170, 25);
		contentPane.add(txtPaga80);
		
		txtPaga0 = new JTextField();
		txtPaga0.setBackground(SystemColor.info);
		txtPaga0.setEditable(false);
		txtPaga0.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		txtPaga0.setColumns(10);
		txtPaga0.setBounds(570, 187, 170, 25);
		contentPane.add(txtPaga0);
		
		JLabel lblPagaPrej = new JLabel("Paga prej 0-80\u20AC:");
		lblPagaPrej.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblPagaPrej.setBounds(423, 187, 135, 25);
		contentPane.add(lblPagaPrej);
		
		JComboBox cmbPunedhenesi = new JComboBox();
		cmbPunedhenesi.setModel(new DefaultComboBoxModel(new String[] {"Primar", "Sekondar"}));
		cmbPunedhenesi.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		cmbPunedhenesi.setBounds(213, 154, 170, 20);
		contentPane.add(cmbPunedhenesi);
		
		JButton btnKalkulo = new JButton("Llogarit");
		btnKalkulo.setForeground(Color.BLACK);
		btnKalkulo.setBackground(Color.LIGHT_GRAY);
		btnKalkulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String punedhenesi=String.valueOf(cmbPunedhenesi.getSelectedItem());
				double pagaBruto=Double.parseDouble(txtPagaBruto.getText());
				double kontributiPunetorit=Double.parseDouble(txtKontributiPunetorit.getText());
				double kontributiPunedhenesit=Double.parseDouble(txtKontributiPunedhenesit.getText());			
				
				txtGjKontributiPunetorit.setText(kontributiPunetorit*pagaBruto*0.01+"");
				txtGjKontributiPunedhenesit.setText(kontributiPunedhenesit*pagaBruto*0.01+"");
				txtGjKontributet.setText(kontributiPunetorit*pagaBruto*0.01+kontributiPunedhenesit*pagaBruto*0.01+"");
				
				double pagaTatohet=pagaBruto-(kontributiPunetorit*pagaBruto*0.01);
				
				double tatimi0=0, tatimi80=0, tatimi250=0, tatimi450=0;
				if(punedhenesi=="Primar") {
					if(pagaTatohet>80 && pagaTatohet<=250) {
						tatimi80=(pagaTatohet-80)*P80250;						
					}
					else if(pagaTatohet>250 && pagaTatohet<=450) {
						tatimi80=(250-80)*P80250;
						tatimi250=(pagaTatohet-250)*P250450;
					}
					else if(pagaTatohet>450){
						tatimi80=(250-80)*P80250;
						tatimi250=(450-250)*P250450;
						tatimi450=(pagaTatohet-450)*PMBI450;
					}
				}
				else {
					tatimi450=pagaTatohet*PMBI450;
				}
				
				txtPagaTatohet.setText(String.format("%.2f", pagaTatohet));
				txtPaga0.setText(String.format("%.2f", tatimi0));
				txtPaga80.setText(String.format("%.2f", tatimi80));
				txtPaga250.setText(String.format("%.2f", tatimi250));
				txtPaga450.setText(String.format("%.2f", tatimi450));
				txtGjTatimi.setText(String.format("%.2f", tatimi0+tatimi80+tatimi250+tatimi450));
				txtPagaNeto.setText(String.format("%.2f", pagaBruto-(tatimi0+tatimi80+tatimi250+tatimi450)-(kontributiPunetorit*pagaBruto*0.01)));
			}
		});
		btnKalkulo.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnKalkulo.setBounds(341, 439, 100, 31);
		contentPane.add(btnKalkulo);
	}
}

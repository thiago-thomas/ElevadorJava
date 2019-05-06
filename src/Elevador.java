import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica extends JFrame{
	
	private JLabel  labBemVindo = new JLabel();
	private JButton btnBotao[] = new JButton[5];
	private JTextArea txaCaixaTexto = new JTextArea();
	private JScrollPane spBarRol = new JScrollPane(txaCaixaTexto);
	private Elevador e = new Elevador();
	
	public InterfaceGrafica(String titulo) {
		super(titulo);
		this.setSize(450,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		labBemVindo.setText("BEM VINDO AO SIMULADOR DE ELEVADOR!");
		labBemVindo.setBounds(78, 10, 350, 30);
		labBemVindo.setFont(new Font("Lucinda Sans", Font.BOLD, 15));
		labBemVindo.setForeground(Color.BLUE);
		
		btnBotao[0] = new JButton("CHAMAR ELEVADOR");
		btnBotao[0].setBounds(12,52,180,30);
		btnBotao[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txaCaixaTexto.append(e.chamarElevador());
			}
		});
		
		btnBotao[1] = new JButton("ENTRAR NO ELEVADOR");
		btnBotao[1].setBounds(12,92,180,30);
		btnBotao[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txaCaixaTexto.append("- "+ e.entrarElevador() + "\n");
			}
		});
		
		btnBotao[2] = new JButton("SAIR DO ELEVADOR");
		btnBotao[2].setBounds(12,132,180,30);
		btnBotao[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txaCaixaTexto.append(e.sairElevador());
			}
		});
		
		btnBotao[3] = new JButton("ESCOLHER ANDAR");
		btnBotao[3].setBounds(12,172,180,30);
		btnBotao[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txaCaixaTexto.append("- "+ e.escolherAndar(1) + "\n");
			}
		});
		
		btnBotao[4] = new JButton("STATUS DO ELEVADOR");
		btnBotao[4].setBounds(12,212,180,30);
		btnBotao[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				txaCaixaTexto.append(e.status());
			}
		});

		spBarRol.setBounds(215, 53, 200, 192);
		
		txaCaixaTexto.setEditable(true);
		txaCaixaTexto.setLineWrap(true);
		txaCaixaTexto.setWrapStyleWord(true);
				
		for(int x = 0; x < btnBotao.length; x++) {
			this.add(btnBotao[x]);
		}

		this.add(spBarRol);
		this.add(labBemVindo);
		this.setVisible(true); 
	}
		
	
	public static void main (String args[]) {
		new InterfaceGrafica("Elevador");
	}

		
}

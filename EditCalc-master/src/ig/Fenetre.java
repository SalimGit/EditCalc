package ig;
import om.Calcul;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.Timer;

public class Fenetre{

	private JFrame window;
	
	private JLabel ad;
	private JLabel appli;
	
	private JLabel dog;
	private JLabel[] dogs;
	
	private JLabel operation;
	private JLabel solution;
	
	private JLabel gif;
	
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btnValider;
	
	private JLayeredPane layeredPane;
	
	private JTextField text;
	
	private Calcul calc;

	/**
	 * 
	 */
	public Fenetre() {
		launchPub();
		wait(10);
		destructPub();
		launchAppli();
		//closeAppli();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void launchPub() {
		
		this.window = new JFrame();
		this.window.getContentPane().setBackground(UIManager.getColor("Button.background"));
		this.window.getContentPane().setLayout(null);
		
		ad = new JLabel("");
		ad.setIcon(new ImageIcon(getClass().getResource("/img/publicite.gif")));
		ad.setBounds(0, 1, 584, 232);
		
		this.window.getContentPane().add(ad);
		this.window.setFont(new Font("Arial Black", Font.PLAIN, 12));
		this.window.setForeground(Color.WHITE);
		this.window.setIconImage(Toolkit.getDefaultToolkit().getImage("img/favicon-32x32.png"));
		this.window.setTitle("EditCALC V1.0");
		this.window.setBounds(100, 100, 600, 275);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.show();
	}
	public void wait(int seconds){
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void destructPub() {
		/*this.window.getContentPane().setBackground(UIManager.getColor("Button.background"));
		this.window.getContentPane().setLayout(null);
		
		JLabel appli2 = new JLabel("");
		appli2.setIcon(new ImageIcon(""));
		appli2.setBounds(0, 1, 584, 232);
		
		this.window.setFont(new Font("Arial Black", Font.PLAIN, 12));
		this.window.setForeground(Color.WHITE);
		this.window.setIconImage(Toolkit.getDefaultToolkit().getImage("favicon-32x32.png"));
		this.window.setTitle("EditCALC V1.0");
		this.window.setBounds(100, 100, 700, 275);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.show();*/
		ad.setVisible(false);
	}
	private JLabel insertDog() {
		dog = new JLabel();
		dog.setIcon(new ImageIcon(getClass().getResource("/img/mickey.png")));
		return dog;
	}
	private JLabel[] convertIntToImg(int i, int j, JLayeredPane pan) {
		dogs = new JLabel[18];
		for (int x = 8; x >= 0; x --) {
			if (x >= 9 - i) {
				dogs[x] = insertDog();
			}
			else {
				dogs[x] = new JLabel("");
			}
			pan.setLayer(dogs[x], 2);
			dogs[x].setBounds((16*x)+ 39, 50, 16, 16);
			pan.add(dogs[x]);
		}
		for (int x = 9; x < 18; x ++) {
			if (x < 9 + j) {
				dogs[x] = insertDog();
			}
			else {
				dogs[x] = new JLabel("");
			}
			pan.setLayer(dogs[x], 2);
			dogs[x].setBounds((16*x) + 71, 50, 16, 16);
			pan.add(dogs[x]);
		}
		return dogs;
	}
	
	public void launchAppli() {
		//this.window = new JFrame();
		this.window.getContentPane().setBackground(UIManager.getColor("Button.background"));
		this.window.getContentPane().setLayout(null);
		
		text = new JTextField();
		text.setBounds(2, 10, 280, 30);
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		this.window.getContentPane().add(text);
		text.setColumns(10);
		
		//ad.setIcon(new ImageIcon(""));

		btn0 = new JButton(new ImageIcon(getClass().getResource("/img/0.png")));
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("0");
			}
		});
		btn0.setBounds(1, 45, 94, 47);
		this.window.getContentPane().add(btn0);
		
		btn1 = new JButton(new ImageIcon(getClass().getResource("/img/1.png")));
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("1");
			}
		});
		btn1.setBounds(95, 45, 94, 47);
		this.window.getContentPane().add(btn1);
		
		btn2 = new JButton(new ImageIcon(getClass().getResource("/img/2.png")));
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("2");
			}
		});
		btn2.setBounds(189, 45, 94, 47);
		this.window.getContentPane().add(btn2);
		
		btn3 = new JButton(new ImageIcon(getClass().getResource("/img/3.png")));
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("3");
			}
		});
		btn3.setBounds(1, 92, 94, 47);
		this.window.getContentPane().add(btn3);
		
		btn4 = new JButton(new ImageIcon(getClass().getResource("/img/4.png")));
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("4");
			}
		});
		btn4.setBounds(95, 92, 94, 47);
		this.window.getContentPane().add(btn4);
		
		btn5 = new JButton(new ImageIcon(getClass().getResource("/img/5.png")));
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("5");
			}
		});
		btn5.setBounds(189, 92, 94, 47);
		this.window.getContentPane().add(btn5);
		
		btn6 = new JButton(new ImageIcon(getClass().getResource("/img/6.png")));
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("6");
			}
		});
		btn6.setBounds(1, 139, 94, 47);
		this.window.getContentPane().add(btn6);
		
		btn7 = new JButton(new ImageIcon(getClass().getResource("/img/7.png")));
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("7");
			}
		});
		btn7.setBounds(95, 139, 94, 47);
		this.window.getContentPane().add(btn7);
		
		btn8 = new JButton(new ImageIcon(getClass().getResource("/img/8.png")));
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("8");
			}
		});
		btn8.setBounds(189, 139, 94, 47);
		this.window.getContentPane().add(btn8);
		
		btn9 = new JButton(new ImageIcon(getClass().getResource("/img/9.png")));
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("9");
			}
		});
		btn9.setBounds(1, 186, 94, 47);
		this.window.getContentPane().add(btn9);
		
		btn10 = new JButton(new ImageIcon(getClass().getResource("/img/10.png")));
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				text.setText("10");
			}
		});
		btn10.setBounds(189, 186, 94, 47);
		this.window.getContentPane().add(btn10);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(292, 1, 392, 232);
		this.window.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		appli = new JLabel("");
		appli.setBounds(0, 0, 392, 232);
		appli.setIcon(new ImageIcon());//image
		layeredPane.add(appli);
		
		this.calc = new Calcul();
		int i = calc.getA();
		int j = calc.getB();
		int r = (int)(Math.random()*(2));
		int op = calc.operationCalcul(r);
		operation = new JLabel(calc.afficherCalcul(r));
		operation.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		operation.setForeground(Color.RED);
		layeredPane.setLayer(operation, 2);
		operation.setHorizontalAlignment(SwingConstants.CENTER);
		operation.setBounds(0, 32, 392, 46);
		layeredPane.add(operation);
		
		JLabel jdog[] = convertIntToImg(i, j, layeredPane);
		/*
		JLabel appli_1 = new JLabel("");
		appli_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setLayer(appli_1, 2);
		appli_1.setIcon(new ImageIcon(Fenetre.class.getResource("/javax/swing/plaf/metal/icons/ocean/info.png")));
		appli_1.setBounds(350, 11, 32, 32);
		panel.add(appli_1);
		*/
		
		/*
		JLabel gif = new JLabel("");
		panel.setLayer(gif, 2);
		gif.setIcon(new ImageIcon("flash.png"));
		gif.setBounds(10, 50, 16, 16);
		panel.add(gif);
		*/
		btnValider = new JButton("Valider");
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int intText = Integer.parseInt(text.getText());
				boolean test = op == intText;
				//operation.setText(calc.afficherResultat(test));
				solution = new JLabel(calc.afficherResultat(test));
				solution.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
				solution.setForeground(Color.RED);
				layeredPane.setLayer(solution, 1);
				solution.setHorizontalAlignment(SwingConstants.CENTER);
				solution.setBounds(0, 64, 392, 28);
				layeredPane.add(solution);
				gif = new JLabel("");
				layeredPane.setLayer(gif, 2);
				gif.setBounds(150, 116, 180, 120);
				layeredPane.add(gif);
				//text.setText("");
				if (test) {
					gif.setIcon(new ImageIcon(Fenetre.class.getResource("")));
				}
				else {
					gif.setIcon(new ImageIcon(Fenetre.class.getResource("")));
				}
			}
		});
		btnValider.setBounds(95, 186, 94, 47);
		btnValider.setForeground(Color.green);
		this.window.getContentPane().add(btnValider);
		
		this.window.setFont(new Font("Arial Black", Font.PLAIN, 12));
		this.window.setForeground(Color.WHITE);
		this.window.setIconImage(Toolkit.getDefaultToolkit().getImage("img/favicon-32x32.png"));
		this.window.setTitle("EditCALC V1.0");
		this.window.setBounds(100, 100, 700, 275);
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.show();
	}
}
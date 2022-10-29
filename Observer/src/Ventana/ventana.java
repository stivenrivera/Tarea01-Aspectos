package Ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana extends JFrame {

	private Notificacion notif= new Notificacion();
	private JPanel contentPane;
	private JButton boton1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
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
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{142, 142, 142, 0};
		gbl_contentPane.rowHeights = new int[]{253, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		boton1 = new JButton("color amarillo");
		accionBoton(boton1, "el color es amarillo", Color.yellow);

		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.insets = new Insets(0, 0, 0, 5);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 0;
		boton1.setBackground(Color.YELLOW);
		contentPane.add(boton1, gbc_boton1);
		
		JButton boton2 = new JButton("color azul");
		accionBoton(boton2, "el color es azul", Color.blue);
		
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.insets = new Insets(0, 0, 0, 5);
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 0;
		boton2.setBackground(Color.blue);
		contentPane.add(boton2, gbc_boton2);
		
		JButton boton3 = new JButton("color rojo");
		accionBoton(boton3, "el color es rojo", Color.red);
		
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.gridx = 2;
		gbc_boton3.gridy = 0;
		boton3.setBackground(Color.red);
		contentPane.add(boton3, gbc_boton3);
	}
	
	public void accionBoton(JButton b, String texto, Color c) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(c);
				notif.enviarNotificacion(texto, b.getText(), c.toString());
				System.out.println(texto);
			}
		});
	}

}

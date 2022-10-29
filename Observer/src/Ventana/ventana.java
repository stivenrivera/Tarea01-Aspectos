package Ventana;

import java.awt.BorderLayout;
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

public class ventana extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{142, 142, 142, 0};
		gbl_contentPane.rowHeights = new int[]{253, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton boton1 = new JButton("New button");
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.fill = GridBagConstraints.HORIZONTAL;
		gbc_boton1.insets = new Insets(0, 0, 0, 5);
		gbc_boton1.gridx = 0;
		gbc_boton1.gridy = 0;
		contentPane.add(boton1, gbc_boton1);
		
		JButton boton2 = new JButton("New button");
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.fill = GridBagConstraints.HORIZONTAL;
		gbc_boton2.insets = new Insets(0, 0, 0, 5);
		gbc_boton2.gridx = 1;
		gbc_boton2.gridy = 0;
		contentPane.add(boton2, gbc_boton2);
		
		JButton boton3 = new JButton("New button");
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.fill = GridBagConstraints.HORIZONTAL;
		gbc_boton3.gridx = 2;
		gbc_boton3.gridy = 0;
		contentPane.add(boton3, gbc_boton3);
	}

}

import java.awt.FlowLayout;

//port java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;



public class MostrarCuadro extends JFrame implements ActionListener {

	

	JComboBox cboAnimales;

	String Animales[]= {"gato","perro","caballo"};

	ImageIcon ImgGato,ImgPerro,ImgCaballo;

	JLabel lblImagen;

	

	

	MostrarCuadro(){

		

		setLayout(new FlowLayout());

		

		cboAnimales = new JComboBox(Animales);

		

		cboAnimales.addActionListener(this);

		

		lblImagen = new JLabel();

		ImgGato = new ImageIcon("D:\\Imagenes\\gato.jpg");

		ImgPerro = new ImageIcon("D:\\Imagenes\\perro.jpg");

		ImgCaballo = new ImageIcon("D:\\Imagenes\\caballo.jpg");

		

		add(cboAnimales);

		add(lblImagen);



		setTitle("Animal");

		setSize(500,500);

		setVisible(true);

		

	}

	public void actionPerformed(ActionEvent e) {

		

		if(e.getSource() == cboAnimales) {

			

		JOptionPane.showMessageDialog(this,"Seleccionado: "  + cboAnimales.getSelectedItem());

		

		if(cboAnimales.getSelectedItem() == "gato")

			lblImagen.setIcon(ImgGato);

		

		if(cboAnimales.getSelectedItem() == "perro") 

			lblImagen.setIcon(ImgPerro);

		

		if(cboAnimales.getSelectedItem() == "caballo")

			lblImagen.setIcon(ImgCaballo);

		}

		

	}



	public static void main(String[] args) {

	

			new MostrarCuadro();



		}



	}
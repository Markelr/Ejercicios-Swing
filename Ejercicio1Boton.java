import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;



public class Ejercicio1Boton extends JFrame implements ActionListener {



		JLabel lblValor1, lblValor2, lblValor3;

		JButton btnBoton;

		JLabel lblResultado;

		

		

		Ejercicio1Boton(){

			

			setLayout(new GridLayout(15,15));

			

			lblValor1 = new JLabel("");

			lblValor2 = new JLabel("");

			lblValor3 = new JLabel("");

			btnBoton = new JButton("Mostrar");

			lblResultado = new JLabel("");

			

			btnBoton.addActionListener(this);

			

			add(btnBoton);

			add(lblValor1);

			add(lblValor2);

			add(lblValor3);

			add(lblResultado);

			

			setTitle("Aleatorio");

			setSize(500,500);

			setVisible(true);

			

			

		}

	@Override

	public void actionPerformed(ActionEvent e) {

		

		int aleatorio1 = (int)Math.floor(Math.random()*10)+1;

		int aleatorio2 = (int)Math.floor(Math.random()*10)+1;

		int aleatorio3 = (int)Math.floor(Math.random()*10)+1;

		

		lblValor1.setText(String.valueOf(aleatorio1));

		lblValor2.setText(String.valueOf(aleatorio2));

		lblValor3.setText(String.valueOf(aleatorio3));

		

		if(aleatorio1 == aleatorio2 && aleatorio1 == aleatorio3)

			lblResultado.setText("Todos los valores son iguales");

		if(aleatorio1 == aleatorio2 && aleatorio1 != aleatorio3)

			lblResultado.setText("El valor 1 y 2 son iguales");

		if(aleatorio1 != aleatorio2 && aleatorio1 == aleatorio3)

			lblResultado.setText("El valor 1 y 3 son iguales");

		if(aleatorio1 != aleatorio2 && aleatorio1 != aleatorio3)

			lblResultado.setText("Ningun valor es igual");

		}



	public static void main(String[] args) {

	

		new Ejercicio1Boton();



	}




}

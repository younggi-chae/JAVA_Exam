package pos_System;

import javax.swing.JFrame;

public class Pos_Main extends JFrame {

	public Pos_Main() {
		super("POS");
		super.setResizable(true);

		setContentPane(new Pos_View());
		setSize(1200, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Pos_Main();

	}

}

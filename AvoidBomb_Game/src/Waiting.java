import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import processing.core.PApplet;

public class Waiting extends JFrame {

	private JPanel panel;
	private JLabel label;
	private JButton start, end;

	public Waiting() {
		super("대기 화면");
		super.setResizable(true);
		setSize(400, 400);
		setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		setContentPane(panel);

		label = new JLabel("폭탄 피하기");
		label.setFont(new Font("Serif", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setPreferredSize(new Dimension(120, 120));
		panel.add(label, BorderLayout.NORTH);

		JPanel btnMain = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 60));

		start = new JButton("게임 시작");
		btnMain.add(start);
		end = new JButton("게임 종료");
		btnMain.add(end);
		panel.add(btnMain, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PApplet.main("Program");

			}
		});

		end.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});

	}

	public static void main(String[] args) {
		new Waiting();

	}
}

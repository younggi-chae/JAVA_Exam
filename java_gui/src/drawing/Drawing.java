package drawing;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Drawing extends JFrame {

	Graphics g;
	Graphics2D g2;

	JPanel panel, canvas_Panel, btn_Panel;
	JButton pen, eraser, oval, rect, clear, colorSelect;
	JLabel thickness_Info;
	JTextField thickness_text;
	Color sColor;

	int sX, sY, eX, eY, hight, width;
	int thickness = 5;
	boolean state = false;

	int shape;

	static class Shape {
		static final int PEN = 1, OVAL = 2, RECT = 3;

	}

	public Drawing() {

		super("그림판");
		super.setResizable(true);

		canvas_Panel = new JPanel();
		canvas_Panel.setBackground(Color.WHITE);

		pen = new JButton("연필");
		pen.setPreferredSize(new Dimension(70, 40));

		eraser = new JButton("지우개");
		eraser.setPreferredSize(new Dimension(70, 40));

		oval = new JButton("○");
		oval.setPreferredSize(new Dimension(70, 40));

		rect = new JButton("□");
		rect.setPreferredSize(new Dimension(70, 40));

		clear = new JButton("지우기");
		clear.setPreferredSize(new Dimension(90, 60));
		clear.setBackground(Color.GREEN);

		colorSelect = new JButton("색상선택");
		colorSelect.setPreferredSize(new Dimension(90, 60));
		colorSelect.setBackground(Color.GREEN);

		thickness_Info = new JLabel("두께");
		thickness_Info.setFont(new Font("Serif", Font.BOLD, 15));
		thickness_text = new JTextField("5", 5);
		thickness_text.setHorizontalAlignment(JTextField.CENTER);

		btn_Panel = new JPanel();
		btn_Panel.setBackground(Color.ORANGE);
		btn_Panel.setLayout(new FlowLayout(20, 25, 20));
		btn_Panel.add(pen);
		btn_Panel.add(eraser);
		btn_Panel.add(oval);
		btn_Panel.add(rect);
		btn_Panel.add(thickness_Info);
		btn_Panel.add(thickness_text);
		btn_Panel.add(clear);
		btn_Panel.add(colorSelect);

		add(btn_Panel, BorderLayout.NORTH);
		add(canvas_Panel, BorderLayout.CENTER);

		setVisible(true);
		setBounds(100, 100, 800, 600);

		pen.addActionListener(new Tool());
		oval.addActionListener(new Tool());
		rect.addActionListener(new Tool());
		eraser.addActionListener(new Tool());
		clear.addActionListener(new Tool());
		colorSelect.addActionListener(new ColorSelect());

		g = getGraphics(); // 그래픽초기화
		g2 = (Graphics2D) g;

		canvas_Panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				thickness = Integer.parseInt(thickness_text.getText());

				eX = e.getX();
				eY = e.getY();

				switch (shape) {

				case Shape.OVAL:
					g.drawOval(sX + 5, sY + 10, eX + 5, eY + 10);
					((Graphics2D) g).setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, 0));
					break;
				case Shape.RECT:
					g.drawRect(sX + 5, sY + 10, eX + 5, eY + 10);
					((Graphics2D) g).setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, 0));
					break;
				}
				
				sX = eX;
				sY = eY;

			}

			@Override
			public void mousePressed(MouseEvent e) {
				sX = e.getX();
				sY = e.getY();

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		canvas_Panel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseDragged(MouseEvent e) {
				thickness = Integer.parseInt(thickness_text.getText());

				eX = e.getX();
				eY = e.getY();

				if (shape == Shape.PEN) {
					g.drawLine(sX + 15, sY + 130, eX + 15, eY + 130);
					((Graphics2D) g).setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, 0));
				}

				sX = eX;
				sY = eY;

			}

			@Override
			public void mouseMoved(MouseEvent e) {
			}

		});

	}

	public class Tool implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == pen) {
				shape = Shape.PEN;
				if (state == false)
					g.setColor(Color.BLACK);
				else
					g.setColor(sColor);

			} else if (e.getSource() == eraser) {
				g.setColor(Color.WHITE);

			} else if (e.getSource() == oval) {
				shape = Shape.OVAL;
				if (state == false)
					g.setColor(Color.BLACK);
				else
					g.setColor(sColor);
			} else if (e.getSource() == rect) {
				shape = Shape.RECT;
				if (state == false)
					g.setColor(Color.BLACK);
				else
					g.setColor(sColor);

			} else if (e.getSource() == clear) {
				canvas_Panel.repaint();
			}

		}

	}

	public class ColorSelect implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			state = true;
			JColorChooser cc = new JColorChooser();
			sColor = cc.showDialog(null, "Color", Color.ORANGE);
			g.setColor(sColor);

		}
	}

	public static void main(String[] args) {

		new Drawing();
	}

}
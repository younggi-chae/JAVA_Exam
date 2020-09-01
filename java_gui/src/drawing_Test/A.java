package drawing_Test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class A implements ActionListener, MouseListener, MouseMotionListener {

	Graphics g;
	Graphics2D g2;
	private ArrayList<JButton> btnList;
	JPanel panel, canvas_Panel, btn_Panel;
	int pen, eraser, oval, rect, clear, colorSelect;
	JLabel thickness_Info;
	JTextField thickness_text;
	Color sColor;

	boolean state = false;
	int shape;
	private int sX, sY, eX, eY;
	private int thickness = 5;

	static class Shape {
		static int PEN = 1;
		static int OVAL = 2;
		static int RECT = 3;

	}

	public A() {

		view();
	}

	public JComponent getView() {
		return panel;
	}

	public void view() {

		panel = new JPanel(new BorderLayout());
		btnList = new ArrayList<JButton>();

		canvas_Panel = new JPanel(new BorderLayout());
		canvas_Panel.setBackground(Color.WHITE);
		canvas_Panel.addMouseListener(this);
		canvas_Panel.addMouseMotionListener(this);
		panel.add(canvas_Panel, BorderLayout.CENTER);

		JPanel btnView = new JPanel(new BorderLayout());
		btnView.setLayout(new FlowLayout());
		panel.add(btnView, BorderLayout.NORTH);
		btnView.setBackground(Color.YELLOW);

		String[] buttons = { "연필", "지우개", "○", "□", "지우기", "색상선택" };

		for (String btn : buttons) {
			buttonFunc(btnView, btn);
		}

	}

	private void buttonFunc(JComponent cp, String btn) {

		JButton jb = new JButton(btn);
		jb.setPreferredSize(new Dimension(70, 40));
		jb.addActionListener(this);
		jb.addMouseListener(this);
		jb.addMouseMotionListener(this);
		btnList.add(jb);
		cp.add(jb);

	}
	
	
	public void paint(Graphics g) {
		
		if (shape == Shape.PEN) {
			g.drawLine(sX, sY, eX, eY);}
//		} else if (shape == Shape.OVAL) {
//			g.drawOval(sX, sY, eX - sX, eY - sY);
//		} else if (shape == Shape.RECT) {
//			g.drawRect(sX, sY, eX - sX, eY - sY);
//
//		}

	}

	public void update(Graphics g) {
		paint(g);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
     }
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		sX = e.getX();
		sY = e.getY();

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		eX = e.getX();
		eY = e.getY();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		String input = e.getActionCommand();

		if (input.equals(btnList.get(0))) {
			shape = Shape.PEN;
			if (state == false)
				g.setColor(Color.BLACK);
			else
				g.setColor(sColor);
		}
		
//		} else if (input.equals(btnList.get(1))) {
//			g.setColor(Color.WHITE);
//
//		} else if (input.equals(btnList.get(2))) {
//			shape = Shape.OVAL;
//			if (state == false)
//				g.setColor(Color.BLACK);
//			else
//				g.setColor(sColor);
//		} else if (input.equals(btnList.get(3))) {
//			shape = Shape.RECT;
//			if (state == false)
//				g.setColor(Color.BLACK);
//			else
//				g.setColor(sColor);
//
//		} else if (input.equals(btnList.get(4))) {
//			canvas_Panel.repaint();
//		}

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

		A draw = new A();
		JFrame frame = new JFrame("그림판");

		frame.setResizable(true);
		frame.setContentPane(draw.getView());
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
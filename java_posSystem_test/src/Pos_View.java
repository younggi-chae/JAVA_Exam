
import java.awt.BorderLayout;

import java.awt.Font;
import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pos_View extends JPanel {

	private JTable table;
	private DefaultTableModel tModel;
	
	
	public Pos_View() {
		setLayout(new BorderLayout());
		MainView view = new MainView(tModel, table);
		Menu m = new Menu();

		view.setSize(400, 100);
		add(view, BorderLayout.WEST);

		m.setSize(500, 300);
		add(m, BorderLayout.EAST);
	}

   
	public class MainView extends JPanel {

		public MainView(DefaultTableModel tModel, JTable table) {
			
			
			String[] bar = { "메뉴", "가격", "수량" };
			
			tModel = new DefaultTableModel(bar, 0);
			table = new JTable(tModel);
			tModel = (DefaultTableModel) table.getModel();
			table.setFont(new Font("돋움", Font.PLAIN, 20));
			table.setRowHeight(30);
			add(new JScrollPane(table));
		}
	}

}

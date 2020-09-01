package drawing_ex;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/*************************************************
 * JFrame 클래스 시작
 *********************************************************/

//JFrame 상속
public class PainterFrame extends JFrame {

	// 메뉴바 선언
	JMenuBar menubar;

	// 파일메뉴, 속성메뉴, 도움메뉴 선언
	JMenu mFile, mElement, mHelp;

	// 새선택, 열기선택, 저장선택, 어바웃선택, 나가기선택 메뉴아이템선언
	JMenuItem mNew, mOpen, mSave, mExit, mAbout;

	JMenuItem mPen, mLine, mRect, mOval;

	// 속성버튼그룹, 토글버튼그룹 버튼그룹 선언
	ButtonGroup elementGroup;

	ButtonGroup topGroup;

	// 상단툴바, 좌측툴바 선언
	JToolBar topToolbar, leftToolbar;

	// 새버튼, 열기버튼, 저장버튼, 나가기버튼 선언
	JButton tNew, tOpen, tSave, tExit;

	// 펜 토글버튼, 선 토글버튼, 사각형 토글버튼, 타원형 토글버튼 선언
	JToggleButton tPen, tLine, tRect, tOval;

	// 슬라이더 선언 : 질질 잡아끄는거
	JSlider slider;

	// 색선택 버튼 - 빨강, 파랑, 초록 버튼 선언
	JButton tRed, tBlue, tGreen;

	// 하단에서 정의한 MyCanvas 클래스 객체변수 선언
	MyCanvas canvas;

	// 색 정보 저장하는 배열
	Color[] colors = { Color.RED, Color.BLUE, Color.BLACK, Color.WHITE };// 배열

	// 색 버튼 배열
	JButton[] tColors;

	// 현재 선택되어있는 색을 표시하는 곳
	JButton colorSelect;

	JCheckBox fillSelect; // 도형을 그릴 때 색을 채워서 그리는 경우 or 테두리만 그리는 경우

	// 속성을 구분할수 있는 상수 선언 -> 사용자의 선택을 입력받을때 쓰임
	final static int PEN = 1, LINE = 2, RECT = 3, OVAL = 4;

	/**********************************************************
	 * 변수 선언 끝
	 ********************************************************/

	/****************************************************
	 * PainterFrame 생성자 시작
	 ****************************************************/

	// UI

	public PainterFrame() {

		// public JFrame(String title)
		// Creates a new, initially invisible Frame with the specified title.
		// JFrame을 상속받았으므로 생성자에서 super을 해줘야한다.
		// 이경우에서는 JFrame의 public JFrame(String title)생성자를 사용한다
		// 넘겨준 String은 타이틀이 된다

		super("My Painter v1.0");// 제목

		// --------------------------------MenuBar-----------------------------------

		// 선언해두었던 메뉴바 변수에 새 메뉴바 객체 생성 및 대입
		menubar = new JMenuBar();

		// 선언해두었던 메뉴 변수에 새 메뉴객체 생성 및 대입
		mFile = new JMenu("File");
		mElement = new JMenu("Element");
		mHelp = new JMenu("Help");

		// 단축키설정
		mFile.setMnemonic('F');
		mElement.setMnemonic('E');
		mHelp.setMnemonic('H');

		// 메뉴바 객체에 메뉴객체 탑재
		// 여기에서 add한 순서대로 탑재가 된다
		menubar.add(mFile);
		menubar.add(mElement);
		menubar.add(mHelp);

		// 메뉴아이템 객체 생성 및 대입
		mNew = new JMenuItem("New", new ImageIcon("images/new.gif"));
		mOpen = new JMenuItem("Open", new ImageIcon("images/Open.gif"));
		mSave = new JMenuItem("Save", new ImageIcon("images/Save.gif"));
		mExit = new JMenuItem("Exit", new ImageIcon("images/Exit.gif"));
		mAbout = new JMenuItem("About");

		// 단축키 설명
		// 메뉴 아이템에 단축키 설정
		// setAccelerator(keyStroke)사용
		// public static KeyStroke getKeyStroke(Character keyChar,int modifiers) 단축키 문자와
		// 어떤입력과 함께할것인지 modifier설정
		// 여기에선 modifier로 Ctrl + 설정
		mNew.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK));
		mOpen.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_MASK));
		mSave.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_MASK));
		mExit.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_MASK));

		// 버튼그룹 객체 생성 및 대입
		elementGroup = new ButtonGroup();// 한개만 체크되도록

		// 하나씩 고르게하기
		mPen = new JCheckBoxMenuItem("Pen", true);
		mLine = new JCheckBoxMenuItem("Line");
		mRect = new JCheckBoxMenuItem("Rect");
		mOval = new JCheckBoxMenuItem("Oval");

		// 버튼그룹객체에 체크박스메뉴아이템 객체들 탑재
		elementGroup.add(mPen);
		elementGroup.add(mLine);
		elementGroup.add(mRect);
		elementGroup.add(mOval);

		// JMenu객체에 JMenuItem객체 탑재
		// mFile 메뉴에 파일관련 선택 탑재
		mFile.add(mNew);
		mFile.addSeparator();
		mFile.add(mOpen);
		mFile.addSeparator();
		mFile.add(mSave);
		mFile.addSeparator(); // 구분선
		mFile.add(mExit);

		// JMenu객체에 JMenuItem객체 탑재
		// mElement메뉴에 그리기 속성관련 체크박스아이템 탑재
		mElement.add(mPen);
		mElement.add(mLine);
		mElement.add(mRect);
		mElement.add(mOval);

		// JMenu객체에 JMenuItem객체 탑재
		// mHelp메뉴에 About 선택 탑재
		mHelp.add(mAbout);

		// 각 메뉴아이템에 하단에서 정의한 EventHandler 클래스 객체 새로 생성 및 ActionListener로 설정
		mNew.addActionListener(new EventHandler());
		mOpen.addActionListener(new EventHandler());
		mSave.addActionListener(new EventHandler());
		mExit.addActionListener(new EventHandler());
		mAbout.addActionListener(new EventHandler());

		// 각 체크박스메뉴아이템에 하단에서 정의한 EventHandler클래스 객체 생성 및 ActionListener로 설정
		mPen.addActionListener(new EventHandler());
		mLine.addActionListener(new EventHandler());
		mRect.addActionListener(new EventHandler());
		mOval.addActionListener(new EventHandler());

		// ----------------------------------------------ToolBar----------------------------------------------

		topToolbar = new JToolBar();
		topToolbar.setFloatable(false);

		// 툴바버튼 변수에 버튼객체 생성 및 대입
		tNew = new JButton(new ImageIcon("images/new.gif"));
		tOpen = new JButton(new ImageIcon("images/Open.gif"));
		tSave = new JButton(new ImageIcon("images/Save.gif"));
		tExit = new JButton(new ImageIcon("images/Exit.gif"));

		// 툴바 토글 버튼 객체 생성 및 대입
		tPen = new JToggleButton("Pen", true);
		tLine = new JToggleButton("Line");
		tRect = new JToggleButton("Rect");
		tOval = new JToggleButton("Oval");

		topGroup = new ButtonGroup();
		topGroup.add(tPen);
		topGroup.add(tLine);
		topGroup.add(tRect);
		topGroup.add(tOval);

		// 슬라이더 객체 생성 및 대입
		// new JSlider(최솟값, 최댓값, 초기값)
		slider = new JSlider(0, 100, 20);
		slider.setMajorTickSpacing(10); // 슬라이더를 크게 나누는 표시
		slider.setMinorTickSpacing(1);// 슬라이더를 작게 나누는 표시
		slider.setPaintTicks(true);// 중간 작은표시 눈금 표시할건지 설정
		slider.setPaintTrack(true);
		slider.setPaintLabels(true);// label : (종이 등에 물건에 대한 정보를 적어 붙여 놓은) 표[라벨/상표]

		topToolbar.add(tNew);
		topToolbar.addSeparator();
		topToolbar.add(tOpen);
		topToolbar.addSeparator();
		topToolbar.add(tSave);
		topToolbar.addSeparator();
		topToolbar.add(tExit);

		topToolbar.addSeparator();

		topToolbar.add(tPen);
		topToolbar.addSeparator();
		topToolbar.add(tLine);
		topToolbar.addSeparator();
		topToolbar.add(tRect);
		topToolbar.addSeparator();
		topToolbar.add(tOval);

		topToolbar.add(slider);

		// 툴바 파일관련 버튼에 ActionListener 장착 <- 하단에 정의한 EventHandler 넘겨줌
		tNew.addActionListener(new EventHandler());
		tOpen.addActionListener(new EventHandler());
		tSave.addActionListener(new EventHandler());
		tExit.addActionListener(new EventHandler());

		// 각 툴바 토글버튼에 ActionListener 장착
		tPen.addActionListener(new EventHandler());
		tLine.addActionListener(new EventHandler());
		tRect.addActionListener(new EventHandler());
		tOval.addActionListener(new EventHandler());

		// 색상
		// 좌측 툴바 객체 생성 및 대입
		// 속성을 수직으로 넘김
		leftToolbar = new JToolBar(JToolBar.VERTICAL);

		/*
		 * tRed = new JButton("  "); tRed.setBackground(Color.RED);
		 * 
		 * tGreen = new JButton("  "); tGreen.setBackground(Color.GREEN);
		 * 
		 * tBlue = new JButton("  "); tBlue.setBackground(Color.BLUE);
		 * 
		 * leftToolbar.add(tRed); leftToolbar.add(tGreen); leftToolbar.add(tBlue);
		 */

		// 배열 자체를 생성

		// 버튼배열 길이 4짜리로 객체 생성 및 대입
		tColors = new JButton[4];
		colorSelect = new JButton("       ");
		fillSelect = new JCheckBox("Fill"); // 채워서 그릴지 선택하는 체크박스 객체 생성 및 대입
		fillSelect.addActionListener(new EventHandler()); // ActionListener 장착

		// 위에서 tColors에 버튼배열 길이 4짜리로 객체 생성 및 대입한데에 버튼객체 생성 및 탑재
		for (int i = 0; i < colors.length; i++) {

			tColors[i] = new JButton("       "); // 버튼 객체 생성 및 대입

			tColors[i].setBackground(colors[i]); // 배경색 설정

			tColors[i].addActionListener(new EventHandler()); // ActionListener 장착

			leftToolbar.add(tColors[i]); // 이렇게 만들어진 버튼객체를 좌측툴바에 탑재

		}

		// 어떤 색을 클릭했는지 바뀌는

		leftToolbar.addSeparator(); // 좌측 툴바에 tColors버튼 전부 장착후 구분선 집어넣기

		leftToolbar.add(colorSelect); // 좌측 툴바에 탑재
		leftToolbar.add(fillSelect); // 좌측 툴바에 탑재

		// ----------------------------------------Canvas Settings!
		// -------------------------------------------

		canvas = new MyCanvas();

		// PainterFrame객체에 탑재
		// 위치는 중앙
		this.add(BorderLayout.CENTER, canvas);

		// --------------------------------Frame
		// Settings--------------------------------

		// 좌측에 좌측툴바 탑재
		this.add(BorderLayout.WEST, leftToolbar);

		// 상단에 상단툴바 탑재
		this.add(BorderLayout.NORTH, topToolbar);

		this.setJMenuBar(menubar); // 메뉴바 탑재 -> 자동으로 최상단에 배치되는듯
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼 눌러서 지울때 행동할것 정함 -> 완전히 종료
		this.setSize(800, 800);
		this.setVisible(true);

	}

	/*************************************************
	 * MyCanvas 클래스 시작
	 ******************************************************/

	// 도화지 클래스
	// MyCanvas는 클래스 안에 정의된 클래스 : Inner클래스 이다
	// Canvas를 상속하고 MouseListener(마우스클릭 인식하는 리스너), MouseMotionListener(마우스 움직임 인식하는
	// 리스너) 인터페이스화
	// 뜻 : Canvas클래스의 기능을 죄다 사용할 수 있고
	// MouseListener와 MouseMotionListener의 기능중 쓰고싶은것을 재정의해서 쓸수있다
	// 상속과 인터페이스 선언을 먼저 한뒤 -> 클래스명에 에러표시뜬것을 활용해 "Add unimplemented methods"를 클릭하면
	// 인터페이스에서 재정의 할 수 있는 메소드들이 자동으로 코딩된다
	// 이중 사용하고 싶은기능만 재정의 하면된다. 필요없으면 그냥 두면된다.

	class MyCanvas extends Canvas implements MouseListener, MouseMotionListener {

		// sX,sY = 마우스 드래그 시작하는 좌표의 (x,y)
		// eX,eY = 마우스 드래그 끝나는 좌표의 (x,y)
		int sX, sY, eX, eY; // Point start, end;

		private Color selectedColor; // 선택된 색 저장할 변수
		private int selectShape = PEN; // 선택된 모양 저장할 변수
		private int selectThick;
		private boolean selectFill; // 선택된 채움 여부를 저장할 변수

		public void setSelectedColor(Color selectedColor) { // 색 설정
			this.selectedColor = selectedColor;

		}

		public void setSelectedShape(int selectedShape) { // 모양 설정
			this.selectShape = selectedShape;

		}

		public void setSelectedThick(int selectedThick) { // 굵기 설정
			this.selectThick = selectedThick;

		}

		public void setSelectedFill(boolean selectedFill) { // 채움 여부 설정
			this.selectFill = selectedFill;

		}

		// 도화지 객체 생성자
		public MyCanvas() {

			this.setBackground(Color.WHITE);// 배경색 하양으로
			// MouseListener와 MouseMotionListener를 장착해야한다.
			// MyCanvas객체 자신이 인터페이스화 해서 해당 기능을 사용할 수 있기때문에 자기 자신을 넘겨준다
			this.addMouseListener(this);
			this.addMouseMotionListener(this);

		}

		// 그림 그리는 역할
		// paint는 자동호출이라 사용자가 못건드림
		public void paint(Graphics g) { // 펜 역할 Graphics 에 라인을 그릴 수 있는 메소드가
			// 선으로만 그려짐
			// g.drawLine(sX, sY, eX, eY);

			// 넘겨받은 Graphics객체에 색 설정 <- 현재 선택된 색 변수 이용
			g.setColor(selectedColor);
			// g.fillRect(sX, sY, eX - sX, eY - sY);

			if (selectShape == PainterFrame.PEN) {
				g.drawLine(sX, sY, eX, eY);
			} else if (selectShape == PainterFrame.LINE) {
				g.drawLine(sX, sY, eX, eY);
			} else if (selectShape == PainterFrame.RECT) {

				if (selectFill == true) {
					g.fillRect(sX, sY, eX - sX, eY - sY);

				}

				else {
					g.drawRect(sX, sY, eX - sX, eY - sY);

				}

			}

			else if (selectShape == PainterFrame.OVAL) {
				g.drawOval(sX, sY, eX - sX, eY - sY);

				if (selectFill == true) {

					g.fillOval(sX, sY, eX - sX, eY - sY);
				}

				else {
					g.drawOval(sX, sY, eX - sX, eY - sY);
				}
			}

		}

		// repaint메소드 호출시 자동호출
		public void update(Graphics g) {
			paint(g);

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {// 클릭했을때
			// TODO Auto-generated method stub
			sX = e.getX();
			sY = e.getY();
		}

		@Override
		public void mouseReleased(MouseEvent e) {// 땠을때
			// TODO Auto-generated method stub
			eX = e.getX();
			eY = e.getY();

			repaint();
		}

	}

	/*****************************************************
	 * MyCanvas 클래스 끝
	 ********************************************************/

	/****************************************************
	 * EventHandler 클래스 시작
	 ****************************************************/

	// MenuBar, ToolBar
	// 얘도 Inner클래스
	// 이벤트가생겨서 입력받았을때 처리하는 클래스
	// ActionListener을 인터페이스화
	// 얘도 Add unimplemented methods
	class EventHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) { // 액션을 감지했을때 매번 호출

			Object eObj = e.getSource(); // 소스 추출

			for (int i = 0; i < colors.length; i++) {
				if (eObj.equals(tColors[i])) {
					canvas.setSelectedColor(colors[i]); // MyCanvas클래스에서 정의한 setColor메소드 호출해서 selectedColor 설정
					colorSelect.setBackground(colors[i]); // 현재 선택된 색 표시하는 버튼에 배경색 설정
				}
			}

			if (eObj.equals(mNew) || eObj.equals(tNew)) { // 눌린게 새 버튼이면

			}

			else if (eObj.equals(mOpen) || eObj.equals(tOpen)) { // 눌린게 열기 버튼

				JFileChooser openDialog = new JFileChooser(",");
				int result = openDialog.showOpenDialog(PainterFrame.this);

				if (result == JFileChooser.APPROVE_OPTION) {

				}

				else if (result == JFileChooser.CANCEL_OPTION) {

				}

				else {

				}

			}

			else if (eObj.equals(mSave) || eObj.equals(tSave)) { // 눌린게 저장 버튼

				JFileChooser openDialog = new JFileChooser(",");
				int result = openDialog.showSaveDialog(PainterFrame.this);

				if (result == JFileChooser.APPROVE_OPTION) {

				}

				else if (result == JFileChooser.CANCEL_OPTION) {

				}

				else {

				}

			}

			else if (eObj.equals(mExit) || eObj.equals(tExit)) { // 눌린게 나가기 버튼
				System.exit(0); // 종료
			}

			else if (eObj.equals(mAbout)) {
				final JDialog about = new JDialog(PainterFrame.this, "About", true);

				JButton b = new JButton("Close", new ImageIcon("images/image.jpg"));

				about.add(b);
				b.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						about.dispose();
					}
				});

				about.setSize(200, 300);
				about.setVisible(true);

			} else if (eObj.equals(mPen) || eObj.equals(tPen)) {
				mPen.setSelected(true);
				tPen.setSelected(true);

				canvas.setSelectedShape(PainterFrame.PEN);

			}

			else if (eObj.equals(mLine) || eObj.equals(tLine)) {
				mLine.setSelected(true);
				tLine.setSelected(true);

				canvas.setSelectedShape(PainterFrame.LINE);
			}

			else if (eObj.equals(mRect) || eObj.equals(tRect)) {
				mRect.setSelected(true);
				tRect.setSelected(true);

				canvas.setSelectedShape(PainterFrame.RECT);

			}

			else if (eObj.equals(mOval) || eObj.equals(tOval)) {
				mOval.setSelected(true);
				tOval.setSelected(true);

				canvas.setSelectedShape(PainterFrame.OVAL);

			}

			else if (eObj.equals(fillSelect)) {

				canvas.setSelectedFill(fillSelect.isSelected());
			}

		}

	}

	public static void main(String[] args) {
		new PainterFrame();

	}

}

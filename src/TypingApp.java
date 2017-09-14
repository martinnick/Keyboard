/*
	@author Nick Charles Martin
			Programming Project #3
			CIS 2151 Summer 2016
			Prof. John Baugh
*/			
			

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TypingApp extends JFrame implements KeyListener 
{

	private final int WINDOW_WIDTH = 710;
	private final int WINDOW_HEIGHT = 620;
	private JButton defaultButton = new JButton();
	
	JButton currentButton = null;
	JButton button = new JButton("`");
	JButton button_1 = new JButton("1");
	JButton button_2 = new JButton("2");
	JButton button_4 = new JButton("4");
	JButton button_3 = new JButton("3");
	JButton button_5 = new JButton("5");
	JButton button_6 = new JButton("6");
	JButton button_7 = new JButton("7");
	JButton button_8 = new JButton("8");
	JButton button_9 = new JButton("9");
	JButton button_10 = new JButton("0");
	JButton button_11 = new JButton("-");
	JButton button_12 = new JButton("=");
	JButton btnBackspace = new JButton("Backspace");
	
	JButton btnTab = new JButton("Tab");
	JButton button_Q = new JButton("Q");
	JButton button_W = new JButton("W");
	JButton button_E = new JButton("E");
	JButton button_R = new JButton("R");
	JButton button_T = new JButton("T");
	JButton button_Y = new JButton("Y");
	JButton button_U = new JButton("U");
	JButton button_I = new JButton("I");
	JButton button_O = new JButton("O");
	JButton button_P = new JButton("P");
	JButton button_13 = new JButton("[");
	JButton button_14 = new JButton("]");
	JButton button_15 = new JButton("\\");
			
	JButton btnCaps = new JButton("Caps");
	JButton button_A = new JButton("A");
	JButton button_S = new JButton("S");
	JButton button_D = new JButton("D");
	JButton button_F = new JButton("F");
	JButton button_G = new JButton("G");
	JButton button_H = new JButton("H");
	JButton button_J = new JButton("J");
	JButton button_K = new JButton("K");
	JButton button_L = new JButton("L");
	JButton button_16 = new JButton(":");
	JButton button_17 = new JButton("\"");
	JButton button_18 = new JButton("Enter");
	
	JButton btnShift = new JButton("Shift");
	JButton button_Z = new JButton("Z");
	JButton button_X = new JButton("X");
	JButton button_C = new JButton("C");
	JButton button_V = new JButton("V");
	JButton button_B = new JButton("B");
	JButton button_N = new JButton("N");
	JButton button_M = new JButton("M");
	JButton button_19 = new JButton(",");
	JButton button_20 = new JButton(".");
	JButton button_21 = new JButton("?");
	
	
	JButton btnSpace = new JButton("      " +
	"                                       "
	+ "         ");
	
	JButton btnUp = new JButton("^");
	JButton btnDown = new JButton("v");
	JButton btnLeft = new JButton("<");
	JButton btnRight = new JButton(">");
	
		
	public TypingApp()
	{
		
		setTitle("Typing Application");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new GridLayout(3, 1));
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel2.setBorder(UIManager.getBorder("InternalFrame.border"));
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		FlowLayout fl_panel1 = new FlowLayout(FlowLayout.CENTER);
		fl_panel1.setVgap(2);
		panel1.setLayout(fl_panel1);
		
		JLabel textLabel = new JLabel("<html><p>Type some text using your keyboard. The keys you" +
				 "press will be highlighted and the text will be displayed. <br />"
					+	"Note: Clicking the buttons with you mouse will not perform any action.");
		
		
		panel1.add(textLabel);		
		
		JTextArea textInput = new JTextArea(10, 40);
		textInput.setWrapStyleWord(true);
		textInput.setLineWrap(true);
		textInput.addKeyListener(this);
		textInput.setRequestFocusEnabled(isEnabled());
		
		panel2.setLayout(new BorderLayout());
		panel2.add(textInput, BorderLayout.CENTER);
		
		panel3.setLayout(new FlowLayout());
		
		
		panel3.add(button);
		panel3.add(button_1);
		panel3.add(button_2);
		panel3.add(button_3);
		panel3.add(button_4);
		panel3.add(button_5);
		panel3.add(button_6);
		panel3.add(button_7);
		panel3.add(button_8);
		panel3.add(button_9);
		panel3.add(button_10);
		panel3.add(button_11);
		panel3.add(button_12);
		panel3.add(btnBackspace);
		
		panel3.add(btnTab);
		panel3.add(button_Q);
		panel3.add(button_W);
		panel3.add(button_E);
		panel3.add(button_R);
		panel3.add(button_T);
		panel3.add(button_Y);
		panel3.add(button_U);
		panel3.add(button_I);
		panel3.add(button_O);
		panel3.add(button_P);
		panel3.add(button_13);
		panel3.add(button_14);
		panel3.add(button_15);
		
		panel3.add(btnCaps);
		panel3.add(button_A);
		panel3.add(button_S);
		panel3.add(button_D);
		panel3.add(button_F);
		panel3.add(button_G);
		panel3.add(button_H);
		panel3.add(button_J);
		panel3.add(button_K);
		panel3.add(button_L);
		panel3.add(button_16);
		panel3.add(button_17);
		panel3.add(button_18);
		
		panel3.add(btnShift);
		panel3.add(button_Z);
		panel3.add(button_X);
		panel3.add(button_C);
		panel3.add(button_V);
		panel3.add(button_B);
		panel3.add(button_N);
		panel3.add(button_M);
		panel3.add(button_19);
		panel3.add(button_20);
		panel3.add(button_21);
		panel3.add(btnSpace);
		
		panel3.add(panel4);
		
		panel4.add(btnUp, BorderLayout.NORTH);
		panel4.add(btnLeft, BorderLayout.WEST);
		panel4.add(btnRight, BorderLayout.EAST);
		panel4.add(btnDown, BorderLayout.SOUTH);

		
		
		getContentPane().add(panel1);
		getContentPane().add(panel2);
		getContentPane().add(panel3);
				
		
		setVisible(true);
		
		
		
}	

		
		public static void main(String[] args)
		{
		                     
			new TypingApp();
		  
		}

		@Override
		public void keyPressed(KeyEvent event) {
			
			if(currentButton != null)
			{
				currentButton.setForeground(defaultButton.getForeground());
				currentButton.setBackground(defaultButton.getBackground());
			}
			
			if(event.getKeyCode() == KeyEvent.VK_BACK_QUOTE)
			{
				currentButton = button;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_1)
			{
				currentButton = button_1;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_2)
			{
				currentButton = button_2;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_3)
			{
				currentButton = button_3;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_4)
			{
				currentButton = button_4;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_5)
			{
				currentButton = button_5;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_6)
			{
				currentButton = button_6;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_7)
			{
				currentButton = button_7;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_8)
			{
				currentButton = button_8;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_9)
			{
				currentButton = button_9;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_0)
			{
				currentButton = button_10;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_MINUS)
			{
				currentButton = button_11;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_EQUALS)
			{
				currentButton = button_12;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_BACK_SPACE)
			{
				currentButton = btnBackspace;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_TAB)
			{
				currentButton = btnTab;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_Q)
			{
				currentButton = button_Q;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_W)
			{
				currentButton = button_W;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_E)
			{
				currentButton = button_E;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_R)
			{
				currentButton = button_R;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_T)
			{
				currentButton = button_T;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_Y)
			{
				currentButton = button_Y;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_U)
			{
				currentButton = button_U;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_I)
			{
				currentButton = button_I;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_O)
			{
				currentButton = button_O;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_P)
			{
				currentButton = button_P;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_OPEN_BRACKET)
			{
				currentButton = button_13;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_CLOSE_BRACKET)
			{
				currentButton = button_14;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_BACK_SLASH)
			{
				currentButton = button_15;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_CAPS_LOCK)
			{
				currentButton = btnCaps;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_A)
			{
				currentButton = button_A;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_S)
			{
				currentButton = button_S;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_D)
			{
				currentButton = button_D;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_F)
			{
				currentButton = button_F;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_G)
			{
				currentButton = button_G;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_H)
			{
				currentButton = button_H;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_J)
			{
				currentButton = button_J;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_K)
			{
				currentButton = button_K;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_L)
			{
				currentButton = button_L;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_SEMICOLON)
			{
				currentButton = button_16;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_QUOTE)
			{
				currentButton = button_17;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_ENTER)
			{
				currentButton = button_18;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_SHIFT)
			{
				currentButton = btnShift;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_Z)
			{
				currentButton = button_Z;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_X)
			{
				currentButton = button_X;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_C)
			{
				currentButton = button_C;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_V)
			{
				currentButton = button_V;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_B)
			{
				currentButton = button_B;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_N)
			{
				currentButton = button_N;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_M)
			{
				currentButton = button_M;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_COMMA)
			{
				currentButton = button_19;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_PERIOD)
			{
				currentButton = button_20;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_SLASH)
			{
				currentButton = button_21;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_SPACE)
			{
				currentButton = btnSpace;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_UP)
			{
				currentButton = btnUp;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_LEFT)
			{
				currentButton = btnLeft;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				currentButton = btnRight;
			}
			
			else if(event.getKeyCode() == KeyEvent.VK_DOWN)
			{
				currentButton = btnDown;
			}
			
			currentButton.setForeground(Color.WHITE);
			currentButton.setBackground(Color.DARK_GRAY);
			
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) 
		{
			
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) 
		{
			
			
		}

		
	}
		
	



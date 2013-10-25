package webserviceclient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 实现小球的运行
 * 窗口 面板 小球
 * @author Administrator
 *
 */
public class BallMove extends JFrame {
	//窗口
	
	JPanel jPanel = null;
	int radius = 5;
	int pointX = 100;
	int pointY = 200;
	void initFrame(){
		this.setTitle("小球移动");
		this.setSize(new Dimension(400,300));
		this.setVisible(true);
		jPanel = new JPanel();
		jPanel.setSize(new Dimension(400,300));
		jPanel.setBackground(Color.white);
		jPanel.setLayout(null);
		JLabel jLabel = new JLabel("text");
		jLabel.setSize(30, 25);
		jPanel.add(jLabel);
		this.getContentPane().add(jPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭
		setCenter();
		drawCircle(jPanel.getGraphics());
		this.repaint();
	}
	//设置窗体位置居中
	void setCenter(){
		int x = (int)(this.getToolkit().getScreenSize().getWidth()-this.getWidth())/2;
		int y = (int)(this.getToolkit().getScreenSize().getHeight()-this.getHeight())/2;
		this.setLocation(x,y);
	}
	public void drawCircle(Graphics g){
	   Graphics2D g2=(Graphics2D)g;
	   g2.setColor(Color.red);
	   Ellipse2D circle=new Ellipse2D.Double();
	   circle.setFrameFromCenter(pointX,pointY,pointX+radius,pointY+radius);
	   g2.fill(circle);
//	   g2.fillOval(pointX, pointY, radius, radius);
	}
	
	public static void main(String[] args){
		//事件调动线程，不知道为啥要用。
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				BallMove ballMove = new BallMove();
				ballMove.initFrame();
				System.out.println("不知道为何删除掉了？？？");
			}
		});
	}
	
}
/**
 * 重写窗口的事件
 * @author Administrator
 *
 */
class WidowEvent implements WindowListener{

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);//执行关闭时，退出系统
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

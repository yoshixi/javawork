//15D8102011G Yoshikii Masubuchi 増渕　佳輝　2017/04/14

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Kadai01 extends JFrame {
	
	public static void main(String[] args){
	public Kadai01() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		sp = new SamplePanel();
		add(sp, BorderLayout.CENTER);
		setVisible(true);
	public class SamplePanel extends JPanel {
		
		public SamplePanel(){
		public void  paintComponent(Graphics g){
			Iterator<Circle> it = circlelist.iterator();
			while(it.hasNext()){
				c.draw(g);
		public	class SampleMouseListener extends MouseAdapter{
				repaint();
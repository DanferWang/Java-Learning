import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
public class bayes extends JFrame implements  ActionListener{
	JPanel panel=new JPanel();
	JLabel ph=new JLabel("P(H)");
	JTextField PH=new JTextField("",3);
	JLabel pe=new JLabel("P(E)");
	JTextField PE=new JTextField("",3);	
	JLabel ls=new JLabel("LS");
	JTextField LS=new JTextField("",3);		
	JLabel ln=new JLabel("LN");
	JTextField LN=new JTextField("",3);
	Button compute=new Button("COMPUTE");

	static double t_ph;
	static double t_pe;
	static double t_ln;
	static double t_ls;
	static double ph_e;             //P(E/S)=0 ʱ PHS
	static double phe;              //P(E/S)=1 ʱ PHS
	public bayes()
	{
		setLayout(new BorderLayout());	
		panel.setLayout(new FlowLayout());
		panel.add(ph);
		panel.add(PH);
		panel.add(pe);
		panel.add(PE);
		panel.add(ln);
		panel.add(LN);
		panel.add(ls);
		panel.add(LS);
		this.add(panel);
		compute.addActionListener(this);
		this.add(compute,BorderLayout.SOUTH);
	}
	public static void main(String [] args)
	{
		bayes a=new bayes();
		a.setSize(400,250);
		a.setVisible(true);
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		t_ph=new Double(PH.getText());
		t_pe=new Double(PE.getText());
		t_ls=new Double(LS.getText());
		t_ln=new Double(LN.getText());
		ph_e=t_ln*t_ph/((t_ln-1)*t_ph+1);
		phe=t_ls*t_ph/((t_ls-1)*t_ph+1);
		display c=new display();
	}
}
class draw extends JPanel{
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawLine(50, 350, 350, 350);
		g.drawLine(50, 50, 50, 350 );
		g.drawLine(50, 350-(int)(bayes.ph_e*300), 50+(int)(bayes.t_pe*300),350-(int)(bayes.t_ph*300));
		g.drawLine(50+(int)(bayes.t_pe*300),350-(int)(bayes.t_ph*300),350,350-(int)(bayes.phe*300));
	}
}
class display extends JFrame{
	public display()
	{
		draw b=new draw();
		this.add(b);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(400,400);
	}
}

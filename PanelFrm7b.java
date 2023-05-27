import java.awt.*;import java.awt.event.*;import java.util.*;import javax.swing.*;
public class PanelFrm7b extends JFrame implements ActionListener {
	int N=9,r1,g1,b1,r2,g2,b2,t=1,n[]=new int[N];String s,r[]=new String[N];Button bc,bs;
	ClickPanel p[]=new ClickPanel[N];Random rd;Panel pp=new Panel();int clk=0;
	PanelFrm7b(){super("Panel Frame");rd=new Random();setLayout(new BorderLayout());
		Panel pb=new Panel();pp.setLayout(new GridLayout(3,3));
		bc=new Button("color");bc.addActionListener(this);
		bs=new Button("swap");bs.addActionListener(this);
		pb.setLayout(new FlowLayout());pb.add(bc);pb.add(bs);
		for(int i=0;i<N;i++){r1=rd.nextInt(255);g1=rd.nextInt(255);
			b1=rd.nextInt(255);r2=255-r1;g2=255-g1;b2=255-b1;r[i]=""+(rd.nextInt(99)+1);
			p[i]=new ClickPanel(new Color(r1,g1,b1),new Color(r2,g2,b2),
				new Dimension(33,33),r[i],clk);pp.add(p[i]);
		} add(pp,BorderLayout.CENTER);add(pb,BorderLayout.SOUTH);
		setBounds(100,100,300,330);setVisible(true);//System.out.print("8:"+p[8].s+";");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);}
	public void actionPerformed(ActionEvent e){String c=e.getActionCommand();
		if(c.equals("swap")){int j=-1,k=-1,cc=0,ccc=0;for(int i=0;i<N;i++)if(p[i].ss.equals(p[i].s)){
			j=i;if(k==-1)k=i;} //System.out.println(""+j+"="+p[j].s+","+k+"="+p[k].s);
			if(j!=k)swap(p,j,k);for(int i=0;i<N;i++)p[i].repaint();setVisible(false);
			for(int i=1;i<N;i++) if(Integer.parseInt(p[i].s)>=Integer.parseInt(p[i-1].s))cc++;
				else if(Integer.parseInt(p[i].s)<=Integer.parseInt(p[i-1].s))ccc++;
				if((cc>=8)||(ccc>=8)){JOptionPane.showMessageDialog(this,"WIN score=100;click="+clk,"INFO",1);
				bs.setEnabled(false);}System.out.println("\ncc:"+cc+";ccc:"+ccc);
		}else {for(int i=0;i<N;i++){r1=rd.nextInt(255);g1=rd.nextInt(255);b1=rd.nextInt(255);
			r2=255-r1;g2=255-g1;b2=255-b1;p[i].setBackground(new Color(r1,g1,b1));bs.setEnabled(true);
			p[i].setForeground(new Color(r2,g2,b2));r[i]=""+(rd.nextInt(99)+1);p[i].s=r[i];repaint();} 
			setVisible(false);	} pp.repaint();setVisible(true);}
	void swap(ClickPanel p[],int j,int k){String t=p[j].s;p[j].s=p[k].s;p[k].s=t;
	for(int i=0;i<N;i++) if(p[i].clk!=0) {clk+=p[i].clk;p[i].clk=0;}}
	public static void main(String[] args) {new PanelFrm7b();} }
class ClickPanel extends JPanel implements MouseListener {String s,ss="";int clk;
	ClickPanel(Color c1,Color c2,Dimension d,String s,int clk){this.s=s;this.clk=clk;
		setBackground(c1);setForeground(c2);setSize(d);addMouseListener(this);}
	public void mouseClicked(MouseEvent e){ss=s;clk++;System.out.print(ss+";");}
	public void mouseEntered(MouseEvent e){}	public void mouseExited(MouseEvent e){}	
	public void mousePressed(MouseEvent e){}	public void mouseReleased(MouseEvent e){}
	public void paint(Graphics g){super.paint(g);
		g.setFont(new Font("",Font.BOLD|Font.ITALIC,36));g.drawString(s,28,52);	} }
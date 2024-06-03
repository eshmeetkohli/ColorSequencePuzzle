import java.awt.*;
import java.awt.event.*;

class ColorSequenceColor extends Frame implements MouseListener,ActionListener,TextListener
{
	TextField tf1,tf2;
	Label lb,lb1,lb2,lb3,lb4,lb5,b_lb1,b_lb2,b_lb3;
	TextField tf[][]=new TextField[25][25];
	Button btn1,btn2;
	int flag=4,flag2=0,lb1_flag=0,lb2_flag=0,lb3_flag=0,lb4_flag=0,lb5_flag=4;

	public StackColor()
	{
		setLayout(null);
		lb=new Label("---COLOR SORT PUZZLE--- ");
		lb.setSize(500,40);
		lb.setFont(new Font("Arial",Font.BOLD,22));
		lb.setLocation(400,50);
		add(lb);

		int x=100,y=100;

		for(int i=0;i<4;i++,x=100,y=y+35)
		{
			for(int j=0;j<5;j++,x=x+150,y=y)
			{
				tf[i][j]=new TextField();
				tf[i][j].setSize(100,40);
				tf[i][j].setLocation(x,y);
		        add(tf[i][j]);
				tf[i][j].addTextListener(this);
			}
		}



		tf1=new TextField();
		tf1.setSize(200,40);
		tf1.setLocation(850,135);
		add(tf1);

		tf2=new TextField(null);
		tf2.setSize(200,40);
		tf2.setLocation(850,250);
		add(tf2);

		lb1=new Label("STACK 1");
		lb1.setSize(100,40);
		lb1.setFont(new Font("Arial",Font.BOLD,22));
		lb1.setLocation(100,250);
		add(lb1);

		lb2=new Label("STACK 2");
		lb2.setSize(100,40);
		lb2.setFont(new Font("Arial",Font.BOLD,22));
		lb2.setLocation(250,250);
		add(lb2);

		lb3=new Label("STACK 3");
		lb3.setSize(100,40);
		lb3.setFont(new Font("Arial",Font.BOLD,22));
		lb3.setLocation(400,250);
		add(lb3);

		lb4=new Label("STACK 4");
		lb4.setSize(100,40);
		lb4.setFont(new Font("Arial",Font.BOLD,22));
		lb4.setLocation(550,250);
		add(lb4);

		lb5=new Label("STACK 5");
		lb5.setSize(100,40);
		lb5.setFont(new Font("Arial",Font.BOLD,22));
		lb5.setLocation(700,250);
		add(lb5);

		lb1.addMouseListener(this);
		lb2.addMouseListener(this);
		lb3.addMouseListener(this);
		lb4.addMouseListener(this);
		lb5.addMouseListener(this);



		btn1=new Button("FILL");
		btn1.setSize(100,40);
		btn1.setLocation(900,190);
		add(btn1);
		btn1.addActionListener(this);

		btn2=new Button("FINISH");
		btn2.setSize(100,40);
		btn2.setLocation(900,305);
		add(btn2);
		btn2.addActionListener(this);


		b_lb1=new Label("FILL COLOR");
		b_lb1.setSize(200,18);
		b_lb1.setFont(new Font("Arial",Font.BOLD,18));
		b_lb1.setLocation(850,120);
		b_lb1.setBackground(Color.yellow);
		add(b_lb1);

		b_lb2=new Label("SELECTED COLOR");
		b_lb2.setSize(200,18);
		b_lb2.setFont(new Font("Arial",Font.BOLD,18));
		b_lb2.setLocation(850,235);
		b_lb2.setBackground(Color.yellow);
		add(b_lb2);


		b_lb3=new Label("COME-ON YOU CAN DO IT!!!");
		b_lb3.setSize(400,40);
		b_lb3.setFont(new Font("Arial",Font.BOLD,25));
		b_lb3.setLocation(200,350);
		add(b_lb3);

          }



	public void textValueChanged(TextEvent te)
	{



		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(tf[i][j].getText().equals(""))
				{
					tf[i][j].setBackground(Color.white);
				}
				else if(tf[i][j].getText().equals("RED"))
				{
					tf[i][j].setBackground(Color.red);
				}
				else if(tf[i][j].getText().equals("YELLOW"))
				{
					tf[i][j].setBackground(Color.yellow);
				}
				else if(tf[i][j].getText().equals("BLUE"))
				{
					tf[i][j].setBackground(Color.blue);
				}
				else if(tf[i][j].getText().equals("GREEN"))
				{
					tf[i][j].setBackground(Color.green);
				}
			}
		}

	}
	public void mouseEntered(MouseEvent me)
	{
		Object ob2=me.getSource();

		if(ob2==lb1)
		{
			if(!tf2.getText().equals(""))
			{
				if(lb1_flag==0)
				{
					System.out.println("3");}
				else
				{
					System.out.println("4");
					String s1=tf2.getText();
					tf[lb1_flag-1][0].setText(s1);
					lb1_flag=lb1_flag-1;
					tf2.setText("");
				}
			}
			else
			{

				if(lb1_flag>=0 && lb1_flag<4 )
				{
					System.out.println("1");
					String s1=tf[lb1_flag][0].getText();
					tf2.setText(s1);
					tf[lb1_flag][0].setText(null);
					lb1_flag=lb1_flag+1;
				}
				else
				{
					System.out.println("2");
				}
			}
		}
		else if(ob2==lb2)
		{
			if(!tf2.getText().equals(""))
			{
				if(lb2_flag==0)
				{
					System.out.println("3");}
				else
				{
					System.out.println("4");
					String s1=tf2.getText();
					tf[lb2_flag-1][1].setText(s1);
					lb2_flag=lb2_flag-1;tf2.setText("");
				}
			}
			else
			{

				if(lb2_flag>=0 && lb2_flag<4 )
				{
					System.out.println("1");
					String s1=tf[lb2_flag][1].getText();
					tf2.setText(s1);
					tf[lb2_flag][1].setText(null);
					lb2_flag=lb2_flag+1;
				}
				else
				{
					System.out.println("2");
				}
			}
		}

		else if(ob2==lb3)
		{
			if(!tf2.getText().equals(""))
			{
				if(lb3_flag==0)
				{
					System.out.println("3");}
				else
				{
					System.out.println("4");
					String s1=tf2.getText();
					tf[lb3_flag-1][2].setText(s1);
					lb3_flag=lb3_flag-1;tf2.setText("");
				}
			}
			else
			{

				if(lb3_flag>=0 && lb3_flag<4 )
				{
					System.out.println("1");
					String s1=tf[lb3_flag][2].getText();
					tf2.setText(s1);
					tf[lb3_flag][2].setText(null);
					lb3_flag=lb3_flag+1;
				}
				else
				{
					System.out.println("2");
				}
			}
		}

		else if(ob2==lb4)
		{
			if(!tf2.getText().equals(""))
			{
				if(lb4_flag==0)
				{
					System.out.println("3");}
				else
				{
					System.out.println("4");
				    String s1=tf2.getText();
					tf[lb4_flag-1][3].setText(s1);
					lb4_flag=lb4_flag-1;
					tf2.setText("");
				}
			}
			else
			{

				if(lb4_flag>=0 && lb4_flag<4 )
				{
					System.out.println("1");
					String s1=tf[lb4_flag][3].getText();
					tf2.setText(s1);
					tf[lb4_flag][3].setText(null);
					lb4_flag=lb4_flag+1;
				}
				else
				{
					System.out.println("2");
				}
			}
		}

		else if(ob2==lb5)
		{
			if(!tf2.getText().equals(""))
			{
				//if(lb5_flag==0)
				//{System.out.println("3");}
				//else
				{
				System.out.println("3");
				System.out.println("4");
				String s1=tf2.getText();
				tf[lb5_flag-1][4].setText(s1);
				lb5_flag=lb5_flag-1;tf2.setText("");}

			}
			else
			{
				if(lb5_flag>=0 && lb5_flag<4 )
				{
					System.out.println("1");
					String s1=tf[lb5_flag][4].getText();
					tf2.setText(s1);
					tf[lb5_flag][4].setText(null);
					lb5_flag=lb5_flag+1;
				}
				else
				{
					System.out.println("2");
				}
			}
		}
	}






	public void mouseExited(MouseEvent me){}
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}



	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==btn1)
		{

                        if(flag==0)
			{
				flag=4;
				flag2++;
                        }
		        if(flag2==0)
                        {

				String s1=tf1.getText();
				tf[flag-1][0].setText(s1);
				flag=flag-1;tf1.setText(null);


			}

			if(flag2==1)
                        {

				String s1=tf1.getText();
				tf[flag-1][1].setText(s1);
				flag=flag-1;tf1.setText(null);

			}

			if(flag2==2)
                        {

				String s1=tf1.getText();
				tf[flag-1][2].setText(s1);
				flag=flag-1;tf1.setText(null);

			}

			if(flag2==3)
                        {

				String s1=tf1.getText();
				tf[flag-1][3].setText(s1);
				flag=flag-1;tf1.setText(null);

			}

			if(flag2==4)
                        {


				tf[flag-1][4].setText("");
				tf[flag-2][4].setText("");
				tf[flag-3][4].setText("");
				tf[flag-4][4].setText("");


			}


	}

		if(ob==btn2)
		{b_lb3.setText("HURRAH..!!YOU WON!!!"); b_lb3.setBackground(Color.orange);}

}

	public static void main(String arg[])
	{
		Font f=new Font("Arial",Font.BOLD,20);
		ColorSequencePuzzle ed4=new ColorSequencePuzzle();
		ed4.setFont(f);
		ed4.setBackground(new Color(253,10,91));
		ed4.setSize(1150,500);
		ed4.setVisible(true);
	}
}
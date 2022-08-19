
package april;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
class Converter {
	//for the converter
   private double input;
   public Converter()
   {
	   input = Double.NaN;
   }
   public Converter(double input) {
	this.input = input;
	}
	double get()
	{
		return input;
	}
	void set(double input)
	{
		this.input= input;
	}
	double convert()
	{
		return input;
	}
} 
 class Temperature extends Converter{
	
	 public Temperature(double input)
	 {
		 super(input);
	 }
	 @Override
	 double convert()
	 {
		 if(super.get()==Double.NaN)
			 return Double.NaN;
		 double answer =((super.get ()-32)*5)/9;
		 return answer;
	 }
 }
  class Height extends Converter
 
  {
	  public Height(double Input)
	  {
		  super(Input);
	  }
	  double convert()
	  {
		  if(super.get()== Double.NaN)
			  return Double.NaN;
		double answer= ((super.get())*30.48);
		  return answer;
	  }
  }
  class Distance extends Converter{
	
	
		 public Distance(double input)
		 {
			 super(input);
		 }
		 double convert()
		 {
			 if(super.get()==Double.NaN)
				 return Double.NaN;
			 double answer =((super.get ()* 0.621371));
			 return answer;
			 
		 }
	 }
  class Weight extends Converter{
	

		
		 public Weight(double input)
		 {
			 super(input);
		 }
		 double convert()
		 {
			 if(super.get()==Double.NaN)
				 return Double.NaN;
			 double answer =((super.get ()* 2.20462262));
			 return answer;
			 
		 }
	 }
  //
  public class AJ{
	  public static void main(String[]args) {
	
		
		  JLabel label = new JLabel("");
		  JPanel panel= new JPanel();
		  JFrame frame= new JFrame("converter");
		  
		    //height
		    JFrame f3 = new JFrame();
		    Icon icon3 = new ImageIcon("height.jpg");    
		    JButton height= new JButton("Height",icon3);  
		    height.setVerticalTextPosition(SwingConstants.BOTTOM);
		    height.setHorizontalTextPosition(SwingConstants.CENTER);
		    height.setBounds(100,300,200,100);  
		    f3.add(height);  
		    f3.setSize(300,250);  
		    f3.setLayout(null);  
		    f3.setVisible(false);  
		    f3.setResizable(false);
		    f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 //temperature
		    JFrame f2 = new JFrame();
		    Icon icon2 = new ImageIcon("temp.jpg");    
		  
		    JButton temperature= new JButton("Temperature",icon2); 
		   
		    temperature.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		    temperature.setHorizontalTextPosition(SwingConstants.CENTER);
		    temperature.setBounds(100,300,200,100);  
		    f2.add(temperature);  
		    f2.setSize(300,250);  
		    f2.setLayout(null);  
		    f2.setVisible(false);  
		    f2.setResizable(false);
		    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 //distance
		   JFrame f = new JFrame();
		    Icon icon = new ImageIcon("dist.jpg");    
		   
		    JButton distance= new JButton("Distance",icon); 
		
		    distance.setVerticalTextPosition(SwingConstants.BOTTOM);
		 
		    
		    distance.setHorizontalTextPosition(SwingConstants.CENTER);
		    distance.setBounds(100,300,200,100);  
		    f.add(distance);  
		    f.setSize(200,100);  
		    f.setLayout(null);  
		    f.setVisible(false);  
		    f.setResizable(false);
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   JButton distance1= new JButton("distance");
		   distance1.setBackground(Color.GRAY);
		   distance1.setForeground(Color.BLUE);	   
		   //weight 
		    JFrame f1 = new JFrame();
		    Icon icon1 = new ImageIcon("weight.jpg");    
		    JButton weight= new JButton("Weight",icon1);
		    weight.setVerticalTextPosition(SwingConstants.BOTTOM);
		    weight.setHorizontalTextPosition(SwingConstants.CENTER);
		    weight.setBounds(100,300,200,100);  
		    f1.add(weight);  
		    f1.setSize(300,250);  
		    f1.setLayout(null);  
		    f1.setVisible(false);  
		    f1.setResizable(false);
		    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      
		  //exit
		  JButton exit= new JButton("Exit");
		 //gui presentation
		  panel.setLayout(new BorderLayout());	
		  panel.add(height,BorderLayout.NORTH);
		  panel.add(temperature,BorderLayout.CENTER);
		  panel.add(exit,BorderLayout.SOUTH);
		  panel.add(distance,BorderLayout.WEST);
		  panel.add(weight,BorderLayout.EAST);
		   //single panel add converter border layout center 
		  ImageIcon image = new ImageIcon("LOGO1.jpg");
		  frame.setLayout(new BorderLayout(100,20));
		  frame.setIconImage(image.getImage());
 		  frame.add(panel);
 		  frame.setVisible(true);
		  frame.setResizable(false);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500,500);
		  frame.getContentPane().setBackground(Color.BLUE);
		  frame.setVisible(true);
		  frame.add(label);
		  frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		  frame.add(panel);

		 
	     
	      //after input sa number ni user diri ang mag show sa result
		 
	      height.addActionListener (new ActionListener(){	
				@Override
				public void actionPerformed(ActionEvent task) {
					  String input= (String)JOptionPane.showInputDialog(frame,"Input number in feet");
				      Converter c= new Height(Double.parseDouble(input));
				      double result = c.convert();
				      JOptionPane.showMessageDialog(frame,input+ " feet is equals to "+ result+ " cm");	
				      DecimalFormat df = new DecimalFormat("0.00");
				      System.out.println(df.format(result));
				}
			  });
		  distance.addActionListener (new ActionListener(){	
			@Override
			public void actionPerformed(ActionEvent task) {
				  String input= (String)JOptionPane.showInputDialog(frame,"Input number in kilometers");
			      Converter c= new Distance(Double.parseDouble(input));
			      double result  = c.convert();
			      JOptionPane.showMessageDialog(frame,input+ " km is equals to "+ result+ " miles");	
			      DecimalFormat df1 = new DecimalFormat("0.00");
			      System.out.println(df1.format(result));
			}
		  });
	
		  temperature.addActionListener (new ActionListener(){	 
			@Override
			public void actionPerformed(ActionEvent task) {
				  {
		 String input= (String)JOptionPane.showInputDialog(frame,"Input number in °F");
		 Converter c= new Temperature(Double.parseDouble(input));
		 double result = c.convert();
	     JOptionPane.showMessageDialog(frame,input +" fahrenheit is equals to "+  result+  " celcius");
		 //DecimalFormat df2 = new DecimalFormat("0.00");
		 DecimalFormat FORMATTER = new DecimalFormat("0.00");
	     System.out.println(FORMATTER.format(result));
			  }				
		   }
	    });	  
		weight.addActionListener (new ActionListener(){	 
		@Override
		public void actionPerformed(ActionEvent task) {
	    {
        String input= (String)JOptionPane.showInputDialog(frame,"Input number in kilo's");
		Converter c= new Weight(Double.parseDouble(input));
	    double result = c.convert();
		JOptionPane.showMessageDialog(frame,input+" kilo's is equals to "+result+" pounds");
		DecimalFormat LAG = new DecimalFormat("0.00");
		System.out.println(LAG.format(result));
				 }				
			}
				  	
		  });	
		exit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent task) {
		frame.dispose();
			  }
		  });
	  }
  }

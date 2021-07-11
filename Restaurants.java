import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.colorchooser.ColorChooserComponentFactory;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Restaurants {

	private JFrame frame;
	private JTextField jtxtJB;
	private JTextField jtxtJBM;
	private JTextField jtxtJCB;
	private JTextField textField_4;
	private JTextField jtxtQty;
	private JTextField textField_6;
	private JComboBox jcmbSAD;
	
	double[] i=new double[5];
	
	double	USA_Dollar=0.016;
	double	Nigerian_Naira=4.91;
	double 	Aus_Dollar=0.019;
	double	Canadian_Dollar=0.019;
	double	India_Rs=1;
	double	Indonesian_Rupiah=207.63;
	double	SouthAfrican_Rand=.21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(0, 0, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 5));
		panel.setBounds(75, 120, 248, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblJainBurger = new JLabel("Jain Burger");
		lblJainBurger.setForeground(Color.GRAY);
		lblJainBurger.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblJainBurger.setBounds(10, 25, 80, 20);
		panel.add(lblJainBurger);
		
		JLabel label = new JLabel("Jain Burger Meal");
		label.setForeground(Color.GRAY);
		label.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label.setBounds(10, 56, 125, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Jain Cheese Burger");
		label_1.setForeground(Color.GRAY);
		label_1.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_1.setBounds(10, 87, 140, 20);
		panel.add(label_1);
		
		jtxtJB = new JTextField();
		jtxtJB.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtJB.setBounds(152, 28, 86, 20);
		panel.add(jtxtJB);
		jtxtJB.setColumns(10);
		
		jtxtJBM = new JTextField();
		jtxtJBM.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtJBM.setColumns(10);
		jtxtJBM.setBounds(152, 59, 86, 20);
		panel.add(jtxtJBM);
		
		jtxtJCB = new JTextField();
		jtxtJCB.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtJCB.setColumns(10);
		jtxtJCB.setBounds(152, 90, 86, 20);
		panel.add(jtxtJCB);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setForeground(Color.GRAY);
		lblDrink.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblDrink.setBounds(10, 118, 46, 20);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setForeground(Color.GRAY);
		lblQty.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		lblQty.setBounds(162, 118, 46, 20);
		panel.add(lblQty);
		
		jtxtQty = new JTextField();
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(152, 142, 86, 20);
		panel.add(jtxtQty);
		
		JCheckBox jchckbxTax = new JCheckBox("Tax");
		jchckbxTax.setBounds(152, 165, 86, 23);
		panel.add(jchckbxTax);
		
		JCheckBox jchckbxHomeDelivery = new JCheckBox("Home Delivery");
		jchckbxHomeDelivery.setBounds(10, 165, 97, 23);
		panel.add(jchckbxHomeDelivery);
		
		jcmbSAD = new JComboBox();
		jcmbSAD.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink", "Apple Juice", "Tea", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange", "Banana Shake", "Pineapple Shake", "Jain Juice"}));
		jcmbSAD.setBounds(10, 142, 107, 20);
		panel.add(jcmbSAD);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 118, 228, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLUE, 5));
		panel_1.setBounds(333, 120, 263, 195);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCO = new JComboBox();
		jcmbCO.setModel(new DefaultComboBoxModel(new String[] {"Choose One....", "USA", "Nigeria", "Australia", "Canada", "India", "Indonesia", "SouthAfrica"}));
		jcmbCO.setBounds(76, 23, 107, 20);
		panel_1.add(jcmbCO);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setBounds(76, 78, 107, 28);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double Indian_Rs=Double.parseDouble(textField_6.getText());
				if(jcmbCO.getSelectedItem().equals("USA"))
				{
					String cConvert1=String.format("$ %.2f",Indian_Rs*USA_Dollar);
					textField_6.setText(cConvert1);
				}
				if(jcmbCO.getSelectedItem().equals("Nigeria"))
				{
					String cConvert2=String.format("N %.2f",Indian_Rs*Nigerian_Naira);
					textField_6.setText(cConvert2);
				}
				if(jcmbCO.getSelectedItem().equals("Australia"))
				{
					String cConvert3=String.format("$ %.2f",Indian_Rs*Aus_Dollar);
					textField_6.setText(cConvert3);
				}
				if(jcmbCO.getSelectedItem().equals("Canada"))
				{
					String cConvert4=String.format("$ %.2f",Indian_Rs*Canadian_Dollar);
					textField_6.setText(cConvert4);
				}
				if(jcmbCO.getSelectedItem().equals("India"))
				{
					String cConvert5=String.format("Rs %.2f",Indian_Rs*India_Rs);
					textField_6.setText(cConvert5);
				}
				if(jcmbCO.getSelectedItem().equals("Indonesia"))
				{
					String cConvert6=String.format("SEN %.2f",Indian_Rs*Indonesian_Rupiah);
					textField_6.setText(cConvert6);
				}
				if(jcmbCO.getSelectedItem().equals("SouthAfrica"))
				{
					String cConvert6=String.format("R %.2f",Indian_Rs*SouthAfrican_Rand);
					textField_6.setText(cConvert6);
				}
				
			}
		});
		jbtnConvert.setBounds(27, 142, 89, 23);
		panel_1.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Clear");
		jbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_6.setText(null);
				jcmbCO.setSelectedItem("Choose One....");
			}
		});
		jbtnClose.setBounds(142, 142, 89, 23);
		panel_1.add(jbtnClose);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLUE, 5));
		panel_2.setBounds(75, 326, 248, 201);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("Cost Of Drinks");
		label_2.setForeground(Color.GRAY);
		label_2.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_2.setBounds(10, 41, 108, 20);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Cost Of Meals");
		label_3.setForeground(Color.GRAY);
		label_3.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_3.setBounds(10, 89, 125, 20);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Cost Of Delivery");
		label_4.setForeground(Color.GRAY);
		label_4.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_4.setBounds(10, 133, 113, 20);
		panel_2.add(label_4);
		
		JLabel jlblCostOfDrinks = new JLabel("");
		jlblCostOfDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrinks.setBounds(145, 41, 94, 20);
		jlblCostOfDrinks.setBorder(new LineBorder(Color.BLACK, 2));
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeals = new JLabel("0");
		jlblCostOfMeals.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeals.setBorder(new LineBorder(Color.BLACK, 2));
		jlblCostOfMeals.setBounds(145, 89, 94, 20);
		panel_2.add(jlblCostOfMeals);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setBorder(new LineBorder(Color.BLACK, 2));
		jlblCostOfDelivery.setBounds(144, 133, 94, 20);
		panel_2.add(jlblCostOfDelivery);
		panel_2.setBounds(75, 326, 248, 201);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.BLUE, 5));
		panel_3.setBounds(333, 326, 263, 201);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_7 = new JLabel("Tax (Rs.)");
		label_7.setForeground(Color.GRAY);
		label_7.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_7.setBounds(10, 39, 108, 20);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("Sub Total (Rs.)");
		label_8.setForeground(Color.GRAY);
		label_8.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_8.setBounds(10, 87, 125, 20);
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel("Total (Rs.)");
		label_9.setForeground(Color.GRAY);
		label_9.setFont(new Font("Nirmala UI", Font.BOLD, 15));
		label_9.setBounds(10, 131, 113, 20);
		panel_3.add(label_9);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setBorder(new LineBorder(Color.BLACK, 2));
		jlblTax.setBounds(145, 39, 108, 20);
		panel_3.add(jlblTax);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setBorder(new LineBorder(Color.BLACK, 2));
		jlblSubTotal.setBounds(145, 87, 108, 20);
		panel_3.add(jlblSubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setBorder(new LineBorder(Color.BLACK, 2));
		jlblTotal.setBounds(144, 131, 109, 20);
		panel_3.add(jlblTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.BLUE, 5));
		panel_4.setBounds(75, 536, 806, 114);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double JainBurger=Double.parseDouble(jtxtJB.getText());
				double iJainBurger=60;      
				double Burger=(JainBurger * iJainBurger);
				String jb=String.format("%.2f", Burger);
				jlblCostOfMeals.setText(jb);
				
				double JainBurgerMeal=Double.parseDouble(jtxtJBM.getText());
				double iJainBurgerMeal=150;
				double BurgerMeal=(JainBurgerMeal * iJainBurgerMeal);
				String jBMeal=String.format("%.2f", BurgerMeal+Burger);
				jlblCostOfMeals.setText(jBMeal);
				
				double JainCheeseBurger=Double.parseDouble(jtxtJCB.getText());
				double iJainCheeseBurger=80;
				double BurgerCheese=(JainBurger * iJainBurger);
				String jcB=String.format("%.2f", BurgerCheese+BurgerMeal+Burger);
				jlblCostOfMeals.setText(jcB);
				
				//--------------------------------Home Delivery------------------------------------------------------
				double iDelivery=30;
				if(jchckbxHomeDelivery.isSelected())
				{
					String pDelivery=String.format("%.2f", iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				else
				{
					jlblCostOfDelivery.setText("0");
				}
				//-------------------------------------Drinks---------------------------------------------------------
				double Drinks=Double.parseDouble(jtxtQty.getText());
				double Apple_Juice=30*Drinks;
				double Tea=10*Drinks;
				double Coca_Cola=12*Drinks;
				double Coke=20*Drinks;
				double Coffee=15*Drinks;
				double Ice_Tea=20*Drinks;
				double Ice_Coffee=25*Drinks;
				double Orange=20*Drinks;
				double Banana_Shake=25*Drinks;
				double Pineapple_Shake=25*Drinks;
				double Jain_Juice=50*Drinks;
				
				if(jcmbSAD.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice=String.format("%.2f", Apple_Juice);
					jlblCostOfDrinks.setText(cApple_Juice);
				}
				if(jcmbSAD.getSelectedItem().equals("Tea"))
				{
					String cTea=String.format("%.2f", Tea);
					jlblCostOfDrinks.setText(cTea);
				}
				if(jcmbSAD.getSelectedItem().equals("Coke"))
				{
					String cCoke=String.format("%.2f", Coke);
					jlblCostOfDrinks.setText(cCoke);
				}
				if(jcmbSAD.getSelectedItem().equals("Coffee"))
				{
					String cCoffee=String.format("%.2f", Coffee);
					jlblCostOfDrinks.setText(cCoffee);
				}
				if(jcmbSAD.getSelectedItem().equals("Ice_Tea"))
				{
					String cIce_Tea=String.format("%.2f", Ice_Tea);
					jlblCostOfDrinks.setText(cIce_Tea);
				}
				if(jcmbSAD.getSelectedItem().equals("Ice_Coffee"))
				{
					String cIce_Coffee=String.format("%.2f", Ice_Coffee);
					jlblCostOfDrinks.setText(cIce_Coffee);
				}
				if(jcmbSAD.getSelectedItem().equals("Orange"))
				{
					String cOrange=String.format("%.2f", Orange);
					jlblCostOfDrinks.setText(cOrange);
				}
				if(jcmbSAD.getSelectedItem().equals("Banana_Shake"))
				{
					String cBanana_Shake=String.format("%.2f", Banana_Shake);
					jlblCostOfDrinks.setText(cBanana_Shake);
				}
				if(jcmbSAD.getSelectedItem().equals("Pineapple_Shake"))
				{
					String cPineapple_Shake=String.format("%.2f", Pineapple_Shake);
					jlblCostOfDrinks.setText(cPineapple_Shake);
				}
				if(jcmbSAD.getSelectedItem().equals("Jain_Juice"))
				{
					String cJain_Juice=String.format("%.2f", Jain_Juice);
					jlblCostOfDrinks.setText(cJain_Juice);
				}
				if(jcmbSAD.getSelectedItem().equals("Select a Drink"))
				{
					jlblCostOfDrinks.setText("0");
				}
				
				//======================================TAX Rate==============================
				double cTotal1=Double.parseDouble(jlblCostOfDrinks.getText());
				double cTotal2=Double.parseDouble(jlblCostOfMeals.getText());
				double cTotal3=Double.parseDouble(jlblCostOfDelivery.getText());
				double allTotal=(cTotal1+cTotal2+cTotal3)*(0.18);
				if(jchckbxTax.isSelected())
				{
					String iTotal=String.format("%.2f",allTotal);
					jlblTax.setText(iTotal);
				}
				//============================= Total=========================================
				double cTotal4=Double.parseDouble(jlblTax.getText());
				
				double subTotal=(cTotal1+cTotal2+cTotal3);
				String isubTotal=String.format("%.2f", subTotal);
				jlblSubTotal.setText(isubTotal);
				
				double allTotal1=(cTotal1+cTotal2+cTotal3+cTotal4);
				String iallTotal=String.format("%.2f", allTotal1);
				jlblTotal.setText(iallTotal);
				
			}
		});
		jbtnTotal.setBounds(69, 46, 89, 23);
		panel_4.add(jbtnTotal);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jbtnReceipt.setBounds(262, 46, 89, 23);
		panel_4.add(jbtnReceipt);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrinks.setText(null);
				jlblCostOfMeals.setText("0");
				jlblTax.setText(null);
				jlblSubTotal.setText(null);
				jlblTotal.setText(null);
				jtxtJB.setText(null);
				jtxtJBM.setText(null);
				jtxtJCB.setText(null);
				jtxtQty.setText(null);
				textField_6.setText(null);
				jcmbSAD.setSelectedItem("Select A Drink");
				jcmbCO.setSelectedItem("Choose One....");
				jchckbxHomeDelivery.setSelected(false);
				jchckbxTax.setSelected(false);
				
			}
		});
		jbtnReset.setBounds(461, 46, 89, 23);
		panel_4.add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbtnExit.setBounds(636, 46, 89, 23);
		panel_4.add(jbtnExit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(Color.BLUE, 5));
		panel_5.setBounds(606, 120, 275, 407);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 39, 255, 357);
		panel_5.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 11, 230, 307);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("AYU--RESTRO");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 72));
		lblNewLabel.setBounds(236, 17, 483, 92);
		frame.getContentPane().add(lblNewLabel);
	}
}
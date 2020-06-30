package TheMainProject;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

import DataManager.CarsBeenSaledManager;
import DataManager.DataCarManager;
import DataManager.DataCustomerManager;
import DataManager.DataSender;
import DataManager.SportCarDataManager;
import classes.CArFactory;
import classes.Car;
import classes.CarType;
import classes.Customer;
import classes.Insurance;
import classes.SportCar;
import classes.gearType;

import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;

public class CarSalesProject {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPanel panel1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarSalesProject window = new CarSalesProject();
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

	public CarSalesProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public DataSender Sender = new DataSender();
	private JTextField ComNameTxt;
	private JTextField yearOfPTxt;
	private JTextField IdTXT;
	private JTextField SpeedTXT;
	private JTextField CompTYPTXt;
	private JTextField PriceTXT;
	private JTextField GASTXT;
	private JTextField TankTXT;
	private JTextField ColorTXT;
	private JTextField LedTXT;
	private JTextField SoundTXT;
	private JTextField PadTXT;
	private JTextField LengthTXT;
	private JTextField WeightTXT;
	private JTextField WidthTXT;
	private JTextField AccelrateTXT;
	private JTextField TurboTXT;
	private JTextField IDTEXTF;
	private JTextField LIDTXT;
	private JLabel YOPTEXT;
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 204));
		frame.setBounds(100, 100, 1517, 791);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 160, 1500, 600);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		panel1 = new JPanel();
		layeredPane.add(panel1, "name_1020283939190700");
		panel1.setLayout(null);
		
		JLabel lblFullname = new JLabel("FullName :");
		lblFullname.setBounds(10, 11, 158, 50);
		panel1.add(lblFullname);
		lblFullname.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 32));
		
		textField = new JTextField();
		textField.setBounds(272, 9, 281, 50);
		panel1.add(textField);

		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if(!(Character.isLetter(c) ||  c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE))
				{
					arg0.consume();
				}
				
			}
		});

		textField.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField.setColumns(10);
	
		JLabel lblPhonenumber = new JLabel("PhoneNumber:");
		lblPhonenumber.setBounds(0, 133, 219, 50);
		panel1.add(lblPhonenumber);
		lblPhonenumber.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 32));
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(10, 72, 228, 50);
		panel1.add(lblId);
		lblId.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 32));
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 70, 281, 50);
		panel1.add(textField_1);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c = arg0.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )) {
					arg0.consume();
				}
			}
		});
		textField_1.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 131, 281, 50);
		panel1.add(textField_2);
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField_2.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField_2.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 194, 228, 50);
		panel1.add(lblAge);
		lblAge.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 32));
		
		textField_3 = new JTextField();
		textField_3.setBounds(272, 192, 281, 50);
		panel1.add(textField_3);
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
				
			}
		});
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		JRadioButton ThirdInsurance = new JRadioButton("3rdInsurance");
		ThirdInsurance.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		ThirdInsurance.setBounds(10, 424, 158, 23);
		panel1.add(ThirdInsurance);
		
		JRadioButton FullInsurance = new JRadioButton("Full Insurance");
		FullInsurance.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		FullInsurance.setBounds(10, 450, 158, 23);
		panel1.add(FullInsurance);
		
		
		JRadioButton BasicInsurance = new JRadioButton("BasicInsurance ");
		BasicInsurance.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		BasicInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdInsurance.setSelected(false);
				FullInsurance.setSelected(false);
				BasicInsurance.setSelected(true);
				
			}
		});
		BasicInsurance.setBounds(10, 398, 171, 23);
		panel1.add(BasicInsurance);
		
		FullInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdInsurance.setSelected(false);
				FullInsurance.setSelected(true);
				BasicInsurance.setSelected(false);
				
			}
		});
		ThirdInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThirdInsurance.setSelected(true);
				FullInsurance.setSelected(false);
				BasicInsurance.setSelected(false);
				
			}
		});
		textField_3.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField_3.setColumns(10);
		JLabel lblCreditNumber = new JLabel("Credit Number:");
		lblCreditNumber.setBounds(10, 258, 228, 50);
		panel1.add(lblCreditNumber);
		lblCreditNumber.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 32));
		
		textField_4 = new JTextField();
		textField_4.setBounds(272, 256, 281, 50);
		panel1.add(textField_4);
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		textField_4.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField_4.setColumns(10);
		
		JRadioButton SportCar = new JRadioButton("Sport Car");
		SportCar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		JRadioButton Car = new JRadioButton("Car");
		Car.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel selectAcar = new JLabel("Select A Car");
		selectAcar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		selectAcar.setBounds(694, 133, 230, 56);
		panel1.add(selectAcar);
		
		JScrollBar scrollBar = new JScrollBar();
		
		JButton btnNewButton = new JButton("update information");
		btnNewButton.setBounds(428, 509, 401, 66);
		panel1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int Age =0 ; 
				String FullName=null , ID=null , PhoneNumber=null ,CreditCard=null,Address = null;
				Insurance C = Insurance.getInstance();
				int Ins = C.getBasicInsurance();
				try {
					if(Integer.parseInt(textField_3.getText()) > 24 && textField_1.getText().length() == 9 && textField_2.getText().length() == 10 &&
							!selectAcar.getText().equals("Select A Car") && !selectAcar.getText().equals("NO Sport Cars In the Garage") &&  !selectAcar.getText().equals("NO  Cars In the Garage") ) {
					FullName = new String(textField.getText());
					ID = new String(textField_1.getText());
					PhoneNumber = new String(textField_2.getText());
					CreditCard =new String(textField_4.getText());
					Age = Integer.parseInt(textField_3.getText());
					Address = new String(textField_5.getText());
					String CarId = new String(selectAcar.getText());
					if(ThirdInsurance.isSelected()) {
						Ins = C.thirdInsurance();
					}else if(FullInsurance.isSelected()) {
						Ins = C.allInsurance();
					}

					
					if(SportCar.isSelected()) {
						
						SportCar S2 = SportCarDataManager.ReturnTheCar(CarId);
						
						Customer S1 =new Customer(Age ,FullName,PhoneNumber,CreditCard,ID,Address,CarId,S2.GetCost() + Ins,CarType.regularcar,Integer.parseInt(CarId));
						Sender.setDataCustomer(S1);
						Sender.Notify();
						SportCarDataManager.removeACar(CarId);
						CarsBeenSaledManager.WriteIntoFile(CarId);
						ResetCustomerFields();
					}
					else if(Car.isSelected()) {
						Car S2 = DataCarManager.ReturnTheCar(CarId);
						Customer S1 =new Customer(Age ,FullName,PhoneNumber,CreditCard,ID,Address,CarId,S2.GetCost()+ Ins,CarType.regularcar,Integer.parseInt(CarId));
						Sender.setDataCustomer(S1);
						Sender.Notify();
						DataCarManager.removeACar(CarId);
						ResetCustomerFields();
						CarsBeenSaledManager.WriteIntoFile(CarId);
					}
					JOptionPane.showMessageDialog(frame, "update Complete");
					selectAcar.setText("Select A Car");
					scrollBar.setValue(0);
					}
					else {
						JOptionPane.showMessageDialog(frame, "please enetr Age greater than 24 \nID == 9digits\nPhoneNumber == 10 digits  And Pick A Car ","uncorrect information ", JOptionPane.ERROR_MESSAGE);
						selectAcar.setText("Select A Car");
					}
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame, "please enetr Age greater than 24 \nID == 9digits\nPhoneNumber == 10 digits","uncorrect information ", JOptionPane.ERROR_MESSAGE);
					selectAcar.setText("Select A Car");
				}
			}
		});
		btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		lblAddress.setBounds(10, 319, 219, 72);
		panel1.add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 37));
		textField_5.setColumns(10);
		textField_5.setBounds(272, 330, 281, 50);
		panel1.add(textField_5);
		
		

		Car.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SportCar.setSelected(false);
				Car.setSelected(true);
			}
		});
		
		SportCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SportCar.setSelected(true);
				Car.setSelected(false);
			}
		});
		SportCar.setBounds(596, 99, 140, 23);
		panel1.add(SportCar);
		
	
		Car.setBounds(738, 99, 158, 23);
		panel1.add(Car);
		
		JLabel lblCarid = new JLabel("Car ID:");
		lblCarid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarid.setBounds(627, 135, 57, 50);
		panel1.add(lblCarid);
		
		JLabel CompanyName = new JLabel("");
		CompanyName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CompanyName.setBounds(627, 194, 297, 66);
		panel1.add(CompanyName);
		
		JLabel CompanyType = new JLabel("");
		CompanyType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CompanyType.setBounds(627, 258, 297, 66);
		panel1.add(CompanyType);
		
		JLabel Speed = new JLabel("");
		Speed.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Speed.setBounds(627, 314, 297, 66);
		panel1.add(Speed);

		
		
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				try {
				if(SportCar.isSelected()) {
					ArrayList<SportCar> Sp = new ArrayList<SportCar>();
					Sp = SportCarDataManager.ReadFromFile();
					if(Sp.size()  ==  0 ) {
						selectAcar.setText("NO Sport Cars In the Garage");
						CompanyName.setText(null);
						CompanyType.setText(null);
						Speed.setText(null);
					}
					else {
					SportCar C = Sp.get(scrollBar.getValue() % Sp.size());
					selectAcar.setText(C.CarId());
					CompanyName.setText("Company Name: "+C.CompanyName());
					CompanyType.setText("Company Type: "+C.CompanyKind());
					Speed.setText("Speed : " + C.GetSpeed());
					}
				}
				else if (Car.isSelected()){
					ArrayList<Car> Sp = new ArrayList<Car>();
					Sp = DataCarManager.ReadFromFile();
					if(Sp.size()  ==  0 ) {
						selectAcar.setText("NO  Cars In the Garage");
						CompanyName.setText(null);
						CompanyType.setText(null);
						Speed.setText(null);
					}
					else {
					Car C = Sp.get(scrollBar.getValue() % Sp.size());
					selectAcar.setText(C.CarId());
					CompanyName.setText("Company Name: "+C.CompanyName());
					CompanyType.setText("Company Type: "+C.CompanyKind());
					Speed.setText("Speed : " + C.GetSpeed());					
					}
					
				}
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		scrollBar.setBounds(596, 133, 27, 56);
		panel1.add(scrollBar);
		
		JLabel lblChooseACar = new JLabel("Choose A Car  Informatons :");
		lblChooseACar.setFont(new Font("Lucida Fax", Font.BOLD | Font.ITALIC, 18));
		lblChooseACar.setBounds(641, 33, 372, 34);
		panel1.add(lblChooseACar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\Adding Customer Icon.png"));
		label.setBounds(934, 47, 526, 482);
		panel1.add(label);
		

		

		

		
		JPanel panel2 = new JPanel();
		layeredPane.add(panel2, "name_1020321654805838");
		
		JLabel lblCarname = new JLabel("Company Name:");
		lblCarname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarname.setBounds(0, 159, 144, 68);
		
		JLabel lblYear = new JLabel("Year Of Production:");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblYear.setBounds(0, 238, 172, 68);
		
		JLabel lblId_1 = new JLabel("License Plate  : ");
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblId_1.setBounds(0, 317, 144, 68);
		
		JLabel lblSpped = new JLabel("Max Speed: ");
		lblSpped.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpped.setBounds(0, 398, 144, 68);
		
		JLabel lblAdingANew = new JLabel("Adding A new Car ");
		lblAdingANew.setBounds(489, 0, 358, 68);
		lblAdingANew.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 36));
		
		
		JRadioButton selectManual = new JRadioButton("Manual");
		selectManual.setFont(new Font("Tahoma", Font.BOLD, 16));

		selectManual.setBounds(10, 129, 109, 23);
		JRadioButton SelectSport = new JRadioButton("Sport");
		SelectSport.setFont(new Font("Tahoma", Font.BOLD, 16));
		JRadioButton Selectregular = new JRadioButton("Regular");
		Selectregular.setFont(new Font("Tahoma", Font.BOLD, 14));
		JRadioButton SelectAutomatic = new JRadioButton("Automatic");
		SelectAutomatic.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		SelectAutomatic.setToolTipText("");
		SelectAutomatic.setBounds(10, 103, 109, 23);
		Selectregular.setBounds(175, 103, 109, 23);
		SelectSport.setBounds(175, 129, 109, 23);
		
		SelectAutomatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectAutomatic.setSelected(true);
				selectManual.setSelected(false);
			}
		});
		
		selectManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectAutomatic.setSelected(false);
				selectManual.setSelected(true);
			}
		});
		Selectregular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectregular.setSelected(true);
				SelectSport.setSelected(false);
			}
		});

		SelectSport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Selectregular.setSelected(false);
				SelectSport.setSelected(true);
			}
		});
		panel2.setLayout(null);
		panel2.add(lblCarname);
		panel2.add(lblYear);
		panel2.add(lblId_1);
		panel2.add(lblSpped);
		panel2.add(lblAdingANew);
		panel2.add(selectManual);
		panel2.add(SelectAutomatic);
		panel2.add(Selectregular);
		panel2.add(SelectSport);
		
		JLabel lblCargear = new JLabel("Transmission:");
		lblCargear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCargear.setBounds(10, 73, 134, 23);
		panel2.add(lblCargear);
		
		JLabel lblCarType = new JLabel("Car Type:");
		lblCarType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarType.setBounds(172, 73, 87, 23);
		panel2.add(lblCarType);
		
		ComNameTxt = new JTextField();
		ComNameTxt.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		ComNameTxt.setBounds(164, 168, 181, 50);
		panel2.add(ComNameTxt);
		ComNameTxt.setColumns(10);
		
		yearOfPTxt = new JTextField();
		yearOfPTxt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		yearOfPTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		yearOfPTxt.setBounds(163, 250, 181, 50);
		panel2.add(yearOfPTxt);
		yearOfPTxt.setColumns(10);
		
		IdTXT = new JTextField();
		IdTXT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		IdTXT.setColumns(10);
		IdTXT.setBounds(164, 335, 181, 50);
		panel2.add(IdTXT);
		
		SpeedTXT = new JTextField();
		SpeedTXT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		SpeedTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
				
			}
		});
		SpeedTXT.setColumns(10);
		SpeedTXT.setBounds(164, 416, 181, 50);
		panel2.add(SpeedTXT);
		
		JLabel lblCompanytype = new JLabel("Model:");
		lblCompanytype.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCompanytype.setBounds(358, 159, 144, 68);
		panel2.add(lblCompanytype);
		
		JLabel lblPrice = new JLabel("Price($):");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrice.setBounds(358, 238, 144, 68);
		panel2.add(lblPrice);
		
		JLabel lblGasforliter = new JLabel("Mileage(Km/L):");
		lblGasforliter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGasforliter.setBounds(358, 317, 144, 68);
		panel2.add(lblGasforliter);
		
		JLabel lblTankCapicity = new JLabel("Tank Capacity(L):");
		lblTankCapicity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTankCapicity.setBounds(358, 398, 144, 68);
		panel2.add(lblTankCapicity);
		
		CompTYPTXt = new JTextField();
		CompTYPTXt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CompTYPTXt.setColumns(10);
		CompTYPTXt.setBounds(512, 168, 181, 50);
		panel2.add(CompTYPTXt);
		
		PriceTXT = new JTextField();
		PriceTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		PriceTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PriceTXT.setColumns(10);
		PriceTXT.setBounds(512, 238, 181, 50);
		panel2.add(PriceTXT);
		
		GASTXT = new JTextField();
		GASTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		GASTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GASTXT.setColumns(10);
		GASTXT.setBounds(512, 317, 181, 50);
		panel2.add(GASTXT);
		
		TankTXT = new JTextField();
		TankTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		TankTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TankTXT.setColumns(10);
		TankTXT.setBounds(512, 398, 181, 50);
		panel2.add(TankTXT);
		
		JLabel lblCarcolor = new JLabel("Color:");
		lblCarcolor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarcolor.setBounds(703, 159, 144, 68);
		panel2.add(lblCarcolor);
		
		JLabel lblLedcompany = new JLabel("Bulb Type:");
		lblLedcompany.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLedcompany.setBounds(703, 238, 144, 68);
		panel2.add(lblLedcompany);
		
		JLabel lblSoundbarcompany = new JLabel("Sound Sys Brand:");
		lblSoundbarcompany.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSoundbarcompany.setBounds(703, 317, 144, 68);
		panel2.add(lblSoundbarcompany);
		
		JLabel lblPadcompany = new JLabel("Seats Type:");
		lblPadcompany.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPadcompany.setBounds(703, 398, 144, 68);
		panel2.add(lblPadcompany);
		
		ColorTXT = new JTextField();
		ColorTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ColorTXT.setColumns(10);
		ColorTXT.setBounds(857, 168, 181, 50);
		panel2.add(ColorTXT);
		
		LedTXT = new JTextField();
		LedTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LedTXT.setColumns(10);
		LedTXT.setBounds(857, 247, 181, 50);
		panel2.add(LedTXT);
		
		SoundTXT = new JTextField();
		SoundTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SoundTXT.setColumns(10);
		SoundTXT.setBounds(857, 326, 181, 50);
		panel2.add(SoundTXT);
		
		PadTXT = new JTextField();
		PadTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PadTXT.setColumns(10);
		PadTXT.setBounds(857, 407, 181, 50);
		panel2.add(PadTXT);
		
		JLabel lblLength = new JLabel("Length(cm):");
		lblLength.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLength.setBounds(0, 477, 144, 68);
		panel2.add(lblLength);
		
		JLabel lblWeight = new JLabel("Weight(Kg):");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeight.setBounds(358, 477, 144, 68);
		panel2.add(lblWeight);
		
		JLabel lblWidth = new JLabel("Width(cm):");
		lblWidth.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWidth.setBounds(698, 477, 144, 68);
		panel2.add(lblWidth);
		
		LengthTXT = new JTextField();
		LengthTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});

		LengthTXT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		LengthTXT.setColumns(10);
		LengthTXT.setBounds(163, 491, 181, 50);
		panel2.add(LengthTXT);
		
		WeightTXT = new JTextField();
		WeightTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
				
			}
		});
		WeightTXT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		WeightTXT.setColumns(10);
		WeightTXT.setBounds(512, 486, 181, 50);
		panel2.add(WeightTXT);
		
		WidthTXT = new JTextField();
		WidthTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		WidthTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		WidthTXT.setColumns(10);
		WidthTXT.setBounds(857, 491, 181, 50);
		panel2.add(WidthTXT);
		
		JLabel lblAccelrate = new JLabel("Accelration time:");
		lblAccelrate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAccelrate.setBounds(1070, 238, 144, 68);
		panel2.add(lblAccelrate);
		
		JLabel lblTurbo = new JLabel("Horsepower:");
		lblTurbo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTurbo.setBounds(1070, 317, 144, 68);
		panel2.add(lblTurbo);
		
		AccelrateTXT = new JTextField();
		AccelrateTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		AccelrateTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		AccelrateTXT.setColumns(10);
		AccelrateTXT.setBounds(1207, 247, 181, 50);
		panel2.add(AccelrateTXT);
		
		TurboTXT = new JTextField();
		TurboTXT.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
					e.consume();
				}
			}
		});
		TurboTXT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TurboTXT.setColumns(10);
		TurboTXT.setBounds(1207, 326, 181, 50);
		panel2.add(TurboTXT);
		
		JLabel lblForSportCars = new JLabel("For Sport Cars:");
		lblForSportCars.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblForSportCars.setBounds(1070, 159, 227, 68);
		panel2.add(lblForSportCars);
		
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = null , CompanyName = null ,CompanyT= null , led = null , sound= null , pad = null , color =null;
				int speed=0 , year=0, price =0 ,tank=0  ,gazliter = 0;
				float len =0 , weight = 0 , wid = 0 ;
				 CArFactory F = new CArFactory();
					try {
					if((Selectregular.isSelected() || SelectSport.isSelected()) && (SelectAutomatic.isSelected() || selectManual.isSelected()) && DataCarManager.ReturnTheCar(IdTXT.getText()) == null && SportCarDataManager.ReturnTheCar(IdTXT.getText()) == null && 
							CarsBeenSaledManager.LicenseExist(IdTXT.getText()) == false) {
						id = new String(IdTXT.getText());
						CompanyName = new String(ComNameTxt.getText());
						CompanyT = new String(CompTYPTXt.getText());
						led =new String(LedTXT.getText());
						sound = new String(SoundTXT.getText());
						pad  = new String(PadTXT.getText());
						color = new String(ColorTXT.getText());
						speed = Integer.parseInt(SpeedTXT.getText());
						year = Integer.parseInt(yearOfPTxt.getText());
						price = Integer.parseInt(PriceTXT.getText());
						tank = Integer.parseInt(TankTXT.getText());
						len = Float.parseFloat(LengthTXT.getText());
						weight = Float.parseFloat(WeightTXT.getText());
						wid = Float .parseFloat(WidthTXT.getText());
						gazliter = Integer.parseInt(GASTXT.getText());
						
						if(SelectAutomatic.isSelected()) {
							if(SelectSport.isSelected()) {
								Sender.setSpCar(F.CreateASportCar(speed, year,price, id, gazliter, len, wid, weight, CompanyName, CompanyT, gearType.Manual, tank, color, led, sound, pad, Integer.parseInt(TurboTXT.getText()), Integer.parseInt(AccelrateTXT.getText())));
								Sender.Notify();
								Success();
							}else {
								Sender.setDataVechile(F.createACar(speed, year,price, id, gazliter, len, wid, weight, CompanyName, CompanyT, gearType.Manual, tank, color, led, sound, pad));
								Sender.Notify();
								Success();
							}
						}else if (selectManual.isSelected()){
							if(SelectSport.isSelected()) {

								Sender.setSpCar(F.CreateASportCar(speed, year,price, id, gazliter, len, wid, weight, CompanyName, CompanyT, gearType.Manual, tank, color, led, sound, pad, Integer.parseInt(TurboTXT.getText()), Integer.parseInt(AccelrateTXT.getText())));
								Sender.Notify();					
								Success();
							}else {
								Sender.setDataVechile(F.createACar(speed, year,price, id, gazliter, len, wid, weight, CompanyName, CompanyT, gearType.Manual, tank, color, led, sound, pad));
								Sender.Notify();
								Success();
								
							}
						}else {
							JOptionPane.showMessageDialog(null,"Eneter Car Gear Type");
						}
					}else {
						JOptionPane.showMessageDialog(null , "Car Already exist or You didnt Select Car Type Or Car Gear Type");

					}

					
				}catch(Exception l) {
					JOptionPane.showMessageDialog(null, "Fill All the Fields");

				
				}
			}
		});


		
		btnNewButton_2.setFont(new Font("Snap ITC", Font.PLAIN, 40));
		btnNewButton_2.setBounds(1088, 424, 327, 99);
		panel2.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("__________________________________________________________");
		lblNewLabel_8.setBounds(480, 54, 397, 14);
		panel2.add(lblNewLabel_8);
		
		JPanel panel3 = new JPanel();
		layeredPane.add(panel3, "name_1030826522035294");
		panel3.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("Sport Car");
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		radioButton.setBounds(43, 111, 140, 23);
		panel3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Car");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton_1.setSelected(true);
				radioButton.setSelected(false);
			}
		});
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton_1.setSelected(false);
				radioButton.setSelected(true);
			}
		});
		
		
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioButton_1.setBounds(185, 111, 158, 23);
		panel3.add(radioButton_1);
		
		JLabel IDCAR = new JLabel("Select A Car");
		IDCAR.setForeground(Color.RED);
		IDCAR.setBackground(UIManager.getColor("Button.background"));
		IDCAR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		IDCAR.setBounds(88, 144, 560, 56);
		panel3.add(IDCAR);
		
		
		

		JLabel label_1 = new JLabel("Car");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(10, 146, 37, 50);
		panel3.add(label_1);
		
		JLabel CompanyN = new JLabel("");
		CompanyN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CompanyN.setBounds(88, 206, 560, 66);
		panel3.add(CompanyN);
		
		JLabel ComT = new JLabel("");
		ComT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ComT.setBounds(88, 270, 560, 66);
		panel3.add(ComT);
		
		JLabel SpeedI = new JLabel("");
		SpeedI.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SpeedI.setBounds(88, 342, 560, 66);
		panel3.add(SpeedI);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(54, 139, 27, 56);
		panel3.add(scrollBar_1);
		scrollBar_1.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				try {
				if(radioButton.isSelected()) {
					ArrayList<SportCar> Sp = new ArrayList<SportCar>();
					Sp = SportCarDataManager.ReadFromFile();
					if(Sp.size()  ==  0 ) {
						IDCAR.setText("NO Sport Cars In the Garage");
						CompanyN.setText(null);
						ComT.setText(null);
						SpeedI.setText(null);
					}
					else {
					SportCar C = Sp.get(scrollBar_1.getValue() % Sp.size());
					IDCAR.setText(C.CarId());
					CompanyN.setText("Company Name: "+C.CompanyName());
					ComT.setText("Company Type: "+C.CompanyKind());
					SpeedI.setText("Speed : " + C.GetSpeed());
					}
				}
				else if (radioButton_1.isSelected()){
					ArrayList<Car> Sp = new ArrayList<Car>();
					Sp = DataCarManager.ReadFromFile();
					if(Sp.size()  ==  0 ) {
						IDCAR.setText("NO  Cars In the Garage");
						CompanyN.setText(null);
						ComT.setText(null);
						SpeedI.setText(null);
					}
					else {
					Car C = Sp.get(scrollBar_1.getValue() % Sp.size());
					IDCAR.setText(C.CarId());
					CompanyN.setText("Company Name: "+C.CompanyName());
					ComT.setText("Company Type: "+C.CompanyKind());
					SpeedI.setText("Speed" + C.GetSpeed());					
					}
					
				}
				}catch(Exception l) {
					l.printStackTrace();
				}
			}
			
		});


		
		JButton btnNewButton_3 = new JButton("REMOVE THE CAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioButton.isSelected() && IDCAR.getText() != null) {//delete Sport Car
					SportCarDataManager.removeACar(IDCAR.getText());
					JOptionPane.showMessageDialog(null,"Delete Complete");

				}else if (radioButton_1.isSelected() && IDCAR.getText() != null) {
					DataCarManager.removeACar(IDCAR.getText());
					JOptionPane.showMessageDialog(null,"Delete Complete");
				}else {
					JOptionPane.showMessageDialog(null,"No Cars To Delete");
				}
				
				IDCAR.setText(null);
				CompanyN.setText(null);
				ComT.setText(null);
				SpeedI.setText(null);
			}
		});
		btnNewButton_3.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_3.setBounds(716, 479, 308, 56);
		panel3.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Choose the Car to delete");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(25, 11, 330, 56);
		panel3.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\Delete Icon.jpg"));
		lblNewLabel_6.setBounds(746, 117, 278, 256);
		panel3.add(lblNewLabel_6);
		
		
		
		JPanel panel5 = new JPanel();
		layeredPane.add(panel5, "name_259010444962728");
		panel5.setLayout(null);
		
		
		JLabel DealNumberTXT = new JLabel("");
		JLabel PayedTXT = new JLabel("");
		JLabel AddressTXT = new JLabel("");
		JLabel PhoneNumberTXT = new JLabel("");
		JLabel CreditCardTXT = new JLabel("");
		JLabel FullNameTXT = new JLabel("");
		JLabel FullNameLabel = new JLabel("FullName:");
		IDTEXTF = new JTextField();
		IDTEXTF.setFont(new Font("Tahoma", Font.ITALIC, 16));
		IDTEXTF.setBounds(163, 14, 281, 64);
		panel5.add(IDTEXTF);
		IDTEXTF.setColumns(10);
		JLabel AgeTXT = new JLabel("");
		JLabel lblNewLabel_1 = new JLabel("Insert ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 11, 163, 64);
		panel5.add(lblNewLabel_1);
		JLabel IDTEXT = new JLabel("");
		JButton btnNewButton_5 = new JButton("Search");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Customer> S = new ArrayList<Customer>();
				S = DataCustomerManager.ReadFromFile();
				String ID ; 
				int flag = 0 ;
				try {
					
					ID = new String(IDTEXTF.getText());
					if(ID.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter ID to locate Customer");
						return;
					}
					for(Customer C : S) {
						if(C.getID().equals(ID)) {
							flag = 1 ;
							IDTEXT.setText(ID);
							FullNameTXT.setText(C.getFullName());
							AgeTXT.setText(""+C.getAge());
							CreditCardTXT.setText(C.getCreditCard());
							PhoneNumberTXT.setText(C.getPhoneNumber());
							AddressTXT.setText(C.getAddress());
							DealNumberTXT.setText(""+C.getCustomerNumber());
							PayedTXT.setText(""+C.GetDealCost());
						}
					
					}	if(flag != 1) {
						IDTEXTF.setText(null);
						IDTEXT.setText(null);
						FullNameTXT.setText(null);
						AgeTXT.setText(null);
						CreditCardTXT.setText(null);
						PhoneNumberTXT.setText(null);
						AddressTXT.setText(null);
						DealNumberTXT.setText(null);
						PayedTXT.setText(null);
						JOptionPane.showMessageDialog(null,"Customer isnt exist ");
					}
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Enter ID to locate Customer");
				}
				
				
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_5.setBounds(468, 14, 255, 64);
		panel5.add(btnNewButton_5);
		
		
		FullNameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		FullNameLabel.setBounds(10, 190, 163, 64);
		panel5.add(FullNameLabel);
		
		JLabel IDLabel = new JLabel("ID:");
		IDLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		IDLabel.setBounds(10, 122, 163, 64);
		panel5.add(IDLabel);
		
		JLabel PhoneNumberLabel = new JLabel("PhoneNumber:");
		PhoneNumberLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		PhoneNumberLabel.setBounds(10, 265, 163, 64);
		panel5.add(PhoneNumberLabel);
		
		JLabel CreditcardLabel = new JLabel("CreditCard:");
		CreditcardLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		CreditcardLabel.setBounds(10, 340, 163, 64);
		panel5.add(CreditcardLabel);
		
		JLabel AgeLabel = new JLabel("Age:");
		AgeLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		AgeLabel.setBounds(468, 115, 163, 64);
		panel5.add(AgeLabel);
		
		JLabel AddressLabel = new JLabel("Address:");
		AddressLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		AddressLabel.setBounds(468, 190, 163, 64);
		panel5.add(AddressLabel);
		
		JLabel PayedLabel = new JLabel("Payed:");
		PayedLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		PayedLabel.setBounds(468, 264, 163, 64);
		panel5.add(PayedLabel);
		
		JLabel DealNumberLabel = new JLabel("DealNumber:");
		DealNumberLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		DealNumberLabel.setBounds(468, 340, 163, 64);
		panel5.add(DealNumberLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\Customer Search.png"));
		lblNewLabel_2.setBounds(954, 14, 536, 536);
		panel5.add(lblNewLabel_2);
		
		
		IDTEXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		IDTEXT.setBounds(163, 115, 238, 57);
		panel5.add(IDTEXT);
		
		
		FullNameTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		FullNameTXT.setBounds(163, 197, 238, 57);
		panel5.add(FullNameTXT);
		
		
		PhoneNumberTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		PhoneNumberTXT.setBounds(163, 272, 238, 57);
		panel5.add(PhoneNumberTXT);
		
		
		CreditCardTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		CreditCardTXT.setBounds(163, 347, 238, 57);
		panel5.add(CreditCardTXT);
		
		
		AgeTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AgeTXT.setBounds(598, 120, 238, 57);
		panel5.add(AgeTXT);
		
		
		AddressTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AddressTXT.setBounds(598, 195, 238, 57);
		panel5.add(AddressTXT);
		
		
		PayedTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		PayedTXT.setBounds(598, 270, 238, 57);
		panel5.add(PayedTXT);
		
	
		DealNumberTXT.setFont(new Font("Times New Roman", Font.BOLD, 18));
		DealNumberTXT.setBounds(598, 347, 238, 57);
		panel5.add(DealNumberTXT);
		
		JPanel panel6 = new JPanel();
		layeredPane.add(panel6, "name_259043515981779");
		panel6.setLayout(null);
		
		JLabel lblInsertLicenseId = new JLabel("Insert License ID :");
		lblInsertLicenseId.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblInsertLicenseId.setBounds(10, 11, 332, 64);
		panel6.add(lblInsertLicenseId);
		
		LIDTXT = new JTextField();
		LIDTXT.setFont(new Font("Tahoma", Font.ITALIC, 16));
		LIDTXT.setColumns(10);
		LIDTXT.setBounds(193, 12, 281, 64);
		panel6.add(LIDTXT);
		

		
		JLabel lblNewLabel_4 = new JLabel("Car LicenseID:");
		lblNewLabel_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(10, 133, 185, 64);
		panel6.add(lblNewLabel_4);
		
		JLabel lblCompanyName = new JLabel("Company Name:");
		lblCompanyName.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblCompanyName.setBounds(10, 208, 185, 64);
		panel6.add(lblCompanyName);
		
		JLabel lblCompanytype_1 = new JLabel("CompanyType:");
		lblCompanytype_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblCompanytype_1.setBounds(10, 283, 185, 64);
		panel6.add(lblCompanytype_1);
		
		JLabel lblMaxSpeed = new JLabel("Max Speed:");
		lblMaxSpeed.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblMaxSpeed.setBounds(10, 358, 185, 64);
		panel6.add(lblMaxSpeed);
		
		JLabel LIDTEXT = new JLabel("");
		LIDTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		LIDTEXT.setBounds(193, 133, 185, 64);
		panel6.add(LIDTEXT);
		
		JLabel CNTEXT = new JLabel("");
		CNTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		CNTEXT.setBounds(193, 208, 185, 64);
		panel6.add(CNTEXT);
		
		JLabel CTTEXT = new JLabel("");
		CTTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		CTTEXT.setBounds(193, 283, 185, 64);
		panel6.add(CTTEXT);
		
		JLabel MTEXT = new JLabel("");
		MTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		MTEXT.setBounds(193, 358, 185, 64);
		panel6.add(MTEXT);
		
		layeredPane.removeAll();
		JPanel panel7 = new JPanel();
		layeredPane.add(panel7, "name_380065582750606");
		panel7.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\dream-car-garage-23.jpg"));
		lblNewLabel_3.setBounds(602, 11, 723, 562);
		panel7.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("Car Sale Management System ");
		lblNewLabel_7.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblNewLabel_7.setBounds(10, 11, 551, 73);
		panel7.add(lblNewLabel_7);
		
		JLabel lblSystemVersion = new JLabel("System Version 1.0");
		lblSystemVersion.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblSystemVersion.setBounds(10, 63, 551, 73);
		panel7.add(lblSystemVersion);
		
		JLabel lblDateOfPublish = new JLabel("Date of Publish 2019 / 05");
		lblDateOfPublish.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblDateOfPublish.setBounds(10, 125, 551, 73);
		panel7.add(lblDateOfPublish);
		
		JLabel lblCreatedByStudents = new JLabel("Created By Students :");
		lblCreatedByStudents.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblCreatedByStudents.setBounds(10, 187, 551, 73);
		panel7.add(lblCreatedByStudents);
		
		JLabel lblAubidaNaalwaId = new JLabel("Aubida Naalwa ID: 318448255");
		lblAubidaNaalwaId.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblAubidaNaalwaId.setBounds(10, 233, 551, 73);
		panel7.add(lblAubidaNaalwaId);
		
		JLabel lblNoorMasarweId = new JLabel("Noor Masarwe ID :318380268");
		lblNoorMasarweId.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblNoorMasarweId.setBounds(10, 281, 551, 73);
		panel7.add(lblNoorMasarweId);
		
		JLabel lblBahaaBaderId = new JLabel("Bahaa Bader ID:208996520");
		lblBahaaBaderId.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblBahaaBaderId.setBounds(10, 337, 551, 73);
		panel7.add(lblBahaaBaderId);
		
		JLabel lblRabeeMansorId = new JLabel("Rabea Mansor ID:209232982");
		lblRabeeMansorId.setFont(new Font("Traditional Arabic", Font.PLAIN, 21));
		lblRabeeMansorId.setBounds(10, 393, 551, 73);
		panel7.add(lblRabeeMansorId);
		layeredPane.repaint();
		layeredPane.revalidate();
		
		JButton btnNewButton_1 = new JButton("ShowCustomerDetails");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel5);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		
		
		btnNewButton_1.setBounds(829, 11, 172, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnAddANew = new JButton("Add A New Car");
		btnAddANew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnAddANew.setBounds(465, 11, 172, 43);
		frame.getContentPane().add(btnAddANew);
		
		JButton RemoveACar = new JButton("Remove A Car");
		RemoveACar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel3);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		RemoveACar.setBounds(647, 11, 172, 43);
		frame.getContentPane().add(RemoveACar);
		
		
		JButton WellcomeButton = new JButton("SALE MANAGMENT");
		WellcomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel1);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		WellcomeButton.setBounds(265, 11, 190, 43);
		frame.getContentPane().add(WellcomeButton);
		
		JButton btnNewButton_4 = new JButton("Home Page");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panel7);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_4.setBounds(65, 11, 190, 43);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnShowcainformation = new JButton("Show Car Information");
		btnShowcainformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel6);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		JLabel lblCarType_1 = new JLabel("Car Type:");
		JLabel lblPrice_1 = new JLabel("Price:");
		JButton SearchB = new JButton("Search");
		JLabel lblYearOfPrudction = new JLabel("Year Of Prudction:");
		JLabel lblGearType = new JLabel("Gear Type:");
		SearchB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SearchB.setBounds(525, 12, 255, 64);
		panel6.add(SearchB);
		
		
		lblPrice_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblPrice_1.setBounds(508, 133, 185, 64);
		panel6.add(lblPrice_1);
		
		
		lblYearOfPrudction.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblYearOfPrudction.setBounds(508, 208, 185, 64);
		panel6.add(lblYearOfPrudction);
		
	
		lblCarType_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblCarType_1.setBounds(508, 283, 185, 64);
		panel6.add(lblCarType_1);
		
		
		lblGearType.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		lblGearType.setBounds(508, 358, 185, 64);
		panel6.add(lblGearType);
		
		JLabel PTEXT = new JLabel("");
		PTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		PTEXT.setBounds(709, 133, 185, 64);
		panel6.add(PTEXT);
		
		YOPTEXT = new JLabel("");
		YOPTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		YOPTEXT.setBounds(709, 208, 185, 64);
		panel6.add(YOPTEXT);
		
		JLabel CARTTEXT = new JLabel("");
		CARTTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		CARTTEXT.setBounds(709, 283, 185, 64);
		panel6.add(CARTTEXT);
		
		JLabel GTTEXT = new JLabel("");
		GTTEXT.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		GTTEXT.setBounds(709, 358, 185, 64);
		panel6.add(GTTEXT);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\Mustang (1).jpg"));
		lblNewLabel_5.setBounds(904, 80, 566, 411);
		panel6.add(lblNewLabel_5);
		
		JPanel panel8 = new JPanel();
		layeredPane.add(panel8, "name_110966366595692");
		panel8.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Profit(Selling Cars $):");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(10, 161, 317, 53);
		panel8.add(lblNewLabel_9);
		
		JLabel lblNumberOfCars = new JLabel("Number Of Cars in the Garage:");
		lblNumberOfCars.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumberOfCars.setBounds(10, 225, 317, 53);
		panel8.add(lblNumberOfCars);
		
		JLabel lblNumberOfDeals = new JLabel("");
		lblNumberOfDeals.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumberOfDeals.setBounds(10, 225, 317, 53);
		panel8.add(lblNumberOfDeals);
		
		JLabel lblNumberOfSold = new JLabel("Number Of Sold Cars:");
		lblNumberOfSold.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNumberOfSold.setBounds(10, 285, 317, 53);
		panel8.add(lblNumberOfSold);
		
		JLabel PROFIT = new JLabel("");
		PROFIT.setFont(new Font("Tahoma", Font.BOLD, 20));
		PROFIT.setBounds(337, 161, 317, 53);
		panel8.add(PROFIT);
		
		JLabel NUMCARS = new JLabel("");
		NUMCARS.setFont(new Font("Tahoma", Font.BOLD, 20));
		NUMCARS.setBounds(337, 225, 317, 53);
		panel8.add(NUMCARS);
		
		JLabel NUMSOLD = new JLabel("");
		NUMSOLD.setFont(new Font("Tahoma", Font.BOLD, 20));
		NUMSOLD.setBounds(337, 285, 317, 53);
		panel8.add(NUMSOLD);
		
		JLabel lblGarageInformations = new JLabel("Garage informations");
		lblGarageInformations.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		lblGarageInformations.setBounds(570, 11, 206, 53);
		panel8.add(lblGarageInformations);
		
		JLabel label_5 = new JLabel("____________________________");
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 23));
		label_5.setBounds(502, 23, 448, 53);
		panel8.add(label_5);
		
		JButton btnReloadData = new JButton("Reload Data");
		btnReloadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sum =0 ; 
				ArrayList<Customer> A = new ArrayList<Customer>();
				A = DataCustomerManager.ReadFromFile();
				for(Customer C : A) {
					sum = sum + C.GetDealCost();
				}
				PROFIT.setText("" + sum);
				NUMSOLD.setText(""+CarsBeenSaledManager.numberOfsaledCars());
				NUMCARS.setText(""+(DataCarManager.numberOfRegularCars() + SportCarDataManager.numberOfSportCars()));
			}
		});
		btnReloadData.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 20));
		btnReloadData.setBounds(468, 493, 308, 56);
		panel8.add(btnReloadData);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(System.getProperty("user.dir")+ "\\Project_management_Business_Case-512.png"));
		lblNewLabel_10.setBounds(960, 58, 514, 508);
		panel8.add(lblNewLabel_10);
		
		SearchB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Car C =null ;
				SportCar D=null;
				try {
					C = DataCarManager.ReturnTheCar(LIDTXT.getText());
					D = SportCarDataManager.ReturnTheCar(LIDTXT.getText());
					
					if(LIDTXT.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null,"Insert ID Lisence ");
					}
					else if(C == null && D == null){
						JOptionPane.showMessageDialog(null, "Car Isnt Exist");
					}
					if(C != null) {
						LIDTEXT.setText(C.CarId());
						CNTEXT.setText(C.CompanyName());
						CTTEXT.setText(C.CompanyKind());
						MTEXT.setText(""+C.GetSpeed());
						PTEXT.setText(""+C.GetCarCost());
						YOPTEXT.setText(""+C.GetYearOfpruduction());
						CARTTEXT.setText("Regualr Car");
						GTTEXT.setText("" + C.GetGearType());
					}
					else if(D != null) {
						LIDTEXT.setText(D.CarId());
						CNTEXT.setText(D.CompanyName());
						CTTEXT.setText(D.CompanyKind());
						MTEXT.setText(""+D.GetSpeed());
						PTEXT.setText(""+D.GetCarCost());
						YOPTEXT.setText(""+D.GetYearOfpruduction());
						CARTTEXT.setText("Sport Car");
						GTTEXT.setText("" +D.GetGearType());
					}
					
				}catch(Exception E) {
					JOptionPane.showMessageDialog(null, "there is no data to show ");
				}
				
			}
		});

		
		btnShowcainformation.setBounds(1011, 11, 190, 43);
		frame.getContentPane().add(btnShowcainformation);
		
		JButton btnInformations = new JButton("Informations");
		btnInformations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(panel8);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnInformations.setBounds(1211, 11, 190, 43);
		frame.getContentPane().add(btnInformations);
	}
	public JTextField getTextField_3() {
		return textField_3;
	}
	private void Success() {
		IdTXT.setText(null);
		ComNameTxt.setText(null);
		CompTYPTXt.setText(null);
		LedTXT.setText(null);
		SoundTXT.setText(null);
		PadTXT.setText(null);
		ColorTXT.setText(null);
		yearOfPTxt.setText(null);
		SpeedTXT.setText(null);
		PriceTXT.setText(null);
		TankTXT.setText(null);
		TurboTXT.setText(null);
		AccelrateTXT.setText(null);
		LengthTXT.setText(null);
		WeightTXT.setText(null);
		WidthTXT.setText(null);
		GASTXT.setText(null);
		JOptionPane.showMessageDialog(null,"Adding Car Complete ");
	}
	private void ResetCustomerFields() {
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_4.setText(null);
		textField_3.setText(null);
		textField_5.setText(null);
	}
}

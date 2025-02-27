import javax.swing.*;
import java.awt.*;
class UpdateBook extends JFrame{
	private JPanel BaseRightPanel, labelPanel, textPanel, buttonPanel;
	
	private JLabel lblUpdateBook, lblBookID, lblBookTitle, lblAuthor, lblIsbnNumber, lblPrice, lblPublicationYear;
	
	private JTextField txtBookID, txtBookTitle, txtAuthor, txtIsbnNumber, txtPrice, txtPublicationYear;
	
	private JButton btnUpdate, btnCancel, btnBacktoHomePage;

	
	public UpdateBook(){
		setSize(1200, 700);
		setTitle("Add Book");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 2));
		
		ImagePanel image = new ImagePanel("D:\\iCET\\iCM 114\\OOP\\My Projects\\SmartLibrary\\img\\UpdateBook.jpg");//Importing leftSide image
		add(image);
		
		BaseRightPanel = new JPanel();
		labelPanel = new JPanel();
		BaseRightPanel.setLayout(new BorderLayout());
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		lblUpdateBook = new JLabel("Update Book", SwingConstants.CENTER);
		lblUpdateBook.setFont(new Font("",1,50));
		lblUpdateBook.setForeground(Color.WHITE);
		lblUpdateBook.setOpaque(true);//enable JLabel Background color
		lblUpdateBook.setBackground(new Color(165, 34, 135));
		
		BaseRightPanel.add("North", lblUpdateBook);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		lblBookID = new JLabel("Book ID");
		lblBookID.setFont(new Font("",1,25));
		
		lblBookTitle = new JLabel("Book Title");
		lblBookTitle.setFont(new Font("",1,25));
		
		lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("",1,25));
		
		lblIsbnNumber = new JLabel("ISBN Number");
		lblIsbnNumber.setFont(new Font("",1,25));
		
		lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("",1,25));
		
		lblPublicationYear = new JLabel("Publication Year");
		lblPublicationYear.setFont(new Font("",1,25));
		
		labelPanel.setLayout(new GridLayout(6,1, 0, 50));
		labelPanel.add(lblBookID);
		labelPanel.add(lblBookTitle);
		labelPanel.add(lblAuthor);
		labelPanel.add(lblIsbnNumber);
		labelPanel.add(lblPrice);
		labelPanel.add(lblPublicationYear);
		
		BaseRightPanel.add("Center", labelPanel);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		textPanel = new JPanel(new GridLayout(6, 1, 0, 50));
		txtBookID = new JTextField(15);
		txtBookID.setFont(new Font("",1,25));
		txtBookTitle = new JTextField();
		txtBookTitle.setFont(new Font("",1,25));
		txtAuthor = new JTextField();
		txtAuthor.setFont(new Font("",1,25));
		txtIsbnNumber = new JTextField();
		txtIsbnNumber.setFont(new Font("",1,25));
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("",1,25));
		txtPublicationYear = new JTextField();
		txtPublicationYear.setFont(new Font("",1,25));
		
		textPanel.add(txtBookID);
		textPanel.add(txtBookTitle);
		textPanel.add(txtAuthor);
		textPanel.add(txtIsbnNumber);
		textPanel.add(txtPrice);
		textPanel.add(txtPublicationYear);
		
		BaseRightPanel.add("East", textPanel);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("",1,25));
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("",1,25));
		btnBacktoHomePage = new JButton("Back to HomePage");
		btnBacktoHomePage.setFont(new Font("",1,25));
		
		buttonPanel.add(btnUpdate);
		buttonPanel.add(btnCancel);
		buttonPanel.add(btnBacktoHomePage);
		
		BaseRightPanel.add("South", buttonPanel);
		
		add(BaseRightPanel);
	}
}

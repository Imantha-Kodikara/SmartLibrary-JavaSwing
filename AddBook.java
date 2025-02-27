import javax.swing.*;
import java.awt.*;
class AddBook extends JFrame{
	private JPanel BaseRightPanel, labelPanel, textPanel, buttonPanel;
	
	private JLabel lblAddNewBook, lblBookID, lblBookTitle, lblAuthor, lblIsbnNumber, lblPrice, lblPublicationYear;
	
	private JTextField txtBookID, txtBookTitle, txtAuthor, txtIsbnNumber, txtPrice, txtPublicationYear;
	
	private JButton btnAdd, btnCancel, btnBacktoHomePage;

	
	public AddBook(){
		setSize(1200, 700);
		setTitle("Add Book");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 2));
		
		ImagePanel image = new ImagePanel("D:\\iCET\\iCM 114\\OOP\\My Projects\\SmartLibrary\\img\\AddImage.jpg");//Importing leftSide image
		add(image);
		
		BaseRightPanel = new JPanel();
		labelPanel = new JPanel();
		BaseRightPanel.setLayout(new BorderLayout());
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		lblAddNewBook = new JLabel("Add New Book", SwingConstants.CENTER);
		lblAddNewBook.setFont(new Font("",1,50));
		lblAddNewBook.setForeground(Color.WHITE);
		lblAddNewBook.setOpaque(true);//enable JLabel Background color
		lblAddNewBook.setBackground(new Color(165, 34, 135));
		
		BaseRightPanel.add("North", lblAddNewBook);
		
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
		
		labelPanel.setLayout(new GridLayout(6,1));
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
		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("",1,25));
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("",1,25));
		btnBacktoHomePage = new JButton("Back to HomePage");
		btnBacktoHomePage.setFont(new Font("",1,25));
		
		buttonPanel.add(btnAdd);
		buttonPanel.add(btnCancel);
		buttonPanel.add(btnBacktoHomePage);
		
		BaseRightPanel.add("South", buttonPanel);
		
		add(BaseRightPanel);
	}
}

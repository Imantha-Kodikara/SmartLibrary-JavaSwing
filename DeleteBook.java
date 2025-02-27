import javax.swing.*;
import java.awt.*;
class DeleteBook extends JFrame{
	private JPanel BaseRightPanel, labelPanel, textPanel, buttonPanel, northPanel, searchButtonPanel, searchPanel;
	
	private JLabel lblDeleteBook, lblBookID, lblBookTitle, lblAuthor, lblIsbnNumber, lblPrice, lblPublicationYear;
	
	private JTextField txtBookID, txtBookTitle, txtAuthor, txtIsbnNumber, txtPrice, txtPublicationYear, txtSearch;
	
	private JButton btnDelete, btnBacktoHomePage, btnSearch;

	
	public DeleteBook(){
		setSize(1200, 700);
		setTitle("Add Book");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(1, 2));
		
		ImagePanel image = new ImagePanel("D:\\iCET\\iCM 114\\OOP\\My Projects\\SmartLibrary\\img\\DeleteBook.jpg");//Importing leftSide image
		add(image);
		
		BaseRightPanel = new JPanel();
		labelPanel = new JPanel();
		BaseRightPanel.setLayout(new BorderLayout());
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		lblDeleteBook = new JLabel("Delete Book", SwingConstants.CENTER);
		lblDeleteBook.setFont(new Font("",1,50));
		lblDeleteBook.setForeground(Color.WHITE);
		lblDeleteBook.setOpaque(true);//enable JLabel Background color
		lblDeleteBook.setBackground(new Color(165, 34, 135));
		
		txtSearch = new JTextField(15);
		txtSearch.setFont(new Font("",1,25));
		searchPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		searchPanel.add(txtSearch);
		
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("",1,25));
		searchButtonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		searchButtonPanel.add(btnSearch);
		
		northPanel = new JPanel(new GridLayout(3, 1));
		northPanel.add(lblDeleteBook);
		northPanel.add(searchPanel);
		northPanel.add(searchButtonPanel);
		
		BaseRightPanel.add("North", northPanel);
		
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
		txtBookID.setEditable(false);
		txtBookTitle = new JTextField();
		txtBookTitle.setFont(new Font("",1,25));
		txtBookTitle.setEditable(false);
		txtAuthor = new JTextField();
		txtAuthor.setFont(new Font("",1,25));
		txtAuthor.setEditable(false);
		txtIsbnNumber = new JTextField();
		txtIsbnNumber.setFont(new Font("",1,25));
		txtIsbnNumber.setEditable(false);
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("",1,25));
		txtPrice.setEditable(false);
		txtPublicationYear = new JTextField();
		txtPublicationYear.setFont(new Font("",1,25));
		txtPublicationYear.setEditable(false);
		
		textPanel.add(txtBookID);
		textPanel.add(txtBookTitle);
		textPanel.add(txtAuthor);
		textPanel.add(txtIsbnNumber);
		textPanel.add(txtPrice);
		textPanel.add(txtPublicationYear);
		
		BaseRightPanel.add("East", textPanel);
		
		//-------------------------------------------------------------------------------------------------------------------------
		
		buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("",1,25));
		btnBacktoHomePage = new JButton("Back to HomePage");
		btnBacktoHomePage.setFont(new Font("",1,25));
		
		buttonPanel.add(btnDelete);
		buttonPanel.add(btnBacktoHomePage);
		
		BaseRightPanel.add("South", buttonPanel);
		
		add(BaseRightPanel);
	}
}

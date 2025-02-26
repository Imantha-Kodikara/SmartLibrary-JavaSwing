import javax.swing.*;
import java.awt.*;
class Homepage extends JFrame{
	private JButton btnAddBook;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnView;
	private JButton btnSearch;
	private JButton btnExit;
	
	private JPanel btnPanel;
	public Homepage(){
		setSize(700, 500);
		setTitle("Home Page");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		ImagePanel image = new ImagePanel("D:\\iCET\\iCM 114\\OOP\\My Projects\\SmartLibrary\\img\\HomePage_Banner.jpg");
		add(image);
		
		btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("",1,16));
		btnAddBook.setForeground(Color.WHITE);
		btnAddBook.setBackground(new Color(165, 34, 135));
		
		btnUpdate = new JButton("Update Book");
		btnUpdate.setFont(new Font("",1,16));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(new Color(165, 34, 135));
		
		btnDelete = new JButton("Delete Book");
		btnDelete.setFont(new Font("",1,16));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(165, 34, 135));
		
		btnView = new JButton("View Book");
		btnView.setFont(new Font("",1,16));
		btnView.setForeground(Color.WHITE);
		btnView.setBackground(new Color(165, 34, 135));
		
		btnSearch = new JButton("Search Book");
		btnSearch.setFont(new Font("",1,16));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(165, 34, 135));
		
		btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("",1,16));
		btnExit.setForeground(Color.WHITE);
		btnExit.setBackground(new Color(165, 34, 135));
		
		btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(2,3, 40, 40));
		
		btnPanel.add(btnAddBook);
		btnPanel.add(btnUpdate);
		btnPanel.add(btnDelete);
		btnPanel.add(btnView);
		btnPanel.add(btnSearch);
		btnPanel.add(btnExit);
		
		add(btnPanel);
		
		
	}
}

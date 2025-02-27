import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Homepage extends JFrame{
	private JButton btnAddBook;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnView;
	private JButton btnSearch;
	private JButton btnExit;
	
	private JPanel btnPanel;
	public Homepage(){
		setSize(1200, 700);
		setTitle("Home Page");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		
		ImagePanel image = new ImagePanel("D:\\iCET\\iCM 114\\OOP\\My Projects\\SmartLibrary\\img\\HomePage_Banner.jpg");
		add(image);
		
		btnAddBook = new JButton("Add Book");
		btnAddBook.setFont(new Font("",1,30));
		btnAddBook.setForeground(Color.WHITE);
		btnAddBook.setBackground(new Color(165, 34, 135));
		
		btnUpdate = new JButton("Update Book");
		btnUpdate.setFont(new Font("",1,30));
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(new Color(165, 34, 135));
		
		btnDelete = new JButton("Delete Book");
		btnDelete.setFont(new Font("",1,30));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBackground(new Color(165, 34, 135));
		
		btnView = new JButton("View Book");
		btnView.setFont(new Font("",1,30));
		btnView.setForeground(Color.WHITE);
		btnView.setBackground(new Color(165, 34, 135));
		
		btnSearch = new JButton("Search Book");
		btnSearch.setFont(new Font("",1,30));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(165, 34, 135));
		
		btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("",1,30));
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
		
		//Set action to the btnAddBook Button
		
		btnAddBook.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new AddBook().setVisible(true);//Creating new AddBook object
			}
		});
		
		//Set action to the btnUpdate Button
		
		btnUpdate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new UpdateBook().setVisible(true);//Creating new Update object
			}
		});
		
		//Set action to the btnDelete Button
		
		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				new DeleteBook().setVisible(true);//Creating new Update object
			}
		});
		
		
		
	}
}

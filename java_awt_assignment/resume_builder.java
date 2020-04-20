package hello.demo;

import java.awt.*;  
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; 

public class resume  extends Frame{
	private TextField text;
	private TextField text_1;
	private TextField text_2;
	private TextField text_3;
	private TextField text_4;
	private TextField text_5;
	private TextField text_6;
	private TextField text_7;
	private TextField text_8;
	private TextField text_9;
	private TextField text_10;
	private TextField text_11;
	private TextField text_12;
	private TextField text_13;
	private TextField text_14;
	private TextField text_15;
	private TextField text_16;
	private TextField text_17;
	private TextField text_18;
	private TextField text_19;
	private TextField text_20;
	private TextField text_21;
	private TextField text_22;
	private TextField text_23;
	private TextField text_24;

	/**
         *Author:
	 * Dharam singh meena
         * 181210020
         * created :
         * 20-04-2020
         * 21:49
	 */
	public resume() {
		setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		setBackground(Color.black);
		
		Label lblResume = new Label();
		lblResume.setFont(new Font("TimesRomanBaltic", Font.BOLD, 32));
		lblResume.setForeground(Color.white);
		lblResume.setBackground(Color.black);
		lblResume.setBounds(520, 25, 518, 54);
		lblResume.setText("RESUME");
		
		
		Label lblPersonalDetails = new Label();
		lblPersonalDetails.setFont(new Font("TimesRomanBaltic", Font.BOLD, 24));
		lblPersonalDetails.setForeground(Color.white);
		lblPersonalDetails.setBackground(Color.black);
		lblPersonalDetails.setBounds(10, 79, 188, 26);
		lblPersonalDetails.setText("Personal Details");
		
		text = new TextField();
		text.setBounds(187, 127, 344, 24);
		
		Label lblFirstName = new Label();
		lblFirstName.setBackground(Color.black);
		lblFirstName.setForeground(Color.white);
		lblFirstName.setBounds(34, 127, 90, 20);
		lblFirstName.setText("First Name:");
		
		Label lblLastName = new Label();
		lblLastName.setBackground(Color.black);
		lblLastName.setForeground(Color.white);
		lblLastName.setBounds(34, 162, 90, 20);
		lblLastName.setText("Last Name:");
		
		text_1 = new TextField();
		text_1.setBounds(187, 159, 344, 24);
		
		Label lblDob = new Label();
		lblDob.setForeground(Color.white);
		lblDob.setBackground(Color.black);
		lblDob.setBounds(34, 194, 90, 20);
		lblDob.setText("DOB:");
		
		text_2 = new TextField();
		text_2.setBounds(187, 191, 344, 24);
		
		Label lblContactNo = new Label();
		lblContactNo.setBackground(Color.black);
		lblContactNo.setForeground(Color.white);
		lblContactNo.setBounds(34, 226, 90, 20);
		lblContactNo.setText("Contact No:");
		
		text_3 = new TextField();
		text_3.setBounds(187, 223, 344, 24);
		
		Label lblEmailId = new Label();
		lblEmailId.setForeground(Color.white);
		lblEmailId.setBackground(Color.black);
		lblEmailId.setBounds(34, 259, 70, 20);
		lblEmailId.setText("Email ID");
		
		text_4 = new TextField();
		text_4.setBounds(187, 256, 344, 24);
		
		Label lblAddress = new Label();
		lblAddress.setBackground(Color.black);
		lblAddress.setForeground(Color.white);
		lblAddress.setBounds(34, 291, 90, 20);
		lblAddress.setText("Address:");
		
		text_5 = new TextField();
		text_5.setBounds(187, 288, 342, 24);
		
		Label lblQualifications = new Label();
		lblQualifications.setFont(new Font("TimesRomanBaltic", Font.BOLD, 24));
		lblQualifications.setForeground(Color.white);
		lblQualifications.setBackground(Color.black);
		lblQualifications.setBounds(16, 343, 182, 33);
		lblQualifications.setText("Qualifications");
		
		Label lblTitle = new Label();
		lblTitle.setBackground(Color.black);
		lblTitle.setForeground(Color.white);
		lblTitle.setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		lblTitle.setAlignment(Label.CENTER);
		lblTitle.setBounds(34, 382, 70, 20);
		lblTitle.setText("Title");
		
		Label lblInstitution = new Label();
		lblInstitution.setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		lblInstitution.setForeground(Color.white);
		lblInstitution.setBackground(Color.black);
		lblInstitution.setAlignment(Label.CENTER);
		lblInstitution.setBounds(408, 382, 103, 20);
		lblInstitution.setText("Institution");
		
		Label lblMarks = new Label();
		lblMarks.setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		lblMarks.setAlignment(Label.CENTER);
		lblMarks.setBackground(Color.black);
		lblMarks.setForeground(Color.white);
		lblMarks.setBounds(940, 382, 70, 20);
		lblMarks.setText("Marks");
		
		text_6 = new TextField();
		text_6.setBounds(34, 420, 182, 24);
		
		text_7 = new TextField();
		text_7.setBounds(408, 420, 477, 24);
		
		text_8 = new TextField();
		text_8.setBounds(940, 420, 78, 24);
		
		text_9 = new TextField();
		text_9.setBounds(34, 452, 182, 24);
		
		text_10 = new TextField();
		text_10.setBounds(408, 452, 477, 24);
		
		text_11 = new TextField();
		text_11.setBounds(940, 452, 78, 24);
	     
		text_12 = new TextField();
		text_12.setBounds(34, 484, 182, 24);
		
		text_13 = new TextField();
		text_13.setBounds(408, 484, 477, 24);
		
		text_14 = new TextField();
		text_14.setBounds(940, 484, 78, 24);
		
		Label lblWorkExperience = new Label();
		lblWorkExperience.setFont(new Font("TimesRomanBaltic", Font.BOLD, 24));
		lblWorkExperience.setForeground(Color.white);
		lblWorkExperience.setBackground(Color.black);
		lblWorkExperience.setBounds(16, 535, 200, 33);
		lblWorkExperience.setText("Work Experience");
		
		Label lblCompany = new Label();
		lblCompany.setAlignment(Label.CENTER);
		lblCompany.setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		lblCompany.setBackground(Color.black);
		lblCompany.setForeground(Color.white);
		lblCompany.setBounds(34, 574, 90, 20);
		lblCompany.setText("Company");
		
		Label lblWorkDone = new Label();
		lblWorkDone.setAlignment(Label.CENTER);
		lblWorkDone.setFont(new Font("TimesRomanBaltic", Font.BOLD, 14));
		lblWorkDone.setBackground(Color.black);
		lblWorkDone.setForeground(Color.white);
		lblWorkDone.setBounds(408, 574, 97, 20);
		lblWorkDone.setText("Work Done");
		
		text_15 = new TextField();
		text_15.setBounds(34, 612, 182, 24);
		
		text_16 = new TextField();
		text_16.setBounds(34, 648, 182, 24);
		
		text_17 = new TextField();
		text_17.setBounds(408, 612, 477, 24);
		
		text_18 = new TextField();
		text_18.setBounds(408, 648, 477, 24);
		
		Label lblSkills = new Label();
		lblSkills.setFont(new Font("TimesRomanBaltic", Font.BOLD, 24));
		lblSkills.setBackground(Color.black);
		lblSkills.setForeground(Color.white);
		lblSkills.setBounds(10, 685, 149, 33);
		lblSkills.setText("Skills");
		
		text_19 = new TextField();
		text_19.setBounds(34, 720, 182, 24);
		
		text_20 = new TextField();
		text_20.setBounds(34, 749, 182, 24);
		
		text_21 = new TextField();
		text_21.setBounds(34, 779, 182, 24);
		
		Label lblHobbies = new Label();
		lblHobbies.setFont(new Font("TimesRomanBaltic", Font.BOLD, 24));
		lblHobbies.setForeground(Color.white);
		lblHobbies.setBackground(Color.black);
		lblHobbies.setAlignment(Label.RIGHT);
		lblHobbies.setBounds(879, 685, 149, 33);
		lblHobbies.setText("Hobbies");
		
		text_22 = new TextField();
		text_22.setBounds(802, 720, 226, 24);
		
		text_23 = new TextField();
		text_23.setBounds(802, 749, 226, 24);
		
		text_24 = new TextField();
		text_24.setBounds(802, 779, 226, 24);
		
		Button btnSubmit = new Button("SUBMIT");
		btnSubmit.setFont(new Font("TimesRomanBaltic", Font.BOLD, 12));
		btnSubmit.setBounds(485, 750, 90, 30);
        
		//ADD COMPONENTS TO CONTAINER
		add(text);add(text_1);add(text_2);add(text_3);add(text_4);add(text_5);add(text_6);add(text_7);add(text_8);add(text_9);add(text_10);add(text_11);
		add(text_12);add(text_13);add(text_14);add(text_15);add(text_16);add(text_17);add(text_18);add(text_19);add(text_20);add(text_21);add(text_22);add(text_23);
		add(text_24);
		add(lblResume);add(lblPersonalDetails);add(lblFirstName);add(lblLastName);add(lblDob);add(lblContactNo );add(lblEmailId );add(lblAddress );add(lblQualifications );
		add(lblTitle );add(lblInstitution );add(lblMarks );add(lblWorkExperience );add(lblCompany );add(lblWorkDone );add(lblSkills );add(lblHobbies );add(btnSubmit );
		
		//FOR GUI
		setSize(1080,830);
        setLayout(null);  
        setVisible(true);
        //FOR CLOSING THE WINDOW
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
       //FOR WRITING TO A FILE
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try	{
					//create a new file
					File file = new File("audit.txt");
					//write to the file
					BufferedWriter fw = new BufferedWriter(new FileWriter(file,false));
					fw.write("\t\t\t~~RESUME~~\n" + "\n~Personal Details~\n" +"\nFIRST NAME:\t"+ text.getText()+"\nLast Name:\t"+text_1.getText()+"\nDOB:\t\t"+text_2.getText()+
							"\nContact No:\t"+text_3.getText()+"\nEmail id:\t"+text_4.getText()+"\nAddress:\t"+text_5.getText()+"\n\n~Qualifications~"+"\nTitle\t\t\t"+"Institution\t\t"+"\tMarks\n"+text_6.getText()+
							"\t\t\t"+text_7.getText()+"\t\t\t\t"+text_8.getText()+"\n"+text_9.getText()+"\t\t\t"+text_10.getText()+"\t\t\t\t"+text_11.getText()+"\n"+text_12.getText()+"\t\t\t"
                            +text_13.getText()+"\t\t\t\t"+text_14.getText()+"\n"+"\n~Work Experience~"+"\nCompany\t\t\t"+"Work Done\t\t\t\n"+
							text_15.getText()+"\t\t\t"+text_17.getText()+"\n"+text_16.getText()+"\t\t\t"+text_18.getText()
							+"\n\n~Skills~\n"+text_19.getText()+"\n"+text_20.getText()+"\n"+text_21.getText()+"\n"
							+"\n~Hobbies~\n"+text_22.getText()+"\n"+text_23.getText()+"\n"+text_24.getText()+"\n"
							);
					
					
					fw.close();
					//TO OPEN THE FILE
					Desktop desktop = Desktop.getDesktop();  
					if(file.exists())         //checks file exists or not  
					    desktop.open(file);              //opens the specified file  
					
				}
				catch(IOException ioe) {
					System.out.println("Exception Caught : " +ioe.getMessage());
				}
		}
	});
		
	}
	public static void main(String[] args) {
		   new resume();
		}
}

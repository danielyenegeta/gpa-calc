import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**Used oracle java tutorial to create vertical boxes**/ 
/**https://docs.oracle.com/javase/tutorial/uiswing/layout/box.html**/

public class HW5 {
	
	public static void main(String[] args) {
		new HW5();
	}
	
	public HW5() {
		
		JFrame frame = new JFrame();
		
		/**make sure program exits**/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setTitle("GPA Calculator & Planner");
		frame.setSize(770,385);
		
		/**Center JFrame in middle of screen**/
		frame.setLocationRelativeTo(null);
		
		/**Create panel for list of courses**/
		JPanel coursesPan = new JPanel();
		JLabel coursesLabel = new JLabel("Course Name");
		JTextField course1 = new JTextField(20);
		JTextField course2 = new JTextField(20);
		JTextField course3 = new JTextField(20);
		JTextField course4 = new JTextField(20);
		JTextField course5 = new JTextField(20);
		JTextField course6 = new JTextField(20);
		JTextField course7 = new JTextField(20);
		/**Create vertical box for courses**/
		Box coursesBox = Box.createVerticalBox();
		coursesBox.add(coursesLabel);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course1);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course2);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course3);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course4);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course5);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course6);
		coursesBox.add(Box.createVerticalStrut(4));
		coursesBox.add(course7);
		coursesPan.add(coursesBox);
		coursesPan.setVisible(true);
		
		/**Create panel for credit hours**/
		JPanel creditHoursPan = new JPanel();
		JLabel creditHoursLabel = new JLabel("Credit Hours");
		String[] hours = {"--", "1", "2", "3", "4", "5"};
		JComboBox<String> ch1 = new JComboBox<String>(hours);
		JComboBox<String> ch2 = new JComboBox<String>(hours);
		JComboBox<String> ch3 = new JComboBox<String>(hours);
		JComboBox<String> ch4 = new JComboBox<String>(hours);
		JComboBox<String> ch5 = new JComboBox<String>(hours);
		JComboBox<String> ch6 = new JComboBox<String>(hours);
		JComboBox<String> ch7 = new JComboBox<String>(hours);
		/**Create vertical box for credit hours**/
		Box chBox = Box.createVerticalBox();
		chBox.add(creditHoursLabel);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch1);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch2);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch3);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch4);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch5);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch6);
		chBox.add(Box.createVerticalStrut(4));
		chBox.add(ch7);
		creditHoursPan.add(chBox);
		creditHoursPan.setVisible(true);
		
		/**Create panel for grades**/
		String[] grades = {"--", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "D+", "F"};
		JPanel gradePan = new JPanel();
		JLabel gLabel = new JLabel("Grade");
		JComboBox<String> grades1 = new JComboBox<String>(grades);
		JComboBox<String> grades2 = new JComboBox<String>(grades);
		JComboBox<String> grades3 = new JComboBox<String>(grades);
		JComboBox<String> grades4 = new JComboBox<String>(grades);
		JComboBox<String> grades5 = new JComboBox<String>(grades);
		JComboBox<String> grades6 = new JComboBox<String>(grades);
		JComboBox<String> grades7 = new JComboBox<String>(grades);
		/**Create vertical box for grades**/
		Box gBox = Box.createVerticalBox();
		gBox.add(gLabel);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades1);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades2);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades3);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades4);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades5);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades6);
		gBox.add(Box.createVerticalStrut(4));
		gBox.add(grades7);
		gradePan.add(gBox);
		gradePan.setVisible(true);
		
		/**Create panel for course type (previously taken, current or anticipated)**/
		String[] pca = {"Previously Taken", "Current", "Anticipated"};
		JPanel pcaPan = new JPanel();
		JLabel pcaLabel = new JLabel("Course Type");
		JComboBox<String> pca1 = new JComboBox<String>(pca);
		JComboBox<String> pca2 = new JComboBox<String>(pca);
		JComboBox<String> pca3 = new JComboBox<String>(pca);
		JComboBox<String> pca4 = new JComboBox<String>(pca);
		JComboBox<String> pca5 = new JComboBox<String>(pca);
		JComboBox<String> pca6 = new JComboBox<String>(pca);
		JComboBox<String> pca7 = new JComboBox<String>(pca);
		/**Create vertical box for course type**/
		Box pcaBox = Box.createVerticalBox();
		pcaBox.add(pcaLabel);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca1);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca2);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca3);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca4);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca5);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca6);
		pcaBox.add(Box.createVerticalStrut(4));
		pcaBox.add(pca7);
		pcaPan.add(pcaBox);
		pcaPan.setVisible(true);
		
		/**Create panel for target GPA**/
		JPanel tGPApan = new JPanel();
		JLabel tGPAlabel = new JLabel("Enter Target GPA:");
		JTextField tGPAtf = new JTextField(5);
		tGPApan.add(tGPAlabel);
		tGPApan.add(tGPAtf);
		tGPApan.setVisible(true);
		
		/**Create panel for calculating GPA**/
		JPanel calcGPApan = new JPanel();
		JButton calcGPAbutton = new JButton("Calculate GPA");
		JTextField calcOutput = new JTextField(5);
		calcGPApan.add(calcGPAbutton);
		calcGPApan.add(calcOutput);
		calcGPApan.setVisible(true);
		
		/**Create panel for required GPA**/
		JPanel reqGPApan = new JPanel();
		JButton reqGPAbutton = new JButton("Required GPA:");
		JTextField reqGPAoutput = new JTextField(5);
		reqGPApan.add(reqGPAbutton);
		reqGPApan.add(reqGPAoutput);
		reqGPApan.setVisible(true);
		
		/**Create panel for clear, quick add, add and remove**/
		JPanel p = new JPanel();
		JButton clearButton = new JButton("Clear");
		JButton quickAddButton = new JButton("Quick Add");
		JButton addCourseButton = new JButton("Add Course");
		JButton removeCourseButton = new JButton("Remove Course");
		JLabel warning = new JLabel("Warning:");
		JTextField warnOutput = new JTextField(17);
		p.add(clearButton);
		p.add(quickAddButton);
		p.add(addCourseButton);
		p.add(removeCourseButton);
		p.setVisible(true);
		p.add(warning);
		p.add(warnOutput);
		p.setVisible(true);
		
		/**Create ArrayList for list of courses**/
		ArrayList<JTextField> courseList = new ArrayList<JTextField>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		courseList.add(course5);
		courseList.add(course6);
		courseList.add(course7);
		
		/**Create ArrayList for credit hour combo boxes**/
		ArrayList<JComboBox<String>> chList = new ArrayList<JComboBox<String>>();
		chList.add(ch1);
		chList.add(ch2);
		chList.add(ch3);
		chList.add(ch4);
		chList.add(ch5);
		chList.add(ch6);
		chList.add(ch7);
		
		/**Create ArrayList for grade combo boxes**/
		ArrayList<JComboBox<String>> gradeList = new ArrayList<JComboBox<String>>();
		gradeList.add(grades1);
		gradeList.add(grades2);
		gradeList.add(grades3);
		gradeList.add(grades4);
		gradeList.add(grades5);
		gradeList.add(grades6);
		gradeList.add(grades7);
		
		/**Create ArrayList for course type combo boxes**/
		ArrayList<JComboBox<String>> pcaList = new ArrayList<JComboBox<String>>();
		pcaList.add(pca1);
		pcaList.add(pca2);
		pcaList.add(pca3);
		pcaList.add(pca4);
		pcaList.add(pca5);
		pcaList.add(pca6);
		pcaList.add(pca7);
		
		/**Create Hash Map that maps letter grades to grade point values**/
		Map<String, Double> letterToNum = new HashMap<String, Double>();
		letterToNum.put("--", 0.0);
		letterToNum.put("A", 4.0);
		letterToNum.put("A-", 3.7);
		letterToNum.put("B+", 3.3);
		letterToNum.put("B", 3.0);
		letterToNum.put("B-", 2.7);
		letterToNum.put("C+", 2.3);
		letterToNum.put("C", 2.0);
		letterToNum.put("C-", 1.7);
		letterToNum.put("D+", 1.3);
		letterToNum.put("D", 1.0);
		letterToNum.put("F", 0.0);
		
		/**Create Hash Map that maps credit hour strings to integer values**/
		Map<String, Integer> toHours = new HashMap<String, Integer>();
		toHours.put("--", 0);
		toHours.put("1", 1);
		toHours.put("2", 2);
		toHours.put("3", 3);
		toHours.put("4", 4);
		toHours.put("5", 5);
		
		
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**Set every course name text field to empty string**/
				for (JTextField t : courseList) {
					t.setText("");
				}
				/**Set every credit hour combo box selection to "--"**/
				for (JComboBox<String> c : chList) {
					c.setSelectedItem("--");
				}
				/**Set every grade combo box selection to "--"**/
				for (JComboBox<String> c : gradeList) {
					c.setSelectedItem("--");
				}
				/**Set every course type combo box selection to "Previously Taken"**/
				for (JComboBox<String> c : pcaList) {
					c.setSelectedItem("Previously Taken");
				}
				/**Set rest of text fields to empty string**/
				calcOutput.setText("");
				tGPAtf.setText("");
				reqGPAoutput.setText("");
				warnOutput.setText("");
			}
			
		});
		
		quickAddButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				/**Set first 5 credit hour combo boxes to 3**/
				for (int i = 0; i < 5; i++) {
					chList.get(i).setSelectedItem("3");
				}
				/**Set course text field, grade and course type combo boxes to empty string/"--"**/
				for (int i = 0; i < 5; i++) {
					courseList.get(i).setText("");
				}
				for (int i = 0; i < 5; i++) {
					gradeList.get(i).setSelectedItem("--");
				}
				for (int i = 0; i < 5; i++) {
					pcaList.get(i).setSelectedIndex(0);
				}
			}
			
		});
		
		calcGPAbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				double gradeSum = 0;
				/**Get sum of all grade points**/
				for (int i = 0; i < gradeList.size(); i++) {
					gradeSum = gradeSum + letterToNum.get(gradeList.get(i).getSelectedItem()) * toHours.get(chList.get(i).getSelectedItem());
				}
				
				double hoursSum = 0;
				/**Get sum of all credit hours**/
				for (JComboBox<String> c : chList) {
					hoursSum = hoursSum + toHours.get(c.getSelectedItem());
				}
				
				/**Subtract grade points for combo boxes that select "--"**/
				for (int i = 0; i < gradeList.size(); i++) {
					if (gradeList.get(i).getSelectedItem().equals("--")) {
						gradeSum = gradeSum - letterToNum.get(gradeList.get(i).getSelectedItem());
						hoursSum = hoursSum - toHours.get(chList.get(i).getSelectedItem());
					}
				}
				
				/**Get grade point average**/
				double d2 = gradeSum / hoursSum;
				DecimalFormat df = new DecimalFormat("#.##");
				calcOutput.setText("" + df.format(d2));	

			}
			
		});
		
		addCourseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**Add a new course**/
				JTextField newCourse = new JTextField(20);
				coursesBox.add(Box.createVerticalStrut(4));
				coursesBox.add(newCourse);
				courseList.add(newCourse);
				coursesPan.add(coursesBox);
				/**Add a new credit hour combo box**/
				JComboBox<String> newCH = new JComboBox<String>(hours);
				chBox.add(Box.createVerticalStrut(4));
				chBox.add(newCH);
				chList.add(newCH);
				creditHoursPan.add(chBox);
				/**Add a new grade combo box**/
				JComboBox<String> newGrade = new JComboBox<String>(grades);
				gBox.add(Box.createVerticalStrut(4));
				gBox.add(newGrade);
				gradeList.add(newGrade);
				gradePan.add(gBox);
				/**Add a new course type combo box**/
				JComboBox<String> newPCA = new JComboBox<String>(pca);
				pcaBox.add(Box.createVerticalStrut(4));
				pcaBox.add(newPCA);
				pcaList.add(newPCA);
				pcaPan.add(pcaBox);
				/**Resize frame**/
				frame.setSize(frame.getWidth(), frame.getHeight() + 15);
				

			}
			
		});
		
		removeCourseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				/**Remove the last element from course, credit hour, grade and course type Boxes**/
				coursesBox.remove(courseList.get(courseList.size()-1));
				chBox.remove(chList.get(chList.size()-1));
				gBox.remove(gradeList.get(gradeList.size()-1));
				pcaBox.remove(pcaList.get(pcaList.size()-1));
				/**Remove the last element from course, credit hour, grade and course type ArrayLists**/
				courseList.remove(courseList.size()-1);
				chList.remove(chList.size()-1);
				gradeList.remove(gradeList.size()-1);
				pcaList.remove(pcaList.size()-1);
				/**Resize frame**/
				frame.setSize(frame.getWidth(), frame.getHeight() - 15);

			}
			
		});
		reqGPAbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcOutput.removeAll();
				calcGPAbutton.getAction();
				double counter = 0;
				double currCounter = 0;
				double futureCount = 0;
				/**Add up total credit hours**/
				for (int i = 0; i < chList.size(); i++) {
					if (!(chList.get(i).getSelectedItem().equals("--"))) {
						counter = counter + toHours.get(chList.get(i).getSelectedItem());
					}
				}
				/**Add up credit hours with grades**/
				for (int i = 0; i < chList.size(); i++) {
					if (!(chList.get(i).getSelectedItem().equals("--")) && (!gradeList.get(i).getSelectedItem().equals("--"))) {
						currCounter = currCounter + toHours.get(chList.get(i).getSelectedItem());
					}
				}
				/**Add up credit hours without grades**/
				for (int i = 0; i < chList.size(); i++) {
					if ((!(chList.get(i).getSelectedItem().equals("--"))) && (gradeList.get(i).getSelectedItem().equals("--"))) {
						futureCount = futureCount + toHours.get(chList.get(i).getSelectedItem());
					}
				}
				
				/**Calculate required GPA**/
				double reqGPA = ((Double.parseDouble(tGPAtf.getText()) * counter) - (Double.parseDouble(calcOutput.getText()) * currCounter)) / futureCount;
				DecimalFormat dt = new DecimalFormat("#.##");
				reqGPAoutput.setText("" + dt.format(reqGPA));
				/**Print warning output**/
				if (reqGPA > 4) {
					warnOutput.setText("Take more credit hours");
				} else if (reqGPA < 2) {
					warnOutput.setText("You can take less credit hours");
				} else {
					warnOutput.setText("");
				}

			}
			
		});
		
		/**Add panels to frame**/
		frame.add(coursesPan);
		frame.add(creditHoursPan);
		frame.add(gradePan);
		frame.add(pcaPan);
		frame.add(tGPApan);
		frame.add(calcGPApan);
		frame.add(reqGPApan);
		frame.add(p);
		
		//Make frame visible
		frame.setVisible(true);
			
	}	
}

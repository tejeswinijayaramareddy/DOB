package DOB;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ts_frame  extends JFrame{
	public String PathSchema = "";
	public static void main(String[] args) {
	    new ts_frame().setVisible(true);
	   
	}

	public ts_frame(){
        super("Day and Zodiac Sign Calculator");
        setSize(800,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JLabel labelSelect  = new JLabel("", JLabel.LEFT);
        labelSelect.setText("Enter your Date of Birth");
        JTextField field = new JTextField(10);
        field.setPreferredSize(new Dimension(150, 25));
        JLabel label = new JLabel("Input will appear here");
        JButton ProcessButton = new JButton("Process");
        ProcessButton.setEnabled(true);
        JLabel FinishedP  = new JLabel("Process finished successfully.");
        FinishedP.setVisible(false);
        JLabel Output  = new JLabel("Output file generated");
        Output.setVisible(false);
        

        add(labelSelect );        
        add(field);
        add(ProcessButton);
        add(FinishedP);
        add(Output);
        
        ProcessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	 String input = field.getText();
            	 label.setText(input);
            	 ts_processInput uinput = new ts_processInput();
            	 String out = uinput.parseInput(input);
            	 FinishedP.setText(String.valueOf(out));
            	 FinishedP.setVisible(true);
            }
        });
	}
}



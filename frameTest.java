package DOB;

import static org.junit.Assert.*;

import javax.swing.JTextField;
import junit.framework.TestCase;

import org.junit.Test;

public class frameTest extends TestCase {
	ts_frame frame;
	
	public void setUp() throws Exception {
		 frame= new ts_frame();
		 frame.setVisible(true);
	}
	 public void tearDown() {
		 frame.dispose();
	 }
	 
	 public void testisShowing() {
		 
		 assertTrue(frame.isShowing());
	 }
		
}

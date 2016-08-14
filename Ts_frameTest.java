package DOB;
import java.awt.Dimension;
import java.awt.geom.Dimension2D;

import junit.framework.TestCase;

public class Ts_frameTest extends TestCase{
	
	
	public void test_test1() {
		ts_frame  frame = new ts_frame();
		String result = frame.getSize().toString();
		assertEquals("java.awt.Dimension[width=800,height=300]", result);
	}
	

	public void test_test2() {
		ts_frame  frame = new ts_frame();
		String result = frame.getName();
		assertEquals("frame0", result);
	}
	
	public void test_test3() {
		ts_frame  frame = new ts_frame();
		String result = frame.getClass().toString();
		assertEquals("class DOB.ts_frame", result);
	}
	
	public void test_test4() {
		ts_frame  frame = new ts_frame();
		int result = frame.getHeight();
		assertEquals(300, result);
	}
	
	public void test_test5() {
		ts_frame  frame = new ts_frame();
		String result = frame.getLocation().toString();
		assertEquals("java.awt.Point[x=283,y=214]", result);
	}
	
	public void test_test6() {
		ts_frame  frame = new ts_frame();
		String result = frame.getLayout().toString();
		assertEquals("java.awt.BorderLayout[hgap=0,vgap=0]", result);
	}
	
	public void test_test7() {
		ts_frame  frame = new ts_frame();
		int result = frame.EXIT_ON_CLOSE;
		assertEquals(3, result);
	}
	
}

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.Robot;

public class AutoKeyClicker {
	
    public static void main(String[] args) throws InterruptedException, AWTException, {
		
        Robot platRandomBots = new Robot();
		
        int delay = 100; // Delay in milliseconds, by changing this value you will change the speed of clicking

        while (true) {
			
            robot.keyPress(KeyEvent.VK_X); // Press the 'unassigned' key, to change the key you must change the last letter in "(KeyEvent.VK_X)", replace the X key with any key you want
            robot.keyRelease(KeyEvent.VK_X); // Release the 'assigned' key, to change the key you must change the last letter in "(KeyEvent.VK_X)", replace the X key with any key you want
			
            Thread.sleep(delay); // Wait for the specified delay
        }
		
		//coded by SnapiyyFan435
		
		
    }
}
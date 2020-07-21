// Author: Benjamin Harris
// main class for the SpeciesListUpdater program
// July, 18 2020

import java.io.File;
import java.awt.Desktop;
import javax.swing.JOptionPane;

public class SLLauncher {

	public static void main(String[] args) {
		String dir = getDir();
		String file = dir + File.separator + "sl.jar";
		try {			
			Desktop.getDesktop().open(new File(file));
		} catch (Exception e) {
			pop("main(): " + e);
		} // end try-catch
	} // end main()

	private static void pop (String msg) {
		JOptionPane.showMessageDialog(null, msg, "Alert!", JOptionPane.INFORMATION_MESSAGE, null);
	} // end pop()

	private static String getDir () {
		File f = null;
		String dirPath = null;
		try {
			f = new File(SLLauncher.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
			dirPath = f.toString();
		} catch (Exception e) {
			pop("setDir(): " + e);
		} // end try-catch
		return dirPath;
	} // end getDir()

} // end class SLLauncher

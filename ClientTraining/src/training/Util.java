package training;

import org.eclipse.swt.widgets.Shell;

public final class Util {
	public static void centerWindow(int width, int height, Shell shell) {
		int w = shell.getMonitor().getClientArea().width;
		int h = shell.getMonitor().getClientArea().height;
		
		int x = (w - width)/2;
		int y = (h - height)/2;
		
		shell.setBounds(x, y, width, height);
	}
}

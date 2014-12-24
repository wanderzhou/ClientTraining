package training.w1.d1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 
 * command arguments : one argument 
 * horizontal for SWT.HORIZONTAL
 * vertical for SWT.VERTICAL
 * 
 * @author admin
 *
 */
public class FillLayoutMain {
	private static final int Layout_Style = SWT.HORIZONTAL;

	public static void main(String[] args) {
		
		int layoutStyle = Layout_Style;
		if(args.length > 0) {
			if("VERTICAL".equalsIgnoreCase(args[0])) {
				layoutStyle = SWT.VERTICAL;
			}
		} else {
			System.out.println("You can specify FillLayout style in command line by input vertical, default is horizontal.");
		}
		
		Display display = new Display();
		Shell shell = new Shell(display);
		
		Button but1 = new Button(shell, SWT.PUSH);
		but1.setText("Button One");
		
		Button but2 = new Button(shell, SWT.PUSH);
		but2.setText("Button Two");

		Button but3 = new Button(shell, SWT.PUSH);
		but3.setText("Button Three");

		Button but4 = new Button(shell, SWT.PUSH);
		but4.setText("Button Four");

		Button but5 = new Button(shell, SWT.PUSH);
		but5.setText("Button Five");
		
		FillLayout fillLayout = new FillLayout(layoutStyle);
		
		/*fillLayout.marginHeight = 100;
		fillLayout.marginWidth = 50;
		fillLayout.spacing = 50;*/
		shell.setLayout(fillLayout);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();
				
	}

}

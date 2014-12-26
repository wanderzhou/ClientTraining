package training.w2.d4;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import training.Util;

/**
 * 
 * ComboViewer Sample
 * 
 * @author admin
 *
 */
public class ComboViewerMain {

	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("JFace Sample - ComboViewer");
		
		Util.centerWindow(600, 400, shell);
		
		//create ComboViewer
		ComboViewer comboViewer = new ComboViewer(shell, SWT.SIMPLE);
		
		//set content provider and label provider
		comboViewer.setContentProvider(new StructuredContentProvider());
		comboViewer.setLabelProvider(new SimpleLabelProvider());
		
		//set input
		comboViewer.setInput("");
		
		shell.setLayout(new FillLayout());
		
		shell.open();
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}

		display.dispose();
	}

}

package training.w2.d4;

import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import training.Util;

/**
 * 
 * ListViewer Sample
 * 
 * @author admin
 *
 */
public class ListViewerMain extends ApplicationWindow {

	public ListViewerMain(Shell parentShell) {
		super(parentShell);
	}
	
	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		
		shell.setText("JFace Sample - List Viewer");
		Util.centerWindow(600, 400, shell);
		
		//create LisetViewer
		ListViewer listViewer = new ListViewer(shell, SWT.SINGLE);
		
		//create content provider
		StructuredContentProvider provider = new StructuredContentProvider();
		
		//create label provider
		SimpleLabelProvider labelProvider = new SimpleLabelProvider();
		
		//set content provider
		listViewer.setContentProvider(provider);
		//set label provider
		listViewer.setLabelProvider(labelProvider);
		
		//set input
		listViewer.setInput(new Student[]{new Student(2, 18, "Marry", "Carie", false)});
		
	}

	public static void main(String[] args) {
		ListViewerMain mainWindow = new ListViewerMain(null);
		mainWindow.setBlockOnOpen(true);
		mainWindow.open();
	}

}

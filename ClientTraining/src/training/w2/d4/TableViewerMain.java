package training.w2.d4;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import training.Util;

/**
 * 
 * TableViewer Sample
 * 
 * @author admin
 *
 */
public class TableViewerMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.setText("JFace Sample - TableViewer");
		Util.centerWindow(500, 400, shell);
		
		//create TableViewer
		TableViewer tableViewer = new TableViewer(shell, SWT.SINGLE|SWT.FULL_SELECTION|SWT.BORDER);
		
		//set properties of table
		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		//set column header
		String[] columnHeaders = new String[]{"ID", "First Name", "Last Name", "Sex", "Age"};
		for(int i = 0; i < columnHeaders.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(columnHeaders[i]);
		}		
		
		//set content provider and label provider
		tableViewer.setContentProvider(new StructuredContentProvider());
		tableViewer.setLabelProvider(new CustomTableLabelProvider());
		
		
		tableViewer.setInput(new Student[]{new Student(2, 18, "Marry", "Carie", false)});
		
		for(int i = 0; i < table.getColumnCount(); i++) {
			table.getColumn(i).pack();
		}
		
		shell.setLayout(new FillLayout());;
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}

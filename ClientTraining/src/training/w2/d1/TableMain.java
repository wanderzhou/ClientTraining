package training.w2.d1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import training.Util;

public class TableMain {

	public static void main(String[] args) {
		int topTableColumnCount = 5;
		int bottomTableColumnCount = 5;
		
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("Widgets Sample - Table");
		
		Util.centerWindow(600, 400, shell);
		
		//create table column
		Table tabTop = new Table(shell, SWT.MULTI|SWT.FULL_SELECTION|SWT.BORDER);
		tabTop.setLinesVisible(true);
		tabTop.setHeaderVisible(true);
		
		TableColumn col1 = new TableColumn(tabTop, SWT.LEFT);
		TableColumn col2 = new TableColumn(tabTop, SWT.CENTER);
		TableColumn col3 = new TableColumn(tabTop, SWT.RIGHT);
		TableColumn col4 = new TableColumn(tabTop, SWT.LEFT);
		TableColumn col5 = new TableColumn(tabTop, SWT.LEFT);
		
		//set text of table column
		col1.setText("C-01");
		col2.setText("C-02");
		col3.setText("C-03");
		col4.setText("C-04");
		col5.setText("C-05");
		
		//create table item
		for(int i = 1; i <= 4; i++) {
			TableItem tabItem = new TableItem(tabTop, SWT.NONE);
			for(int j = 0; j < topTableColumnCount; j++) {
				tabItem.setText(j, String.format("(%d, %d)", i, j + 1));
			}
		}
		
		for(int i = 0; i < topTableColumnCount; i++) {
			tabTop.getColumn(i).pack();
		}
		
		//create second table
		Table tabBottom = new Table(shell, SWT.MULTI|SWT.FULL_SELECTION|SWT.BORDER|SWT.CHECK);
		tabBottom.setLinesVisible(true);
		tabBottom.setHeaderVisible(true);

		TableColumn colBottom1 = new TableColumn(tabBottom, SWT.LEFT);
		TableColumn colBottom2 = new TableColumn(tabBottom, SWT.CENTER);
		TableColumn colBottom3 = new TableColumn(tabBottom, SWT.RIGHT);
		TableColumn colBottom4 = new TableColumn(tabBottom, SWT.LEFT);
		TableColumn colBottom5 = new TableColumn(tabBottom, SWT.LEFT);	
		
		colBottom1.setText("I-A");
		colBottom2.setText("I-B");
		colBottom3.setText("I-C");
		colBottom4.setText("I-D");
		colBottom5.setText("I-E");
		
		//create table item
		for(int i = 1; i <= 4; i++) {
			TableItem tabItem = new TableItem(tabBottom, SWT.NONE);
			for(int j = 0; j < bottomTableColumnCount; j++) {
				tabItem.setText(j, String.format("(%d, %d)", i, j + 1));
			}
		}		
		
		for(int i = 0; i < bottomTableColumnCount; i++) {
			tabBottom.getColumn(i).pack();
		}		
		
		shell.setLayout(new FillLayout(SWT.VERTICAL));		
		
		shell.pack();
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();

	}

}

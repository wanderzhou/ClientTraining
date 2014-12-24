package training.w1.d3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import training.Util;

public class TextMain {

	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("Basic Widgets Sample - Text");
		
		Util.centerWindow(500, 360, shell);
		
		RowData rowData = new RowData(150, 30);
		
		Text txtLeft = new Text(shell, SWT.LEFT);
		txtLeft.setText("Left alignment");
		txtLeft.setLayoutData(rowData);
		
		
		Text txtCenter = new Text(shell, SWT.CENTER);
		txtCenter.setText("Center alignment");
		txtCenter.setLayoutData(rowData);
		
		Text txtRight = new Text(shell, SWT.RIGHT);
		txtRight.setText("Right alignment");
		txtRight.setLayoutData(rowData);
		
		Text txtReadonly = new Text(shell, SWT.LEFT|SWT.READ_ONLY);
		txtReadonly.setText("Read only text box.");
		txtReadonly.setLayoutData(rowData);
		
		Text txtPassword = new Text(shell, SWT.LEFT|SWT.PASSWORD);
		txtPassword.setText("password");
		txtPassword.setLayoutData(rowData);
		
		Text txtDisabled = new Text(shell, SWT.LEFT);
		txtDisabled.setText("Disabled text box");
		txtDisabled.setEnabled(false);
		txtDisabled.setLayoutData(rowData);
		
		Text txtMulti = new Text(shell, SWT.LEFT|SWT.MULTI);
		txtMulti.setText("Multiple lines text box. " + System.lineSeparator() + "Second line ..." + System.lineSeparator() + "Third line.");
		txtMulti.setLayoutData(new RowData(460, 200));
		
		RowLayout rowLayout = new RowLayout();
		rowLayout.marginLeft = 10;
		
		shell.setLayout(rowLayout);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
		

	}

}

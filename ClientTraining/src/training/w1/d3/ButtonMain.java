package training.w1.d3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import training.Util;

public class ButtonMain {

	public static void main(String[] args) {
		
		int controlWidth = 100;
		int controlHeight = 40;
		
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("Basic Widgets Sample - Button");
		
		Util.centerWindow(440, 300, shell);
		
		RowData rowData = new RowData(controlWidth, controlHeight);
		
		//normal button
		Button butA = new Button(shell, SWT.CENTER);
		butA.setText("A");
		butA.setLayoutData(rowData);
		
		Button butB = new Button(shell, SWT.LEFT);
		butB.setText("B");
				
		Button butC = new Button(shell, SWT.RIGHT);
		butC.setText("C");
		
		//toggle button
		Button butToggle = new Button(shell, SWT.CENTER|SWT.TOGGLE);
		butToggle.setText("Toggle");
		
		//radio
		Button butRad1 = new Button(shell, SWT.RADIO);
		butRad1.setText("Item 1");

		Button butRad2 = new Button(shell, SWT.RADIO);
		butRad2.setText("Item 2");

		Button butRad3 = new Button(shell, SWT.RADIO);
		butRad3.setText("Item 3");

		Button butRad4 = new Button(shell, SWT.RADIO);
		butRad4.setText("Item 4");
		
		//checkbox
		Button butCheck1 = new Button(shell, SWT.CHECK);
		butCheck1.setText("Option A");
		
		Button butCheck2 = new Button(shell, SWT.CHECK);
		butCheck2.setText("Option B");
		
		Button butCheck3 = new Button(shell, SWT.CHECK);
		butCheck3.setText("Option C");
		
		Button butCheck4 = new Button(shell, SWT.CHECK);
		butCheck4.setText("Option D");
		
		//arrow
		Button butArrowTop = new Button(shell, SWT.ARROW|SWT.UP);
		Button butArrowDown = new Button(shell, SWT.ARROW|SWT.DOWN);
		Button butArrowLeft = new Button(shell, SWT.ARROW|SWT.LEFT);
		Button butArrowRight = new Button(shell, SWT.ARROW|SWT.RIGHT);		
		
		RowLayout rowLayout = new RowLayout();
		rowLayout.pack = false;
		shell.setLayout(rowLayout);

		shell.open();
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();

	}

}

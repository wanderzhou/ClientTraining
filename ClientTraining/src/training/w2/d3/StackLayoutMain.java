package training.w2.d3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import training.Util;

public class StackLayoutMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.setText("Layout Sample - StackLayout");
		
		Util.centerWindow(600, 400, shell);
		
		//stack layout for button array
		final Composite composite = new Composite(shell, SWT.NONE);
		final Button[] buttons = new Button[10];
		
		for(int i = 0; i < 10; i++) {
			buttons[i] = new Button(composite, SWT.NONE);
			buttons[i].setText("Button " + (i + 1));
		}
		
		final StackLayout stackLayout = new StackLayout();
		composite.setLayout(stackLayout);
		stackLayout.topControl= buttons[0];
				
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		//button
		Button butShow = new Button(shell, SWT.PUSH);
		butShow.setText("Show Next Button");
		butShow.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		final int[] index = new int[1];
		butShow.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {				
				System.out.println("Event : widgetSelected");
				index[0] = (index[0] + 1) % 10;
				stackLayout.topControl= buttons[index[0]];
				composite.layout();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				System.out.println("Event : widgetDefaultSelected");				
			}
			
		});
		
		shell.setLayout(new GridLayout());
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();

	}

}

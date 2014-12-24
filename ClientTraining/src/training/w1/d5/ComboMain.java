package training.w1.d5;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import training.Util;

public class ComboMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Widgets Sample - Combo");
		
		//center window
		Util.centerWindow(600, 400, shell);
		
		//label simple
		Label labSimple = new Label(shell, SWT.LEFT);
		labSimple.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//label drop down
		Label labDropdown = new Label(shell, SWT.LEFT);
		labDropdown.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//label readonly
		Label labReadonly = new Label(shell, SWT.LEFT);
		labReadonly.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//combo simple
		Combo cmbSimple = new Combo(shell, SWT.SIMPLE);
		cmbSimple.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		for (int i = 1; i <= 10; i++) {
			cmbSimple.add(String.format("Item %02d", i));
		}
		
		//combo drop down
		Combo cmbDropdown = new Combo(shell, SWT.DROP_DOWN);
		cmbDropdown.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		for (int i = 1; i <= 10; i++) {
			cmbDropdown.add(String.format("Item %02d", i));
		}
		//default selected
		cmbDropdown.select(4);
					
		//combo readonly
		Combo cmbReadonly = new Combo(shell, SWT.DROP_DOWN|SWT.READ_ONLY);
		cmbReadonly.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		for (int i = 1; i <= 10; i++) {
			cmbReadonly.add(String.format("Item %02d", i));
		}		
		//default selected
		cmbReadonly.select(6);				
		
		GridLayout layout = new GridLayout(3, true);
		
		shell.setLayout(layout);
		
		
		shell.open();
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();

	}

}

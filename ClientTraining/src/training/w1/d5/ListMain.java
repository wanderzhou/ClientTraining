package training.w1.d5;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

import training.Util;

public class ListMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		
		shell.setText("Widgets Sample - List");
		Util.centerWindow(600, 400, shell);

		Label labSingle = new Label(shell, SWT.LEFT);
		labSingle.setText("Single Selection");

		GridData gdSingle = new GridData(SWT.FILL, SWT.FILL, true, false);
		labSingle.setLayoutData(gdSingle);

		Label labMultiple = new Label(shell, SWT.LEFT);
		labMultiple.setText("Multiple Selection");

		GridData gdMultiple =  new GridData(SWT.FILL, SWT.FILL, true, false);
		labMultiple.setLayoutData(gdMultiple);

		final List lstSingle = new List(shell, SWT.SINGLE);

		// add item
		for (int i = 1; i <= 10; i++) {
			lstSingle.add(String.format("Item %02d", i));
		}

		GridData gdLstSingle =  new GridData(SWT.FILL, SWT.FILL, true, false);
		lstSingle.setLayoutData(gdLstSingle);

		final List lstMultiple = new List(shell, SWT.MULTI);
		// add item
		for (int i = 1; i <= 10; i++) {
			lstMultiple.add(String.format("Item %02d", i));
		}

		GridData gdLstMultiple =  new GridData(SWT.FILL, SWT.FILL, true, false);
		lstMultiple.setLayoutData(gdLstMultiple);

		GridLayout layout = new GridLayout(2, true);

		shell.setLayout(layout);

		lstSingle.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				//
				System.out.println(lstSingle.getSelection()[0]);
			}
		});

		lstMultiple.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] selections = lstMultiple.getSelection();
				for (String str : selections) {
					System.out.println(str);
				}
			}
		});

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}

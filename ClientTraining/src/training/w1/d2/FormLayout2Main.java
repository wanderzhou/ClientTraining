package training.w1.d2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FormLayout2Main {

	public static void main(String[] args) {
		
		int defaultWidthHeight = 50;
		Display display = new Display();
		
		Shell shell = new Shell(display);
		
		Button butTopLeft = new Button(shell, SWT.PUSH);
		butTopLeft.setText("Top Left");
		
		Button butTopCenter = new Button(shell, SWT.PUSH);
		butTopCenter.setText("Top Center");

		Button butTopRight = new Button(shell, SWT.PUSH);
		butTopRight.setText("Top Right");

		Button butBottomLeft = new Button(shell, SWT.PUSH);
		butBottomLeft.setText("Bottom Left");

		Button butBottomRight = new Button(shell, SWT.PUSH);
		butBottomRight.setText("Bottom Right");
		
		FormLayout formLayout = new FormLayout();
		shell.setLayout(formLayout);
		
		FormData formDataTopLeft = new FormData();
		formDataTopLeft.left = new FormAttachment(0, 0);
		formDataTopLeft.top = new FormAttachment(0, 0);
		formDataTopLeft.height = defaultWidthHeight;
		formDataTopLeft.width = shell.getClientArea().width/3;
		butTopLeft.setLayoutData(formDataTopLeft);
		
		FormData formDataTopCenter = new FormData();
		formDataTopCenter.left = new FormAttachment(butTopLeft, 0, SWT.RIGHT);
		formDataTopCenter.top = new FormAttachment(0, 0);
		formDataTopCenter.width = shell.getClientArea().width/3;
		formDataTopCenter.height = defaultWidthHeight;
		butTopCenter.setLayoutData(formDataTopCenter);
		
		FormData formDataTopRight = new FormData();
		formDataTopRight.left = new FormAttachment(butTopCenter, 0, SWT.RIGHT);
		formDataTopRight.top = new FormAttachment(0, 0);
		formDataTopRight.height = defaultWidthHeight;
		formDataTopRight.width = shell.getClientArea().width/3;
		butTopRight.setLayoutData(formDataTopRight);
		
		FormData formDataBottomLeft = new FormData();
		formDataBottomLeft.left = new FormAttachment(butTopLeft, 0, SWT.LEFT);
		formDataBottomLeft.top = new FormAttachment(butTopLeft, shell.getClientArea().height - defaultWidthHeight, SWT.TOP);
		formDataBottomLeft.width = shell.getClientArea().width/3;
		formDataBottomLeft.height = defaultWidthHeight;
		butBottomLeft.setLayoutData(formDataBottomLeft);
		
		FormData formDataBottomRight = new FormData();
		formDataBottomRight.top = new FormAttachment(butBottomLeft, 0 , SWT.TOP);
		formDataBottomRight.left = new FormAttachment(butBottomLeft, shell.getClientArea().width/3, SWT.RIGHT);
		formDataBottomRight.width = shell.getClientArea().width/3;
		formDataBottomRight.height = defaultWidthHeight;
		butBottomRight.setLayoutData(formDataBottomRight);
				
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		shell.dispose();

		
	}

}

package training.w1.d2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FormLayoutMain {

	public static void main(String[] args) {
		
		int defaultWidthHeight = 50;
		Display display = new Display();
		
		Shell shell = new Shell(display);
		
		Button butLeft = new Button(shell, SWT.PUSH);
		butLeft.setText("Left");
		
		Button butTop = new Button(shell, SWT.PUSH);
		butTop.setText("Top");

		Button butRight = new Button(shell, SWT.PUSH);
		butRight.setText("Right");

		Button butBottom = new Button(shell, SWT.PUSH);
		butBottom.setText("Bottom");

		Button butCenter = new Button(shell, SWT.PUSH);
		butCenter.setText("Center");
		
		FormLayout formLayout = new FormLayout();
		shell.setLayout(formLayout);
		
		FormData formDataLeft = new FormData();
		formDataLeft.left = new FormAttachment(0, 0);
		formDataLeft.top = new FormAttachment(0, 0);
		formDataLeft.height = shell.getClientArea().height;
		formDataLeft.width = defaultWidthHeight;
		butLeft.setLayoutData(formDataLeft);
		
		FormData formDataTop = new FormData();
		formDataTop.left = new FormAttachment(butLeft);
		formDataTop.top = new FormAttachment(0, 0);
		formDataTop.width = shell.getClientArea().width - 2 * defaultWidthHeight;
		formDataTop.height = defaultWidthHeight;
		butTop.setLayoutData(formDataTop);
		
		FormData formDataRight = new FormData();
		formDataRight.left = new FormAttachment(butTop, 0, SWT.RIGHT);
		formDataRight.top = new FormAttachment(0, 0);
		formDataRight.height = shell.getClientArea().height - defaultWidthHeight;
		formDataRight.width = defaultWidthHeight;
		butRight.setLayoutData(formDataRight);
		
		FormData formDataCenter = new FormData();
		formDataCenter.left = new FormAttachment(butLeft, 0, SWT.RIGHT);
		formDataCenter.top = new FormAttachment(butTop, 0, SWT.BOTTOM);
		formDataCenter.width = shell.getClientArea().width - 2 * defaultWidthHeight;
		formDataCenter.height = shell.getClientArea().height - 2 * defaultWidthHeight;
		butCenter.setLayoutData(formDataCenter);
		
		FormData formDataBottom = new FormData();
		formDataBottom.top = new FormAttachment(butCenter, 0 , SWT.BOTTOM);
		formDataBottom.left = new FormAttachment(butLeft, 0, SWT.RIGHT);
		formDataBottom.width = shell.getClientArea().width - defaultWidthHeight;
		formDataBottom.height = defaultWidthHeight;
		butBottom.setLayoutData(formDataBottom);
				
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		shell.dispose();

		
	}

}

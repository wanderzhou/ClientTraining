package training.w1.d4;



import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import training.Util;

public class EnGridLayoutMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("GridLayout Sample");
		shell.setBackground(new Color(null, new RGB(0, 0, 255)));
		
		Util.centerWindow(540, 320, shell);
				
		//line 1
		//id
		Label labId = new Label(shell, SWT.RIGHT);
		labId.setText("Id:");
		labId.setLayoutData(new GridData(SWT.FILL, SWT.END, true, false));
		
		//text
		Text txtId = new Text(shell, SWT.NONE);
		txtId.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//name
		Label labName = new Label(shell, SWT.RIGHT);
		labName.setText("Name:");
		labName.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//text
		Text txtName = new Text(shell, SWT.NONE);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		
		//password
		Label labPassword = new Label(shell, SWT.RIGHT);
		labPassword.setText("Password:");
		GridData gdPassword = new GridData(SWT.FILL, SWT.NONE, true, false); 
		gdPassword.horizontalAlignment = SWT.RIGHT;
		labPassword.setLayoutData(gdPassword);
		
		//right part
		Composite comp = new Composite(shell, SWT.NONE);
		
		Text txtPassword = new Text(comp, SWT.PASSWORD);
		txtPassword.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Group group = new Group(comp, SWT.NONE);
		group.setText("Features");		
		
		Button butFeature1 = new Button(group, SWT.CHECK);
		butFeature1.setText("Feature 1");
		
		Button butFeature2 = new Button(group, SWT.CHECK);
		butFeature2.setText("Feature 2");
		
		Button butFeature3 = new Button(group, SWT.CHECK);
		butFeature3.setText("Feature 3");
		
		Button butFeature4 = new Button(group, SWT.CHECK);
		butFeature4.setText("Feature 4");
		
		group.setLayout(new FillLayout(SWT.NONE));
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label labSpacing = new Label(comp, SWT.CENTER);
		labSpacing.setBackground(new Color(null, new RGB(0, 255, 0)));
		labSpacing.setText("Spacing");		
		labSpacing.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		
		comp.setLayout(new GridLayout(1, true));
		
		GridData gdRight = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdRight.verticalSpan = 5;
		gdRight.verticalAlignment = SWT.TOP;
		comp.setLayoutData(gdRight);
		
		//line 2
		Button butRadio1 = new Button(shell, SWT.RADIO);
		butRadio1.setText("O1");
		butRadio1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Button butRadio2 = new Button(shell, SWT.RADIO|SWT.CENTER);
		butRadio2.setText("O2");
		GridData gdR2 = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdR2.horizontalAlignment = SWT.CENTER;
		butRadio2.setLayoutData(gdR2);
		
		Button butRadio3 = new Button(shell, SWT.RADIO);
		butRadio3.setText("O3");
		GridData gdR3 = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdR3.horizontalAlignment = SWT.RIGHT;		
		butRadio3.setLayoutData(gdR3);
		
		Text txtLine2 = new Text(shell, SWT.LEFT);
		GridData gdLine2 = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdLine2.horizontalSpan = 2;
		txtLine2.setLayoutData(gdLine2);
		
		//line 3
		Label labL1 = new Label(shell, SWT.LEFT);
		labL1.setText("L1:");
		labL1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Text txtL1 = new Text(shell, SWT.NONE);
		txtL1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Label labL2 = new Label(shell, SWT.RIGHT);
		labL2.setText("L2:");
		labL2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Text txtL2 = new Text(shell, SWT.NONE);
		txtL2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Button butRefresh = new Button(shell, SWT.CENTER);
		butRefresh.setText("Refresh");
		GridData gdRefresh = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdRefresh.horizontalAlignment = SWT.RIGHT;
		butRefresh.setLayoutData(gdRefresh);
		
		//line 4
		Label labDescription = new Label(shell, SWT.LEFT);
		labDescription.setText("Description:");
		GridData gdDescription = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdDescription.horizontalSpan = 4;
		labDescription.setLayoutData(gdDescription);
		
		Button butAccept = new Button(shell, SWT.CHECK);
		butAccept.setText("Accept");
		GridData gdAccept = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdAccept.horizontalAlignment = SWT.RIGHT;
		butAccept.setLayoutData(gdAccept);
		
		Text txtContent = new Text(shell, SWT.NONE);
		GridData gdContent = new GridData(SWT.FILL, SWT.FILL, true, false);
		gdContent.horizontalSpan = 5;
		txtContent.setLayoutData(gdContent);
		
		//line 5
		//last row
		Composite compBottom = new Composite(shell, SWT.NONE);
		compBottom.setBackground(new Color(null, new RGB(255, 0, 0)));

		
		/*Label labEmpty = new Label(compBottom, SWT.NONE);
		labEmpty.setBackground(new Color(null, new RGB(255, 0, 0)));
		labEmpty.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));*/
		
		Button butOk = new Button(compBottom, SWT.CENTER);
		butOk.setText("Ok");
		GridData gdOk = new GridData(SWT.FILL, SWT.CENTER, true, false);

		butOk.setLayoutData(gdOk);
		
		/*Label labEmpty2 = new Label(compBottom, SWT.NONE);
		labEmpty2.setBackground(new Color(null, new RGB(255, 0, 0)));
		labEmpty2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));*/	
		
		Button butCancel = new Button(compBottom, SWT.CENTER);
		butCancel.setText("Cancel");
		GridData gdCancel = new GridData(SWT.FILL, SWT.CENTER, true, false);

		butCancel.setLayoutData(gdCancel);

		/*Label labEmpty4 = new Label(compBottom, SWT.NONE);
		labEmpty4.setBackground(new Color(null, new RGB(255, 0, 0)));
		labEmpty4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));*/		
		
		//
		GridLayout gdCompBottom = new GridLayout(2, true);
		gdCompBottom.horizontalSpacing = shell.getBounds().width/5;
		gdCompBottom.marginLeft = shell.getBounds().width/5;
		gdCompBottom.marginRight = shell.getBounds().width/5;

		compBottom.setLayout(gdCompBottom);
		
		GridData gdBottom = new GridData(SWT.FILL, SWT.CENTER, true, false, 6, 1);
		compBottom.setLayoutData(gdBottom);
		
		GridLayout gridLayout = new GridLayout(6, false);
		gridLayout.marginTop = 5;
		gridLayout.marginBottom = 5;
		gridLayout.marginLeft = 5;
		gridLayout.marginRight = 5;
		
		shell.setLayout(gridLayout);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}

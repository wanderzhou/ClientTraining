package training.w1.d4;



import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import training.Util;

public class GridLayoutMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("GridLayout Sample");
		shell.setBackground(new Color(null, new RGB(0, 0, 255)));
		
		Util.centerWindow(540, 320, shell);
		
		int w50 =50;
		int w70 = 70;
		int w60 = 60;
		int w80 = 80;		
		int w100 = 100;
		int h20 = 20;
		
		//line 1
		//id
		Label labId = new Label(shell, SWT.RIGHT);
		labId.setText("Id:");
		labId.setLayoutData(new GridData(w50, h20));
		
		//text
		Text txtId = new Text(shell, SWT.NONE);
		txtId.setLayoutData(new GridData(w100, h20));
		
		//name
		Label labName = new Label(shell, SWT.RIGHT);
		labName.setText("Name:");
		labName.setLayoutData(new GridData(w50, h20));
		
		//text
		Text txtName = new Text(shell, SWT.NONE);
		txtName.setLayoutData(new GridData(w100, h20));
		
		//password
		Label labPassword = new Label(shell, SWT.RIGHT);
		labPassword.setText("Password:");
		GridData gdPassword = new GridData(w70, h20); 
		gdPassword.horizontalAlignment = SWT.RIGHT;
		labPassword.setLayoutData(gdPassword);
		
		//right part
		Composite comp = new Composite(shell, SWT.NONE);
		//comp.setBounds(0, 0, 150, 250);
		
		Text txtPassword = new Text(comp, SWT.PASSWORD);
		txtPassword.setLayoutData(new RowData(w100, h20));
		
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
		group.setLayoutData(new RowData(w100, 4 * h20));
		
		Label labSpacing = new Label(comp, SWT.CENTER);
		labSpacing.setBackground(new Color(null, new RGB(0, 255, 0)));
		labSpacing.setText("Spacing");		
		labSpacing.setLayoutData(new RowData(w80, 3 * h20));
		
		
		comp.setLayout(new RowLayout(SWT.VERTICAL));
		GridData gdRight = new GridData(w100, 10 * h20);
		gdRight.verticalSpan = 5;
		gdRight.verticalAlignment = SWT.TOP;
		comp.setLayoutData(gdRight);
		
		//line 2
		Button butRadio1 = new Button(shell, SWT.RADIO);
		butRadio1.setText("O1");
		butRadio1.setLayoutData(new GridData(w50, h20));
		
		Button butRadio2 = new Button(shell, SWT.RADIO|SWT.CENTER);
		butRadio2.setText("O2");
		GridData gdR2 = new GridData(w50, h20);
		gdR2.horizontalAlignment = SWT.CENTER;
		butRadio2.setLayoutData(gdR2);
		
		Button butRadio3 = new Button(shell, SWT.RADIO);
		butRadio3.setText("O3");
		GridData gdR3 = new GridData(w50, h20);
		gdR3.horizontalAlignment = SWT.RIGHT;		
		butRadio3.setLayoutData(new GridData(w50, h20));
		
		Text txtLine2 = new Text(shell, SWT.LEFT);
		GridData gdLine2 = new GridData(w100 + 30, h20);
		gdLine2.horizontalSpan = 2;
		txtLine2.setLayoutData(gdLine2);
		
		//line 3
		Label labL1 = new Label(shell, SWT.LEFT);
		labL1.setText("L1:");
		labL1.setLayoutData(new GridData(w50/2, h20));
		
		Text txtL1 = new Text(shell, SWT.NONE);
		txtL1.setLayoutData(new GridData(w100, h20));
		
		Label labL2 = new Label(shell, SWT.LEFT);
		labL2.setText("L2:");
		labL2.setLayoutData(new GridData(w50/2, h20));
		
		Text txtL2 = new Text(shell, SWT.NONE);
		txtL2.setLayoutData(new GridData(w100, h20));
		
		Button butRefresh = new Button(shell, SWT.CENTER);
		butRefresh.setText("Refresh");
		GridData gdRefresh = new GridData(w70, h20);
		gdRefresh.horizontalAlignment = SWT.RIGHT;
		butRefresh.setLayoutData(gdRefresh);
		
		//line 4
		Label labDescription = new Label(shell, SWT.LEFT);
		labDescription.setText("Description:");
		GridData gdDescription = new GridData(3 * w100, h20);
		gdDescription.horizontalSpan = 4;
		labDescription.setLayoutData(gdDescription);
		
		Button butAccept = new Button(shell, SWT.CHECK);
		butAccept.setText("Accept");
		GridData gdAccept = new GridData(w60, h20);
		gdAccept.horizontalAlignment = SWT.RIGHT;
		butAccept.setLayoutData(gdAccept);
		
		Text txtContent = new Text(shell, SWT.NONE);
		GridData gdContent = new GridData(4 * w100, 5 * h20);
		gdContent.horizontalSpan = 5;
		txtContent.setLayoutData(gdContent);
		
		//line 5
		//last row
		Composite compBottom = new Composite(shell, SWT.NONE);
		compBottom.setBackground(new Color(null, new RGB(255, 0, 0)));
		
		Button butOk = new Button(compBottom, SWT.CENTER);
		butOk.setText("Ok");
		
		
		Button butCancel = new Button(compBottom, SWT.CENTER);
		butCancel.setText("Cancel");
		
		FillLayout bottomLayout = new FillLayout(SWT.HORIZONTAL);
		bottomLayout.marginWidth = 500/4;
		bottomLayout.marginHeight = h20/2;
		bottomLayout.spacing = 500/8;
		compBottom.setLayout(bottomLayout);
		
		GridData gdBottom = new GridData(510, 60);
		gdBottom.horizontalAlignment = SWT.CENTER;
		gdBottom.horizontalSpan = 6;
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
		shell.dispose();

	}

}

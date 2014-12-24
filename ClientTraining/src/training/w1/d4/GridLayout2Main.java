package training.w1.d4;



import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import training.Util;

public class GridLayout2Main {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("GridLayout Sample");
		//shell.setBackground(new Color(null, new RGB(0, 0, 255)));
		
		Util.centerWindow(650, 440, shell);
		
		int marginLeft = 10;
		int marginRight = 10;
		int marginTop = 10;
		int marginBottom = 10;
		int spacing =10;
		
		int w50 = 50;
		int w70 = 70;
		int w60 = 60;
		int w80 = 80;		
		int w100 = 100;
		int h20 = 20;
		
		//left composite
		Composite compLeft = new Composite(shell, SWT.NONE);
		
		//left-top group
		Group group = new Group(compLeft, SWT.NONE);		
		
		Label labPrefix = new Label(group, SWT.RIGHT);
		labPrefix.setText("Prefix:");
		GridData gdPrefix = new GridData(w50, h20);
		gdPrefix.horizontalAlignment = SWT.RIGHT;
		labPrefix.setLayoutData(gdPrefix);
		
		Text txtPrefix = new Text(group, SWT.NONE);
		GridData gdTxtPrefix = new GridData(120, h20);
		gdTxtPrefix.horizontalSpan = 2;
		txtPrefix.setLayoutData(gdTxtPrefix);
		
		Label lblEmpty = new Label(group, SWT.NONE);
		lblEmpty.setLayoutData(new GridData());		
		
		Label labProfile = new Label(group, SWT.RIGHT);
		labProfile.setText("Profile:");
		GridData gdProfile = new GridData(w50, h20);
		gdProfile.horizontalAlignment = SWT.RIGHT;
		labProfile.setLayoutData(gdProfile);
			
		Combo cmbProfile = new Combo(group, SWT.DROP_DOWN);
		GridData gdCmbProfile = new GridData(w50, h20);
		cmbProfile.setLayoutData(gdCmbProfile);
		
		Button butLeft1 = new Button(group, SWT.NONE);
		GridData gdButLeft1 = new GridData(w50, h20);
		butLeft1.setLayoutData(gdButLeft1);		
		
		Button butLeft2 = new Button(group, SWT.NONE);
		GridData gdButLeft2 = new GridData(w50, h20);
		butLeft2.setLayoutData(gdButLeft2);
		

		GridLayout glLeftTop = new GridLayout(4, false);
		group.setLayout(glLeftTop);
		
		GridData gdLeftTop = new GridData(250, 100);
		gdLeftTop.horizontalAlignment = SWT.BEGINNING;
		group.setLayoutData(gdLeftTop);
		
		//left-bottom list
		List lstLeft = new List(compLeft, SWT.SINGLE);
		GridData gdLstLeft = new GridData(250, 200);
		lstLeft.setLayoutData(gdLstLeft);
				

		//left GridLayout
		GridLayout glLeft = new GridLayout(1, true);
		glLeft.marginTop = 5;
		glLeft.marginBottom = 5;
		glLeft.marginLeft = 5;
		glLeft.marginRight = 5;
		
		compLeft.setLayout(glLeft);
		
		//left GridData
		GridData gdLeft = new GridData(280, 380);
		gdLeft.horizontalAlignment = SWT.BEGINNING;
		compLeft.setLayoutData(gdLeft);
		
		//right composite
		Composite comRight = new Composite(shell, SWT.NONE);
		
		//right-top group
		Group groupRightTop = new Group(comRight, SWT.NONE);
		
		Button butNew = new Button(groupRightTop, SWT.CENTER);
		butNew.setText("New");
		GridData gdButNew = new GridData(w80, h20);
		gdButNew.horizontalAlignment = SWT.CENTER;
		butNew.setLayoutData(new RowData(w80, h20));
		
		Button butDelete = new Button(groupRightTop, SWT.CENTER);
		GridData gdButDelete = new GridData(w80, h20);
		gdButDelete.horizontalAlignment = SWT.CENTER;		
		butDelete.setLayoutData(new RowData(w80, h20));
		butDelete.setText("Delete");
		
		Button butSave = new Button(groupRightTop, SWT.CENTER);
		butSave.setText("Save");
		GridData gdButSave = new GridData(w80, h20);
		gdButSave.horizontalAlignment = SWT.CENTER;		
		butSave.setLayoutData(new RowData(w80, h20));
		
		RowLayout rlRightTop = new RowLayout(SWT.HORIZONTAL);
		rlRightTop.center = true;
		rlRightTop.spacing = 15;
		rlRightTop.marginLeft = 15;
		rlRightTop.marginRight = 15;
		groupRightTop.setLayout(rlRightTop);
		
		GridData gdRightTop = new GridData(300, 30);
		gdRightTop.horizontalAlignment = SWT.BEGINNING;
		groupRightTop.setLayoutData(gdRightTop);
		
		//right-bottom group
		Group groupRightBottom = new Group(comRight, SWT.NONE);
		
		//login line
		Label labLoginId = new Label(groupRightBottom, SWT.RIGHT);
		labLoginId.setText("Login Id:");
		GridData gdL11 = new GridData(150, h20);
		labLoginId.setLayoutData(gdL11);
		
		Text txtLoginId = new Text(groupRightBottom, SWT.NONE);
		GridData gdL12 = new GridData(120, h20);
		txtLoginId.setLayoutData(gdL12);
		
		//password line
		Label labPassword = new Label(groupRightBottom, SWT.RIGHT);
		labPassword.setText("Password:");
		GridData gdL21 = new GridData(150, h20);
		labPassword.setLayoutData(gdL21);
		
		Text txtPassword = new Text(groupRightBottom, SWT.PASSWORD);
		GridData gdL22 = new GridData(120, h20);
		txtPassword.setLayoutData(gdL22);		
		
		//re-password line
		Label labPassword2 = new Label(groupRightBottom, SWT.RIGHT);
		labPassword2.setText("Confirm Password:");
		GridData gdL31 = new GridData(150, h20);
		labPassword2.setLayoutData(gdL31);
		
		Text txtPassword2 = new Text(groupRightBottom, SWT.PASSWORD);
		GridData gdL32 = new GridData(120, h20);
		txtPassword2.setLayoutData(gdL32);			
		
		//pfofile
		Label labRightProfile = new Label(groupRightBottom, SWT.RIGHT);
		labRightProfile.setText("Profile:");
		GridData gdL41 = new GridData(150, h20);
		labRightProfile.setLayoutData(gdL41);
		
		Combo cmbRightProfile = new Combo(groupRightBottom, SWT.DROP_DOWN);
		cmbRightProfile.setEnabled(false);
		GridData gdL42 = new GridData(100, h20);
		cmbRightProfile.setLayoutData(gdL42);	
		
		//platform
		Label labPlatform = new Label(groupRightBottom, SWT.RIGHT);
		labPlatform.setText("Platform:");
		GridData gdL51 = new GridData(150, h20);
		labPlatform.setLayoutData(gdL51);
		
		Combo cmbPlatform = new Combo(groupRightBottom, SWT.DROP_DOWN);
		cmbPlatform.setEnabled(false);
		GridData gdL52 = new GridData(100, h20);
		cmbPlatform.setLayoutData(gdL52);		
		
		//tips
		Label labTips = new Label(groupRightBottom, SWT.WRAP|SWT.BORDER);
		labTips.setText("Tips: if you want to reset password, then input the new one, or please let the password be empty.");
		labTips.setSize(260, 50);
		GridData gdL6 = new GridData(280, 50);
		gdL6.horizontalSpan = 2;
		labTips.setLayoutData(gdL6);
		
		//right-bottom layout
		GridLayout glRightBottom = new GridLayout(2, false);
		groupRightBottom.setLayout(glRightBottom);
		GridData gdRightBottom = new GridData(300, 250);
		groupRightBottom.setLayoutData(gdRightBottom);
				
		GridLayout glRight = new GridLayout(1, true);
		comRight.setLayout(glRight);
		
		//right GridData
		GridData gdRight = new GridData(350, 380);
		gdRight.verticalAlignment = SWT.BEGINNING;
		comRight.setLayoutData(gdRight);
		
		//top level layout
		GridLayout gridLayout = new GridLayout(2, false);
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

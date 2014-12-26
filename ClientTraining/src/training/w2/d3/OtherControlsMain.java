package training.w2.d3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

import training.Util;

public class OtherControlsMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);

		shell.setText("Widgets Sample - Misc");
		Util.centerWindow(600, 400, shell);

		//left-top
		Group groupLeftTop = new Group(shell, SWT.NONE);
		groupLeftTop.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		//right-top
		Group groupRightTop = new Group(shell, SWT.NONE);
		
		Label labP1 = new Label(groupRightTop, SWT.SHADOW_IN);
		labP1.setText("This is a very simple");
		
		Link link = new Link(groupRightTop, SWT.NONE);
		link.setText("<a href=\"www.ossera.com\">link</a>");

		Label labP2 = new Label(groupRightTop, SWT.NONE);
		labP2.setText("Widget.");		
		
		groupRightTop.setLayout(new RowLayout());
		
		groupRightTop.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		//left-bottom
		Group groupLeftBottom = new Group(shell, SWT.NONE);
		groupLeftBottom.setText("A Group");
		
		groupLeftBottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		//right-bottom
		Group groupRightBottom = new Group(shell, SWT.SHADOW_IN);
		TabFolder tabf = new TabFolder(groupRightBottom, SWT.TOP);
		//create TabItem
		TabItem tabItem1 = new TabItem(tabf, SWT.NONE);
		tabItem1.setText("Page 1");
		TabItem tabItem2 = new TabItem(tabf, SWT.NONE);
		tabItem2.setText("Page 2");
		TabItem tabItem3 = new TabItem(tabf, SWT.NONE);
		tabItem3.setText("Page 3");
		
		DateTime datetime = new DateTime(tabf, SWT.CALENDAR);
		tabItem1.setControl(datetime);
		
		
		//default selection
		tabf.setSelection(tabItem1);
		
		groupRightBottom.setLayout(new FillLayout());
		
		groupRightBottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		

		//layout
		GridLayout layout = new GridLayout(2, false);
		shell.setLayout(layout);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}

}

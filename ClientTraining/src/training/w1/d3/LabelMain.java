package training.w1.d3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import training.Util;

/**
 * 
 * RowLayout
 * 
 * @author admin
 *
 */
public class LabelMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Basic Widgets Sample - Label");
		
		Util.centerWindow(440, 180, shell);	
		
		int labelWidth = 180;
		int labelHeight = 30;
		
		Label labNormal = new Label(shell, SWT.LEFT);
		labNormal.setText("A normail static text.");
		labNormal.setLayoutData(new RowData(labelWidth, labelHeight));

		Label labCenter = new Label(shell, SWT.CENTER);
		labCenter.setText("Text aligned as center.");
		labCenter.setLayoutData(new RowData(labelWidth, labelHeight));

		Label labRight = new Label(shell, SWT.RIGHT);
		labRight.setText("Text aligned to right.");
		labRight.setLayoutData(new RowData(labelWidth, labelHeight));
		
		Label labHorizontalSeparatorLeft = new Label(shell, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.SHADOW_IN);
		labHorizontalSeparatorLeft.setLayoutData(new RowData(labelWidth, 5));
		
		Label labBottomDisable = new Label(shell, SWT.LEFT);
		labBottomDisable.setEnabled(false);
		labBottomDisable.setText("A disabled text.");
		labBottomDisable.setLayoutData(new RowData(labelWidth, labelHeight));
		
				
		Label labVerticalSeparator = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		labVerticalSeparator.setLayoutData(new RowData(5, 100));
		
		Label labEmpty = new Label(shell, SWT.NONE);
		labEmpty.setLayoutData(new RowData(5, labelHeight));

		Label labLongClipped = new Label(shell, SWT.LEFT);
		labLongClipped.setText("A very long text will be clipped, please click for detail.");
		labLongClipped.setLayoutData(new RowData(labelWidth, labelHeight));
		

		Label labLongWrapped = new Label(shell, SWT.WRAP);
		labLongWrapped.setText("A very long text will be wrapped to next line.");
		labLongWrapped.setLayoutData(new RowData(labelWidth, labelHeight));

		Label labEmptyRight = new Label(shell, SWT.NONE);
		labEmptyRight.setLayoutData(new RowData(5, labelHeight));
		
		Label labHorizontalSeparatorRight = new Label(shell, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.SHADOW_OUT);
		labHorizontalSeparatorRight.setLayoutData(new RowData(labelWidth, 5));

		
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.marginLeft = 20;
		rowLayout.marginRight = 20;
		shell.setLayout(rowLayout);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();

	}

}

package training.w1.d2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowLayoutMain {

	public static void main(String[] args) {
		//shell width
		int sw = 280;
		//shell height
		int sh = 230;
		
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("RowLayout");
		
		int w = shell.getMonitor().getClientArea().width;
		int h = shell.getMonitor().getClientArea().height;
		
		int x = (w - sw)/2;
		int y = (h - sh)/2;
		
		shell.setBounds(x, y, sw, sh);

		Button but1 = new Button(shell, SWT.PUSH);
		but1.setText("Button One");
		but1.setLayoutData(new RowData(100, 50));
		
		Button but2 = new Button(shell, SWT.PUSH);
		but2.setText("Button two");
		but2.setLayoutData(new RowData(120, 70));

		Button but3 = new Button(shell, SWT.PUSH);
		but3.setText("Button three");
		but3.setLayoutData(new RowData(130, 50));

		Button but4 = new Button(shell, SWT.PUSH);
		but4.setText("Button four");
		but4.setLayoutData(new RowData(110, 30));
		
		//RowLayout rowLayout = createRowLayout();
		
		//pack = true
		//RowLayout rowLayout = createRowLayout(true, false, false, false, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
		
		//fill = true, same height
		//RowLayout rowLayout = createRowLayout(true, true, true, false, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
		
		// 1) default
		//RowLayout rowLayout = createRowLayout(true, true, false, false, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
		
		// 2) center = true
		//RowLayout rowLayout = createRowLayout(true, true, false, true, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
		
		// 3) justify = true
		//RowLayout rowLayout = createRowLayout(true, true, false, false, true, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
		
		// 4) center = true
		//RowLayout rowLayout = createRowLayout(false, true, false, false, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);

		// 5) vertical
		//RowLayout rowLayout = createRowLayout(true, true, false, false, false, SWT.VERTICAL, 3, 3, 3, 3, 3);
		
		// 6) vertical center
		//RowLayout rowLayout = createRowLayout(true, true, false, true, false, SWT.VERTICAL, 3, 3, 3, 3, 3);
		
		// 7) vertical center
		//RowLayout rowLayout = createRowLayout(false, true, false, false, false, SWT.VERTICAL, 3, 3, 3, 3, 3);

		// 8) vertical justify
		RowLayout rowLayout = createRowLayout(true, true, false, false, true, SWT.VERTICAL, 3, 3, 3, 3, 3);
		
		shell.setLayout(rowLayout);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		shell.dispose();
		

	}
	
	public static RowLayout createRowLayout() {
		return createRowLayout(true, true, false, false, false, SWT.HORIZONTAL, 3, 3, 3, 3, 3);
	}

	public static RowLayout createRowLayout(boolean wrap, boolean pack, boolean fill, boolean center,
			boolean justify, int styleType, int marginLeft, int marginTop,
			int marginRight, int marginBottom, int spacing) {
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = wrap;				//default: true
		rowLayout.pack = pack;				//default: true
		rowLayout.fill = fill;				//default: false
		rowLayout.center = center;			//default: false
		rowLayout.justify = justify;		//default: false
		rowLayout.type = styleType;			//default:  SWT.HORIZONTAL
		rowLayout.marginLeft = marginLeft;  //default: 3
		rowLayout.marginTop = marginTop;
		rowLayout.marginRight = marginRight;
		rowLayout.marginBottom = marginBottom;
		rowLayout.spacing = spacing;
		
		return rowLayout;
	}

}

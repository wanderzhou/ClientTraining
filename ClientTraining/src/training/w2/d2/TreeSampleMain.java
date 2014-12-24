package training.w2.d2;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import training.Util;

public class TreeSampleMain {

	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setText("Widgets Sample - Tree");
		
		Util.centerWindow(600, 400, shell);
		
		//left tree
		Tree treeLeft = new Tree(shell, SWT.SINGLE|SWT.BORDER);

		//init
		initLeftTree(treeLeft);
		
		//show the whole left tree
		displayItemsOfTree(treeLeft);
		treeLeft.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		//right tree
		Tree treeRight = new Tree(shell, SWT.SINGLE|SWT.BORDER|SWT.CHECK);
		initRightTree(treeRight);
		
		//show the whole right tree
		displayItemsOfTree(treeRight);
		
		treeRight.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		//bottom tree
		Tree treeBottom = new Tree(shell, SWT.MULTI|SWT.BORDER);
		treeBottom.setHeaderVisible(true);
				
		initBottomTree(treeBottom);
		
		//column span = 2
		treeBottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		//show the whole bottom tree
		displayItemsOfTree(treeBottom);
		
		for(int i = 0; i < treeBottom.getColumnCount(); i++) {
			treeBottom.getColumn(i).pack();
		}
		
		shell.setLayout(new GridLayout(2, true));
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		display.dispose();		

	}
	

	/**
	 * initialize left tree
	 * 
	 * @param parent
	 */
	private static void initLeftTree(Tree parent) {
		TreeItem level11 = new TreeItem(parent, SWT.NONE);
		level11.setText("A(0)-0");
		
		TreeItem level12 = new TreeItem(parent, SWT.NONE);
		level12.setText("A(0)-1");
		
		TreeItem level121 = new TreeItem(level12, SWT.NONE);
		level121.setText("B(1)-0");

		TreeItem level122 = new TreeItem(level12, SWT.NONE);
		level122.setText("B(1)-1");
		
		TreeItem level123 = new TreeItem(level12, SWT.NONE);
		level123.setText("B(1)-2");
		
		TreeItem level1231 = new TreeItem(level123, SWT.NONE);
		level1231.setText("C(2)-0");

		TreeItem level1232 = new TreeItem(level123, SWT.NONE);
		level1232.setText("C(2)-1");

		TreeItem level1233 = new TreeItem(level123, SWT.NONE);
		level1233.setText("C(3)-0");				
	}
	
	/**
	 * initialize right tree
	 * 
	 * @param parent
	 */
	private static void initRightTree(Tree parent) {
		TreeItem level11 = new TreeItem(parent, SWT.NONE);
		level11.setText("Item(¢ñ)-0");
		
		TreeItem level12 = new TreeItem(parent, SWT.NONE);
		level12.setText("Item(¢ñ)-1");
		
		TreeItem level13 = new TreeItem(parent, SWT.NONE);
		level13.setText("Item(¢ñ)-2");
		
		TreeItem level131 = new TreeItem(level13, SWT.NONE);
		level131.setText("Item(¢ò)-0");
	
		TreeItem level1311 = new TreeItem(level131, SWT.NONE);
		level1311.setText("Item(¢ó)-0");

		TreeItem level1312 = new TreeItem(level131, SWT.NONE);
		level1312.setText("Item(¢ó)-1");

		TreeItem level1313 = new TreeItem(level131, SWT.NONE);
		level1313.setText("Item(¢ó)-2");
		
		TreeItem level1314 = new TreeItem(level131, SWT.NONE);
		level1314.setText("Item(¢ó)-3");
		
	}

	/**
	 * initialize bottom tree
	 * 
	 * @param treeBottom
	 */
	private static void initBottomTree(Tree treeBottom) {
		//set header
		TreeColumn treeCol1 = new TreeColumn(treeBottom, SWT.LEFT);
		treeCol1.setText("Column 1");
		
		TreeColumn treeCol2 = new TreeColumn(treeBottom, SWT.CENTER);
		treeCol2.setText("Column 2");

		TreeColumn treeCol3 = new TreeColumn(treeBottom, SWT.RIGHT);
		treeCol3.setText("Column 3");
		
		//set content
		TreeItem item1 = new TreeItem(treeBottom, SWT.NONE);
		item1.setText(0, "item 0");
		item1.setText(1, "book");
		item1.setText(2, "public");
		
		TreeItem item2 = new TreeItem(treeBottom, SWT.NONE);
		item2.setText(0, "item 1");
		item2.setText(1, "CD");
		item2.setText(2, "favorite");
		
		TreeItem item21 = new TreeItem(item2, SWT.NONE);
		item21.setText(0, "sub item 0");
		item21.setText(1, "Asia CD");
		item21.setText(2, "private");
		
		TreeItem item22 = new TreeItem(item2, SWT.NONE);
		item22.setText(0, "sub item 0");
		item22.setText(1, "Europe CD");
		item22.setText(2, "popular");		
		
		TreeItem item221 = new TreeItem(item22, SWT.NONE);
		item221.setText(0, "sub sub item 0");
		item221.setText(1, "France CD");
		item221.setText(2, "romantic");		

		TreeItem item222 = new TreeItem(item22, SWT.NONE);
		item222.setText(0, "sub sub item 0");
		item222.setText(1, "Germany CD");
		item222.setText(2, "classic");					
	}	
	
	/**
	 * show the whole tree
	 * 
	 * @param tree
	 */
	private static void displayItemsOfTree(Tree tree) {
		for(int i = 0; i < tree.getItemCount(); i++) {
			displayItem(tree, tree.getItem(i));
		}
	}


	/**
	 * show item iteratively
	 * 
	 * @param tree
	 * @param item
	 */
	private static void displayItem(Tree tree, TreeItem item) {
		tree.showItem(item);
		for(int i = 0; i < item.getItemCount(); i++) {
			displayItem(tree, item.getItem(i));
		}
		
	}
}

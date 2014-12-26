package training.w2.d5;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import training.Util;
import training.w2.d4.CustomTableLabelProvider;
import training.w2.d4.Group;
import training.w2.d4.Student;

public class TreeViewerMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("JFace Sample - TreeViewer");
		
		Util.centerWindow(500, 500, shell);
		
		TreeViewer treeViewer = new TreeViewer(shell, SWT.SINGLE|SWT.FULL_SELECTION);
		
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		TreeColumn col1 = new TreeColumn(tree, SWT.NONE);
		col1.setText("ID");

		TreeColumn col2 = new TreeColumn(tree, SWT.NONE);
		col2.setText("First Name");

		TreeColumn col3 = new TreeColumn(tree, SWT.NONE);
		col3.setText("Last Name");

		TreeColumn col4 = new TreeColumn(tree, SWT.NONE);
		col4.setText("Sex");

		TreeColumn col5 = new TreeColumn(tree, SWT.NONE);
		col5.setText("Age");
		
		treeViewer.setContentProvider(new TreeContentProvider());
		CustomTableLabelProvider treeLabelProvider = new CustomTableLabelProvider();
		treeViewer.setLabelProvider(treeLabelProvider);
		
		treeViewer.setInput(getInput());
		
		shell.setLayout(new FillLayout());	

		treeViewer.expandToLevel(2);
		
		for(int i = 0; i < tree.getColumnCount(); i++) {
			tree.getColumn(i).pack();
		}		
		
		shell.open();
		
		
		while(!shell.isDisposed()) {
			if(display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		//just test, do net need to invoke dispose method explicitly
		treeLabelProvider.dispose();
		
		display.dispose();
	}
	
	private static Group[] getInput() {
		Group[] groups = new Group[2];
		
		groups[0] = new Group(1, "Chemistry");
		groups[1] = new Group(2, "Physics");
		
		List<Student> studentsChemistry = new ArrayList<Student>();
		studentsChemistry.add(new Student(1, 18, "John", "Li", true));
		studentsChemistry.add(new Student(4, 21, "Linda", "Miller", false));
		groups[0].setStudents(studentsChemistry);
		
		List<Student> studentsPhysics = new ArrayList<Student>();
		studentsPhysics.add(new Student(2, 18, "Marry", "Carie", false));
		studentsPhysics.add(new Student(3, 20, "Cindy", "Bran", true));
		groups[1].setStudents(studentsPhysics);
		
		return groups;
		
	}

}

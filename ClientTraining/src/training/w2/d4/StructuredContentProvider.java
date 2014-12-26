package training.w2.d4;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * 
 * for ListViewer and ComboViewer
 * 
 * @author admin
 *
 */
public class StructuredContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		Student[] students = new Student[4];
		
		students[0] = new Student(1, 18, "John", "Li", true);
		students[1] = new Student(2, 18, "Marry", "Carie", false);
		students[2] = new Student(3, 20, "Cindy", "Bran", true);
		students[3] = new Student(4, 21, "Linda", "Miller", false);
		
		return students;
	}

}

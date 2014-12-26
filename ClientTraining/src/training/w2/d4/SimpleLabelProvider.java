package training.w2.d4;

import org.eclipse.jface.viewers.LabelProvider;

/**
 * 
 * Simple LabelProvider for ListViewer and ComboViewer
 * 
 * @author admin
 *
 */
public class SimpleLabelProvider extends LabelProvider {
	@Override
	public String getText(Object element) {
		if(element instanceof Student) {
			Student student = (Student)element;
			return student.getFirstName() + " " + student.getLastName();
		} else {
			return super.getText(element);
		}
	}

}

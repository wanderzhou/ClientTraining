package training.w2.d4;

import org.eclipse.jface.viewers.IColorDecorator;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * for TableViewer and TreeViewer
 * 
 * @author admin
 *
 */
public class CustomTableLabelProvider implements ITableLabelProvider, IColorProvider, IColorDecorator {
	
	//icon for male
	private final static Image imgMale;
	//icon for female
	private final static Image imgFemale;
	//icon for group
	private final static Image imgGroup;
	
	//caching images, images should be disposed when corresponding widget is disposed.
	static {
		imgMale = new Image(null, CustomTableLabelProvider.class.getClassLoader().getResourceAsStream("Male.png"));
		imgFemale = new Image(null, CustomTableLabelProvider.class.getClassLoader().getResourceAsStream("Female.png"));
		imgGroup =  new Image(null, CustomTableLabelProvider.class.getClassLoader().getResourceAsStream("Group.png"));
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/**
	 * dispose images explicitly
	 */
	@Override
	public void dispose() {
		imgMale.dispose();
		imgFemale.dispose();
		imgGroup.dispose();
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	/**
	 * two kinds of object Student and Group.
	 * same icon for Group object.
	 * different icon for female and male.
	 */
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if(columnIndex == 0) {
			if(element instanceof Student) {
				Student student = (Student)element;
				if(student.isMale()) {
					//return new Image(null, getClass().getClassLoader().getResourceAsStream("Male.png"));
					return imgMale;
				} else {
					//return new Image(null, getClass().getClassLoader().getResourceAsStream("Female.png"));
					return imgFemale;
				}
			} else if(element instanceof Group)  {
				//return new Image(null, getClass().getClassLoader().getResourceAsStream("Group.png"));
				return imgGroup;
			}
		} 
		return null;		
	}

	/**
	 * two kinds of object Student and Group 
	 */
	@Override
	public String getColumnText(Object element, int columnIndex) {
		if(element instanceof Student) {
			Student student = (Student)element;
			switch(columnIndex) {
			case 0: //id
				return Integer.toString(student.getId());
			case 1: //first name
				return student.getFirstName();
			case 2: //last name
				return student.getLastName();
			case 3: //gender
				return student.isMale() ? "M" : "F";
			case 4: //age
				return Integer.toString(student.getAge());
			default:
					return "";				
			}
		} else if(element instanceof Group) {
			if(columnIndex == 0) {
				//group name
				return ((Group)element).getName();
			} 
		} 
		return null;
	}

	@Override
	public Color getForeground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getBackground(Object element) {
		if(element instanceof Student) {
			if(((Student)element).getId() % 2 == 0) {
				//red for even
				return new Color(null, 255, 0, 0);
			} else {
				//green for odd
				return new Color(null, 0, 255, 0);
			}
		} else {
			return null;
		}
	}

	@Override
	public Color decorateForeground(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * test for IColorDecorator, the result is, compare to IColorProvider, do not take precedence as document says.
	 * 
	 * @param element
	 * @return
	 */
	@Override
	public Color decorateBackground(Object element) {
		if(element instanceof Student) {
			if(((Student)element).getId() % 2 == 0) {
				//red for even
				return new Color(null, 100, 0, 0);
			} else {
				//green for odd
				return new Color(null, 0, 100, 0);
			}
		} 
		return null;
	}

}

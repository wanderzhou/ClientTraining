package training.w2.d5;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import training.w2.d4.Group;
import training.w2.d4.Student;

public class TreeContentProvider extends ArrayContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		//System.out.println("inputChanged");
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		//System.out.println("getElements");
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

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Group) {
			Group group = (Group)parentElement;
			if(group.getStudents() != null && group.getStudents().size() > 0) {
				Student[] students = new Student[group.getStudents().size()];
				return group.getStudents().toArray(students);				
			} 
		} 
		return null;
	}

	@Override
	public Object getParent(Object element) {
		//System.out.println(element.getClass());
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		//System.out.println("invoke hasChildren");
		if(element instanceof Group) {
			Group group = (Group)element;
			return group.getStudents() != null && group.getStudents().size() > 0;
		}
		return false;
	}



}

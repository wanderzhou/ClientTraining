package training.w2.d5;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class StudentDialog extends Dialog {
	
	private String title;
	
	private Text id;
	
	private Text age;
	
	private Button male;
	
	private Button female;
	
	private Text firstName;
	
	private Text lastName;
		
	protected StudentDialog(Shell parentShell, String title) {
		super(parentShell);
		this.title = title;
	}

    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        if (title != null) {
			shell.setText(title);
		}
    }
    
	@Override
	protected Control createDialogArea(Composite parent) {
		Label labTitle = new Label(parent, SWT.BOLD);
		labTitle.setText("Student Information");
		labTitle.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1));
		
		Label labTips = new Label(parent, SWT.NONE);
		labTips.setText("\tPlease fill in the student's information.");
		labTips.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1));
		
		Label labId = new Label(parent, SWT.NONE);
		labId.setText("ID");
		labId.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		
		id = new Text(parent, SWT.SINGLE|SWT.BORDER);
		id.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		
		Label labAge = new Label(parent, SWT.NONE);
		labAge.setText("Age");
		labAge.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		age = new Text(parent, SWT.SINGLE|SWT.BORDER);
		age.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		Label labSex = new Label(parent, SWT.NONE);
		labSex.setText("Sex");
		labSex.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		Composite composite = new Composite(parent, SWT.NONE);
		Button butMale = new Button(composite, SWT.RADIO);
		butMale.setText("Male");
		
		
		Button butFemale = new Button(composite, SWT.RADIO);
		butFemale.setText("Female");
		composite.setLayout(new FillLayout());
		
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		
		Label labFirstName = new Label(parent, SWT.NONE);
		labFirstName.setText("First Name");
		labFirstName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		firstName = new Text(parent, SWT.SINGLE|SWT.BORDER);
		firstName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		Label labLastName = new Label(parent, SWT.NONE);		
		labLastName.setText("Last Name");
		labLastName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		lastName = new Text(parent, SWT.SINGLE|SWT.BORDER);
		lastName.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		
		parent.setLayout(new GridLayout(4, false));
		
		return super.createDialogArea(parent);
	}
	
	@Override
	protected void setButtonLayoutData(Button button) {
		GridData data = new GridData(SWT.FILL | SWT.RIGHT);
		int widthHint = convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
		Point minSize = button.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
		data.widthHint = Math.max(widthHint, minSize.x);
		button.setLayoutData(data);
	}
	
	
	public Text getId() {
		return id;
	}

	public Text getAge() {
		return age;
	}

	public Button getMale() {
		return male;
	}

	public Button getFemale() {
		return female;
	}

	public Text getFirstName() {
		return firstName;
	}

	public Text getLastName() {
		return lastName;
	}

}

package training.w2.d5;


public class DialogMain {

	public static void main(String[] args) {		
		StudentDialog dialog = new StudentDialog(null, "JFace Sample - Dialog");		
		dialog.setBlockOnOpen(true);
		dialog.open();
	}

}

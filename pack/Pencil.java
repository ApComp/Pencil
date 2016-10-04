package pack;

public class Pencil {
	private static Graphite write = new Graphite();

	public static void main(String[] args) {
		Eraser gone = new Eraser();
		Casing cases = new Casing();
		cases.setVisible(true);
		System.out.println(cases.getVisible());
	
		
		write.setText("Hello! ");
		write.getText();
		System.out.println(write.getText());
		gone.erase();
		System.out.println();
	
	}
	public String toString(){
		
		return null;
	}
}

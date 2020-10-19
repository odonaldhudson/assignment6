import acm.graphics.*;
import acm.program.GraphicsProgram;


public class ImageProcessing extends GraphicsProgram {
	
	//CLASS VARIABLES
	private static final long serialVersionUID = 1L;
	private static GImage image = new GImage("Vernmeer_Milkmaid.jpg");
	static int counter;
	
	
	//Start
	public void run() {
		add(flipHorizontal(image));
	}
	public GImage flipHorizontal(GImage image) {
		int [][] array = image.getPixelArray();
		int [][] newArray = image.getPixelArray();
		int width = array.length;
		int height = array[0].length;
		
		int[][] newArray = null;
		for (int i = 0; i < width; i++) {
			counter = 0;
			for(int j = height - 1; j >= 0; j--) {
				newArray[i][counter] = array[i][j];
				counter++;
			}
		}
		return new GImage(newArray);
	}
	
}
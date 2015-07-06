
public interface PushInterface {

	
	//data structure to hold matrix 
	//least memory consuming data structure possible
	//instance of matrix
	
	
	
	public boolean[][] getMatrix();
	
	public boolean[][] setMatrix();
	
	public boolean[][] pushDown(boolean[][] matrix);
	
	public boolean[][] pushUp(boolean[][] matrix );
	
	public boolean[][] pushOver(boolean[][] matrix);
	
	public boolean[][] pushBack(boolean[][] matrix);
	
	
	
	
	
}

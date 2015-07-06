
public class DataPartition {

	//matrix that defines the data partition
	//double array to hold randomly partitioned two processor matrix
	
	boolean [][]  matrix;
	static int UP = 1;
	static int DOWN = 2; 
	static int BACK = 3;
	static int OVER = 4; 
	
	
	
	public DataPartition(){
		
		//set intitial partition 
		//choose a random processor (not most powerful) how can this be determined? 
		//choose a random direction
		setPartition();
		
		
	}
	
	public void setPartition(){
	
		
	}
	
	public void applyPush(int direction){
		

		switch(direction){
		case 1: matrix = PushAbstract.pushUp(matrix);
				break;
				
		case 2: matrix = PushAbstract.pushDown(matrix);
			break;
		
			
		case 3: matrix = PushAbstract.pushOver(matrix);
			break;
			
			
		case 4: matrix = PushAbstract.pushOver(matrix);
			break;
		
		
		}
		
		
	}
	
	
	
	
}

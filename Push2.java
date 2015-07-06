
public class Push2 {

	//abstract representation of the matrix because it doesn't actually contain numbers
	//only the processor distributions 
	boolean [][] matrix; 
	
	int  UP = 1;
	int DOWN = 2;
	int LEFT = 3;
	int RIGHT = 4;
	
	private boolean PRO1; //an abstract representation of processor 1
	
	private boolean PRO2; //an abstract representation of processor 2 
	
	
	double pro1Cap; //abstract representation of processor 1 's computing capabilities as a percentage
	double pro2Cap; //abstract representation of processor 2 's computing capabilities as a percentage
	
	public Push2(){
		
		PRO1 = true;
		PRO2= false;
		
		pro1Cap = 0.65;// for now just choose arbitrary percentages
		pro2Cap = 0.35; //for now just choose arbitrary percentages 
		
		matrix =  new boolean [10][10];
		
		for(int i = 0; i <matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++)
				{
					matrix[i][j] = false;
				}
			
		}
		
		
	randomDistr();		
	}
	
	
	/**
	 * @return matrix
	 */
	public boolean [][] getMatrix(){
		
		return matrix;
		
	}
	
	/*
	 * a method to compute a processors computing capabilities
	 * takes in a processor as an argument (in what form ?? String?) 
	 * in a boolean form for the moment
	 */
	public int computeCap( boolean processor){
		
		int compPercent =0; //value representing processor's computing capability as a percentage
		
		return compPercent; 
		
	}
	
	/*
	 * issues with random distribution: not that arbitrary because it does not start in a random
	 * place; it starts in order 
	 */
	
	public void randomDistr(){
		
		//iterate through the matrix and randomly assign processor 1 or 2 
		//if one processor has reached its computing capacity then finish with the other processor
		
		double cap1 = 0; 
		double cap2 = 0; 
		

		//iterate through every block in the matrix
				for(int i = 0; i <matrix.length; i++){
					for(int j = 0; j<matrix[i].length; j++)
						{
							
							if(cap1 >= pro1Cap*(matrix.length*matrix[1].length))//multiplied by matrix SIZE
							{
								matrix[i][j] = PRO2;//multiplied by matrix SIZE
							}
								
							else if(cap2 >= pro2Cap*(matrix.length*matrix[1].length)){
								matrix[i][j] = PRO1;
							}
							//find out another way to randomly choose between two options?
							//keep this method in the case when there are more than two processors? 
							else{
							
								double k  = Math.floor(Math.random()*10); //choose a random number between 0 and 10
								//System.out.println("K " + k);
								if(k<5)//if random number is less than 5 then choose processor 1
								{
									matrix[i][j] = PRO1;
									cap1++;
								}
								else //else choose processor 2
								{
									matrix[i][j] = PRO2;
									cap2++;
								}
								
							}
						
						}
					}			
	}


	//it's push tiiiime!!
	/*** Determine the appropriate row or column k, the edge of the enclosing rectangle
	 * (up acts on Xbottom, down acts on Xtop, left acts on Xright, right acts on Xleft)
	 * 
	 * **For each element, x, assigned to Processor X in row or column k:
	 * 	1. Assign Processor X an element z within its enclosing rectangle(to it's left, right, 
	 * above, or below depending on push)
	 * 2. Assign element x to processor previously assigned z
	 * 
	 * *** a valid Push may not increase the volume of communication, so select all z such that:
	 * 1. Processor X is introduced to no more than one new row OR column
	 * 2. No processor is assigned an element in k if k is outside that processor's enclosing rectangle
	 * 3. A processor cannot be assigned an element in k, if it did not already own an element in k, unless 
	 * doing so would also remove that processor from some other row or column
	 * 
	 * 
	 * 
	 */

	
	
	/*
	 * takes in processor to push as an argument;
	 *  boolean in this case but can be changed to something else if there are more processors? 
	 */
	public void pushDown(boolean PROC){
		
		//first determine the top row of the enclosing rectangle of the processor
		int topEdge  =0;
		for(int i = 0; i <matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++)
				{
					if(matrix[i][j] == PROC){
						topEdge = i;
						break;
					}
					
				}
			}
		
		//go through row at topEdge
		for(int l =0; l<matrix.length;l++){
			
			//go through each entry in this row, if it belongs to PROC then
			if(matrix[topEdge][l]==PROC){
				
			//compare to entry & row below (because we are pushing down)
				
				if(matrix[topEdge+1][l] == PROC){
					//don't do anything; move to next one
				}
				else{
					
					matrix[topEdge]
					
					
					
					
					/* *** a valid Push may not increase the volume of communication, so select all z such that:
						 * 1. Processor X is introduced to no more than one new row OR column
						 * 2. No processor is assigned an element in k if k is outside that processor's enclosing rectangle
						 * 3. A processor cannot be assigned an element in k, if it did not already own an element in k, unless 
						 * doing so would also remove that processor from some other row or column
						 */
					
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
					
					
					
					
					
					
					
					
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void printMatrix(){
		
		String [][] matrixPrint = new String [10][10];
		
		for(int i = 0; i <matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				
				if(matrix[i][j])
					{
						matrixPrint[i][j] = "O "; //change to numbers to have a better visualization
					}
				else
				{
					matrixPrint[i][j] = "W ";
				}
				
			}
		}
		
		String print ="";
		
		for(int i = 0; i <matrixPrint.length; i++){
			print = print + "\n";
			
			for(int j = 0; j<matrixPrint[i].length; j++){
				
					
					print = print +matrixPrint[i][j];
				}
				
			}
		
		System.out.println(print);		
	}
	
	
	
	public static void main(String args[]){
	
		System.out.println("888888");
		
		Push2 pushNow = new Push2();
//		
		//boolean [][] matrix = pushNow.getMatrix();
//		
//		System.out.println(matrix.length*matrix[1].length);
		
		//System.out.println(pushNow.getMatrix());	
		
	pushNow.printMatrix();
		
		
		
//		String [][] array =  new String [5][5];
//		
//		for(int i = 0; i <array.length; i++){
//			for(int j = 0; j<array[i].length; j++){
//			
//				
//				array[i][j] = "T";
//			}
//			}
//		
//		System.out.println(array);
	}

	
	
}



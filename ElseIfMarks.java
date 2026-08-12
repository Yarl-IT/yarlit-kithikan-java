class ElseIfMarks{
	public static void main(String args[]){
		int marks=28;
		
		if ((marks>=75)&&(marks<=100)){
			System.out.println("Grade : A");
		}else if((marks>=65)&&(marks<=74)){
			System.out.println("Grade : B");
		}else if((marks>=55)&&(marks<=64)){
			System.out.println("Grade : C");
		}else if((marks>=45)&&(marks<=54)){
			System.out.println("Grade : D");
		}else if((marks>=0)&&(marks<=44)){
			System.out.println("Grade : F");
		}else{
			System.out.println("Invalid Marks! Plese Enter Marks Between 0 and 100.");
		}	
	}
}
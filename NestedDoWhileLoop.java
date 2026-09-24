class NestedDoWhileLoop{
	public static void main(String Args[]){
		
		int y = 1;
		
		do {
			int x = 1;
			
			do {
				System.out.print(x);
				x++;
			} while (x <= 3);
			
			System.out.println(y);
			y++;
			
		} while (y <= 5);
	}
}

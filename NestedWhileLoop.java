class NestedWhileLoop{
    public static void main(String args[]){

        int x=1;
        while(x<=5){
            int y=1;
			while (y<=3){
                System.out.print(y);
                y++;
            }
            System.out.println(x);
            x++;
        }
	}
}
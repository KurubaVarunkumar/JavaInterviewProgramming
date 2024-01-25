class pppp{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=4;i++){
        	int nn=65;
            for(int k=n;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)nn);
                nn++;
            }
            int mm=65;
            for(int m=2;m<=i;m++) {
            	
            	System.out.print(m);
            	
            }
            
            System.out.println();
        }
    }
}
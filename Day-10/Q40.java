public class Q40{
    public static void main(String[]args){
        
        for(int i = 1;i<=5;i++){
            char ch = 'A';
            for(int j =1;j<=5-i;j++){
            System.out.print(" ");

        }
            for(int j =1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        ch-=2;
        for(int j =i-1;j>=1;j--){
            System.out.print(ch);
            ch--;

        }
            
        System.out.println();
        }
    }
}
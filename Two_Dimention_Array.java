public class Two_Dimention_Array {
    public static void main(String[] args){
        int nums [][] = new int[3][4];

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                nums[i][j] = (int)(Math.random() *100);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //enhanced for loop

        for(int [] row: nums)
        {
            for(int value:row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

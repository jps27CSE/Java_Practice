public class Jagged_Array {
    public static void main (String [] args){
        int array[][] = new int[3][];

        array[0] = new int[2];
        array[1] = new int[3];
        array[2] = new int[4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                array[i][j] = (int)(Math.random() *100);
            }
        }

        for(int [] number: array)
        {
            for(int value:number)
            {
               System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}

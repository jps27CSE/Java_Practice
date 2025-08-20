class ComputerDemo{
    public void MusicPlaying()
    {
        System.out.println("Music is playing..");
    }
    public String GetPen(int cost)
    {
        if(cost >= 10)
        {
            return "Pen";
        }
        else{
            return "Sorry";
        }
    }
}

public class Computer {
    public static void main(String[] args){
        ComputerDemo demo = new ComputerDemo();

        demo.MusicPlaying();

        String str = demo.GetPen(10);

        System.out.print(str);
    }
}

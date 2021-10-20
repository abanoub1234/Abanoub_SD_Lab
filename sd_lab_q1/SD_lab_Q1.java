package sd_lab_q1;

import java.util.Scanner;

public class SD_lab_Q1 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int YES_OR_NO = 1;
        int channelNum = 120;
        int volumeNum = 7;
        int[] channels = java.util.stream.IntStream.rangeClosed(1, channelNum).toArray();
        int[] volume = java.util.stream.IntStream.rangeClosed(1, volumeNum).toArray();
        TV tv = new TV();
        
        
        while(YES_OR_NO==1)
        {
            int op;
        System.out.println("1. turn on TV");
        System.out.println("2. turn off TV");
        System.out.println("3. set new Channel");
        System.out.println("4. set new Volume");
        System.out.println("5. channel up");
        System.out.println("6. channel Down");
        System.out.println("7. Volume up");
        System.out.println("8. Volume Down");
        System.out.print("Choose the Operation: ");
        op = sc.nextInt();
           
            switch(op)
           {
            case 1:
                tv.turnOn();
                break;
                
            case 2:
                tv.turnOff();
                break;
                
            case 3:
                tv.setChannel(channelNum);
                break;
            case 4:
                tv.setVolume(volumeNum);
                break;
                
            case 5:
                tv.channelUp();
                break;
                
            case 6:
                tv.channelDown();
                break;
                
            case 7:
                tv.volumeUp();
                break;
                
            case 8:
                tv.volumeDown();
                break;
                
             default:
                break;    
           }
            
            System.out.println("do you want to Continue?.....to Continue Enter [1] to Stop Enter [0]");
             YES_OR_NO = sc.nextInt();
        
        }
        
   
    }
    
}

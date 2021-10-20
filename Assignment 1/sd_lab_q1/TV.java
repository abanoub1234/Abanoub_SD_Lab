package sd_lab_q1;

public class TV 
{
    int currentVolume=1;
    int currentChannel = 1;
    int channel;
    int volumeLevel;
    boolean on = true;

    public TV() 
    {
    }
    
    public void turnOn()
    {
        on=true;
        if(on)
        {
            System.out.println("TV is On");
        }

    }
    
    public void turnOff()
    {
        on = false;
        if(on==false)
        {
            System.out.println("TV is off");
        }
    }
    
    public void setChannel(int newChannel)
    {
        newChannel = newChannel+1;
        int[] Channels = java.util.stream.IntStream.rangeClosed(1, newChannel).toArray();
        System.out.println("Number of Cjannel Now is: " + Channels.length);
    }
    
    public void setVolume(int newVolumeLevel)
    {
        newVolumeLevel = newVolumeLevel+1;
        int[] volume = java.util.stream.IntStream.rangeClosed(1, newVolumeLevel).toArray();
        System.out.println("Number of Volume Now is: " + volume.length);
    }
    
    public void channelUp()
    {
        currentChannel = currentChannel+1;
        System.out.println("Current Channel is: " + currentChannel);
    }
    
    public void channelDown()
    {
        currentChannel = currentChannel-1;
        System.out.println("Current Channel is: " + currentChannel);
    }
    
    public void volumeUp()
    {
        currentVolume = currentVolume+1;
        System.out.println("Current Volume is: " + currentVolume);
    }
    
    public void volumeDown()
    {
        currentVolume = currentVolume-1;
        System.out.println("Current Volume is: " + currentVolume);
    }
    
    
}

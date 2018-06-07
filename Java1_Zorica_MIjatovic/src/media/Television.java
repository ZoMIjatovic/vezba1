package media;

public class Television {

    private int volume;
    private int currentProgram;
    private boolean turnOn;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentVolume) {
        this.currentProgram = currentProgram;
    }

    public boolean getTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public Television() {
        this.volume = 0;
        this.turnOn = false;
        this.currentProgram = 1;
    }

    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.turnOn = turnOn;
        this.currentProgram = currentProgram;

    }

    public void showData() {
        System.out.println("Jacina tona je " + getVolume());
        System.out.println("Broj programa je " + getCurrentProgram());
        System.out.println("Da li je televizor uljucen " + getTurnOn());
    }
}


package media;

public class Radio {
   private double fmFrequency;
   private int amFrequency;
   private char band;
   
   
   public double getFmFrequency(){
   return fmFrequency;
   }
   
   public void setFmFrequency(double fmFrequency) {
       this.fmFrequency = fmFrequency;
       
   }

   public int getAmFrequency() {
        return amFrequency;
   }
   public void setAmFrequency(int amFrequency) {
   this.amFrequency = amFrequency;
   }
   
   
   public char getBand() {
   return band;
   }
   public void setBand(char band) {
   this.band = band;
   }
   public Radio() {
       this.amFrequency = 600;
       this.fmFrequency = 91.8;
       this.band = 'F';
   
   }
   public Radio(double fmFrequency, int amFrequency,char band) {
       this.amFrequency = amFrequency;
       this.fmFrequency = fmFrequency;
       this.band = band;
   }
   public void showData() {
       System.out.println("Fm radio frekvencija je " + getFmFrequency());
       System.out.println("Am radio  frekvencija je " + getAmFrequency());
       System.out.println("Band "  + getBand());
   }
   
}

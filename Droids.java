public class Droid {
  String name;
  int batteryLevel;
  
  Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;
  }
  
  public void energyReport(){
    System.out.println(name + "`s current battery level is " + batteryLevel);
  }
  
  public void energyTransfer(Droid receiverDroid, Droid donorDroid, int transferAmount){
    int batteryAfterTransferdon = donorDroid.batteryLevel - transferAmount;
    int batteryAfterTransferrec = receiverDroid.batteryLevel + transferAmount;
    receiverDroid.batteryLevel = batteryAfterTransferrec;
    donorDroid.batteryLevel = batteryAfterTransferdon;
    System.out.println(name + " has taken " + transferAmount + " battery units from " +  donorDroid.name + "!");
    }
  
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }
  
  public static void main(String[] args){
    Droid codey = new Droid("Codey"); 
    Droid molly = new Droid("Molly"); 
    System.out.println(codey);
    codey.performTask("singing");
    codey.performTask("dancing");
    codey.performTask("bathing");
    codey.energyReport();
    molly.energyReport();
    codey.energyTransfer(codey,molly, 10);
    codey.energyReport();
    molly.energyReport();
    molly.energyTransfer(molly,codey,70);
    codey.energyReport();
    molly.energyReport();
  }
}

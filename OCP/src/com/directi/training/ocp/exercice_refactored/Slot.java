package com.directi.training.ocp.exercice_refactored;

public interface Slot {

    

    public void markSlotFree(int resourceId);
    

    public int findFreeSlot();
    

    public  void markSlotBusy(int resourceId);
     
  

    
}
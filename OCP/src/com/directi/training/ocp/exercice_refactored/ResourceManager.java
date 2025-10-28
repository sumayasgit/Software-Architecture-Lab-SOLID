package com.directi.training.ocp.exercice_refactored;

public class ResourceManager
{

    public int allocate(Slot slot)
    {
        int resourceId;
        resourceId = slot.findFreeSlot();
        slot.markSlotBusy(resourceId);
        
        return resourceId;
    }

    public void free(Slot slot, int resourceId)
    {
       
        slot.markSlotFree(resourceId);
            
    }


}
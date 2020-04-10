package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(SLOT slot)
    {
        int resourceId;
        if(slot) {
            resourceId = slot.findFreeSlot();
            slot.markSlotBusy(resourceId);
        }
        else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            resourceId = INVALID_RESOURCE_ID;
        }
        return resourceId;
    }

    public void free(SLOT slot, int resourceId)
    {
        if(slot) {
            slot.markSlotFree(resourceId);
        }
        else{
                System.out.println("ERROR: attempted to free invalid resource");
        }
    }
}

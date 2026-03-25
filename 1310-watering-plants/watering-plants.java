class Solution {
    public int wateringPlants(int[] plants, int capacity) 
    {
        int iValue = capacity;
        int iTotal = 0;

        for(int i = 0; i < plants.length; i++)
        {
            if(iValue < plants[i])
            {
                iTotal = iTotal + (i);      //Backward to fill
                iValue = capacity - plants[i];
                iTotal = iTotal + (i+1);
            }
            else
            {
                iTotal++;
                iValue = iValue - plants[i];
            }
        }
        return iTotal;
    }
}
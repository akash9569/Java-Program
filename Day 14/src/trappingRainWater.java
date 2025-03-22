public class trappingRainWater {
    public static int trapWater(int height[]){
        int n=height.length;
//        Calculate Lefy max Boundry - Array.
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

//        Calculate Right max Boundry - Array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

//        Loop

        int trappedWater=0;
        for(int i=0;i<n;i++){
//            WaterLevel = min(leftmax boundry, Rightmax Boundry)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

//            trapped water = water Level - height[i]
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        System.out.print(trapWater(height));

//        Time Complexity = O(n)
    }
}

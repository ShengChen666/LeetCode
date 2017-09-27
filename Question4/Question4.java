class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int total = nums1.length+nums2.length;
        int temp = 0;
        int med;
        int result;
        int i =0;
        int j =0;
        boolean odd;
        if(total%2==1){
            med=total/2;
            odd=true;
        }else{
            med=total/2;
            odd=false;
        }
        if(l1==0){
            if(odd){
                return nums2[med];
            }else{
                return (float)(nums2[med-1]+nums2[med])/2;
            }
        }
        if(l2==0){
            if(odd){
                return nums1[med];
            }else{
                return (float)(nums1[med-1]+nums1[med])/2;
            }
        }
        if(odd){
            while(temp<med && i!=l1 && j!=l2){
                if(nums1[i]<nums2[j]){
                    i++;
                }else{
                    j++;
                }
                temp++;
            }
            while(temp<med){
                if(i==l1){
                    j++;
                    temp++;
                 }else if(j==l2){
                    i++;
                    temp++;
                }
            }
            if(i==l1){
                return nums2[j];
            }else if(j==l2){
                return nums1[i];
            }else{
                 return Math.min(nums1[i],nums2[j]);
            }
        }else{
            while(temp<med-1&& i!=l1 && j!=l2){
                if(nums1[i]<nums2[j]){
                    i++;
                }else{
                    j++;
                }
                temp++;
            }
            while(temp<med-1){
                if(i==l1){
                    j++;
                    temp++;
                 }else if(j==l2){
                    i++;
                    temp++;
                }
            }
             if(i==l1){
                return (float)(nums2[j]+nums2[j+1])/2;
            }else if(j==l2){
                return (float)(nums1[i]+nums1[i+1])/2;
            }else{
                 int t;
                 if(nums1[i]<nums2[j]){
                    t= Math.min(nums1[i],nums2[j]);
                    i++;
                }else{
                    t= Math.min(nums1[i],nums2[j]);
                    j++;
                }
                  if(i==l1){
                return (float)(t+nums2[j])/2;
                }else if(j==l2){
                return (float)(nums1[i]+t)/2;
                 }else{
                 return (float)(t+Math.min(nums1[i],nums2[j]))/2;
                  }
            }
        }
    }
}
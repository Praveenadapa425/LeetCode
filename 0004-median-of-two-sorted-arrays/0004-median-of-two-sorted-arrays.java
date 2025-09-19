class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0,j=0,k=0;
        double mid=-1;
        double pre=-1;
        while(k<(m+n)/2+1){
             //if(mid!=-1){
                pre=mid;
           // }
            if(i<n && (j>=m || nums1[i]<nums2[j])){
                mid=(double)(nums1[i]);
                i++;
                k++;
            }
            else{
                mid=(double)nums2[j++];
                k++;
            }
           
        }
        if((m+n)%2==0){
           // System.out.println(mid+" "+pre);
            return (mid+pre)/2.0;
        }
        return mid;
    }
}
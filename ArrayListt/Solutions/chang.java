*/
: Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn]  */
        
public static ArrayList<Integer> shuffle(ArrayList<Integer> nums, int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            ans.add(nums.get(i));
            ans.add(nums.get(n + i));
        }
        return ans;
    }

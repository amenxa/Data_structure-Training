class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> a = new ArrayList();
       int  k = 1 ;
       for (int i = 0 ;i<numRows ;i++)
       {
           a.add(new ArrayList());
           for (int j = 0 ;j<k;j++)
           {
               if (j==0||j==k-1)a.get(i).add(1);
               else a.get(i).add(a.get(i-1).get(j)+a.get(i-1).get(j-1));
           }
           k++;
       }
       return a;
    }
}

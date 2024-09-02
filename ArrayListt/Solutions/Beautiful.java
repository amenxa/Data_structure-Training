/*given an Arraylist make the array beautiful
an array is called beautiful if
a[i]+a[i+1] is odd (for any i from 1 to n-1 )
[ YOU CAN CHANG THE ORDER OF ELEMENTS AS YOU WANT TO ]
or print that its impossible to make the array beautiful
example :
[ 1 , 3 , 4 , 6 , 10 , 11 ]
out put :
[1,4,3,6,11,10 ]
example 2 :
[ 4,12,15,3,7 ,9]
out put :
ITS IMPOSSIBLE TO MAKE THE ARRAY BEAUTIFUL */

// solution complexcity O (N)
 static void beautiful (ArrayList <Integer> a)
{
   ArrayList <Integer> ans =new ArrayList(),odd = new ArrayList (),even = new ArrayList (); 
   
   for (int i = 0 ; i<a.size();i++)
    {
       if (a.get(i)%2==0)even.add(a.get(i));
      else odd.add(a.get(i));
    }
  
  if (abs(odd.size()-even.size())>1) 
    System.out.println("ITS IMPOSSIBLE TO MAKE THE ARRAY BEAUTIFUL");
    
  else 
  {
    int oindx = 0 ,eindx =0; 
    while (oindx!=odd.size()&&eindx!=even.size())
     {
        ans.add(odd.get(oindx)); oindx++;
        ans.add(even.get(eindx)); eindx++;
     }
    if (odd.size()>even.size())ans.add(odd.get(oindx));
    else if (odd.size()<even.size())ans.add(0,even.get(eindx));
    
    for (int i = 0 ; i<ans.size();i++)
       System.out.print(ans.get(i)+" ");
  }
  
}
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> a = new ArrayList();
        a.add(1); a.add(3); a.add(4); a.add(2); a.add(5);a.add(8); a.add(10);
          beautiful(a);
         
    }

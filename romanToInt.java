class Solution {
    public int romanToInt(String s){
        HashMap<Character,Integer> ref=new HashMap<>();
        ref.put('I',1);
        ref.put('V',5);
        ref.put('X',10);
        ref.put('L',50);
        ref.put('C',100);
        ref.put('D',500);
        ref.put('M',1000);
        int r=ref.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        { 
            Character m=s.charAt(i);
            if(ref.get(m)<ref.get(s.charAt(i+1)))
            {
            r-=ref.get(m);
            }
            else
            r=r+ref.get(m);
        }
        
        return r;
    }
}

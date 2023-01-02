class Solution {
    public boolean isPalindrome(int x) {
        String s=new String();
        s=String.valueOf(x);
        StringBuilder temp=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            temp.append(s.charAt(i));
        }
        System.out.println(temp);
        if(s.equals(temp.toString()))
        return true;
        else
        return false;
    }
}

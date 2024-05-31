class Solution {
    
    public int result = 0; // this is holding for the result
    public char r; // for get the cheracter at index i+1
    public int lv, rv; // lv for left value and rv for right value of the string index possition
    public int romanToInt(String s) {
        for(int i=0; i<s.length(); i++){
            char l = s.charAt(i);  // Get the character at index i
            if(s.length() > i+1){
            r = s.charAt(i+1);
                switch (r) {
    case 'I':
         rv = 1;
        break;
    case 'V':
          rv = 5;
        break;
    case 'X':
          rv = 10;
        break;
    case 'L':
          rv = 50;
        break;
    case 'C':
          rv = 100;
        break;
    case 'D':
          rv = 500;
        break;
    case 'M':
          rv = 1000;
        break;
    default:
        rv= lv;
        break;
}
            }
            
            switch (l) {
    case 'I':
         lv = 1;
        break;
    case 'V':
          lv = 5;
        break;
    case 'X':
          lv = 10;
        break;
    case 'L':
          lv = 50;
        break;
    case 'C':
          lv = 100;
        break;
    case 'D':
          lv = 500;
        break;
    case 'M':
          lv = 1000;
        break;
    default:
        
        break;
}

            
            if(lv>=rv){
                result = result + lv;
            } else{
                result = result + (rv-lv);
                i+=1;
                rv=0;
            }

            
        }
        return result;
    }
}
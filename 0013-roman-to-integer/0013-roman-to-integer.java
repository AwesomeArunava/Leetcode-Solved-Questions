class Solution {
    
    public int I = 1;
    public int V = 2;
    public int X = 10;
    public int L = 50;
    public int C = 100;
    public int D = 500;
    public int M = 1000;
    public int result = 0;
    public char r;
    public int lv, rv;
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
//             if(lv>=rv){
                
//                 switch (l) {
//     case 'I':
//          result = result + 1;
//         break;
//     case 'V':
//           result = result + 5;
//         break;
//     case 'X':
//           result = result + 10;
//         break;
//     case 'L':
//           result = result + 50;
//         break;
//     case 'C':
//           result = result + 100;
//         break;
//     case 'D':
//           result = result + 500;
//         break;
//     case 'M':
//           result = result + 1000;
//         break;
//     default:
        
//         break;
// }
                
//             } else{
//                 // result = r-l;
//                 switch (r) {
//     case 'I':
//          // result = result + 1;
//                                           switch (l) {
//     case 'I':
//          result = result +(1-1);
//         break;
//     case 'V':
//           result = result +(5-1);
//         break;
//     case 'X':
//           result = result +(10-1);
//         break;
//     case 'L':
//           result = result +(50-1);
//         break;
//     case 'C':
//           result = result +(100-1);
//         break;
//     case 'D':
//           result = result +(500-1);
//         break;
//     case 'M':
//           result = result +(1000-1);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'V':
//           // result = result + 5;
//  switch (l) {
//     case 'I':
//          result = result +(1-5);
//         break;
//     case 'V':
//           result = result +(5-5);
//         break;
//     case 'X':
//           result = result +(10-5);
//         break;
//     case 'L':
//           result = result +(50-5);
//         break;
//     case 'C':
//           result = result +(100-5);
//         break;
//     case 'D':
//           result = result +(500-5);
//         break;
//     case 'M':
//           result = result +(1000-5);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'X':
//           // result = result + 10;
//                                           switch (l) {
//     case 'I':
//          result = result +(1-10);
//         break;
//     case 'V':
//           result = result +(5-10);
//         break;
//     case 'X':
//           result = result +(10-10);
//         break;
//     case 'L':
//           result = result +(50-10);
//         break;
//     case 'C':
//           result = result +(100-10);
//         break;
//     case 'D':
//           result = result +(500-10);
//         break;
//     case 'M':
//           result = result +(1000-10);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'L':
//           // result = result + 50;
// switch (l) {
//     case 'I':
//          result = result +(1-50);
//         break;
//     case 'V':
//           result = result +(5-50);
//         break;
//     case 'X':
//           result = result +(10-50);
//         break;
//     case 'L':
//           result = result +(50-50);
//         break;
//     case 'C':
//           result = result +(100-50);
//         break;
//     case 'D':
//           result = result +(500-50);
//         break;
//     case 'M':
//           result = result +(1000-50);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'C':
//           // result = result + 100;
//                                           switch (l) {
//     case 'I':
//          result = result +(1-1);
//         break;
//     case 'V':
//           result = result +(5-1);
//         break;
//     case 'X':
//           result = result +(10-1);
//         break;
//     case 'L':
//           result = result +(50-1);
//         break;
//     case 'C':
//           result = result +(100-100);
//         break;
//     case 'D':
//           result = result +(500-100);
//         break;
//     case 'M':
//           result = result +(1000-100);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'D':
//           result = result + 500;
//                                           switch (l) {
//     case 'I':
//          result = result +(1-1);
//         break;
//     case 'V':
//           result = result +(5-1);
//         break;
//     case 'X':
//           result = result +(10-1);
//         break;
//     case 'L':
//           result = result +(50-1);
//         break;
//     case 'C':
//           result = result +(100-1);
//         break;
//     case 'D':
//           result = result +(500-500);
//         break;
//     case 'M':
//           result = result +(1000-500);
//         break;
//     default:
        
//         break;
// }
//         break;
//     case 'M':
//           // result = result + 1000;
//                         switch (l) {
//     case 'I':
//          result = result +(1-1);
//         break;
//     case 'V':
//           result = result +(5-1);
//         break;
//     case 'X':
//           result = result +(10-1);
//         break;
//     case 'L':
//           result = result +(50-1);
//         break;
//     case 'C':
//           result = result +(100-1);
//         break;
//     case 'D':
//           result = result +(500-1);
//         break;
//     case 'M':
//           result = result +(1000-1000);
//         break;
//     default:
        
//         break;
// }
//         break;
//     default:
        
//         break;
// }
//             }
            
        }
        return result;
    }
}
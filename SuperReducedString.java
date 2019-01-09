// Complete the superReducedString function below.
    static String superReducedString(String s) {      
      int i=0;
      while(i<s.length()-1){
        if(s.charAt(i)==s.charAt(i+1)){          
          s = s.substring(0,i) + s.substring(i+2) ;
          i=0;
          continue;
        }
        i++;
      }
      return s.length() > 0 ? s : "Empty String";

    }

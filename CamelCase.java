 // Complete the camelcase function below.
    static int camelcase(String s) {
      int i=0,count=0;
      while(i<s.length()-1){
      if(s.charAt(i) > 64 && s.charAt(i) < 91)
        count++;
      i++;  
      }
      return count+1;
    }

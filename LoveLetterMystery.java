 // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
      char[] s_char = s.toCharArray();
      int sum=0;
      int j=s.length()-1;
      for(int i=0;i<s.length()/2;i++){
        sum += Math.abs(s_char[i]-s_char[j]);
        j--;
      }
      return sum;
    }


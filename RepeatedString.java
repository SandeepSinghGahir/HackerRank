//Short Solution
// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
      return (occurancesofa(s,s.length()) * (n/s.length())) + occurancesofa(s,n%s.length());
    }
   
    private static long occurancesofa(String s,long limit){
      long occr = 0;
      for(int i=0;i<limit;i++){
      if(s.charAt(i)=='a')
        occr++;   
      }
    return occr;
    }


//Long/Understandable Solution
// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    Solution sol = new Solution();
      long l = s.length();
      long div = n/l;
      long rem = n%l;
      long occr = sol.occurancesofa(s,s.length());
      long las = sol.occurancesofa(s,rem);      
      return (occr*div)+las;
    }
   
    private long occurancesofa(String s,long limit){
      long occr = 0;
      for(int i=0;i<limit;i++){
      if(s.charAt(i)=='a')
        occr++;   
      }
    return occr;
    }


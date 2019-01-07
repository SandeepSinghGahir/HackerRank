static String isValid(String s) {
      int[] charcount = new int[26];
      for(char c :s.toCharArray())
          charcount[c-'a']++;      
      int firstUnique = -1,secondUnique = -1,count = 0;
      for(int i=0;i<26;i++){
        if(firstUnique<0 && charcount[i]>0)
          firstUnique=charcount[i]; 
        else if(secondUnique<0 && firstUnique>0 && charcount[i]!=firstUnique && charcount[i]!=0)
          secondUnique = charcount[i];
      if(charcount[i]==0 || charcount[i]==firstUnique)
        count++;
      }
      
      if(count==26 || count==25 && (secondUnique-firstUnique==1 || firstUnique>1 && secondUnique==1))
        return "YES";
      return "NO";
      }


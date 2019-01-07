// Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
      int [] temp = new int[26];
      int result = 0;
      //Using ascii values we can store all the characters a to z from indexes 0 to 25
      for(char i : a.toCharArray())
        temp[i-'a']++;

      //The smallest character a has ascii value 97 which results in a-a or 97-97 = 0 index whereas last char z has ascii value 122 which results in a-z or 97 - 122 = 25; Therfore all other character will lie in the range 0 to 25
      for(char j : b.toCharArray())
        temp[j-'a']--;
      
      for(int cnt : temp)
        result+=Math.abs(cnt);
      return result;
    }

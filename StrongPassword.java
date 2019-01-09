   static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count=0;
        if(password.matches(".*[0123456789]+.*"))
          count++;
        if (password.matches(".*[abcdefghijklmnopqrstuvwxyz]+.*")) 
          count++;
        if (password.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ]+.*")) 
          count++;  
        if (password.matches(".*[!@#$%^&*()+-]+.*")) 
          count++;      
        return password.length()>5 ?  4-count : Math.max(6-password.length(), 4-count);
    }

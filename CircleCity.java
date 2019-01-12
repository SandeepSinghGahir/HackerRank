/*Roy lives in a city that is circular in shape on a  plane that has radius . The city center is located at origin  and it has suburbs lying on the lattice points (points with integer coordinates). The city Police Department Headquarters can only protect those suburbs which are located strictly inside the city. The suburbs located on the border of the city are still unprotected. So the police department decides to build at most  additional police stations at some suburbs. Each of these police stations can protect the suburb it is located in.

Given the square of radius, , of the city, Roy has to determine if it is possible to protect all the suburbs.

Input Format 
The first line of input contains integer ;  test cases follow. 
Each of the next  lines contains two space-separated integers: , the square of the radius of the city, and , the maximum number of police stations the headquarters is willing to build.*/

static String solve(int d, int k) {    
      int threshold=0;      
      int j=0;
      double r = Math.sqrt(d);  
      for(double i=0;i<r;i++){
        //System.out.println("inside the loop");
        int y = d - j*j;
        j++;
        //System.out.println("y : "+y);        
        if(y == (int)Math.round(Math.sqrt(y)) * (int)Math.round(Math.sqrt(y)))
          threshold += 4;        
      }
      System.out.println(threshold);
      if( (k==0 && threshold==0)|| k>=threshold)
        return "possible";
      return "impossible";
    }

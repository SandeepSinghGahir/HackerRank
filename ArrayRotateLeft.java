  // Complete the rotLeft function below.
   static int[] rotLeft(int[] a, int d) {
   for(int j=0;j<d;j++){
    int temp = a[0];
    for(int i=0;i<a.length-1;i++)
      a[i] = a[i+1];
      a[a.length-1] = temp;
  }
    return a;
  }

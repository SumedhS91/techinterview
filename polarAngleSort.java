 public class polarAngleSort{
 
     public class coOrdinates{
     
         double x;
         double y;
     
		    public String toString() {
	    	  return "("+x+","+y+")";
	      }
     }
 
     public static double polarAngle(double x, double y){
         
         return y/x;
     
     }
     
     public static coOrdinates[] SortPolarAngle(coOrdinates[] input){
         for(int i=0, j = input.length()-1;i<j;i++,j--){
             if(polarAngle(input[i].y,input[i].x)>polarAngle(input[j].y,input[j].x){
                 coOrdinates temp = input[i];
				         input[i]=input[j];
				         input[j]=temp;
             }
         }
         return input;
     }
	 
	 public static void main(String[] args){
		  coOrdinates[] ans = sortPolarAngle(input);
		  System.out.println(ans.toString());
	 }
 }

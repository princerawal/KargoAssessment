public class StringArray {

    public static void main(String[] args) {

      int temp;
      int i = 1;
     
      temp = Integer.parseInt(args[0]);
      if(temp==0){
          System.out.print("Zero");
      }
      else{
        System.out.print(converter(temp));
	    }

      while(i<args.length){   

        temp = Integer.parseInt(args[i]);

        if(temp==0){
          System.out.print(", Zero");
        }
        else{
          System.out.print(", "+converter(temp));
        }
        i++;
      }

    }

    public static String converter(int a){

        if(a==0){
          return "";
        }

        String result;
        int digit = a%10;

        a=a/10;
        

        if(digit==0){
          return converter(a)+"Zero";
        }
        else if(digit==1){
          return converter(a)+"One";
        }
        else if(digit==2){
          return converter(a)+"Two";
        }
        else if(digit==3){
          return converter(a)+"Three";
        }
        else if(digit==4){
          return converter(a)+"Four";
        }
        else if(digit==5){
          return converter(a)+"Five";
        }
        else if(digit==6){
          return converter(a)+"Six";
        }
        else if(digit==7){
          return converter(a)+"Seven";
        }
        else if(digit==8){
          return converter(a)+"Eight";
        }
        else if(digit==9){
          return converter(a)+"Nine";
        }
        else{
          return "";
        }

      
    }
	  
}
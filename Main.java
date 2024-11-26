//Java code
import java.util.*;
import java.lang.*;
public class Main {
public static void main(String args[]){
  int n=2;
  int c=0;
  for(int i=2;i<Math.sqrt(n);i++){
    if(n%i==0){
      c++;
      break;
}}
if(c==0){
System.out.println(n+" is prime number");
}else{
System.out.println(n+" is not prime number");
}
}
}

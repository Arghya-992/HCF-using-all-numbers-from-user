import java.util.Scanner;
class tr{
public static void main(String arg[]){	
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number of numbers you want to enter:");
    int n=sc.nextInt();

    int arrforhcf[]=new int[n];

    System.out.println("Enter "+ n+" numbers");

    for(int i=0; i<n; i++){

	arrforhcf[i]=sc.nextInt();     

}
     int mod2 = arrforhcf[0];

     for(int i = 1; i < arrforhcf.length; i++){

     mod2 = hcf(mod2, arrforhcf[i]);

}     
     System.out.println("HCF of the numbers entered are = "+mod2);
}

public static int hcf(int n1, int n2){
    while (n2 > 0){
        int mod2 = n2;
        n2 = n1 % n2; 
        n1 = mod2;
}
    return n1;
}
}
import java.util.* ;
public class array {
 //HW problem
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    
    // String names[] = new String[size];
char number[] = new char[size];

    for(int i=0; i<size;i++) {

        number[i]=sc.ne
  
    }
     int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

    for(int i=0; i<number.length; i++){

        if(number[i] < min) {
            min = number[i];
        }
        if(number[i] > max) {
            max = number[i];
        }


       // System.out.println("name " + (i+1) + " is : " + names[i]);
    }
    System.out.println("Largest number is : " + max);
    System.out.println("Smallest number is : " + min);
   
}
}

  



//     // syntax
//     // type[] arrayName = new type[size];
//     // new is used for new memory
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];


//         for(int i =0; i<size; i++){
//             //  we can use numbers.length in the place of size where
//             //  number is variable taken
//             numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt(); 


//         // int[] marks = new int[5];
//         // // also can be wriiten as
//         // // int marks[] = new int[5];
//         // marks[0]= 91;
//         // marks[1]= 97;
//         // marks[2]=96;
//         // marks[3]=99;
//         // marks[4]=93;
//         // int marks[] = {97,97,99,96,95};
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         // System.out.println(marks[3]);
//         // System.out.println(marks[4]);
//         for(int i=0; i<size ; i++){
           
//             if(numbers[i]==x) {
//                 System.out.println("x found at index" +i);

//             }
//             // System.out.println(numbers[i]);
//         }
       



//     }
    
// }



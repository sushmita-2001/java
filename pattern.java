public class pattern {

    public static void main(String[] args) {
        // for(int i=1 ; i<=4; i++){
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        
        // }

        // for(int i = 1; i<=4 ; i++){
        //     for(int j = 1 ;j<=5 ;j++ ){
        //         if(i==1 || j==1 || i== 4 || j==5){
        //             System.out.print(i);
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(int i = 4 ; i >= 1 ; i--){
        //     for(int j= 1; j <= i ; j++){
        //         System.out.print(j);

        //     }
        //     System.out.println();

               
            //   }
                // ****
                // ***
                // **
                // *

                // for(int i =1 ; i<=4 ; i++){
                //     for(int j=1 ; j<=4-i; j++){
                //         System.out.print(" ");
                //     }
                //     for(int j = 1 ; j<=i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();

                // for(int i=1; i<=5; i++){
                //     for(int j=1 ; j<=i; j++){
                //         System.out.print(j);
                //     }
                //     for(int j =1; j<=i; j++){
                //         System.out.print(" ");
                //     }

                //     //done by me without help yeahhhhhhhhhhhh!!!!!!!!


                //     System.out.println();
                // }


                // FLOYD'S TRIANGLE

                // int num = 1;

                // for(int i=1 ; i<=5; i++){
                //     for(int j=1 ; j<=i ; j++){
                //         System.out.print(num + " ");
                //         num++;

                

                //     }System.out.println(" ");

                // }

                // 0-1 triangle

                for(int i = 1 ; i<=5 ; i++){
                    for(int j=1 ; j<=i ; j++){
                        int sum = i+j;
                        if(sum%2==0){   
                            System.out.print("1 ");
            
                            }  
                            else{
                                System.out.print("0 ");
                            }


                        }
                        System.out.println();

                
                }

                }
            }
           
        

    



class Patterns{
    public static void main(String[] args){
        // RightangledTriangle();
        // InverseRightangledTriangle();
        // Square();
        // Diamond();
        // InverseEquilateralTrianle();
        // EquilateralTrianle();
        // LeftsidebaseTriangle();
        // OutlineEquilateralTrianle();
        // XPattern();
        // Heart();
        // EquilateralTrianleNumber();
        // RightangledTriangleNumber();
        // InverseRightangledTriangleNumber();
        // RightangledTriangleNumberChanging();
        // RightangledTriangleNumber01();
        // NumberDiamond();
        //LetterM();

    }

    public static void RightangledTriangle() {
         int n = 5;
            for (int i =1; i<=n; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } 
            System.out.println();  
    }
    

    public static void InverseRightangledTriangle() {
        int n=5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void Square() {
        int n =5;
        for ( int i= 1; i <= n; i++) {
            for ( int j =1; j <= n; j++ ) {
                if ( i == 1  || i ==n || j == 1|| j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        System.out.println(); // for space between one pattern to another, not required for single pattern printing
    }


    public static void Diamond() {
        int n = 5;

     for (int i = 1; i <= n; i++) {
         for (int j = i; j < n; j++) {
             System.out.print(" ");
         }
         for (int j = 1; j <= (2 * i - 1); j++) {
             System.out.print("*");
         }
            System.out.println();
     }

      for (int i = n - 1; i >= 1; i--) {
           for (int j = i; j < n; j++) {
                System.out.print(" ");
           }
           for (int j = 1; j <= (2 * i - 1); j++) {
               System.out.print("*");
           }
           System.out.println();
     }

     System.out.println(); // for space between one pattern to another, not required for single pattern printing
    }


    public static void InverseEquilateralTrianle() {
        int n=5;

        for (int i =n; i>=1; i --) {
            for( int j =i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j= 1; j<=(2*i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // for space between one pattern to another, not required for single pattern printing
    }


    public static void EquilateralTrianle() {
    int n = 5;

    for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {  // spaces before stars
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {  // stars
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
}



    public static void LeftsidebaseTriangle() {
        int n = 5;

       // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
          System.out.println();
       }

       // Lower part
       for (int i = n - 1; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
        System.out.println();
    }


    public static void OutlineEquilateralTrianle() {
        int n = 5;

     for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                  System.out.print("*");
              } else {
                System.out.print(" ");
            }
         }
           System.out.println();
      }
      System.out.println();
    }



    public static void XPattern() {
        int n= 5;

        for ( int i =1; i <=n; i++) {
            for ( int j =1; j <=n; j++) {
                if (j ==i || j ==n -i + 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void Heart() {
        int n =6;

        for ( int i = n/2; i <=n; i+=2) {
            for  (int j =1; j < n- i; j+=2 ) {
                System.out.print(" ");
            }
            for ( int j =1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j =1; j<=n -i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
        for (int i =n; i>=1; i--){
            for (int j = i; j< n; j++) {
                System.out.print(" ");
            }
            for ( int j=1; j<= (i *2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    public static void EquilateralTrianleNumber() {
        int n=6, i, j;
        for (i =1; i<=n; i++) {
            for ( j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (j =1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void RightangledTriangleNumber() {
        int n=6, i, j;
        for (i =1; i<=n; i++) {
            for (j =1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void InverseRightangledTriangleNumber() {
        int n=6, i,j;
        for (i =n; i >=1; i--) {
            for (j =1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

    }


    public static void RightangledTriangleNumberChanging() {
        int n=6, i, j, num =1;
        for (i =1; i<=n; i++) {
            for (j =1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void RightangledTriangleNumber01() {
        int n=6, i, j;
        for (i =1; i<=n; i++) {
            for (j =1; j<=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void NumberDiamond() {
        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void LetterM() {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && j <= 4)|| (j == 8-i&&j>4 ) ) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    

}






    



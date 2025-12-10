public class allpatterns {
    public static void main(String[] args) {


        // box of space and star
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("_ ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        // Right Aligned - right angle triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //corner square.hollow box
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


// right aligned reverse right angle triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

//right angle

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //equilateral
        for (int i =1;i<=5;i++)
        {
            //for(int j =5;j>i;j--)
            for(int j =1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //right only corners
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 1  || i ==j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
// reverse equi
        for (int i =5;i>=1;i--)
        {
            for(int j =5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k =1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        //inverted right angle

        for (int i = 5 ; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
//square with diaganol
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i == 8||i==1||j==8|| j == 1  || i ==j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || i == 5 || i == k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // full square
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print( "  * ");

            }
            System.out.println();
        }
//inverted right angle only corners
for (int i = 5; i >=1; i--) {
        for (int j = 1; j <= 5; j++) {
        if (i == 5 || j == 1  || i ==j) {
        System.out.print(" * ");
                } else {
                        System.out.print("   ");
                }
                        }
                        System.out.println();
                               }
                }
                }

import java.util.Scanner;

class Triangle {
    
    int sideA;
    int sideB;
    int sideC;
    double semiperimeter;
    
    Triangle (int inSideA, int inSideB, int inSideC) {
        sideA = inSideA;
        sideB = inSideB;
        sideC = inSideC;
    }
    
    
    float returnPerimeter() {
           
        float perimeter ;
        
        perimeter     =   sideA + sideB + sideC ;
        semiperimeter =   perimeter / 2 ;
           
        return perimeter ;
    }

    
    double returnArea(){
            
        double area ;

        area   =   Math.sqrt( semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC)) ; // Heron's Formula
           
        return area ;
    }      
}


    class TriangleDriver {
        
        public static int queryForInteger (String prompt) {
            
            Scanner input;
            int theNumber;
        
            input = new Scanner(System.in);
            System.out.println(prompt);
            theNumber = input.nextInt();
        
            return theNumber;
       }
    
  
    
        public static void main(String[] args) {
    
        int sideA1;
        int sideB1;
        int sideC1;
     
        int sideA2;
        int sideB2;
        int sideC2;
       
        
        sideA1 = queryForInteger("Please, enter first side of triangle? ");
        sideB1 = queryForInteger("How about second side of triangle? ");
        sideC1 = queryForInteger("Third side por favor? ");
        
        sideA2 = 3;
        sideB2 = 4;
        sideC2 = 5;
        
        
        Triangle firstTriangle;
        Triangle secondTriangle;
        
        firstTriangle = new Triangle (sideA1, sideB1, sideC1);
        secondTriangle = new Triangle (sideA2, sideB2, sideC2);
        
        
        System.out.println("First triangle's perimeter equals " + firstTriangle.returnPerimeter() + " and its area equals " + firstTriangle.returnArea());
        
        System.out.println("Meanwhile perimeter of the second triangle is: " + secondTriangle.returnPerimeter() + " and its area equals " + secondTriangle.returnArea());
    
        
        
        if (sideA1 != sideB1 && sideA1 != sideC1 && sideB1 != sideC1) {
           
                if (Math.pow(sideA1, 2) == (Math.pow(sideB1, 2) + Math.pow(sideC1, 2)) ){
                    System.out.println("The first triangle is Right and Scalene!");
                    }
                else if (Math.pow(sideB1, 2) == (Math.pow(sideA1, 2) + Math.pow(sideC1, 2)) ){
                    System.out.println("The first triangle is Right and Scalene!");
                    }
                else if (Math.pow(sideC1, 2) == (Math.pow(sideA1, 2) + Math.pow(sideB1, 2)) ){
                    System.out.println("The first triangle is Right and Scalene!");
                    }
                else {
                    System.out.println("The first triangle is Scalene!");
                    }        
        }
        
        else if (Math.pow(sideA1, 2) == (Math.pow(sideB1, 2) + Math.pow(sideC1, 2)) ){
            System.out.println("The first triangle is Right! Thanks to Piphagor!");
        }
        else if (Math.pow(sideB1, 2) == (Math.pow(sideA1, 2) + Math.pow(sideC1, 2)) ){
            System.out.println("The first triangle is Right! Thanks to Piphagor!");
        }
        else if (Math.pow(sideC1, 2) == (Math.pow(sideA1, 2) + Math.pow(sideB1, 2)) ){
            System.out.println("The first triangle is Right! Thanks to Piphagor!");
        }
        
        else if (sideA1 == sideB1 || sideA1 == sideC1 || sideB1 == sideC1) {
        System.out.println("The first triangle is Isosceles!");
        }
        
        
 
        
        
        if (sideA2 != sideB2 && sideA2 != sideC2 && sideB2 != sideC2){
            
                if (Math.pow(sideA2, 2) == (Math.pow(sideB2, 2) + Math.pow(sideC2, 2)) ){
                System.out.println("The Second triangle is Right and Scalene!");
                }
                else if (Math.pow(sideB2, 2) == (Math.pow(sideA2, 2) + Math.pow(sideC2, 2)) ){
                System.out.println("The Second triangle is Right and Scalene!");
                }
                else if (Math.pow(sideC2, 2) == (Math.pow(sideA2, 2) + Math.pow(sideB2, 2)) ){
                System.out.println("The Second triangle is Right and Scalene!");
                }
                else {
                System.out.println("The Second Triangle is Scalene");
                } 
        }
        
        else if (Math.pow(sideA2, 2) == (Math.pow(sideB2, 2) + Math.pow(sideC2, 2)) ){
            System.out.println("The Second triangle is Right! Thanks to Piphagor!");
        }
        else if (Math.pow(sideB2, 2) == (Math.pow(sideA2, 2) + Math.pow(sideC2, 2)) ){
            System.out.println("The Second triangle is Right! Thanks to Piphagor!");
        }
        else if (Math.pow(sideC2, 2) == (Math.pow(sideA2, 2) + Math.pow(sideB2, 2)) ){
            System.out.println("The Second triangle is Right! Thanks to Piphagor!");
        }

        else if (sideA2 == sideB2 || sideA2 == sideC2 || sideB2 == sideC2) {
        System.out.println("The Second triangle is Isosceles!");
        }
        
        
    } // END OF PUBLIC STATIC VOID MAIN

} // END OF TRIANGLE DRIVER

package adtcdt;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {2,2};
        Integer[] arr2 = {2,3,3,4};
        
        System.out.print("Polynomial 1: ");
        for(int i = arr1.length - 1; i >= 0 ; i--) {
            if(i>0) {
                System.out.print(arr1[i] + "x^" + i);
                System.out.print(" + ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        
        System.out.print("\nPolynomial 2: ");
        for(int i = arr2.length - 1; i >= 0 ; i--) {
            if(i>0) {
                System.out.print(arr2[i] + "x^" + i);
                System.out.print(" + ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        
        System.out.println();
        
        Poly p1 = new Poly(arr1);
        Poly p2 = new Poly(arr2);
        
        System.out.println("\nValue of Polynomial 1 when x = 2 : " + p1.evaluate(2));
        System.out.println("Value of Polynomial 2 when x = 2: " + p2.evaluate(2));
        
        System.out.println("\nDegree of Polynomial 1: " + p1.degree());
        System.out.println("Degree of Polynomial 2: " + p2.degree());
        
        Integer[] sum = p1.addPoly(p1, p2);
        System.out.print("\nSum of Polynomial 1 and Polynomial 2: ");
        for(int i = sum.length - 1; i >= 0 ; i--) {
            if(i>0) {
                System.out.print(sum[i] + "x^" + i);
                System.out.print(" + ");
            } else {
                System.out.print(sum[i]);
            }
        }
        
        System.out.println();

        int[] product = p1.multiplyPoly(p1, p2);
        System.out.print("\nProduct of Polynomial 1 and Polynomial 2: ");
        for(int i = product.length - 1; i >= 0 ; i--) {
            if(i>0) {
                System.out.print(product[i] + "x^" + i);
                System.out.print(" + ");
            } else {
                System.out.print(product[i]);
            }
        }
        
    }

}

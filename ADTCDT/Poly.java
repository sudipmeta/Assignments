package adtcdt;

final class Poly{
    private Integer[] polynomial;
    
    public Poly(Integer[] arr) {
        polynomial = arr;
    }
    
    /**
     * To find the value of the polynomial for the given value of the variable.
     * @param float x representing the value of the polynomial
     * @return the value of the polynomial for the given value of the variable
     */
    public float evaluate(float x) {
        float result = 0;
        float tempSum;
        
        for(int i=0; i < polynomial.length; i++) {
            tempSum = polynomial[i];
            for(int j = 0; j < i ; j++) {
                tempSum *= x;
            }
            result = result + tempSum;
        }
        
        return result;
    }
    
    /**
     * To find the degree of the polynomial.
     * @return the degree of the polynomial
     */
    public int degree() {
        return this.polynomial.length - 1;
    }
    
    /**
     * To find the sum of the polynomials p1 and p2.
     * @param Object p1 of class Poly representing the first polynomial
     * @param Object p2 of class Poly representing the second polynomial
     * @return the sum of the polynomials p1 and p2
     */
    public Integer[] addPoly(Poly p1, Poly p2) {
        Integer[] sum = new Integer[Math.max(p1.polynomial.length, p2.polynomial.length)];
        
        for(int i = 0; i < sum.length; i++) {
            if(i < p1.polynomial.length && i < p2.polynomial.length) {
                sum[i] = p1.polynomial[i] + p2.polynomial[i];
             } else if(i < p1.polynomial.length && i >= p2.polynomial.length) {
                 sum[i] = p1.polynomial[i];
             } else if(i >= p1.polynomial.length && i < p2.polynomial.length) {
                 sum[i] = p2.polynomial[i];
             }
        }
        
        return sum;
    }
    
    /**
     * To find the product of the polynomials p1 and p2.
     * @param Object p1 of class Poly representing the first polynomial
     * @param Object p2 of class Poly representing the second polynomial
     * @return the product of the polynomials p1 and p2
     */
    public int[] multiplyPoly(Poly p1, Poly p2) {
        int[] product = new int[p1.polynomial.length + p2.polynomial.length-1];
        
        for(int i = 0; i < p1.polynomial.length; i++) {
            for(int j = 0; j < p2.polynomial.length; j++) {
                product[i+j] += p1.polynomial[i] * p2.polynomial[j];
            }
        }
        
        return product;
    }
    

}

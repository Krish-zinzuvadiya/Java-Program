/*
Date:-27/03/2024
Name:-Krish Zinzuvadiya
AIM :- Create class vector with instance variable x,y,z write necessary constructor to initilized
       values of object and create a method add. that adds x,y,z and print the answer.
       -> If answer is zero then handle the Exception.
*/
class Ex22 {
    public static void main(final String[] args) {
        final Vector v = new Vector(1,2,3);
        v.add();
        try{
            v.check();
        } catch(final OddException e){
            System.out.println(e);
        }
    }    
}
class Vector{
    int x,y,z;

    public Vector(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void add(){
        final int ans = x+y+z;
        try{
            if(ans==0){
                throw new ZeroException("Ans Is Zero.");
            }
        } catch(final ZeroException e){
            System.out.println(e);
        }
        System.out.println("Answer is:- "+ans);
    }
    void check(){
        if(x%2!=0 || y%2!=0|| z%2!=0){
            throw new OddException("All Values Must Be Even.");
        }
    }
}
class ZeroException extends RuntimeException{
    public ZeroException(final String s){
        super(s);
    }
}
class OddException extends RuntimeException{
    public OddException(final String s){
        super(s);
    }
}
public class PowerException {
    public static void main(String[] args) {
        try{
            if(args.length < 2){
            throw new IllegalArgumentException("Please Provide X & Y.");
            }
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if(x<0 || y<0){
                throw new IllegalArgumentException("Please Provide X & Y.");
            }
            int result =(int)Math.pow(x,y);
            System.out.println("Answer of x ^ y Is :- "+ result);
        } catch(NumberFormatException e){
            System.out.println("Invalid Input.");
        } catch(IllegalArgumentException e){
            System.out.println("Invalid...."+e);
        }
    }    
}

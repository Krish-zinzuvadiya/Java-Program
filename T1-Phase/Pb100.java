import java.io.FileReader;

public class Pb100 {
    public static void main(String[] args) {
        if(args.length >=9 ){
            ResourceStatus r = new ResourceStatus(args);
            r.procesStatusCount();
        } else {
            System.out.println("Please Enter 9 Values...");
        }
    }
}
class ResourceStatus{
    int[][] StatusRef = new int[3][3];
    int cn0;
    int cn1;
    int cn2;

    ResourceStatus(String status[]){
        try{
            int c=0;

            for(int i = 0; i<3;i++){
                for(int j=0; j<3;j++){
                    StatusRef[i][j] = Integer.parseInt(status[c]);
                    c++;

                    if(StatusRef[i][j]>2||StatusRef[i][j]<0){
                        throw new InvalidException("Enter 0, 1, 2 only..");
                    }
                    if(StatusRef[i][j]==0){
                        cn0++;
                    }
                    if(StatusRef[i][j]==1){
                        cn1++;
                    }
                    if(StatusRef[i][j]==2){
                        cn2++;
                    }
                }
            }
            System.out.println("---Matrix---");

            for(int i = 0; i<3;i++){
                for(int j=0; j<3;j++){
                    System.out.print(StatusRef[i][j]+" ");
                }
                System.out.println();
            }
        } catch(NumberFormatException e){
            System.out.println("Mismatch : please enter integer value only..."+e);
        } catch(InvalidException e){
            System.out.println(e);
        }
    }

    void procesStatusCount(){
        try{
            if(cn1>cn0){
                throw new FreeException("We Will Free Inaccesible Resource.");
            }
        } catch(FreeException e){
            System.out.println(e);
            for(int i = 0; i<3;i++){
                for(int j=0; j<3;j++){
                    if(StatusRef[i][j]==2){
                    StatusRef[i][j]=0;
                    }
                }
            }
        }

        System.out.println("---Matrix---");

            for(int i = 0; i<3;i++){
                for(int j=0; j<3;j++){
                    System.out.print(StatusRef[i][j]+" ");
                }
                System.out.println();
        }
    }
}
class InvalidException extends RuntimeException{
    public InvalidException(String s){
        super(s);
    }
}
class FreeException extends RuntimeException{
    public FreeException(String s){
        super(s);
    }
}
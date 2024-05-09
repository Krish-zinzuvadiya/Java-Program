import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.String;

public class CMS{
    ArrayList<Car> carList = new ArrayList<Car>();
    Scanner sc = new Scanner(System.in);
//----> Adding Cars...
    void addCar(){
        System.out.print("Enter Car Code: ");
        int code =sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Car Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Car Year: ");
        int year = sc.nextInt();
        Car c = new Car(code,name,price,year);
        carList.add(c);
        System.out.println(c.getCarName()+" Is Added Successfully.");
    }
//----> Remove Car By Car-code...
    void removeCarByCode(){
        System.out.print("Enter Car-code that you want to remove :");
        int code = sc.nextInt();
        int temp = 0;
        for(Car c : carList){
            if(code == c.carCode){
                temp = 1;
                carList.remove(c);
                System.out.println(c.getCarName()+" Car Removed Successfully");
                break;
            } 
            if(temp == 0){
                System.out.println("Car not found !!! ");
            }
        }
    }
//----> Update Car By Index...
    void updateCarByIndex(){
        System.out.print("Enter Index Which You Want To Update : ");
        int index = sc.nextInt();
        sc.nextLine();
        Car c = carList.get(index);

        System.out.println("Enter New Name Of Car Otherwise Do Enter To Keep It as it is : ");
        String newName = sc.nextLine();
        if(!newName.isEmpty()){
            c.setCarName(newName);
        }
        System.out.println("Enter New Price Of Car Otherwise Do Enter To Keep It as it is : ");
        String newPrice = sc.nextLine();
        if(!newPrice.isEmpty()){
            double price = Double.parseDouble(newPrice);
            c.setCarPrice(price);
        }
        System.out.println("Enter New Year Of Car Otherwise Do Enter To Keep It as it is : ");
        String newYear = sc.nextLine();
        if(!newYear.isEmpty()){
            int year = Integer.parseInt(newYear);
            c.setCarPrice(year);
        }
    }
 //---> Display Cars...
    void DisplayCar(){
        System.out.println("----------Car List----------");
        for(Car c : carList){
            System.out.println(
                c.getCarCode()+ " \t " + c.getCarName()+ " \t " + c.getCarPrice()+ " \t " + c.getCarYear());
        }
    }
//---> Search By Car Name...
    void searchCarByName(){
        System.out.print("Enter Car Name That You Want To Search : ");
        String name = sc.next();
        int temp = 0;
        for(Car c : carList){
            if(name.equalsIgnoreCase(c.getCarName())){
                temp = 1;
                System.out.println(
                    c.getCarCode()+ " \t " + c.getCarName()+ " \t " + c.getCarPrice()+ " \t " + c.getCarYear());
                break;
            } 
            if(temp == 0){
                System.out.println("Car not found !!! ");
            }
        }
    }

//---> Sort Price & Year...
    void sortByPrice(){
        Collections.sort(carList, Comparator.comparing(Car::getCarPrice));
    }
    void sortByYear(){
        Collections.sort(carList, Comparator.comparing(Car::getCarYear).reversed());
    }
//----> Main Method.....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CMS cms = new CMS();
        int ch;
        do{
        System.out.println(
            "1. Add Car \t" +"2. Remove Car By Car-code \t" +"3. Update Car By Index \t" +"4. Display Cars \t" +"5. Search By Car Name \n" +"6. Sort By Price \t" +"7. Sort By Year \t" +"8. Exit \t");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1 :{
                    cms.addCar();
                    break;
                }
                case 2 :
                    cms.removeCarByCode();
                    break;
                case 3 :
                    cms.updateCarByIndex();
                    break;
                case 4 :
                    cms.DisplayCar();
                    break;
                case 5 :
                    cms.searchCarByName();
                    break;
                case 6 :
                    cms.sortByPrice();
                    break;
                case 7 :
                    cms.sortByYear();
                    break;
                case 8 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }while(ch != 8);
    }
}

class Car {
    int carCode;
    String carName;
    double carPrice;
    int carYear;
    public Car() {
    }
    public Car(int carCode, String carName, double carPrice, int carYear) {
        this.carCode = carCode;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carYear = carYear;
    }
    public int getCarCode() {
        return carCode;
    }
    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public double getCarPrice() {
        return carPrice;
    }
    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }
    public int getCarYear() {
        return carYear;
    }
    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
package Passengers;
import Passengers.PassengersEntity;
import Passengers.PassengersService;
import java.sql.SQLException;
import java.util.List;
public class Main {

    public static void main (String[] args) {


        //insert
        try {
            PassengersService.getInstance().save (new PassengersEntity().setMelicode("0076728374").setFullnamep ("sarab").setPhonenum ("093677").setNumofpass (3).setStaynum(5) .setFullprice(5).setAdvancepay(0));
            System.out.println ("Saved Successfully");
        }
        catch (Exception e){
            System.out.println ("Failed to Save!"+e.getMessage());
        }

        //update
        try {
            PassengersService.getInstance().edit (new PassengersEntity().setMelicode("0076728374").setFullnamep ("negarp").setPhonenum ("9999991").setNumofpass (4).setStaynum(3) .setFullprice(5).setAdvancepay(0));
            System.out.println ("Edited Successfully");
        }
        catch (Exception e){
            System.out.println ("Failed to Edit!"+e.getMessage ());

        }
        //delete
        try {
            PassengersService.getInstance ().remove ();
            System.out.println ("Removed Successfully");
        }
        catch (Exception e){
            System.out.println ("Failed to Delete!"+e.getMessage ());
        }
        //select
        try {
            List<PassengersEntity> passengersList = PassengersService.getInstance().report ();
            for (PassengersEntity passengersEntity : passengersList) {
                System.out.println(passengersEntity.getMelicode());
                System.out.println(passengersEntity.getFullnamep());
                System.out.println(passengersEntity.getPhonenum());
                System.out.println(passengersEntity.getNumofpass());
                System.out.println(passengersEntity.getStaynum());
                System.out.println(passengersEntity.getFullprice());
                System.out.println(passengersEntity.getAdvancepay());
            }
        }
        catch (Exception e){
            System.out.println ("Failed to Report!"+e.getMessage ());
        }
    }
}


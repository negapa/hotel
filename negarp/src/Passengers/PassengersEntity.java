package Passengers;

public class PassengersEntity {

    private String melicode;
    private String fullnamep;
    private String phonenum;
    private int numofpass;
    private int staynum;//room mide
    private int fullprice;//roomprice * staynum
    private int advancepay;//fullprice * darsadi


    //melicode:
    public String getMelicode() {
        return melicode;
    }
    public PassengersEntity setMelicode(String melicode) {
        this.melicode = melicode;
        return this;
    }

    //fullnamep:
    public String getFullnamep() {
        return fullnamep;
    }
    public PassengersEntity setFullnamep(String fullnamep) {
        this.fullnamep = fullnamep;
        return this;
    }

    //phonenum:
    public String getPhonenum() {
        return phonenum;
    }
    public PassengersEntity setPhonenum(String phonenum) {
        this.phonenum = phonenum;
        return this;
    }

    //numofpass:
    public int getNumofpass() {
        return numofpass;
    }
    public PassengersEntity setNumofpass(int numofpass) {
        this.numofpass = numofpass;
        return this;
    }


    //numofstay:
    public int getStaynum() {
        return staynum;
    }
    public PassengersEntity setStaynum(int staynum) {
        this.staynum = staynum;
        return this;
    }

    //fullprice:
    public int getFullprice() {
        return fullprice;
    }
    public PassengersEntity setFullprice(int fullprice) {
        this.fullprice = fullprice;
        return this;
    }

    //advancepay:
    public int getAdvancepay() {
        return advancepay;
    }
    public PassengersEntity setAdvancepay(int advancepay) {
        this.advancepay = advancepay;
        return this;
    }

}



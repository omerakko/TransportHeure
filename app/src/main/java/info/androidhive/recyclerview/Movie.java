package info.androidhive.recyclerview;

/**
 * Created by Lincoln on 15/01/16.
 */
public class Movie {
    //private String title, genre, year;
    public String TransportHour;
    public String TransportDate;
    public String DepartAdress;
    public String DepartFormattedAdress;
    public String Departlat;
    public String Departlng;
    public String ArriveAddress;
    public String ArriveFormattedAddress;
    public String ArriveLat;
    public String ArriveLng;
    public String ExtraWorker;
    public String ExtraTime;
    public String TotalPrice;
    public String VehicleType;
    public String CustomerSurname;
    public String CustomerName;
    public String CustomerAddress;
    public String CustomerNumber;
    public String BookingId;

    /*public Movie(String title, String genre,String year){
        /* this.title = title;
        this.genre = genre;
        this.year = year;*/
    //}

    /*public Movie(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p, String q, String r) {
    }*/

    public Movie( String bookingId, String departAdress, String departFormattedAdress, String departlat,
                 String departlng, String arriveAddress, String arriveFormattedAddress, String arriveLat, String arriveLng, String customerAddress, String customerName, String customerNumber,
                 String extraTime, String extraWorker, String totalPrice, String transportDate,String transportHour, String vehicleType) {


        this.TransportHour = transportHour;
        this.TransportDate = transportDate;
        this.DepartAdress = departAdress;
        this.DepartFormattedAdress = departFormattedAdress;
        this.Departlat = departlat;
        this.Departlng = departlng;
        this.ArriveAddress = arriveAddress;
        this.ArriveFormattedAddress = arriveFormattedAddress;
        this.ArriveLat = arriveLat;
        this.ArriveLng = arriveLng;
        this.ExtraWorker = extraWorker;
        this.ExtraTime = extraTime;
        this.TotalPrice = totalPrice;
        this.VehicleType = vehicleType;
       // this.CustomerSurname = customerSurname;
        this.CustomerName = customerName;
        this.CustomerAddress = customerAddress;
        this.CustomerNumber = customerNumber;
        this.BookingId = bookingId;



    }

    /*public Movie(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p, String q, String r) {
    }*/


    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getCustomerSurname() {
        return CustomerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        CustomerSurname = customerSurname;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        CustomerNumber = customerNumber;
    }

    public String getBookingId() {
        return BookingId;
    }

    public void setBookingId(String bookingId) {
        BookingId = bookingId;
    }

    public String getTransportHour() {
        return TransportHour;
    }

    public void setTransportHour(String transportHour) {
        TransportHour = transportHour;
    }

    public String getTransportDate() {
        return TransportDate;
    }

    public void setTransportDate(String transportDate) {
        TransportDate = transportDate;
    }

    public String getDepartAdress() {
        return DepartAdress;
    }

    public void setDepartAdress(String departAdress) {
        DepartAdress = departAdress;
    }

    public String getDepartFormattedAdress() {
        return DepartFormattedAdress;
    }

    public void setDepartFormattedAdress(String departFormattedAdress) {
        DepartFormattedAdress = departFormattedAdress;
    }

    public String getDepartlat() {
        return Departlat;
    }

    public void setDepartlat(String departlat) {
        Departlat = departlat;
    }

    public String getDepartlng() {
        return Departlng;
    }

    public void setDepartlng(String departlng) {
        Departlng = departlng;
    }

    public String getArriveAddress() {
        return ArriveAddress;
    }

    public void setArriveAddress(String arriveAddress) {
        ArriveAddress = arriveAddress;
    }

    public String getArriveFormattedAddress() {
        return ArriveFormattedAddress;
    }

    public void setArriveFormattedAddress(String arriveFormattedAddress) {
        ArriveFormattedAddress = arriveFormattedAddress;
    }

    public String getArriveLat() {
        return ArriveLat;
    }

    public void setArriveLat(String arriveLat) {
        ArriveLat = arriveLat;
    }

    public String getArriveLng() {
        return ArriveLng;
    }

    public void setArriveLng(String arriveLng) {
        ArriveLng = arriveLng;
    }

    public String getExtraWorker() {
        return ExtraWorker;
    }

    public void setExtraWorker(String extraWorker) {
        ExtraWorker = extraWorker;
    }

    public String getExtraTime() {
        return ExtraTime;
    }

    public void setExtraTime(String extraTime) {
        ExtraTime = extraTime;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }



   /* public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }*/
}

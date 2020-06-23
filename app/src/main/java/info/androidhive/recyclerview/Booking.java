package info.androidhive.recyclerview;

public class Booking {

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

    public String TotalPrice;
    public String VehicleType;
    public String CustomerSurname;
    public String CustomerName;
    public String CustomerAddress;
    public String CustomerNumber;
    public String BookingId;

     Booking(String TransportHour,
                   String TransportDate,
                   String DepartAdress,
                   String DepartFormattedAdress,
                   String Departlat,
                   String Departlng,
                   String ArriveAddress,
                   String ArriveFormattedAddress,
                   String ArriveLat,
                   String ArriveLng,
                   String ExtraWorker,
                   String ExtraTime,
                   String TotalPrice,
                   String VehicleType,
                   String CustomerSurname,
                   String CustomerName,
                   String CustomerAddress,
                   String CustomerNumber,
                   String BookingId) {
        this. TransportHour=TransportHour;
        this.TransportDate=TransportDate;
        this . DepartAdress=DepartAdress;
        this  .DepartFormattedAdress=DepartFormattedAdress;
        this  .Departlat=Departlat;
        this  .Departlng=Departlng;
        this  .ArriveAddress=ArriveAddress;
        this  .ArriveFormattedAddress=ArriveFormattedAddress;
        this  .ArriveLat=ArriveLat;
        this  .ArriveLng=ArriveLng;
        this  .ExtraWorker=ExtraWorker;
        this  .ExtraTime=ExtraTime;
        this  .TotalPrice=TotalPrice;
        this  .VehicleType=VehicleType;
        this  .CustomerSurname=CustomerSurname;
        this  .CustomerName=CustomerName;
        this  .CustomerAddress=CustomerAddress;
        this  .CustomerNumber=CustomerNumber;
        this  .BookingId=BookingId;


        

    }

    public Booking(){}


}

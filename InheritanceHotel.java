class Hotel{
//    Declare instance variables
    int hotelId;
    String hotelName;
    int roomFare;

//    Getter and Setter for setting and displaying the values.

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRoomFare() {
        return roomFare;
    }

    public void setRoomFare(int roomFare) {
        this.roomFare = roomFare;
    }
}
// Inheritance occurs
class GrandHotel extends Hotel{

}
public class InheritanceHotel{
    public static void main(String[] args) {
//        Creating object
        GrandHotel h = new GrandHotel();

//        Setting values
        h.setHotelId(101);
        h.setHotelName("Grand Hotel");
        h.setRoomFare(3000);

//        Displaying values
        System.out.println("Hotel Id is - " + h.getHotelId());
        System.out.println("Hotel Name is - " + h.getHotelName());
        System.out.println("Hotel fare is - " + h.getRoomFare());
    }
}

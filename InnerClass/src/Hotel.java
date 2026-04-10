public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void ReserveRooms(String guestName, int numOfRooms){
        class ReservationValidation{
            boolean validate(){
                if(guestName==null || guestName.isBlank()){
                    System.out.println("Guestname cant be empty");
                    return false;
                }
                if(numOfRooms<0)
                {
                    System.out.println("no any rooms");
                    return false;
                }
                if(reservedRooms+numOfRooms>totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }
        }

    ReservationValidation validation=new ReservationValidation();
        if(validation.validate()){
            reservedRooms+=numOfRooms;
            System.out.println("Res.. confirmed for "+guestName+" for "+numOfRooms);
        }else{
            System.out.println("Failed...");
        }

    }
}

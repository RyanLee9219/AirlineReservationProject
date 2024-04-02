public class Reservation {

    Airplane airplane = new Airplane();
    UserInfo userInfo = new UserInfo();

    public boolean reserve(String reserver) {
        boolean[] availability = airplane.getReserveAvabileList();
        boolean isAvailable = false;

        for (boolean seat : availability) {
            if (!seat) {
                isAvailable = true;
                break;
            }
        }
        if (!isAvailable) {
            System.out.println("Unfortunately, it is fully booked, choose another itinerary.");
        } else {
            System.out.println("It's available. Please enter your information to book the ticket.");
        }
        return isAvailable;
    }

    public String clientInfo(String info){
        String personalInfo;
        String firstName += userInfo.getFirstName();
        String lastName += userInfo.getLastName();
        String phoneNumber += userInfo.getPhoneNumber();
        return personalInfo;
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements User{
    public static void main(String[] args) {
        Reservation reservation = new Reservation();    //  *
        // Class init
        boolean stop = false;
        String userAnswer="";
        // Value Field

        do{
            printListAirplane();
            System.out.print("Please Enter either Plane Code or Number of the List: ");
            userAnswer = User.userInput();
            if(!reservation.git reserve(userAnswer)){     // * 만약 예약이 불가능한 경우
                continue;
            }
            bookAirplane(reservation);

            System.out.print("Continue..? (y/n)");
            if(User.userInput().equalsIgnoreCase("y")){
                stop = true;
            }
        }while(!stop);
    }
    public static void bookAirplane(Reservation reservation){
        System.out.print("Please input your First Name:  ");
        reservation.**(User.reserveInput());
        System.out.print("Please input your Last Name: ");
        reservation.**(User.reserveInput());
        System.out.print("Please input your Phone Number: ");
        reservation.**(User.reserveInput());
        System.out.println("Order Confirmation:");
        User
        System.out.println("Reserve is completed..!");

    }

    public static void printListAirplane(){
        reservation.printAirplaneList();
    }
}
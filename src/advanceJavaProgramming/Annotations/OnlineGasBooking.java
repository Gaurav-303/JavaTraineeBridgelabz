package advanceJavaProgramming.Annotations;


class OnlineBooking extends BaseBooking {

    @Override
    public void confirmBooking() {
        System.out.println("Online Booking Confirmed");
    }

}
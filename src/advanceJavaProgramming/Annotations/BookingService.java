package advanceJavaProgramming.Annotations;

class BookingService {

    @Deprecated
    public void oldBookingMethod() {
        System.out.println("Old Booking Method");
    }
    @SuppressWarnings("unchecked")
    public void legacyCode() {

        java.util.List list = new java.util.ArrayList();

        list.add("Room A");
    }
}
package ch.silviowangler.spock.booking;

/**
 * @author Silvio Wangler
 */
public class BookingService {

  // teure Ressource, wollen wir im Test besser mocken
  private BookingBackend bookingBackend;

  public BookingService(BookingBackend bookingBackend) {
    this.bookingBackend = bookingBackend;
  }

  public boolean bookEvent(String eventId, int amount) {
    try {
      this.bookingBackend.bookEvent(eventId, amount);
      return true;
    } catch (BookingException e) {
      return false;
    }
  }
}

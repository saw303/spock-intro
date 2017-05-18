package ch.silviowangler.spock.booking;

/**
 * @author Silvio Wangler
 */
public interface BookingBackend {
  void bookEvent(String eventId, int amount) throws BookingException;
}

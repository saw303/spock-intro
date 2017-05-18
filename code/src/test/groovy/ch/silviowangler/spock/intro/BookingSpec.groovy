package ch.silviowangler.spock.intro

import ch.silviowangler.spock.booking.BookingBackend
import ch.silviowangler.spock.booking.BookingException
import ch.silviowangler.spock.booking.BookingService
import spock.lang.Specification
/**
 * @author Silvio Wangler
 */
class BookingSpec extends Specification {

    // tag::happy[]
    void "Buche 2 Ticket für eine Veranstaltung"(){

        given:
        def backend = Mock(BookingBackend)
        BookingService bookingService = new BookingService(backend)

        when: 'zwei Tickets für die Veranstalung 22 gebucht werden'
        def result = bookingService.bookEvent('22', 2)

        then: 'ist die Transaktion erfolgreich'
        result

        and:
        1 * backend.bookEvent('22', 2)
        0 * _
    }
    // end::happy[]

    // tag::badpath[]
    void "Simuliere Fehler beim Buchen"(){

        given:
        def backend = Mock(BookingBackend)
        BookingService bookingService = new BookingService(backend)

        when: 'zwei Tickets für die Veranstalung 22 gebucht werden'
        def result = bookingService.bookEvent('22', 2)

        then: 'ist die Transaktion erfolgreich'
        !result

        and:
        1 * backend.bookEvent('22', 2) >> { throw new BookingException() }
        0 * _
    }
    // end::badpath[]
}

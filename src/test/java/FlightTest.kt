import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FlightTest {

    val plane = Plane(PlaneType.BOEING737)
    val flight = Flight(plane, "AB123", "GLA", "LHR", "12:00 23FEB2020")

    @Test
    fun getPlane() {
        assertEquals(plane, flight.plane)
    }

    @Test
    fun getFightNumber() {
        assertEquals("AB123", flight.fightNumber)
    }

    @Test
    fun getDestination() {
        assertEquals("GLA", flight.destination)
    }

    @Test
    fun getDepartureAirport() {
        assertEquals("LHR", flight.departureAirport)
    }

    @Test
    fun getDepartureTime() {
        assertEquals("12:00 23FEB2020", flight.departureTime)
    }
}
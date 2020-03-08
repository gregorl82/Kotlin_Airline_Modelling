import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PassengerTest {

    val passenger = Passenger("Jonathan McTavish", 2)

    @Test
    fun getName() {
        assertEquals("Jonathan McTavish", passenger.name)
    }

    @Test
    fun getNumberOfBags() {
        assertEquals(2, passenger.numberOfBags)
    }
}
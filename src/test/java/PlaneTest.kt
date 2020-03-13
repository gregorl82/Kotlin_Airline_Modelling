import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PlaneTest {

    val plane = Plane(PlaneType.BOEING737)

    @Test
    fun getPlaneType() {
        assertEquals(PlaneType.BOEING737, plane.planeType)
    }

    @Test
    fun planeStartsEmpty() {
        assertEquals(0, plane.countPassengers())
    }
}
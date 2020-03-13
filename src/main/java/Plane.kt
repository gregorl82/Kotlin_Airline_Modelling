class Plane (planeType: PlaneType) {

    val planeType: PlaneType = planeType
    val passengers: ArrayList<Passenger> = ArrayList()

    fun countPassengers(): Int {
        return passengers.size
    }
}
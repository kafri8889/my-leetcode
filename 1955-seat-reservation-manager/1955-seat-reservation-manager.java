class SeatManager {

    private final LinkedHashSet<Integer> reserved;
    private final LinkedHashSet<Integer> unreserved = new LinkedHashSet<>();
    private final Integer size;
    private Integer lastReservedSeat = 0;

    public SeatManager(int n) {
        reserved = new LinkedHashSet<>(n);
        size = n;
    }

    public int reserve() {
        if (unreserved.isEmpty()) {
            lastReservedSeat++;
            reserved.add(lastReservedSeat);
            return lastReservedSeat;
        } else {
            Integer seat = unreserved.stream().min(Integer::compare).get();

            reserved.add(seat);
            unreserved.remove(seat);

            return seat;
        }
    }

    public void unreserve(int seatNumber) {
        reserved.remove(seatNumber);
        unreserved.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
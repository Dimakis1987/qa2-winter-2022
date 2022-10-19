package hw1;

public class MyFlat {
   private String address;
   private int roomNumber;
   private int floorNumber;
   private boolean convenience;
   private int houseFloor;
   //--------------------------------Getters and Setters-----------------------------------

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getRoomNumber() {
      return roomNumber;
   }

   public void setRoomNumber(int roomNumber) {
      this.roomNumber = roomNumber;
   }

   public int getFloorNumber() {
      return floorNumber;
   }

   public void setFloorNumber(int floorNumber) {
      this.floorNumber = floorNumber;
   }

   public boolean isConvenience() {
      return convenience;
   }

   public void setConvenience(boolean convenience) {
      this.convenience = convenience;
   }

   public int getHouseFloor() {
      return houseFloor;
   }

   public void setHouseFloor(int houseFloor) {
      this.houseFloor = houseFloor;
   }
}

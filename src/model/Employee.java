package model;

import java.io.Serializable;

public class Employee implements Serializable {
    private String RoomNumber; // số phòng
    private String KindOfRoom; // loại phòng
    private int RoomRates; // giá phòng
    private String Prevention; // phòng chống
    private String RentedRoom; // phòng đã thuê
    private String BusinessRoom; // phòng thương gia
    private String NormalRoom; // phòng thường


    public Employee(String employeeCode, String name, int age, String phone, String email) {
        this.RoomNumber = employeeCode;
        this.KindOfRoom = name;
        this.RoomRates = age;
        this.Prevention = phone;
        this.RentedRoom = email;
    }

    public String getEmployeeCode() {
        return RoomNumber;
    }

    public void setEmployeeCode(String employeeCode) {
        this.RoomNumber = employeeCode;
    }

    public String getName() {
        return KindOfRoom;
    }

    public void setName(String name) {
        this.KindOfRoom = name;
    }

    public int getAge() {
        return RoomRates;
    }

    public void setAge(int age) {
        this.RoomRates = age;
    }

    public String getPhone() {
        return Prevention;
    }

    public void setPhone(String phone) {
        this.Prevention = phone;
    }

    public String getEmail() {
        return RentedRoom;
    }

    public void setEmail(String email) {
        this.RentedRoom = email;
    }
//    public String getNormalRoom() {
//        return NormalRoom ;
//    }
//
//    public void setNormalRoom(String employeeCode) {
//        this.NormalRoom = employeeCode;
//    }

}

package de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util;

public class Hoschi {

    private String firstName;
    private String lastName;
    private String nickName;
    private Integer fancyNo;
    private Integer magicNo;

    public Hoschi() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getFancyNo() {
        return fancyNo;
    }

    public void setFancyNo(Integer fancyNo) {
        this.fancyNo = fancyNo;
    }

    public Integer getMagicNo() {
        return magicNo;
    }

    public void setMagicNo(Integer magicNo) {
        this.magicNo = magicNo;
    }

    @Override
    public String toString() {
        return "Hoschi{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", fancyNo=" + fancyNo +
                ", magicNo=" + magicNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hoschi hoschi = (Hoschi) o;

        if (firstName != null ? !firstName.equals(hoschi.firstName) : hoschi.firstName != null) return false;
        if (lastName != null ? !lastName.equals(hoschi.lastName) : hoschi.lastName != null) return false;
        if (nickName != null ? !nickName.equals(hoschi.nickName) : hoschi.nickName != null) return false;
        if (fancyNo != null ? !fancyNo.equals(hoschi.fancyNo) : hoschi.fancyNo != null) return false;
        return magicNo != null ? magicNo.equals(hoschi.magicNo) : hoschi.magicNo == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (fancyNo != null ? fancyNo.hashCode() : 0);
        result = 31 * result + (magicNo != null ? magicNo.hashCode() : 0);
        return result;
    }
}

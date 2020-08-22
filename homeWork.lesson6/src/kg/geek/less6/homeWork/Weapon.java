package kg.geek.less6.homeWork;

public class Weapon {
    private String typeOfWeapon;
    private String nameOfWeapon;

    public Weapon(String typeOfWeapon, String nameOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    //    setters and getters
    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
//    setters and getters
}

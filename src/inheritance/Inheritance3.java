package inheritance;

public class Inheritance3 {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        String color = cellPhone.color;
        String model = cellPhone.model;
        cellPhone.bell();


        DmbCellPhone dmbCellPhone = new DmbCellPhone();
        String color1 = dmbCellPhone.color;
        String channel = dmbCellPhone.channel;
        dmbCellPhone.bell();
        dmbCellPhone.turnOnDmb();

    }
}

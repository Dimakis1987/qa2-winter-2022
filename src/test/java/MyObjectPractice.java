import hw1.*;
import org.junit.jupiter.api.Test;

public class MyObjectPractice {
    @Test
    public void workingWithBook() {
        Book classBook = new Book();

        classBook.setPageNumber(364);
        classBook.setNameOfBook("Ballada");
        classBook.setLetterNumber(1578);
        classBook.setChapterNumber(23);
        classBook.setPublishingHouse("New Stories");

        System.out.println(classBook.getPageNumber());
        System.out.println(classBook.getNameOfBook());
        System.out.println(classBook.getLetterNumber());
        System.out.println(classBook.getChapterNumber());
        System.out.println(classBook.getPublishingHouse());
    }

    @Test
    public void workingWithCalculator() {
        Calculator classCalculator = new Calculator();

        classCalculator.setButtonNumber(15);
        classCalculator.setColour("Grey");
        classCalculator.setTypeOfCalculator("Scientific");
        classCalculator.setDisplayQuantity(1);
        classCalculator.setBrandName("Citizen");

        System.out.println(classCalculator.getButtonNumber());
        System.out.println(classCalculator.getColour());
        System.out.println(classCalculator.getTypeOfCalculator());
        System.out.println(classCalculator.getDisplayQuantity());
        System.out.println(classCalculator.getBrandName());
    }
    @Test
    public void workingWithFlower() {
        Flower classFlower = new Flower();

        classFlower.setColour("Green");
        classFlower.setHeigthM(1.00f);
        classFlower.setNameOfFlower("Akacija");
        classFlower.setStrunkNumber(2);
        classFlower.setWaterNeeded(true);

        System.out.println(classFlower.getColour());
        System.out.println(classFlower.getHeigthM());
        System.out.println(classFlower.getNameOfFlower());
        System.out.println(classFlower.getStrunkNumber());
        System.out.println(classFlower.isWaterNeeded());
    }

    @Test
    public void workingWithMyCar() {
        MyCar classMyCar = new MyCar();

        classMyCar.setTypeOfCar("Compact Wan");
        classMyCar.setTypeOfEnngine("Diesel");
        classMyCar.setColour("Grey");
        classMyCar.setModel("Touran");
        classMyCar.setSeatQuantity(5);

        System.out.println(classMyCar.getTypeOfCar());
        System.out.println(classMyCar.getTypeOfEnngine());
        System.out.println(classMyCar.getColour());
        System.out.println(classMyCar.getModel());
        System.out.println(classMyCar.getSeatQuantity());
    }

    @Test
    public void workingWithMyFishingRod() {
        MyFishingRod classMyFishingRod = new MyFishingRod();

        classMyFishingRod.setTypeOfRod("Spinning");
        classMyFishingRod.setSpecialFor("Predator fish");
        classMyFishingRod.setPartNumber(4);
        classMyFishingRod.setAction("Fast");
        classMyFishingRod.setMaxGrammsLoading(25);

        System.out.println(classMyFishingRod.getTypeOfRod());
        System.out.println(classMyFishingRod.getSpecialFor());
        System.out.println(classMyFishingRod.getPartNumber());
        System.out.println(classMyFishingRod.getAction());
        System.out.println(classMyFishingRod.getMaxGrammsLoading());
    }


    @Test
    public void workingWithMyFlat() {
        MyFlat classMyFlat = new MyFlat();

        classMyFlat.setAddress("Stirnu iela, Riga");
        classMyFlat.setRoomNumber(3);
        classMyFlat.setFloorNumber(1);
        classMyFlat.setConvenience(true);
        classMyFlat.setHouseFloor(5);

        System.out.println(classMyFlat.getAddress());
        System.out.println(classMyFlat.getRoomNumber());
        System.out.println(classMyFlat.getFloorNumber());
        System.out.println(classMyFlat.isConvenience());
        System.out.println(classMyFlat.getHouseFloor());
    }

    @Test
    public void workingWithMyPC() {
        MyPC classMyPC = new MyPC();

        classMyPC.setModelOfPc("Asus");
        classMyPC.setColourOfPc("Black");
        classMyPC.setOperationalSystem("Windows");
        classMyPC.setRam(2.00f);
        classMyPC.setScreenResolution(513.00f);

        System.out.println(classMyPC.getModelOfPc());
        System.out.println(classMyPC.getColourOfPc());
        System.out.println(classMyPC.getOperationalSystem());
        System.out.println(classMyPC.getRam());
        System.out.println(classMyPC.getScreenResolution());
    }


    @Test
    public void workingWithMyPhone() {
        MyPhone classMyphone = new MyPhone();

        classMyphone.setModel("Samsung");
        classMyphone.setOperationalSystem("Android");
        classMyphone.setRam(512.00f);
        classMyphone.setMemoryGb(20);
        classMyphone.setScreenSize(25);

        System.out.println(classMyphone.getModel());
        System.out.println(classMyphone.getOperationalSystem());
        System.out.println(classMyphone.getRam());
        System.out.println(classMyphone.getMemoryGb());
        System.out.println(classMyphone.getScreenSize());

    }

    @Test
    public void workingWithTable (){
        Table classTable = new Table();
        classTable.setTypeOfTable("Computer table");
        classTable.setColour("White");
        classTable.setHeight(1.54f);
        classTable.setWidth(1.46f);
        classTable.setLength(1.00f);

        System.out.println(classTable.getTypeOfTable());
        System.out.println(classTable.getColour());
        System.out.println(classTable.getHeight());
        System.out.println(classTable.getWidth());
        System.out.println(classTable.getLength());
    }

    @Test
    public void workingWithTableLamp (){
        Tablelamp classTableLamp = new Tablelamp();
        classTableLamp.setBrand("Paradox");
        classTableLamp.setColour("black");
        classTableLamp.setContrastColour(3);
        classTableLamp.setHeightInM(0.56f);
        classTableLamp.setRemovable(true);

        System.out.println(classTableLamp.getBrand());
        System.out.println(classTableLamp.getColour());
        System.out.println(classTableLamp.getContrastColour());
        System.out.println(classTableLamp.getHeightInM());
        System.out.println(classTableLamp.isRemovable());
    }
}

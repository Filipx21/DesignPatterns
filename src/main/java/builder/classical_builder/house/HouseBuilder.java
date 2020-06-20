package builder.classical_builder.house;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();
    House getHouse();

}

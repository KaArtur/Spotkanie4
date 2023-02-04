package Interface;

public class DataPresenter {
    void showData(DataProvider dataProvider){
        System.out.println("Prezentacja danych" + dataProvider.getData());
    }
}

package Interface;

public class DataProvideApp {
    public static void main(String[] args) {

        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider(); // podmieniamy data provider
        dataPresenter.showData(dataProvider);

    }
}

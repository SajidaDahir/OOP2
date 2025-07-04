package Challenge6;

import Challenge6.DataSource;


public abstract class Account {
    protected int id;
    protected String name;
    private DataSource myData;


    public void performanceOperation(DataSource _myData){
        myData = _myData;
        myData.execute();
    }
}

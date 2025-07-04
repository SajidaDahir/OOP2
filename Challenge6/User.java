package Challenge6;

public class User extends Account{
    public User(int _id, String _name){
        id= _id;
        name= _name;
    }

    @Override
    public void performanceOperation(DataSource _myData) {
        super.performanceOperation(_myData);
    }
}

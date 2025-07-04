package Challenge6;

import Challenge6.DataSource;

public class Admin extends Account{
    private String AuthPassword;

    public Admin(int _id, String _name, String _password){
        id= _id;
        name= _name;
        AuthPassword= _password;
    }

    @Override
    public void performanceOperation(DataSource _myData) {
        super.performanceOperation(_myData);
    }
}



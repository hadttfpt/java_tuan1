package assignment6;

import constructor.Constructor;

public class UserDao implements UserInterFace{
    private static UserDao instance;
    private UserDao(){}
    public static UserDao getInstance(){
        if(instance == null){
            instance = new UserDao();
        }return  instance;
    }
    public boolean create(User u) {
        Constructor cn = Constructor.getInstance();
        String sql = "Insert into user (username,email,password) values('"+u.getUsername()
                +"','"+u.getEmail()+"','"+u.getPassword()+"')";
        try{
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }
}

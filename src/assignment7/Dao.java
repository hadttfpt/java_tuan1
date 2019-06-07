package assignment7;

import constructor.Constructor;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao implements PhoneInterface {

    private static Dao instance;
    private Dao(){}
    public static Dao getInstance(){
        if(instance == null){
            instance = new Dao();
        }return  instance;
    }
    @Override
    public boolean create(Phone p) {
        Constructor cn = Constructor.getInstance();
        String sql = "Insert into phone (id,user_id,telephone,status) values('"+p.getId()
                +"','"+p.getUser_id()+"','"+p.getTelephone()+"','"+p.getStatus()+"')";
        try{
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }

    @Override
    public boolean update(Phone p) {
        String sql = "update phone set user_id = '"+p.getUser_id()+"' ,telephone= '"+p.getTelephone()
                +"',status= '"+p.getStatus()+"' where id = "+p.getId() ;
        Constructor cn = Constructor.getInstance();
        try{
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }

    @Override
    public boolean delete(Phone p) {
        String sql ="Delete from phone where id = "+p.getId();
        Constructor cn = Constructor.getInstance();
        try{
            if(cn.updateQuery(sql)>0){
                return true;
            }
        }catch (Exception e){

        }
        return false;
    }

    public ArrayList<Phone> getphone(Integer id){
        String sql = "Select * from phone where id = "+id;
        Constructor cn = Constructor.getInstance();
        ArrayList<Phone> list= new ArrayList<>();
        try{
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                list.add(new Phone( rs.getInt("id"),rs.getInt("user_id"),
                        rs.getInt("telephone"),rs.getString("status")));
            }
        }catch (Exception e){

        }return list;
    }
}

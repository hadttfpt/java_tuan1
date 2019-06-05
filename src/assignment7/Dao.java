package assignment7;

import constructor.Constructor;
import java.sql.ResultSet;

public class Dao implements phoneInterface {
    @Override
    public boolean create(phone p) {
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
    public boolean update(phone p) {
        String sql = "update phone set id = "+p.getId();
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
    public boolean delete(phone p) {
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

    public phone getUser(Integer id){
        String sql = "Select * from phone where id = "+id;
        Constructor cn = Constructor.getInstance();
        try{
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()){
                return new phone(rs.getInt("id"),rs.getInt("user_id"),
                        rs.getInt("telephone"),rs.getString("status"));
            }
        }catch (Exception e){

        }return null;
    }

//    public void search(int id){
//        String sql = "Select * from phone where id = "+id;
//        Constructor cn = Constructor.getInstance();
//        try{
//            ResultSet rs = cn.getQuery(sql);
//            if(cn.updateQuery(sql)>0){
//               while (rs.next()){
//                   System.out.println("ID "+rs.getInt("id"));
//                   System.out.println("User_id "+rs.getInt("user_id"));
//                   System.out.println("User "+rs.getString("user"));
//                   System.out.println("Telephone "+rs.getInt("telephone"));
//                   System.out.println("Status "+rs.getString("status"));
//               }
//            }
//        }catch(Exception e){
//
//        }
//    }
}

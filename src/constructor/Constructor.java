package constructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Constructor {
    private static final String Driver = "com.mysql.jdbc.Driver";
    private static final String DB_Url ="jdbc:mysql://localhost:3306/phone";
    private static final String DB_User = "root";

    public Connection conn;
    //b2:tao private static
    private static Constructor instance;

    //Design b1:Khoa Constructor lai.
    private Constructor(){
        try{
            Class.forName(Driver);
            this.conn = DriverManager.getConnection(DB_Url,DB_User,"");
        }catch(Exception e){

        }
    }

    //b3:Tao phuong thuc tra ve doi tuong cua lop neu chua co ms tao con co roi se tra cai cu ve
    public static Constructor getInstance(){
        if(instance == null){
            instance = new Constructor();
        }return instance;
    }
    public ResultSet getQuery(String sql) throws Exception{
        Statement st = conn.createStatement();
        return st.executeQuery(sql);
    }
    public int updateQuery(String sql)throws Exception{
        Statement st = conn.createStatement();
        return st.executeUpdate(sql);
    }
}

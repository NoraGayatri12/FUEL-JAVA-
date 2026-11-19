
//singleton design pattern
class DBConnection{
    private static DBConnection obj;
    DBConnection(){
       System.out.println("Database create successfully...");
    }
    public static DBConnection getInstance(){
         if (obj == null)
        obj=new DBConnection();
        return obj;
        
    }
}

public class SingleternDesign {
    public static void main(String arg[]){
        DBConnection db1=DBConnection.getInstance();
        DBConnection db2=DBConnection.getInstance();
        DBConnection db3=DBConnection.getInstance();
    }
}
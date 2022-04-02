package Test;

public class Test {
    public static void printString(){
        System.out.println("a");
        System.out.println("b");
        System.out.println("c");
    }
    public static void main(String[] args){
        System.out.println("1");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(Exception e){
            System.out.println("error");
        }
    }
}

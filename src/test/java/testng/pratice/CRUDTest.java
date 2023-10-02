package testng.pratice;

import org.testng.annotations.Test;

public class CRUDTest {
    //add
    //retrive/read
    //update
    //delete

    public String inputAddUser(){
        String a="123";
        return a;
    }

    @Test
    public String addUser(){
        String a= inputAddUser();
        int b =9/0;
        return a;
    }
    @Test
    public void readUser(){
        String read = inputAddUser();
    }
    @Test
    public void updateUser(){
        String update = inputAddUser();
    }
    @Test
    public void deleteUser(){
        String delete = inputAddUser();
    }

//    //if we do like this all the below test is depends on add user test
//    // so add user fails all other methods will fail
//    @Test
//    public String addUser(){
//        String a="123";
//        int b =9/0;
//        return a;
//    }
//    @Test
//    public void readUser(){
//        String read = addUser();
//    }
//    @Test
//    public void updateUser(){
//        String update = addUser();
//    }
//    @Test
//    public void deleteUser(){
//        String delete = addUser();
//    }
}

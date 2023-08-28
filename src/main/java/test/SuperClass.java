/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author akash arora
 */
public class SuperClass implements InterFaceTest{
    int i = 10;
    private void testPrivate(){
        System.out.println("Private Super");
        try{
            System.out.println("Private Super");
        }catch(Exception w){}
    }
    public void testPublic(){
        System.out.println("Public Super");
    }
    
    void test(){
        System.out.println("Super");
    }
    
    public static void staticPublic(){
        System.out.println("Public static Super");
    }

    @Override
    public String testInterface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package Sanity;

import org.testng.annotations.Test;

public class Sanity {

    @Test(groups = {"Sanity"})
    public void s1(){
        System.out.println("Sanity test");
    }
}

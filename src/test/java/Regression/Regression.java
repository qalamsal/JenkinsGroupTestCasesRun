package Regression;

import org.testng.annotations.Test;

public class Regression {

    @Test(groups = {"Regression"})
    public void r1(){
        System.out.println("Regression1");
    }

    @Test(groups = {"Regression"})
    public void r2(){
        System.out.println("Regression2");
    }
}

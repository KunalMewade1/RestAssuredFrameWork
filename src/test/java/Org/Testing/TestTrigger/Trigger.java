package Org.Testing.TestTrigger;
import java.io.IOException;

import org.testng.annotations.Test;

import Org.Testing.Testcases.TC1;
import Org.Testing.Testcases.TC2;
import Org.Testing.Testcases.TC3;
import Org.Testing.Testcases.TC4;
public class Trigger {
      
	  @Test(priority = 1)
	  public void second() throws IOException{

        System.out.println("Called the test case-2 post() request");
        TC2 Tc2Obj = new TC2();
        Tc2Obj.testcase2();
        System.out.println("==========================end of the test case ()2======================");
        System.out.println("/n");
        }
	  @Test(priority = 2)
	  public void first() throws IOException{
        System.out.println("Called the test case-1 get() request");
        TC1 Tc1Obj = new TC1();
        Tc1Obj.testcase1();
        System.out.println("==========================end of the test case ()1======================");
        System.out.println("/n");
	  }
	  @Test(priority = 3)
	  public void fourth() throws IOException{
        System.out.println("Called the test case-4 put () request");
        TC4 Tc4Obj = new TC4();
        Tc4Obj.testcase4();
        System.out.println("==========================end of the test case 4 put() request ======================");
        System.out.println("/n");
	  }
        @Test(priority = 4)
        public void third() throws IOException{
        System.out.println(" called theTest case-3 delete() request");
        TC3 Tc3Obj = new TC3();
        Tc3Obj.testcase3();
        System.out.println("==========================end of the test case 3 delete() request ======================");
        System.out.println("/n");
    }
}
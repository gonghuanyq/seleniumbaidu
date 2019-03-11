package day01;

import org.testng.annotations.Test;

public class asdfg {

    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(5000);
    }
    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        while (true){
            // do nothing
        }
    }
}

package app;

import org.apache.commons.lang3.RandomStringUtils;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;


public class Passbreaker {
    public void passbreaker(String password){
        String pass = null;
        boolean flag = true;
        BigInteger counter = BigInteger.ZERO;
        long start = System.nanoTime();

        while (flag){
            pass = RandomStringUtils.randomAlphabetic(password.length());
            counter = counter.add(BigInteger.ONE);
            if (pass.equalsIgnoreCase(password)){
                break;
            }
            System.out.println(pass + " | " +counter);

          //  try {
            //    Thread.sleep(200);
           // }catch (InterruptedException e){
             //   e.printStackTrace();
           // }
        }

        long stop = System.nanoTime();
        double elapsedTime = (double) (stop - start) /1_000_000_000;
        double convert = TimeUnit.MILLISECONDS.convert((stop - start), TimeUnit.NANOSECONDS);
        System.out.println("Broken "+ counter+ " | "+pass + " at time " + elapsedTime);
    }


}

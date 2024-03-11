import com.nt.service.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.api.Assertions.*;

public class TestAddition
{
    @Test
   public void testwithPositiveNumber()
   {
       Addition ad=new Addition();
       int expected=20;
       int actual=ad.add(10,10);
     Assertions.assertEquals(expected,actual);

   }
}

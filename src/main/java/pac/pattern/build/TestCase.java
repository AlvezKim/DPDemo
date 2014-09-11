package pac.pattern.build;

import org.junit.Test;

public class TestCase {

    @Test
    public void testBuilder(){
        ComplicatedDataHolder holder = new ComplicatedDataHolder.Builder().name("Alvez K.").life("Till").build();
        System.out.println(holder.getName());
    }
}

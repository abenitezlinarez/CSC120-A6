import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

    @Test
    public void TestBuy(){
        try{
        Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
        ResaleShop my_shop = new ResaleShop();
        my_shop.buy(computer1); //bug it should print computer1 but it prints newComputer defined in the method
        assertEquals("The computer wasn't added!", computer1, my_shop.inventory); 
    } catch (Exception e){
        System.out.println("Exception caught buy!");
    }
}
    @Test
    public void TestRefurbish(){ //computer that does not exist in lsit triggers exception
        try{
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            ResaleShop my_shop = new ResaleShop();
            my_shop.refurbish(computer1, "None");
        }catch(Exception e){
            System.out.println("Exception caught refurbish!");
        }
    }

    @Test(expected = RuntimeException.class) //computer that is in class
    public void TestRefurbishException(){
        try{
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            ResaleShop my_shop = new ResaleShop();
            my_shop.refurbish(computer1, "None");
            //throw new Exception("blargh");
        }catch(Exception e){
            System.out.println("Exception caught refurbish 2!");
        }
    }
    @Test
        public void TestPrintInventory2(){
             try{
                Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
                ResaleShop my_shop = new ResaleShop();
                my_shop.buy(computer1);
                my_shop.printInventory();
            }catch(Exception e){
                System.out.println("Exception caught print inventory 2!");
        }
    
    }
    @Test
        public void TestSetOS(){ //runtime error?
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            computer1.setOS("newOs");
            assertEquals(computer1.getOS(),  "newOS");
    }

    @Test
        public void TestPrintInventory(){
            try{
            ResaleShop my_shop = new ResaleShop();
            my_shop.printInventory();
            }catch(Exception e){
                System.out.println("Exception caught print1");
                fail();
            }
    }

    @Test(expected = RuntimeException.class)
    public void TestSellException(){
        try{
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            ResaleShop my_shop = new ResaleShop();
            my_shop.sell(computer1);
        }catch(Exception e){
            System.out.println("Exception caught sell!");
        }
    }
    @Test
    public void TestComputerMemory(){
        
    }

    
}
    //test constructor for computer price and memory
    //resale shop constrcutor


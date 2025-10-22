import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

/**
 * Tests error for buy() which only adds the computer that is created in the buy method
 */
    @Test
        public void testBuy(){
            try{
                Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
                ResaleShop my_shop = new ResaleShop();
                my_shop.buy(computer1); //bug it should print computer1 but it prints newComputer defined in the method
                assertEquals("The computer wasn't added!", computer1, my_shop.inventory); 
            }catch (Exception e){
                System.out.println("Exception caught buy!");
            }
        }
/**
 * Tests exception in refurbish, thrown when it shouldn't be
 */
    @Test
        public void testRefurbish(){ //computer that does not exist in lsit triggers exception
            try{
                Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
                ResaleShop my_shop = new ResaleShop();
                my_shop.refurbish(computer1, "None");
            }catch(Exception e){
                System.out.println("Exception caught refurbish!");
                fail();
            }
        }
/**
 * Tests how exception in sell is not thrown when a computer is not first bought
 */
    @Test
        public void testSellException(){
            try{
                Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
                ResaleShop my_shop = new ResaleShop();
                my_shop.sell(computer1);
                fail();
            }catch(Exception e){
                System.out.println("Exception caught sell!");
            }
        }

/**
* Tests setOs and how it should update Os to newOs 
*/
    @Test
        public void testSetOS(){ 
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            computer1.setOS("newOs");
            assertEquals(computer1.getOS(),  "newOs");
        }

/**
 * Tests exception in print inventory
 */
    @Test
        public void testPrintInventoryException(){
            try{
                ResaleShop my_shop = new ResaleShop();
                my_shop.printInventory();
                }catch(Exception e){
                    System.out.println("Exception caught print1");
                    fail();
                }
        }

/**
 * Tests how print inventory throws an exception 
 */
    @Test
        public void testPrintInventory2(){
             try{
                Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
                ResaleShop my_shop = new ResaleShop();
                my_shop.buy(computer1);
                my_shop.printInventory();
                System.out.println("Exception not caught TP2");
            }catch(Exception e){
                System.out.println("Exception caught print inventory 2!");
                fail();
        }
    
    }

/**
 * Tests how resale shop already has a computer made
 */
    @Test
        public void testResaleShop(){
            try{
                ResaleShop my_shop = new ResaleShop();
                my_shop.printInventory();
            }catch(Exception e){
                System.out.println(e.getLocalizedMessage());
                fail();
            }
        }
/**
 * Tests computer constructor for memory attribute
 */
    @Test
        public void testComputerConstructorMemory(){
            Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
            assertEquals(computer1.memory, 64);
        }
/**
 * Tests computer constructor for price attribute
 */
    @Test
    public void testComputerPrice(){
        Computer computer1 = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 1995, 1500);
        assertEquals(computer1.price, 1500);
    }

/**
 * Tests refurbish and the price of instances of computers affected by it
 */
    @Test
    public void testRefurbishPrice(){
        try{
        Computer oldComp = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 2010, 1500);
        Computer newComp = new Computer("Mac Pro (Late 2013)", "3.5 GHc 6-Core Intel Xeon E5", 1024, 64,"macOS Big Sur", 2024, 1500);
        ResaleShop my_shop = new ResaleShop();
        my_shop.inventory.add(oldComp);
        my_shop.inventory.add(newComp);
        my_shop.refurbish(oldComp, "hai");
        my_shop.refurbish(newComp, "peekaboo");
        assertTrue(oldComp.price < newComp.price);
        }catch(Exception e){
            System.out.println("Exception TestRefurbishPrice");
        }
    }
}

    


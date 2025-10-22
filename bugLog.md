## Bug 1
Brief description: Buy only adds the computer that is created in the buy method
Failed unit test: testBuy()
 
## Bug 2
Brief description: The exception in refurbish is triggered even if computer was previously added
Failed unit test: testRefurbish()

## Bug 3
Brief description: When a computer is not first bought before selling it does not throw an exception 
Failed unit test: testSellException()

## Bug 4
Brief description: SetOS should change the OS to the new OS but it just sets it to none
Failed unit test: testSetOS()

## Bug 5
Brief description: If no computer is added it should print "inventory is empty" but it doesn't, it throws an exception, index out of bounds
Failed unit test: testPrintInventoryException()

## Bug 6
Brief description: PrintInventory throws an unwanted exception and does not print new computer
Failed unit test: testPrintInventory2()

## Bug 7
Brief description: New instance of ResaleShop has an already made computer
Failed unit test: testResaleShop()

## Bug 8
Brief description: The computer constructor automatically sets the memory to 64 
Failed unit test: testComputerConstructorMemory()

## Bug 9
Brief description: The computer constructor automatically sets the price to 1500
Failed unit test: testComputerPrice()

## Bug 10
Brief description:  Refurbish resets the price of younger computers as less than older computers
Failed unit test: testRefurbishPrice()
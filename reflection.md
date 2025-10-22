Use this file to record your reflection on this assignment.

What are your initial impressions of how `Unit Testing` affects your programming?
What worked, what didn't, what advice would you give someone taking this course in the future?

Initial Impressions:

I strongly dislike unit tests and want to just use print methods but I understand the usefullness of them, they're just a pain to work with and probably not worth it for small bugs. 

What worked, what didn't, what advice would you give someone taking this course in the future?:

What worked was going throught the code on my own and finding logical errors in the code to fix with unit tests.

Bugs breakdown:
1. testBuy() tests how the buy method only adds a computer that is already made in the buy method
2. testRefurbish() tests how the exception in refurbish is triggered even if a computer was previously added
3. testSellException() tests how when a computer is not first bougght before selling it does not throw an exception like it should
4. testSetOS() tests how setOS should update the OS to newOs but instead it just sets it to none
5. testPrintInventoryException() tests how the an exception is thrown when no computer is added but it should print "inventory is empty"
6. testPrintInventory2() tests how print inventory throws an exception and is not equal to the computer just made
7. testResaleShop() resale shop has an already made computer in a new instance
8. testComputerConstructorMemory() the computer constructor automatically sets the memory to 64 
9.  testComputerPrice() the computer constructor automatically sets the price to 1500
10. testRefurbishPrice() refurbish resets the price of younger computers as less than older computers
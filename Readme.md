What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.

I predicted
 7 5.0 -126
Two

Actual
7 5.0 -126
Two
Three


I didnt realise that Break statement is not there. As Break statment is not there 
it printed everything  till it found end braces

What is the difference between the static variable totalProducts and the instance variable name?
static variable are class level variables, available for all the objects any updates made by one object will be reflected when other objects access it, its like global access. instance variables are object level variables, these variables get initialized each time the new objects are created, its scope is limited to object

Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?
we write (int) whenever we are force fully casting the data types especially from bigger data types to smaller one the decimal part will be removed and rounded off to nearest value.
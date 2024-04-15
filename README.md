<h3>Overview</h3>
Simulates a scenario in which a single server handles n jobs/customers in a round-robin fashion. Job/customer arrival times, in addition to service times, are exponentially distributed.
By default, mu = 1/20, lambda = 1/15, the quantum is 10, and the amount of customers is 100, however these variables can be easily changed at the top of the main.kt file.

In the future, a version simulating multiple servers may be uploaded, if people want it.

To compile and run... <br>

<h3>First step:</h3>
Get access to the Kotlin compiler. This can easily done by installing the IntelliJ IDE, or you can get the compiler directly. <br>
On Debian based package managers, one can use the command: sudo apt install kotlin <br>
MacOS systems with Homebrew can use the command: brew install kotlin <br>

<h3>Second step:</h3>
Once you have installed IntelliJ or downloaded the compiler through your terminal: <br>
IntelliJ users can import the files into their project and hit the green run button. This will build the project and run it automatically. <br>
Those using the terminal can navigate to the directory then use: kotlinc main.kt classes.kt <br>

<h3>Third step (for terminal users):</h3>
Run the following in the terminal: kotlin MainKt <br>



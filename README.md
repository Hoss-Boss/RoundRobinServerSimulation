Simulates a scenario in which a single server handles n jobs/customers in a round-robin fashion. Job/customer arrival times, in addition to service times, are exponentially distributed.
By default, mu = 1/20, lambda = 1/15, the quantum is 10, and the amount of customers is 100, however these variables can be easily changed at the top of the main.kt file.

To compile and run...

First step:
Get access to the Kotlin compiler. This can easily done by installing the IntelliJ IDE, or you can get the compiler directly.
On Debian based package managers, one can use the command: sudo apt install kotlin
MacOS systems with Homebrew can use the command: brew install kotlin

Second step:
Once you have installed IntelliJ or downloaded the compiler through your terminal:
IntelliJ users can import the files into their project and hit the green run button. This will build the project and run it automatically.
Those using the terminal can navigate to the directory then use: kotlinc main.kt classes.kt

Third step (for terminal users):
kotlin MainKt

In the future, a version simulating multiple servers may be uploaded, if people want it.

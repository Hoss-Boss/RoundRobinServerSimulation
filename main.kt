fun main() {

val lambda = 1.0/15.0  //Save the precise value of lambda
var currentTime = 0.0
val mu = 1.0/20.0
val quantum = 10.0
val numberOfCustomers = 100

var customersList = ArrayList<customer>()
//val nobody_customer = customer (-1, -1, -1)
var server1 = server(null)
var server2 = server(null) //This version of the code will only use 1 server for simplicity. An updated version may simulate multiple servers


var temp_current_time = 0.0
//Generate arrival and service times for n customers
for (i in 0..numberOfCustomers-1) {

var exponentialValueArrival = generateExponential(lambda)
temp_current_time = exponentialValueArrival + temp_current_time
var customerToAdd = customer(i, temp_current_time, generateExponential(mu))
customersList.add(customerToAdd)
}//for

/* 

for (i in 0..customersList.size-1) {
println()
println("Generating Customer $i with ArrivalTime: " + customersList[i].arrivalTime + " and ServiceTimeRemaining: " + customersList[i].serviceTimeRemaining)
println("Customer ID is " + customersList[i].custNum)
}

*/
//println()
println("STARTING SIMULATION")

//Continue the loop until everyone is finished being served
while (!customersList.isEmpty()) {

customersList.sortBy {it.arrivalTime} 

//A reference to the customer who's next in line to get served.
val currentCustomer = customersList[0]

if (currentTime < currentCustomer.arrivalTime) {
    currentTime = currentCustomer.arrivalTime
}
//println("Time: $currentTime")
//println("Server 1 is serving: ${server1.currentlyServing.custNum ?: "nobody"}")
//println("Server 2 is serving: ${server2.currentlyServing.custNum ?: "nobody"}")


server1.currentlyServing = currentCustomer
customersList.removeFirst()
println("Customer " + currentCustomer.custNum + " is receiving service from server1 at time = $currentTime" + " (service time remaining: " + currentCustomer.serviceTimeRemaining)
//println("Server 2 is serving: ${server2.currentlyServing.custNum ?: "nobody"}")



if (currentCustomer.serviceTimeRemaining - quantum <= 0.0) {

//Just keeping track of how much service time was needed for the print statement
val how_much_time_was_needed = currentCustomer.serviceTimeRemaining
//var quantum_diff = quantum - currentCustomer.serviceTimeRemaining
currentTime += currentCustomer.serviceTimeRemaining
currentCustomer.serviceTimeRemaining = 0.0
println("Customer " + currentCustomer.custNum + " is done receiving service after receiving $how_much_time_was_needed units of service time. Time = $currentTime")



}
else {

currentCustomer.serviceTimeRemaining -= quantum
currentTime += quantum
println("Customer " + currentCustomer.custNum + " has received " + quantum + " time units of service and will be re-queued. Service time remaining: " + currentCustomer.serviceTimeRemaining + ")")
currentCustomer.arrivalTime = currentTime
customersList.add(currentCustomer)


}






}//while loop containing the main logic


}//Main
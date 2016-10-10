String str = ""
int max = 0
int input = 0
boolean stop = false
println "Please enter a string of positive integers and -1 to stop"
while (!stop){
	str = System.console().readLine()
	input = Integer.parseInt(str)
	if (input == -1){
		stop = true
	} else {
		if (input > max) {
			max = input
		}
	}
}
print "The maximum number is " + max
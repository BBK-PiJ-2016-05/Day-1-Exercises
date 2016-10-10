String str = ""
int max = 0
int input = 0
int lastNumber = 0
boolean stop = false
boolean goingup = true
println "Please enter a string of positive integers and -1 to stop"
str = System.console().readLine()
input = Integer.parseInt(str)
if (input == -1){
	stop = true
}
while (!stop){
	lastNumber = input
	str = System.console().readLine()
	input = Integer.parseInt(str)
	if (input == -1){
		stop = true
	} else {
		if (input != lastNumber + 1) {
			goingup = false
		}
	}
}
if (goingup) {
	print "Yes"
} else {
	print "No"
}
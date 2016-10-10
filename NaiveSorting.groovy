//Take user inputs
println "please enter your first number: "
String str = System.console().readLine()
int firstInput = Integer.parseInt(str)
println "please enter your second number: "
str = System.console().readLine()
int secondInput = Integer.parseInt(str)
println "please enter your third number: "
str = System.console().readLine()
int thirdInput = Integer.parseInt(str)

//calculate order and print
if (firstInput < secondInput){
	if (secondInput < thirdInput){
		println firstInput + " " + secondInput + " " + thirdInput
	} else if (firstInput < thirdInput){
		println firstInput + " " + thirdInput + " " + secondInput
	} else {
		println thirdInput + " " + firstInput + " " + secondInput
	}
} else {
	if (firstInput < thirdInput){
		println secondInput + " " + firstInput + " " + thirdInput
	} else if (secondInput < thirdInput){
		println secondInput + " " + thirdInput + " " + firstInput
	} else {
		println thirdInput + " " + secondInput + " " + firstInput
	}
}

		
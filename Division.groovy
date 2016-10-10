println "please enter your first number: "
String str = System.console().readLine()
int firstNumber = Integer.parseInt(str)
println "please enter your second number: "
str = System.console().readLine()
int secondNumber = Integer.parseInt(str)
int remainder = firstNumber % secondNumber
int division = (firstNumber - remainder) / secondNumber
println firstNumber + " divided by " + secondNumber + " is " + division + ", remainder " + remainder
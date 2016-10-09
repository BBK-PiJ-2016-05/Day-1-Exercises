//Write a program that asks a number from the user, then says whet her the number is prime or not.
//Remember that a prime number is a number that is divisible only by 1 and itself.
//You can use the modulo operator (if a % b is zero, then a is divisible by b).

print "Please input a number? "
String str = System.console().readLine()
int inputNumber = Integer.parseInt(str)
boolean prime = true
int count = 2
while (count < inputNumber && prime) {
	if (inputNumber % count == 0) {
		prime = false
	}
count = count + 1
}
if (prime) {
	println inputNumber + " is prime"
} else {
	println inputNumber + " is not prime"
}



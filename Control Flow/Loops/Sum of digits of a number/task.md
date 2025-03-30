#
### Find the sum of digits of a number using a `while` loop.

Write a Java program that calculates the sum of the digits of a given integer using a while loop. The program should repeatedly extract the last digit of the number, add it to a cumulative sum, and remove the last digit until the number becomes zero.

**Expected Output:**

```text
Sum of digits: 6
```

**Hint:**

```jshelllanguage
int number = 123, sum = 0;
while (number > 0) {
    sum += number % 10;
    number /= 10;
}
System.out.println("Sum of digits: " + sum);
```
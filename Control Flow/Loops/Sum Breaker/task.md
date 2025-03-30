#
### Use `break` to exit a loop when the sum exceeds 50.

Write a Java program that calculates the sum of natural numbers starting from 1. The loop should continue adding numbers until the sum exceeds 50, at which point it should break and print the total sum.

**Expected Output:**

```text
Sum: 55
```

**Hint:**
```jshelllanguage
int sum = 0, i = 1;
while (true) {
    sum += i;
    if (sum > 50) break;
    i++;
}
System.out.println("Sum: " + sum);
```
##

### 1. Must begin with a letter, $, or _

✅ `name`, `_count`, `$amount`  

❌ `5star` (cannot start with a digit)

### 2. Can contain letters, digits, $, and _
✅ `age25`, `total_amount`, `$salary`  

❌ `total-amount` (hyper not allowed)

### 3. Cannot use java keywords
❌ `int`, `class`, `public` (reserved keywords)

### 4. Case-sensitive
`age` and `Age` are two different variables

### 5. No spaces allowed
❌ first name (use firstName instead)

### 6. Should be meaningful (best practice)
✅ userAge, totalPrice  

❌ a, x1 (not descriptive)

### 7. lowerCamelCase for readability (best practice)
   * variables: firstName, accountBalance
   * constants: final int MAX_USERS = 100; (all caps with underscore)
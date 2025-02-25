# TDD1
starter EXs for TDD

# TDD Exercises in Java

Here are 6 Test-Driven Development exercises for Java, split into two categories as requested:

## Exercises 1-3: Tests Provided, Implement the Code

These exercises include complete test cases. Students need to implement the classes to make all tests pass:

1. **StringUtils Exercise**
   - Implement a utility class with methods to:
     - Reverse a string
     - Count character occurrences
     - Check if a string is a palindrome (ignoring case and non-alphanumeric characters)

2. **BankAccount Exercise**
   - Implement a bank account class that can:
     - Store account number and owner name
     - Handle deposits and withdrawals
     - Maintain a balance
     - Validate inputs (no negative deposits/withdrawals)
     - Prevent overdrafts

3. **Calculator Exercise**
   - Implement a calculator with methods for:
     - Addition
     - Subtraction
     - Multiplication
     - Division (with division by zero protection)
     - Power calculation

## Exercises 4-6: Code Provided, Write the Tests

These exercises include fully implemented classes. Students need to write comprehensive test cases:

4. **ShoppingCart Exercise**
   - Test a shopping cart implementation that:
     - Manages items (add, remove, count)
     - Calculates subtotal, tax, and final total
     - Validates input (price, quantity)

5. **PasswordValidator Exercise**
   - Test a password validator that checks:
     - Length requirements (8-20 characters)
     - Character type requirements (uppercase, lowercase, digit, special character)
     - Null/empty handling

6. **EmailService Exercise**
   - Test an email service with:
     - Welcome email functionality
     - Password reset email functionality
     - Email validation
     - Dependency on an EmailSender (requires mocking)

Each exercise is designed to reinforce TDD principles and provide practice with both implementation and test writing. The code includes detailed comments explaining what's expected in each exercise.

```java
/**
 * TDD EXERCISES: 6 EXERCISES FOR PRACTICING TEST-DRIVEN DEVELOPMENT IN JAVA
 * 
 * This file contains 6 exercises designed for students learning Test-Driven Development:
 * - Exercises 1-3: The tests are provided, and students must implement the code to make them pass
 * - Exercises 4-6: The code is provided, and students must write appropriate tests
 * 
 * All exercises use JUnit 5 (Jupiter) for testing.
 */
```
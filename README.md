# Simple Java Calculator

This is a basic command-line calculator written in Java that performs simple arithmetic operations: addition, subtraction, multiplication, and division.

## Features

- Accepts two numbers from the user
- Offers four basic arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Handles division by zero gracefully
- Simple and easy-to-use text-based interface

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system

### Compilation

To compile the program, navigate to the directory containing the `Calculator.java` file and run:

```bash
javac Calculator.java
```

### Running the Program

After compilation, you can run the program with:

```bash
java Calculator
```

### Example Usage

```plaintext
Enter first number
> 10
Enter the Second number
> 5
Choose an Operation
1. Addition
2. Subtraction
3. Multiplication
4. Division
> 3
Result: 50.0
```

## Code Overview

The program uses a `Scanner` to read user input from the console. Based on the user's menu selection, it performs the corresponding arithmetic operation and displays the result.

## Error Handling

- If the user selects an invalid operation (not 1–4), the program prints **"Invalid Input"**.
- If the user attempts to divide by zero, it prints **"Error: Division by 0 is not allowed"**.

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).

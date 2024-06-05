# **About this project**

A simple program that generates a random password made up of letters (uppercase and lowercase), numbers and symbols using SecureRandom.

## **Libraries**

```java
import java.security.SecureRandom;
```

## **Project Structure and How It Works**

This project has only one class:

### **Password**

Firstly, this class generates a random number, 12 times, between 1 and 4, being:

- **1**: a lowercase character is randoly chosen;
- **2**: an uppercase character is randomly chosen;
- **3**: a digit character is randomly chosen;
- **4**: a symbol character (*#*, *$*, *%* or *&*) is randomly chosen.

Then, these options generate a random character based on its range in the ASCII table.

```java

case 1: // Lowercase
  character = (char) (97 + randomNum.nextInt(26));
  break;

case 2: // Uppercase
  character = (char) (65 + randomNum.nextInt(26));
  break;

case 3: // Numbers
  character = (char) (48 + randomNum.nextInt(10));
  break;

case 4: // Symbols
  character = (char) (35 + randomNum.nextInt(4));
```

## **Functions**

- **generatePassword()**: this function is responsible for generating a password and returning it as a *String*.

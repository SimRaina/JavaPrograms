# JavaPrograms

A collection of small Java programs for practicing core programming concepts, data structures, algorithms, and common interview questions.

## Topics

- **Array**: array splitting, merging, maximum pair sum, and finding largest values
- **Concepts**: type conversion, inheritance, method dispatch, `super`, and singleton patterns
- **Interview questions**: anagrams, duplicate values, vowels, missing numbers, reversing strings and arrays, and substring searches
- **Numbers**: Armstrong numbers, binary and decimal conversion, factorials, Fibonacci numbers, HCF, LCM, palindromes, primes, and swapping values
- **Patterns**: console output patterns using stars and numbers
- **Search**: linear search and binary search
- **Sort**: bubble sort and sorting with loops, collections, and built-in methods
- **Strings**: palindrome checks, removing unwanted characters, sorting characters, and swapping strings

## Project structure

```text
JavaPrograms/
├── src/       Java source files grouped by topic and package
├── bin/       Compiled `.class` files
└── JavaPrograms.iml
```

The package names match the folders under `src`, for example `search`, `sort`, `Numbers`, and `Strings`.

## Requirements

- Java Development Kit (JDK) 8 or newer
- A command prompt, PowerShell, or an IDE such as IntelliJ IDEA or Visual Studio Code

## Compile the project

From the project root, compile all source files into `bin`.

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force bin
javac -d bin (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

### macOS/Linux

```bash
mkdir -p bin
javac -d bin $(find src -name "*.java")
```

## Run a program

Most classes include a `main` method and can be run independently using their fully qualified class name:

```bash
java -cp bin search.BinarySearch
java -cp bin Numbers.FactorialLoop
java -cp bin Strings.PalindromeString
```

Replace the class name with another class from `src` to try a different example. Some programs use hard-coded sample values, so edit the corresponding source file when you want to experiment with different input.

## Learning goals

This repository is intended for hands-on practice with:

- Java syntax and control flow
- Arrays and strings
- Recursion and iteration
- Searching and sorting algorithms
- Object-oriented programming fundamentals

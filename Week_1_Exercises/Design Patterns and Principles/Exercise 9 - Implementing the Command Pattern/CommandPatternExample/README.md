# CommandPatternExample

This project demonstrates the Command Pattern in Java for a home automation system.

## Steps to Implement
1. Define a `Command` interface with a method `execute()`.
2. Implement concrete commands like `LightOnCommand` and `LightOffCommand`.
3. Create an `Invoker` class `RemoteControl` that holds a command and executes it.
4. Implement a `Receiver` class `Light` with methods to turn on and off.
5. Test the Command implementation.

## How to Run
1. Compile the project using `javac Command.java LightOnCommand.java LightOffCommand.java RemoteControl.java Light.java CommandPatternExample.java`.
2. Run the main class `CommandPatternExample` to demonstrate the Command pattern.

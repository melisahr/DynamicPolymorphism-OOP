# DynamicPolymorphism-OOP

Language: Java

Dynamic Polymorphism is the process of calling the overriden method in resolving a runtime.
Following a Youtbue video, I created a prompt for user to pick either the dog or cat. 
The project consist dynamic polymorphism, if/else if statement, and a Scanner. 

How?
The superclass is Animal and the subclasses are Dog and Cat. 
Each class has a Speak method in the constructor.
The subclass has an overriden method with its own specific message. 
To accept user input, use a Scanner, ensure its imported.
The code for scanner is:  Scanner scanner = new Scanner(System.in).
Give the user a choice by having it as the integer, use code:
int choice = scanner.nextInt().
Create the prompt, by using println to ask the question and print to provide 
the two choices to the user. Assign 1 for dog and 2 for cat.
Make an if/else if statement. 
If the user type 1 for choice, then use the Dog's constructor and its method speak. 
Similiar process goes for the else if, but use the Cat class instead.
Else if the user doesn't pick either choice then return invalid. 

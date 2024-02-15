# Week 6: Java Polymorphism

*Note: If you want to listen to the narration of the text, please download the document, make it editable, highlight any portion of the text, then click on the speak icon located to the right side of the Repeat Typing Item (redo) on the left side of the title bar.*

## Definition of Polymorphism

The word polymorphism means having many forms.

**Real-life example of polymorphism:**
A person at the same time can have different characteristics, like a man who is a father, a husband, an employee. The same person possesses different behavior in different situations. This is called polymorphism.

## Polymorphism in Java

Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. Polymorphism is considered one of the important features of Object-Oriented Programming. It allows performing a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word "poly" means many and "morphs" means forms, so it means many forms.

In Java, polymorphism is mainly divided into two types:

### Compile time Polymorphism
Method Overloading is a compile-time polymorphism example.

```java
class Overload {
    void demo(int a) {
        System.out.println("a: " + a);
    }

    void demo(int a, int b) {
        System.out.println("a and b: " + a + "," + b);
    }

    double demo(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class MethodOverloading {
    public static void main(String args[]) {
        Overload obj = new Overload();
        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}
```

Output:

```
a: 10
a and b: 10,20
double a: 5.5
O/P : 30.25
```

### Runtime Polymorphism Example

**Animal.java:**
```java
public class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}
```

**Horse.java:**
```java
class Horse extends Animal {
    @Override
    public void sound() {
        System.out.println("Neigh");
    }

    public static void main(String args[]) {
        Animal obj = new Horse();
        obj.sound();
    }
}
```

Output:

```
Neigh
```

**Cat.java:**
```java
public class Cat extends Animal {
    // ... (content not provided in the example)
}
```

**Virtual Methods**

Overridden methods in Java allow you to take advantage of polymorphism when designing your classes.

**Employee.java:**
```java
public class Employee {
    // ... (content not provided in the example)
}
```

**Salary.java:**
```java
public class Salary extends Employee {
    // ... (content not provided in the example)
}
```

**VirtualDemo.java:**
```java
public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
```

Output:

```
Constructing an Employee
Constructing an Employee

Call mailCheck using Salary reference --
Within mailCheck of Salary class
Mailing check to Mohd Mohtashim with salary 3600.0

Call mailCheck using Employee reference--
Within mailCheck of Salary class
Mailing check to John Adams with salary 2400.0
```

## References:

- Paul Deitel, Harvey Deitel, Java How to Program Early Objects, Pearson.
- Tulika Das and Others, Oracle Java Development Guide, Oracle Press.
- [Google Search: Notes on Java Polymorphism](https://www.google.com/search?q=Notes+on+Java+Polymorphism&rlz=1C1CHBF_enCA900CA900&oq=Notes+&aqs=chrome.0.69i59j69i57j0l2j46l3j0.4798j0j8&sourceid=chrome&ie=UTF-8)
- [GeeksforGeeks: Polymorphism in Java](https://www.geeksforgeeks.org/polymorphism-in-java/)
- [BeginnersBook: Polymorphism in Java](https://beginnersbook.com/2013/03/polymorphism-in-java/)

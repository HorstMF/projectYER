package introduction.FirstProject;

import introduction.FirstProject.ClassObject;

/*
public: access modifier: to set the level of access. using for classes, attributes and methods

for classes:
public: class is accessible by any other class
default: class is accessible by classes in the same package.

for attributes and methods:
default: variable/method declared no access control modifier available to any other class in same package
public: accessible from any other class
protected: same access as default access modifier, subclasses can access protected methods and variables of the
superclass
private: accessible only within the declared class itself.

best practise to keep variables within a class private. variables are accessible and modified using getters and setters.
 */

/* getter setter
getter method returns value of attribute
setter method takes a parameter and assigns it to the attribute

 */

/* constructors
Class can have multiple constructors with diff numb of parameters.
setter method can be used inside constructor to set the attribute values

java provides a default constructor, all classes have constructor, whether one is defined or not
 */
public class Main {
    public static void main(String[] args){ //PUBLIC: ACCESS MODIFIER
        ClassObject a = new ClassObject(); //a is an object of type ClassObject
        a.classtype(); //dot: access the objects attributes and methods, call its classtype() method



    }
}

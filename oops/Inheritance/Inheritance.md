# inheritance  

Definition 
1.	Inheritance is the mechanism in which one object acquire all the properties of parent class.
2.	Inheritance is the process to create new class from an existing class. 

Usage  
1. Reuse the code 
2. Add properties into child class. 
3. Reducing the code work	   

Inheritance relationship is called Is-A relationship.      
cat Is-A Animal (Animal is parent class and cat is child class).   
sparrow IS-A Bird (Bird is parent class and sparrow is child class).    
car Is-A vehicle (Vehicle is parent class and car is child class).   
surgeon IS-A  Doctor (Doctor is parent class and surgeon is child class).    
developer Is-A Employee (Employee is parent class and programmer is child class).         

Types of inheritance 
1. single level inheritance
2. multilevel inheritance  
3. hierarchical inheritance  

Example single level inheritance   
Employee is parent class and Developer is the child class.  
	     

Example multilevel inheritance   
Employee is parent class and Developer is the intermediate class and Web Developer is child class  
of intermediate class.    
  
  Example hierarchical inheritance  
The base class is developer class then java developer, web developer and system developer all
derived form developer class is called as hierarchical inheritance. 
Definition 

 single level inheritance : If one class is drive only one class is called single level inheritance.  
 multiple inheritance : When a class is derived form class which class also derived form another class is called multilevel inheritance.   
 hierarchical inheritance : when more then one class derived form one parent class is called  hierarchical inheritance.  
 
 Why multiple hybrid inheritance is not in java.  
 
 Definition
 multiple inheritance : A Class can inherit form more then one class.   
 hybrid inheritance : It's combination of hierarchical and multiple inheritance. 
 
 Problem of multiple   
 class A have show() function and class B also show() function. 
 class C is extends Class A and Class B. 
 If class C object call show() function then it create ambiguity(more than one interpretation) .  
 
 This same problem is hybrid inheritance.
    
 

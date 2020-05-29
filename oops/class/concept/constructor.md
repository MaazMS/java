# constructor    
Definition   
1. It is block/method having same name as class name.  
2. It does not have any return type even void.   
3. The modifire of constructor is private,public and protected.   
4. It is execute automatically when object is created.(not call constructor as similar to method)     
5. It is use to initialize the object.   
* note :  The misunderstand that constructor is used to create the object . It is wrong.    
    
## Why need constructor    
1.  
create class employee having no constructor.    
class Employee {  
int emp_id;   
String emp_name; }  
Employee object1 = new Employee();       
Employee object2 = new Employee();       
  
 * Note : For every object creation the attribute value is epmty.There for we need constructor to put the value such as default value.   
 2. 
 we can put the attribute value directly through object. 
 Employee object1 = new Employee();   
 object1.emp_id=101;   
 object1.emp_name="Maaz";   
Employee object2 = new Employee();     
object1.emp_id=102;         
object1.emp_name="Shaikh";
    
   * Note : If I have 100 object then we written 200 line to put the value for attribute. (100 * 2 = 200)    
   
3 .   
There for  to solve the problem for initializtion the object as sample way is constructor.     

## Tyes of constructor  
1. default constructor : It create by compiler if programmer is not create any constructor in program.Question jvm is create the default    constructor then answer is not. jvm is not a compiler there for it is not create default constructor.  
2. default constrcutor by user : This default constructor is create by user having no argument.  
3. parameter constructor : constructor having argument is called parameter constructor.   

## why constructor not have return type   
1. It is use to initialize the value there for it don't have return type.   
2. compiler create default constructor then compiler is not identify what is the return is used for program.  
There for constructor don't have return type.    

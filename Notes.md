# About Kotlin

1. !! Not-null assertion operator converts any value to a non-null type.
2. Single expression functions are without return and curly braces.
3. Class is a blueprint and object is the implementation of blueprint.
4. Object class can't be instantiated or have a constructor.
5. Primary constructor can have type declaration to access data member inside functions, but secondary constructor.
6. Primary constructor, init block and secondary constructor are executed in same order.
7. Data classes are useful for destructuring and holding similar data efficiently. Data class primary constructor must have only property (val / var) parameters.
8. To inherit a class, override its member function or data member; each needs to be declared as open.
9. Base class can be instantiated, but abstract class or interface. 
10. Pair is a collection of 2 variables and Triple is a collection of 3 variables.
11. lateinit modifier is used with var data type. It can change values as per proper execution. It does not work with nullable types.
12. lazy can be initialized only once; so it is used with val data type.
13. Enumeration is a named list of constants(and hence, it is difficult to maintain different states of the instances.) and contains set of constant values. Each constant enum is itself an object.
    * Unlike Java enums, Kotlin enums are classes.
    * Enum constants aren’t just mere collections of constants- these have properties, methods etc
    * Each of the enum constants acts as separate instances of the class and separated by commas.
    * Enums increases readability of your code by assigning pre-defined names to constants.
    * An instance of enum class cannot be created using constructors.
    * enum classes restrict the value a type can take, so when used with when expression, and the definition for all the constants are provided, then the need of the else clause is completely eliminated. In fact, doing so will generate a warning from the compiler.  
    * Enum constants also behaves as anonymous classes by implementing their own functions along with overriding the abstract functions of the class. The most important thing is that each enum constant must be overridden.
14. Scope Functions are functions which execute a block of code in context of an object. Scope Functions create temporary scope inside which you access the object as it or this.
    * ***let*** scope function is used to access the result of call chains. 
      * The context object is available as an argument (it). The return value is the lambda result.
      * It can also be used for null check on objects of nullable type using safe call operator.
    * ***run*** scope function  is useful when the lambda contains both the object initialization and the computation of the return value.
      * The context object is available as a receiver (this). The return value is the lambda result.
      * run does the same as with but invokes as let- as an extension function of the context object.
      * Non-extension run lets you execute a block of several statements where an expression is required.
    * ***with*** scope function is a non-extension function and can only be the starting point of any expression.
      * The context object is passed as an argument, but inside the lambda, it's available as a receiver (this ). The return value is the lambda result. 
      * It can be used as grammatical where we can read as "with this object, do the following.".
      * with introduces a helper object whose properties or functions will be used for calculating a value.
    * ***apply*** is used for code blocks that don't return a value and mainly operate on the members of the receiver object. 
      * The common case for apply is the object configuration. Such calls can be read as “ apply the following assignments to the object.”
      * The context object is available as a receiver (this ). The return value is the object itself.
    * ***also*** scope function is used to perform some side operation like logging or debugging. 
      * The context object is available as an argument (it ). The return value is the object itself.
      * It can be used as grammatical where we can read as "also do the following with the object"
    * let and run scope functions transform the object, but ***apply*** and ***also*** doesn't.
    * For chaining purpose, we have let, also and apply scope functions. 
     
      [![Scope Functions](https://github.com/inderbagga/Kotlin/blob/master/screenshots/scope_functions.png)](https://www.github.com/inderbagga)  

15. Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while keeping a check of the compile-time type safety.
    * We always use angle brackets <> to specify the type parameter. 
    * Advantages of generic –
      * *Type casting is evitable*- No need to typecast the object. 
      * *Type safety*- Generic allows only single type of object at a time.
      * *Compile time safety*- Generics code is checked at compile time for the parameterized type so that it avoids run time error. 
    * Generic types are invariant in Kotlin. Invariance is the property by which a standard generic function/class already defined for a particular data type, cannot accept or return another datatype.
    * Variance is of two types-
       * Declaration-site variance(using in and out)
        * we can use the out keyword on the generic type which means we can assign this reference to any of its supertypes. The out value can only be produced by the given class but can not be consumed.
        * we can use the in keyword on the generic type which means we can assign this reference to any of its subtypes. The in keyword can be used only on the parameter type that is consumed, not produced.
        * *Covariance* implies substituting subtype is acceptable, but supertype is not, i.e. the generic function/class may accept subtypes of the datatype it is already defined for, e.g. a generic class defined for Number can accept Int, but a generic class defined for Int cannot accept Number.
        * *Contravariance* is used to substitute a supertype value in the subtypes, i.e. the generic function/class may accept supertypes of the datatype it is already defined for, e.g. a generic class defined for Number cannot accept Int, but a generic class defined for Int can accept Number.  
      * Use-site variance: Type and star projection
        * Type Projection: If we want to copy all the elements of an array of some type into the array of Any type then it can be possible, but to allow the compiler to compile our code we need to annotate the input parameter with the out keyword. This makes the compiler to infer that input argument can be of any type that is a subtype of the Any.
        * Star Projection: When we do not know about the specific type of the value, and we just want to print all the elements of an array then we use star(*) projection.
16. A function which can accept a function as parameter or can return a function is called *Higher-Order function*.
17. With extensions, we can add more functionality to the existing classes, without inheriting them. When a function is added to an existing class it is known as Extension Function.
    * They are resolved statically i.e. which extension function is executed depends totally on the type of the expression on which it is invoked, rather than on the type resolved on the final execution of the expression at runtime.
    * Extension functions can also be defined with the class type that is nullable.
18. Sealed classes conform to restricted or bounded class hierarchies. A sealed class defines a set of subclasses within it. It is used when it is known in advance that a type will conform to one of the subclass types. Sealed classes ensure type-safety by restricting the types to be matched at compile-time rather than at runtime.
    * Their constructors are private by default.
    * As each subtype of the Enum class can be only a constant, and it has no state. However, Sealed class have different types of subclasses and also containing the state.   
    * A sealed class is implicitly abstract and hence it cannot be instantiated.
    * Subclasses of a sealed class, as discussed, are either ordinary classes, data classes or sealed classes themselves and hence it is easy to contain the state of the subclass.
    * Abstract vs Sealed: 
      * An abstract class can have their hierarchies anywhere in the project, whereas a sealed class should contain all the hierarchies in the same file.
      * When we consider abstract classes, as they allow defining hierarchies from various files in the project, and hence, the IDE cannot understand the different subclasses involved. Hence, the compiler throws an error stating that an else case should be mentioned. But, there is no requirement to add an else case in sealed class.
19. Equality in Kotlin (‘==’, ‘===’ and ‘equals’)
    * These are used to compare the data of two variables or objects, or the references of two objects in Kotlin.
      * Structural Equality (‘==’) == operator is used to compare the data of two variables.
      * Referential equality (‘===’) === operator is used to compare the reference of two variable or object. It will only be true if both the objects or variables pointing to the same object.
      * equals(other: Any?) method is implemented in Any class and can be overridden in any extending class. .equals method also compares the content of the variables or objects just like == operator, but it behaves differently in case of Float and Double comparison.
    
        
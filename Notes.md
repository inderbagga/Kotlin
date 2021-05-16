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
10.Pair is a collection of 2 variables and Triple is a collection of 3 variables.
11.lateinit modifier is used with var data type. It can change values as per proper execution. It does not work with nullable types.
12.lazy can be initialized only once; so it is used with val data type.
13.Enumerated class contains set of constant values. Each constant enum is itself an object.
14.Scope Functions are functions which execute a block of code in context of an object. Scope Functions create temporary scope inside which you access the object as it or this.
   * 'it' refers to object in case of ***let*** scope function. It returns the result. It's used to access the result of call chains. It can also be used to for null check on objects of nullable type using safe call operator.
   * 'this' refers to object inside ***run*** scope function.It also returns the result. This is used when we need to initialize an object and perform some operation on it.
   * 'this' refers to object inside ***apply*** scope function. It's used to initialize an object and return the same object.
   * 'it' refers to object inside ***also*** scope function.
    
   
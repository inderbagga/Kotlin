 ### Use-site variance: Type and star projection

        * Type Projection: If we want to copy all the elements of an array of some type into the array of Any type then it can be possible,
                           but to allow the compiler to compile our code we need to annotate the input parameter with the out keyword.
                           This makes the compiler to infer that input argument can be of any type that is a subtype of the Any.

        * Star Projection: When we do not know about the specific type of the value, and we just want to print all the elements of an array then we use star(*) projection.

### Equality in Kotlin (‘==’, ‘===’ and ‘equals’)
    
    These are used to compare the data of two variables or objects, or the references of two objects in Kotlin.
      
    * Structural Equality (‘==’) == operator is used to compare the data of two variables.
    
    * Referential equality (‘===’) === operator is used to compare the reference of two variable or object. It will only be true if both the objects or variables pointing to the same object.
    
    * equals(other: Any?) method is implemented in Any class and can be overridden in any extending class. .equals method also compares the content of the variables or objects just like == operator, but it behaves differently in case of Float and Double comparison.

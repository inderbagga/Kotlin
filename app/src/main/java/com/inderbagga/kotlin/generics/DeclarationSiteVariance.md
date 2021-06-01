### Declaration-site variance(using in and out)

    * we can use the out keyword on the generic type which means we can assign this reference to any of its supertypes.
      The out value can only be produced by the given class but can not be consumed.

    * we can use the in keyword on the generic type which means we can assign this reference to any of its subtypes.
      The in keyword can be used only on the parameter type that is consumed, not produced.

    *Covariance* implies substituting subtype is acceptable, but supertype is not, i.e. the generic function/class may accept subtypes of the datatype it is already defined for, e.g. a generic class defined for Number can accept Int, but a generic class defined for Int cannot accept Number.

    *Contravariance* is used to substitute a supertype value in the subtypes, i.e. the generic function/class may accept supertypes of the datatype it is already defined for, e.g. a generic class defined for Number cannot accept Int, but a generic class defined for Int can accept Number.

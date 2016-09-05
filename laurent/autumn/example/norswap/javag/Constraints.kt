package norswap.javag

// - type bounds must extend a class type (but not wildcard bounds)
//      > constraint present in grammar

// - a diamond (<>) is only allowed as type args of last identifier in constructor call
//      > not in grammar

// - type parameters can only be reference types
//      > not in grammar

// - void type is only valid as return type or as void.class
// - it cannot have annotations
//      > not in grammar

// - dot class expression can never contain type parameters
//      > not in grammar

// - super and this method call can only occur as first thing in a constructor
//      > present in grammar

// - impossible to, at runtime, differentiate between packages, classes and fields

// - only class names can be suffixed .this or .super

// - type arguments can only be reference types
//      > not in grammar

// - type bounds can only be class types
//      > not in grammar

// - only one non-interface type in cast
//      > not in grammar

// - type modifiers
//      - volatile and transient not valid on method declaration
//      - native, default and strictfp, synchronized and abstract not valid on fields
//      - constructors: only public / protected / private + annotations
//      - types: visibility + abstract, static, final, strictfp + annotations
//      - variables (and params): only annotation, final + annotations
//
//      - many of them are inter excluding (no repetition, only one visibility, abstract vs default vs final)
//
//      > not in grammar (all of it)

// - this parameter only valid in methods declaration + inner class constructor, and as first param
//      > not in grammar

// - this parameter: prefix must be either name part of type (class)
// - prefix must be present in an inner class constructor
//      - note: nested inner class: can have different repr -> TYPING CONCERN
//      > not in grammar

// - variadic parameter only valid as last parameter
//      > not in grammar

// - expression statements (and list for fors): only possibly side-effecting expr accepted
//      > not in grammar
//      - mnemonics: assign, binc, bdec, ainc, adec, mcall, tmcall, ccall

// - interface can't implement
// - enums can't extend
// - class can extend only one
// - annotations can't extend / implement / have type parameters

// - try: if no resource, must have at least one catch or one finally clause
//      - resources must be instances of closeable

// - statements: reference to statements other than blocks must not allow var or type decl

// - arrayinit only allowable for arrays!

// - annotations and interfaces have restrictions
//      - interfaces: only abstract or default + constant + types
//      - annotation: only member + constant + types
package com.kot.basics

/*
Inline functions:
Disadvantages of higher order functions- runtime overhead, each function is object hence memory allocation
to function object and classes


Using higher-order functions imposes certain runtime penalties: each function is an object, and it captures a closure,
i.e. those variables that are accessed in the body of the function. Memory allocations (both for function objects and classes)
and virtual calls introduce runtime overhead.

Hence inline functions are used

Use "inline" keyword
Everything in inline function will be inlined at call site i.e. at function call
Avoid inlining large functions

 */
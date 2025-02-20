# NullPointerException in Scala Method with Int Parameter

This repository demonstrates a common error in Scala: a `NullPointerException` arising from passing a `null` value to a method expecting an Int.  The issue stems from the fact that Scala's primitive types (like Int) cannot be null. Attempting to pass null results in an exception at runtime.

The `bug.scala` file showcases the problem, while `bugSolution.scala` provides a solution using Option to handle potential null values more gracefully.
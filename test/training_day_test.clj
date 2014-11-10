(ns training-day-test
  (:use iloveponies.tests.training-day)
  (:use midje.sweet training-day))

(facts "boolean"
  (boolean "foo") => true
  (boolean nil) => false
  (boolean (+ 2 3)) => true
  (boolean true) => true
  (boolean false) => false)

(facts "teen?"
  (teen? 12) => false
  (teen? 13) => true
  (teen? 15) => true
  (teen? 19) => true
  (teen? 20) => false
  (teen? 27) => false)

(facts "abs"
  (abs -2) => 2
  (abs 42) => 42)

(facts "divides?"
  (divides? 2 4) => true
  (divides? 4 2) => false
  (divides? 5 10) => true
  (divides? 2 5) => false)

(facts "fizzbuzz"
  (fizzbuzz 2)  => ""
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")

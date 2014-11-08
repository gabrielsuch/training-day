(ns training-day-test
  (:use iloveponies.tests.training-day)
  (:use midje.sweet training-day))

(facts "boolean"
  (boolean "foo") => true
  (boolean nil) ;=> false
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

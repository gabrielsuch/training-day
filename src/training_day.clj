(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(defn boolean [x]
  (if x true false))

(defn teen? [age]
  (and (> age 12) (< age 20)))

(defn abs [x]
  (if (< x 0) (* x -1) x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
      :else ""))

(defn generic-doublificate [n]
  (cond
    (number? n) (* n 2)
    (empty? n) nil
    (or (list? n) (vector? n)) (* (count n) 2)
      :else true))

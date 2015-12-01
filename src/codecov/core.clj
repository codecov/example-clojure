(ns codecov.core)

(defn hello [x]
  (if (= (clojure.string/lower-case x) "world")
    "Not again!"
    (str "Hello, " x "!")))

(defn uncovered []
  "Very sad, uncovered fn.")

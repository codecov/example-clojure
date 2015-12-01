(ns codecov.calc-test
  (:require [clojure.test :refer :all]
            [codecov.calc :as c]))

(deftest calculations
  (testing "adding"
    (is (= (c/add 1 2) 3))
    (is (= (c/add 1 -2) -1)))
  (testing "multiplying"
    (is (= (c/mul 0 1) 0))
    (is (= (c/mul 2 2) 4))
    (is (= (c/mul -1 2) -2))
    (is (= (c/mul -1 -3) 3))))

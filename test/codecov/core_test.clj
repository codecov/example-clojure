(ns codecov.core-test
  (:require [clojure.test :refer :all]
            [codecov.core :as c]))

(deftest greetings
  (testing "with an arbitrary string"
    (is (= (c/hello "Jakub") "Hello, Jakub!")))
  (testing "with a forbidden word"
    (is (= (c/hello "World") "Not again!"))))

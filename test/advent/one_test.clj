(ns advent.one-test
  (:require [clojure.test :refer :all]
            [advent.one :refer :all]))

(deftest fuel-test
  (testing "calculates the mass"
    (is (= (fuel 12) 2))
    (is (= (fuel 14) 2))
    (is (= (fuel 1969) 966))
    (is (= (fuel 100756) 50346))))

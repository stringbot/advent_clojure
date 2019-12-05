(ns advent.two-test
  (:require [clojure.test :refer :all]
            [advent.two :refer :all]))

(deftest intcode-test
  (testing "addition opcode"
    (let [input  [1,0,0,0,99]
          output [2,0,0,0,99]]
      (is (= output (exec-program input)))))

  (testing "longer program"
    (let [input [1,9,10,3,2,3,11,0,99,30,40,50]
          output [3500,9,10,70,2,3,11,0,99,30,40,50]]
      (is (= output (exec-program input)))))

  (testing "additional test cases"
    (let [input [2,4,4,5,99,0]
          output [2,4,4,5,99,9801]]
      (is (= output (exec-program input))))
    (let [input [1,1,1,4,99,5,6,0,99]
          output [30,1,1,4,2,5,6,0,99]]
      (is (= output (exec-program input)))))
)



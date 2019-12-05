(ns advent.two)

(defn opcode [n]
  (case n
      1 +
      2 *
      99 :halt))

(defn exec-program [program]
  (loop [accum program
         counter 0]
    (let [[op pos-a pos-b pos-out & more] (subvec accum counter)
          operator (opcode op)]
      (if (= operator :halt)
        accum
        (let [a (nth accum pos-a)
              b (nth accum pos-b)
              out (operator a b)]
          (recur (assoc accum pos-out out)
                 (+ counter 4)))))))

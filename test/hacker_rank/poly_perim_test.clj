(ns hacker-rank.poly-perim-test
  (:require [clojure.test :refer :all]
            [hacker-rank.poly-perim :refer :all]))

(deftest finds-perimeter-of-square-with-positive-coordinates
  (is (= (poly-perim [[0 0] [0 1] [1 1] [1 0]])
         4.0)))


(deftest finds-perimeter-of-square-with-mixed-coordinates
  (is (= (poly-perim [[0 0] [0 -1] [-1 -1] [-1 0]])
         4.0)))

(deftest finds-perimeter-of-square-with-negative-coordinates
  (is (= (poly-perim [[-1 -1] [-1 -2] [-2 -2] [-2 -1]])
         4.0)))


(ns hacker-rank.convex-hull-test
  (:require [clojure.test :refer :all]
            [hacker-rank.convex-hull :refer :all]))

(deftest finds-point-with-min-y-coordinate
  (is (= (min-coords [[1 3] [1 2] [3 4] [5 6]])
         [1 2])))

(deftest finds-min-polar-angle-with-collinear-points-0
  (is (= (min-polar-angle [0 0] [1 1] [2 2])
         [2 2])))

(deftest finds-min-polar-angle-with-collinear-points-1
  (is (= (min-polar-angle [0 0] [2 2] [1 1])
         [2 2])))

(deftest finds-min-polar-angle-with-non-collinear-points
  (is (= (min-polar-angle [0 0] [3 4] [2 1])
         [2 1])))

(defn convex-hull-points-set [points]
  (into #{} (convex-hull points)))
  
(deftest finds-convex-hull-when-all-points-are-included-in-it
  (is (= (convex-hull-points-set [[2 2] [2 4] [5 3]])
         #{[2 2] [2 4] [5 3]})))

(deftest finds-convex-hull-when-two-points-have-min-y-coordinate
  (is (= (convex-hull-points-set [[2 2] [3 4] [3 3] [4 2]])
         #{[2 2] [3 4] [4 2]})))

(deftest finds-convex-hull-when-two-points-have-max-y-coordinate
  (is (= (convex-hull-points-set [[2 2] [4 2] [5 4] [3 4] [3 3] [4 3]])
         #{[2 2] [4 2] [5 4] [3 4]})))

(deftest finds-convex-hull-of-sample-polygon
  (is (= (convex-hull-points-set [[4 1] [7 2] [7 5] [4 6] [2 5] [1 3]
                                  [4 3] [4 4] [5 5]])
         #{[4 1] [7 2] [7 5] [4 6] [2 5] [1 3]})))

(deftest finds-convex-hull-of-points-with-negative-coordinates
  (is (= (convex-hull-points-set [[-3 -2] [-3 -4] [-5 -2] [-5 -4] [-4 -3]])
         #{[-3 -2] [-3 -4] [-5 -2] [-5 -4]})))

(deftest finds-convex-hull-when-two-points-are-on-the-same-line
  (is (= (convex-hull-points-set [[2 -6] [4 -4] [6 -3] [2 -3]])
         #{[2 -6] [6 -3] [2 -3]})))

(deftest finds-convex-hull-when-one-of-the-points-has-lesser-y-coord-than-previous
  (is (= (convex-hull-points-set [[1 6] [1 3] [4 0] [8 -1]])
         #{[1 6] [1 3] [4 0] [8 -1]})))

(deftest finds-convex-hull-when-points-are-on-the-same-lines-collinear-with-x-axis
  (let [test-data [[1 1] [1 2] [1 3] [1 4]
                   [3 1] [3 2] [3 3] [3 4]
                   [5 1] [5 2] [5 3] [5 4]]]
    (is (= (convex-hull test-data)
           #{[1 1] [5 1] [5 4] [1 4]}))))
                 

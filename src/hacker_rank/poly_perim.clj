(ns hacker-rank.poly-perim
  (:require [hacker-rank.utils :refer [points-from-stdin]]))

(defn distance [[[x1 y1] [x2 y2]]]
  (Math/sqrt (+ (Math/pow (- x2 x1) 2) (Math/pow (- y2 y1) 2))))

(defn poly-perim [points]
  (->> (cons [(first points) (last points)] (partition 2 1 points))
       (map distance)
       (reduce +)))

(println (poly-perim (points-from-stdin)))

